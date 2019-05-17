package com.example.hp.assg3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView= findViewById(R.id.w);

        NotificationHelper helper= new NotificationHelper(this);



        boolean isConnectedWIFI = com.example.hp.assg3.Connection.isConnectedWifi(this);

        if (isConnectedWIFI){
            textView.setText("  Connected");
            helper.createNotification("Internet","Connected");


        }else {
            textView.setText("  Not Connected");
            helper.createNotification("Internet","Not Connected");


        }






    }
}