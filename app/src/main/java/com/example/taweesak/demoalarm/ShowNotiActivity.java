package com.example.taweesak.demoalarm;


import android.app.Notification;
import android.app.NotificationManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowNotiActivity extends AppCompatActivity {

    String messageString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_noti);

        messageString = getIntent().getStringExtra("Message");
        TextView textView = findViewById(R.id.tv_showAlarm);
        textView.setText(messageString);

        showNotification();

    }

    private void showNotification() {

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setSmallIcon(R.drawable.ic_action_noti);
        builder.setTicker("Ticker Notification");
        builder.setContentTitle(messageString);
        builder.setContentText("Text Nofication");
        builder.setWhen(System.currentTimeMillis()); // show Noti current time
        builder.setAutoCancel(false);
        builder.setOnlyAlertOnce(true);

        Uri uri = RingtoneManager.getDefaultUri(Notification.DEFAULT_SOUND);

        builder.setSound(uri);

        Notification notification = builder.build();  // Pack Value from Top
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(1000,notification); // 1000 is noti ID

    }
}
