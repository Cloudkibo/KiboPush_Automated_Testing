import pdfkit
import os
import time
import requests
from reader import get_rows
import config

def publish_to_slack(summary):

  passed = summary['tests_passed']
  failed = summary['tests_failed']

  message =  "An Automated Testing run was just completed. \nPASSED: %s \nFAILED: %s\nCheck report for details." % (passed, failed)

  my_file = {
    'file' : ('report.pdf', open('report.pdf', 'rb'), 'pdf')
  }

  payload={
    "initial_comment": message,
    "filename":"Report.pdf", 
    "token": config.bot_token, 
    "channels":['#automated-testing'], 
  }

  r = requests.post("https://slack.com/api/files.upload", params=payload, files=my_file)
  print(r)

def generate_report(results, summary, file_name='report'):
  options = {
      'page-size': 'A4',
      'dpi': 300,
  }

  table_data = ''
  for result in results:
    failure_color = '#DC143C'
    success_color = '#4BB543'

    result['statuses'] = ''
    status_headings = ''
    for category in config.user_category:
      status_headings += '<th class="text-centered">%s status</th>' % category
      
      if result[category+'_status'] == 'Passed':
        result[category+'_color'] = success_color
      else:
        result[category+'_color'] = failure_color
        
      result['statuses'] += '<td bgcolor=%s>%s</td>' % (result[category+'_color'], result[category+'_status'])


    
    # if 'buyer_status' in result and result['buyer_status'] == 'Passed':
    #   result['buyer_color'] = success_color
    # else: 
    #   result['buyer_color'] = failure_color

    # if 'admin_status' in result and result['admin_status'] == 'Passed':
    #   result['admin_color'] = success_color
    # else:
    #   result['admin_color'] = failure_color

    # if 'agent_status' in result and result['agent_status'] == 'Passed':
    #   result['agent_color'] = success_color
    # else:
    #   result['agent_color'] = failure_color

    # if result['individual_status'] == 'Passed':
    #   result['individual_color'] = success_color
    # else:
    #   result['individual_color'] = failure_color

    table_data += """
    <tr>
    <td>{test}</td>
    <td>{category}</td>
    <td>{description}</td>
    <td style="white-space: pre-wrap; width:100%;">{steps}</td>
    <td>{expected_results}</td>
    {statuses}
    <td>{remarks}</td>
  </tr>
  """.format(**result)

    table_data += os.linesep

  # print(table_data)

  summary_html = """
  <ul>
  <li><strong>Tests Passed</strong>: {tests_passed}</li>
  <li><strong>Tests Failed</strong>: {tests_failed}</li>
  <li><strong>Failed Tests</strong>: {failed_tests}</li>
  </ul>
  """.format(**summary)

  time_stamp = time.strftime("%c")
  print(time_stamp)

  html = """
  <!DOCTYPE html>
  <html>
  <head>
    <meta charset="utf-8">
    <meta name="pdfkit-orientation" content="Portrait" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>KiboPush Automated Testing Results</title>
    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <style>
      .text-centered {
        text-align: center;
      }
    </style>
  </head>
  <body>
    <div class="container">
        <h2>KiboPush Automated Testing Results</h2>
        <h4>%s</h4>
        <br/>
        <table class="table table-bordered s">
            <tr>
                <th class="text-centered">Test</th>
                <th class="text-centered">Category</th>
                <th class="text-centered">Description</th>
                <th class="text-centered">Steps</th>
                <th class="text-centered">Expected Results</th>
                %s
                <th class="text-centered">Remarks</th>
            </tr>
            %s
        </table>
        <h3>Summary:</h3>
        %s
    </div>
  </body>
  </html>
  """ % (time_stamp, status_headings, table_data, summary_html)

  #pdfkit.from_file('sample.html', 'out.pdf', options=options)
  pdfkit.from_string(html, file_name + '.pdf', options=options)
  publish_to_slack(summary)

def gather_report(test_status, summary):
  """Uses reader to get meta-data for report, and combines it with received test data, to generate report"""
  row_no, category, description, steps, expected_result = get_rows(test_status.keys())
  print 'test_status.keys()', test_status.keys()
  report_data = []
  print 'printing keys'
  for k, v in test_status.iteritems():
    print k
    temp = {}
    temp['test'] = k+1
    temp['category'] = category[(row_no.index(k))]
    temp['description'] = description[(row_no.index(k))]
    temp['steps'] = steps[(row_no.index(k))]
    temp['expected_results'] = expected_result[(row_no.index(k))]

    for user in config.user_category:
      temp[user+'_status'] = v[config.user_category.index(user)]

    # temp['buyer_status'] = v[user_category.index('buyer')]
    # temp['admin_status']= v[user_category.index('admin')]
    # temp['agent_status']= v[user_category.index('agent')]
    # temp['individual_status']= v[user_category.index('individual')]
    temp['remarks'] = v[-1]
    report_data.append(temp)

    # print("REPORT DATA:")
    # print(report_data)


  generate_report(report_data, summary )


if __name__ == "__main__":
  steps = """1- Login 
2- Go to Broadcasts
3- Click on Create New Broadcast
4. Click on Create New Broadcast
5- Click on Gallery
6. gallery page 1
7. Click on Enter Title
8. Write First Image
9. Click on Enter subtitle 
10. Write A sample image
11. Click component add button
12. Click on enter button title
13. Write First Image
14. Click on Enter link
15. Write www.google.com
16. Click on Done
17. Next Image
18. gallery page 2
19. Click on Enter Title
20. Write Second Image
21. Click on Enter subtitle 
22. Write Another sample image
23. Click component add button
24. Click on enter button title
25. Write Gallery button
26. Click on Enter link
27. Write www.google.com
28. Click on Done
29. Click on Send
30. Verify Alert"""

  results = [
      {
          'test': '#1',
          'category': 'Sidebar',
          'description': 'Navigation',
          'steps': steps,
          'expected_results': 'User is routed to correct route for each element on the sidebar',
          'buyer_status': 'Failed',
          'remarks': 'Step 7 failed'
      },
      {
          'test': '#1',
          'category': 'Sidebar',
          'description': 'Navigation',
          'steps': steps,
          'expected_results': 'User is routed to correct route for each element on the sidebar',
          'buyer_status': 'Failed',
          'remarks': 'Step 7 failed'
      },      {
          'test': '#1',
          'category': 'Sidebar',
          'description': 'Navigation',
          'steps': steps,
          'expected_results': 'User is routed to correct route for each element on the sidebar',
          'buyer_status': 'Failed',
          'remarks': 'Step 7 failed'
      }
  ]

  summary = {
      'tests_passed': 0,
      'tests_failed': 2,
      'failed_tests': [
          '#1', '#2'
      ]
  }

  generate_report(results, summary, 'results')