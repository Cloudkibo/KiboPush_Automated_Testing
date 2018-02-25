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
    table_data += """
    <tr>
    <td>{test}</td>
    <td>{category}</td>
    <td>{description}</td>
    <td><pre>{steps}</pre></td>
    <td>{expected_results}</td>
    <td>{buyer_status}</td>
    <td>{admin_status}</td>
    <td>{agent_status}</td>
    <td>{individual_status}</td>
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

  generate_report(report_data, summary )


if __name__ == "__main__":
  steps = """
  1. Login
  2. Go to Dashboard
  3. Go to Broadcasts
  4. Go to Survey
  5. Go to Polls
  6. Go to Workflows
  7. Go to Live Chat
  8. Go to Auto posting
  9. Go to Persistent Menu
  10. Go to Manage Pages
  11. Go to Manage Subscriptions
  12. Go to Subscribe to Messenger
  13. Go to Messenger Link
  14. Go to Invite using phone number
  15. Go to Settings
  16. Go to User Guide
  """

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