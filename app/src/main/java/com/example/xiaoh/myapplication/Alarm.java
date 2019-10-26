package com.example.xiaoh.myapplication;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.lang.Math;

public class Alarm {
    public String name;
    public Timer t;
    public Date alarmDate;
    public boolean isTemp;
    public boolean isRepeat;
    public boolean isOn;

    Alarm(String name) {
        this.name = name;
        isOn = false;
        isRepeat = false;
        isTemp = false;
        alarmDate = new Date();
    }

    Alarm(String name, Date alarmDate) {
        this(name,alarmDate,false);
    }

    Alarm(String name, Date alarmDate, boolean isTemp) {
        this.name = name;
        this.alarmDate = alarmDate;
        isTemp = isTemp;
        isOn = true;
        isRepeat = false;
    }

    public long getTime() {
        return alarmDate.getTime();
    }

//    public int compareTo(Alarm a) {
//        return this.getTime().compareTo(a.getTime());
//    }
}
