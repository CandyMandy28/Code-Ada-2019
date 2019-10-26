package com.example.xiaoh.myapplication;

import java.util.ArrayList;
import java.util.Collections;

// AlarmManager class - keeps track of alarms
public class AlarmManager {
    // alarm list
    private ArrayList<Alarm> list;

    // initializer
    // constructor
    AlarmManager() {
        list = new ArrayList<Alarm>();
    }

    AlarmManager(Alarm alarm) {
        this();
        list.add(alarm);
    }

    AlarmManager(ArrayList<Alarm> alarms) {
        this();
        for (Alarm a : alarms) {
            list.add(a);
        }
    }

    // addList function
    // adds alarms the user creates into the list
    public void addList(Alarm alarm) {
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

    public int size() {
        return list.size();
    }

    public Alarm get(int i) {
        return list.get(i);
    }
}
