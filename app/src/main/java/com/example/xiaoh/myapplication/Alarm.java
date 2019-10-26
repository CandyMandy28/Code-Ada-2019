package com.example.xiaoh.myapplication;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.lang.Math;
import java.text.SimpleDateFormat;

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

    public String getFormattedTime(boolean military) {
        SimpleDateFormat ft;

        if(military) {
            ft = new SimpleDateFormat ("kk:mm a");
        } else {
            ft = new SimpleDateFormat ("hh:mm a");
        }

        return ft.format(alarmDate);
    }


    public TimerTask scheduleFor(boolean willTurnOn) {
        if(willTurnOn) {
            return new TimerTask() {
                @Override
                public void run() {
                    turnOn();
                }
            };
        }
        else {
            return new TimerTask() {
                @Override
                public void run() {
                    turnOff();
                }
            };
        }
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

//    public int compareTo(Alarm a) {
//        return this.getTime().compareTo(a.getTime());
//    }


}
