# Alarm class
# import sys
from datetime import datetime


class Alarm:
    
    # initializer
    # constructor example: Alarm(time, True, True) 
    def __init__(self, alarm_time, name="", isTemp = False):
        self.time = alarm_time
        self.isTemp = isTemp
        self.isOn = True
        self.name = name
    
    """ 
    isTime - whether it is the time to ring the alarm
    param: custom_time = the amount of time before the alarm runs
    returns: whether or not it is time to ring the alarm
    """
    def runAlarm(custom_time = None):
        now = datetime.now()
        current_time = now.strftime("%H:%M:%S")
        if current_time == self.time:
            return True
        else:
            return False
    
