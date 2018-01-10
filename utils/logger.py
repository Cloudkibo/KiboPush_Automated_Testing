
def log(text):
    print(text)
    with open("log.txt", "a") as log_file:
        log_file.write(text+"\n")

def clear_logs():
    open('log.txt', 'w').close()