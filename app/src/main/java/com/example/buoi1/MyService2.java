package com.example.buoi1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService2 extends Service {
    public MyService2() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String a = intent.getStringExtra("text");
        int demkta = demkt(a,'A');
        int demktb = demkt(a,'B');
        int demktc = demkt(a,'C');
        int demktd = demkt(a,'D');
        Toast.makeText(getApplicationContext(),"Số ký tự A đếm được là: " + demkta + "\nSố ký tự B đếm được là: " + demktb + "\nSố ký tự C đếm được là: " + demktc + "\nSố ký tự D đếm được là: " + demktd,Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public int demkt(String chuoi, char kt){
        int dem = 0;
        for (int i=0; i<chuoi.length(); i++){
           if (chuoi.charAt(i)==kt){
               dem++;
           }
        }
        return dem;
    }
}
