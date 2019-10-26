import alarm

# AlarmManager class - keeps track of alarms
class AlarmManager:
    # alarm list
    list = []

    # initializer
    # constructor
    def __init__(self, alarm):
        self.list = [alarm]

    # addList function
    # adds alarms the user creates into the list
    def addList(alarm):
        # appends the alarm, putting in time order
        for i in range(0, list.len()):
            if (alarm.time > list[i].time) and (alarm.time < list[i + 1].time):
                list.insert(i + 1, alarm.name)

    # removeList function
    # delete temporary alarms after they go off
    def removeList(alarm):
        for i in range(0, list.len()):
            if (alarm.isTemp == true and alarm.isOn == false):
                list.remove(alarm.name)




# file.py
# alarmm = AlarmManager(newalarm)
# alarmm.list.append(anotherAlarm)
