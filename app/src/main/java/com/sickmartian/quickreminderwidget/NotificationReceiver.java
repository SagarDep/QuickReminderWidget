package com.sickmartian.quickreminderwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

import timber.log.Timber;

/**
 * Created by sickmartian on 8/13/16.
 */
public class NotificationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Timber.d("NotificationReceiver invoked");
        Intent service = new Intent(context, NotificationService.class);
        context.startService(service);
    }

    public static void sendBroadcast() {
        Intent intent = new Intent(App.getAppContext(), NotificationReceiver.class);
        App.getAppContext().sendBroadcast(intent);
    }
}
