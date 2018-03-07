import time

time_stamp = str(int(time.time()))
def log(text):
    print(text)
    
    with open("Logs/log"+time_stamp+".txt", "a") as log_file:
        log_file.write(text+"\n")