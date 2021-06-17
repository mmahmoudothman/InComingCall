package com.pay.incomingcall;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.widget.Toast;

public class MyBrodcastRecieverService extends Service {
    private static BroadcastReceiver br_ScreenOffReceiver;

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }

    @Override
    public void onCreate() {
        registerScreenOffReceiver();
    }

    @Override
    public void onDestroy() {
        unregisterReceiver(br_ScreenOffReceiver);
        br_ScreenOffReceiver = null;
    }

    private void registerScreenOffReceiver() {
        br_ScreenOffReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Toast toast = Toast.makeText(context, "ACTION_SCREEN_OFF", Toast.LENGTH_LONG);

                // do something, e.g. send Intent to main app
            }
        };

        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_OFF);
        registerReceiver(br_ScreenOffReceiver, filter);
    }
}