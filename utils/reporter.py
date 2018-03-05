import pdfkit
import os
import time
from reader import get_rows
from mapper import user_category

def generate_report(results, summary, file_name='report'):
  options = {
      'page-size': 'A4',
      'dpi': 300,
  }

  table_data = ''
  for result in results:
    failure_color = '#DC143C'
    success_color = '#4BB543'
    
    if result['buyer_status'] == 'Passed':
      result['buyer_color'] = success_color
    else:
      result['buyer_color'] = failure_color

    if result['admin_status'] == 'Passed':
      result['admin_color'] = success_color
    else:
      result['admin_color'] = failure_color

    if result['agent_status'] == 'Passed':
      result['agent_color'] = success_color
    else:
      result['agent_color'] = failure_color

    if result['individual_status'] == 'Passed':
      result['individual_color'] = success_color
    else:
      result['individual_color'] = failure_color

    table_data += """
    <tr>
    <td>{test}</td>
    <td>{category}</td>
    <td>{description}</td>
    <td style="white-space: pre-wrap; width:100%;">{steps}</td>
    <td>{expected_results}</td>
    <td bgcolor={buyer_color}>{buyer_status}</td>
    <td bgcolor={admin_color}>{admin_status}</td>
    <td bgcolor={agent_color}>{agent_status}</td>
    <td bgcolor={individual_color}>{individual_status}</td>
    <td>{remarks}</td>
  </tr>
  """.format(**result)

    table_data += os.linesep

  # print(table_data)

  summary = """
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
                <th class="text-centered">Buyer Status</th>
                <th class="text-centered">Admin Status</th>
                <th class="text-centered">Agent Status</th>
                <th class="text-centered">Individual Status</th>
                <th class="text-centered">Remarks</th>
            </tr>
            %s
        </table>
        <h3>Summary:</h3>
        %s
    </div>
  </body>
  </html>
  """ % (time_stamp, table_data, summary)

  #pdfkit.from_file('sample.html', 'out.pdf', options=options)
  pdfkit.from_string(html, file_name + '.pdf', options=options)

def gather_report(test_status, summary):
  """Uses reader to get meta-data for report, and combines it with received test data, to generate report"""
  category, description, steps, expected_result = get_rows(test_status.keys())
  report_data = []
  for k, v in test_status.iteritems():
    temp = {}
    temp['test'] = k
    temp['category'] = category.pop(0)
    temp['description'] = description.pop(0)
    temp['steps'] = steps.pop(0)
    temp['expected_results'] = expected_result.pop(0)
    temp['buyer_status'] = v[user_category.index('buyer')]
    temp['admin_status']= v[user_category.index('admin')]
    temp['agent_status']= v[user_category.index('agent')]
    temp['individual_status']= v[user_category.index('individual')]
    temp['remarks'] = v[-1]
    report_data.append(temp)

    print("REPORT DATA:")
    print(report_data)


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
          'admin_status': 'Failed',
          'agent_status': 'Failed',
          'individual_status': 'Failed',
          'remarks': 'Step 7 failed'
      },
      {
          'test': '#1',
          'category': 'Sidebar',
          'description': 'Navigation',
          'steps': steps,
          'expected_results': 'User is routed to correct route for each element on the sidebar',
          'buyer_status': 'Failed',
          'admin_status': 'Failed',
          'agent_status': 'Passed',
          'individual_status': 'Failed',
          'remarks': 'Step 7 failed'
      },      {
          'test': '#1',
          'category': 'Sidebar',
          'description': 'Navigation',
          'steps': steps,
          'expected_results': 'User is routed to correct route for each element on the sidebar',
          'buyer_status': 'Failed',
          'admin_status': 'Failed',
          'agent_status': 'Failed',
          'individual_status': 'Failed',
          'remarks': 'Step 7 failed'
      },      {
          'test': '#1',
          'category': 'Sidebar',
          'description': 'Navigation',
          'steps': steps,
          'expected_results': 'User is routed to correct route for each element on the sidebar',
          'buyer_status': 'Failed',
          'admin_status': 'Failed',
          'agent_status': 'Failed',
          'individual_status': 'Failed',
          'remarks': 'Step 7 failed'
      },      {
          'test': '#1',
          'category': 'Sidebar',
          'description': 'Navigation',
          'steps': steps,
          'expected_results': 'User is routed to correct route for each element on the sidebar',
          'buyer_status': 'Failed',
          'admin_status': 'Failed',
          'agent_status': 'Failed',
          'individual_status': 'Failed',
          'remarks': 'Step 7 failed'
      },      {
          'test': '#1',
          'category': 'Sidebar',
          'description': 'Navigation',
          'steps': steps,
          'expected_results': 'User is routed to correct route for each element on the sidebar',
          'buyer_status': 'Failed',
          'admin_status': 'Failed',
          'agent_status': 'Failed',
          'individual_status': 'Failed',
          'remarks': 'Step 7 failed'
      },      {
          'test': '#1',
          'category': 'Sidebar',
          'description': 'Navigation',
          'steps': steps,
          'expected_results': 'User is routed to correct route for each element on the sidebar',
          'buyer_status': 'Failed',
          'admin_status': 'Failed',
          'agent_status': 'Failed',
          'individual_status': 'Failed',
          'remarks': 'Step 7 failed'
      },      {
          'test': '#1',
          'category': 'Sidebar',
          'description': 'Navigation',
          'steps': steps,
          'expected_results': 'User is routed to correct route for each element on the sidebar',
          'buyer_status': 'Failed',
          'admin_status': 'Failed',
          'agent_status': 'Failed',
          'individual_status': 'Failed',
          'remarks': 'Step 7 failed'
      },      {
          'test': '#1',
          'category': 'Sidebar',
          'description': 'Navigation',
          'steps': steps,
          'expected_results': 'User is routed to correct route for each element on the sidebar',
          'buyer_status': 'Failed',
          'admin_status': 'Failed',
          'agent_status': 'Failed',
          'individual_status': 'Failed',
          'remarks': 'Step 7 failed'
      },      {
          'test': '#1',
          'category': 'Sidebar',
          'description': 'Navigation',
          'steps': steps,
          'expected_results': 'User is routed to correct route for each element on the sidebar',
          'buyer_status': 'Failed',
          'admin_status': 'Failed',
          'agent_status': 'Failed',
          'individual_status': 'Failed',
          'remarks': 'Step 7 failed'
      },      {
          'test': '#1',
          'category': 'Sidebar',
          'description': 'Navigation',
          'steps': steps,
          'expected_results': 'User is routed to correct route for each element on the sidebar',
          'buyer_status': 'Failed',
          'admin_status': 'Failed',
          'agent_status': 'Failed',
          'individual_status': 'Failed',
          'remarks': 'Step 7 failed'
      },      {
          'test': '#1',
          'category': 'Sidebar',
          'description': 'Navigation',
          'steps': steps,
          'expected_results': 'User is routed to correct route for each element on the sidebar',
          'buyer_status': 'Failed',
          'admin_status': 'Failed',
          'agent_status': 'Failed',
          'individual_status': 'Failed',
          'remarks': 'Step 7 failed'
      },
  ]

  summary = {
      'tests_passed': 0,
      'tests_failed': 2,
      'failed_tests': [
          '#1', '#2'
      ]
  }

  generate_report(results, summary, 'results')