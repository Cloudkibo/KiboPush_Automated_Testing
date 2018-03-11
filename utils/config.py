import json


with open('.env/credentials.json') as fd:
     json_data = json.load(fd)



# Bot token for slack
bot_token = json_data['bot_token']



# Whether tests are ran for certain categories only
categorized = False

# Categories to filter. Defaults to all of them
categories = [
"user authentication",
"sidebar",
"facebook pages",
"broadcasts",
"subscribers",
"surveys",
"workflows",
"polls",
"settings",
"templates",
"analytics",
"navbar",
"live chat",
"main menu",
"auto-posting",
"membership",
"operational dashboard",
"wizard",
"welcome message"
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