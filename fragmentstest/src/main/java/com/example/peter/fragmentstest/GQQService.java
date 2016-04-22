package com.example.peter.fragmentstest;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class GQQService extends Service {
    public GQQService() {
    }

    private static final String SERVICE = "Service";

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
//        Log.d(SERVICE, "onCreate");
        Toast.makeText(this, "The new Service was Created", Toast.LENGTH_LONG).show();

    }

    //
//    public void onStart(Intent intent, int startId) {
//        // For time consuming an long tasks you can launch a new thread here...
//        Log.d(SERVICE, "onStart");
//        Toast.makeText(this, " Service Started", Toast.LENGTH_LONG).show();
//
//    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        Log.d(SERVICE, "onStart");
        Toast.makeText(this, " Service Started", Toast.LENGTH_LONG).show();
        return START_NOT_STICKY; // or START_STICKY, depending on your needs
    }

    @Override
    public void onDestroy() {
        Log.d(SERVICE, "onDestroy");
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();

    }
}