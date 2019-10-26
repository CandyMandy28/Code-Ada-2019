package com.example.xiaoh.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
<<<<<<< HEAD
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;


public class AlarmActivity extends AppCompatActivity {

=======
import android.widget.TextView;

import java.util.Date;

public class AlarmActivity extends AppCompatActivity {
    Alarm alarm;
    AlarmManager alarmManager;
>>>>>>> 6bf0ea3b22de954867fc806c41ddcd6095f162af

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                TextView text =  (TextView) findViewById(R.id.testView);
                text.setText(alarmManager.findAlarm(1).name + alarmManager.findAlarm(1).isOn);
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        alarmManager = new AlarmManager();
        alarmManager.addList( new Alarm("TEST"));
        Date today = new Date();
        alarmManager.addList( new Alarm("T",new Date(today.getTime() + 10000)));

<<<<<<< HEAD
        Date now = new Date();
        AlarmManager manager = new AlarmManager(new ArrayList<Alarm>()

        );

        for(int i = 0; i < 5; i++) {
            int sec = 1000 * i * 2;
            manager.addList(new Alarm("wake up " + i, new Date(now.getTime() + sec)));
        }

        LinearLayout alarmView = (LinearLayout) findViewById(R.id.Alarm_layout);

        for(int i = 0; i < manager.size(); i++) {
            Alarm a = manager.get(i);
            View chunk = getLayoutInflater().inflate(R.layout.chunk_alarm, alarmView, false);

            TextView time = chunk.findViewById(R.id.alarm_time);
            time.setText(a.alarmDate.toString());
            TextView name = chunk.findViewById(R.id.alarm_name);
            name.setText(a.name);
            Switch on = chunk.findViewById(R.id.alarm_isOn);
            Switch temp = chunk.findViewById(R.id.alarm_isTemp);
            on.setChecked(a.isOn);
            temp.setChecked(a.isTemp);

            alarmView.addView(chunk);
        }

=======
        TextView text =  (TextView) findViewById(R.id.testView);
        text.setText(alarmManager.findAlarm(1).name + alarmManager.findAlarm(1).isOn);
>>>>>>> 6bf0ea3b22de954867fc806c41ddcd6095f162af
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_alarm, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
