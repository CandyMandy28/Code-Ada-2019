package com.example.xiaoh.myapplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;

// AlarmManager class - keeps track of alarms
public class AlarmManager {
    // alarm list
    private ArrayList<Alarm> list;
    private Timer t;
    private ArrayList<Alarm> ongoingAlarms;

    // initializer
    // constructor
    AlarmManager() {
        list = new ArrayList<Alarm>();
        t = new Timer();
        ongoingAlarms = new ArrayList<Alarm>();
    }

    AlarmManager(Alarm alarm) {
        this();
        list.add(alarm);
    }

    // addList function
    // adds alarms the user creates into the list
    public void addList(Alarm alarm) {
        if(alarm.isOn) {
            t.schedule(alarm.scheduleFor(false),alarm.alarmDate);
        }
        // appends the alarm, putting in time order
        for (int i = 0; i < list.size() - 1; i++) {
            if ((alarm.getTime() > list.get(i).getTime()) && (alarm.getTime() < list.get(i + 1).getTime())) {
                list.add(i + 1,alarm);
                return;
            }
        }

        list.add(alarm);
    }

    // removeList function
    // delete temporary alarms after they go off
    public void removeTemp() {
        for (int i = 0; i < list.size(); i++) {
            Alarm alarm = list.get(i);
            if (alarm.isTemp && !alarm.isOn) {
                list.remove(i);
            }
        }
    }

    // remove specified alarm
    public void removeAlarm(Alarm alarm) {
        list.remove(alarm);
    }

    // remove alarm at index i
    public void removeAlarm(int i) {
        if (i >= list.size() || i < 0) {
            return;
        }

        list.remove(i);
    }

    public Alarm findAlarm(int i) {
        return list.get(i);
    }

    public Alarm findAlarm(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name == name) {
                return list.get(i);
            }
        }
        return new Alarm("NULL");
    }
}
