import json


with open('.env/credentials.json') as fd:
     json_data = json.load(fd)



# Bot token for slack
bot_token = json_data['bot_token']

#
facebook_accounts = json_data['facebook_accounts']



# Whether tests are ran for certain categories only
categorized = False

# Categories to filter. Defaults to all of them
categories = [
"user authentication",
"sidebar",
"navbar",
"broadcasts",
"subscribers",
"surveys",
"workflows",
"polls",
"settings",
"wizard",
"templates",
"analytics",
"manage pages",
"live chat",
"persistent menu",
"auto-posting",
"membership",
"operational dashboard",
"segment subscribers",
"invite using phone number"
]


# Types of user categories to test
user_category = ['buyer', 'admin', 'agent', 'individual', '0sub']

# Whether to run only passing tests or failing tests
test_failed = True
test_passed = True


# Current status of config can be known by calling this.

def print_config():
	print("categories %s" % categories)
	print("categorized %s" % categorized)
	print("user_category %s" % user_category)
	print("test_failed %s" % test_failed)
	print("test_passed %s" % test_passed)