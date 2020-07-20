package com.example.buoi1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String id = intent.getStringExtra("id");
        String name = intent.getStringExtra("name");
        String lop = intent.getStringExtra("lop");
        String content = "Thêm sinh viên thành công.\n Thông tin sinh viên:\n"+id+" - " + name;
        content +="\nLớp: " + lop;
        Toast.makeText(getApplicationContext(), content,Toast.LENGTH_SHORT).show();
//        int demkta = demkt(data,'L');
//        Toast.makeText(getApplicationContext(),"Số ký tự A đếm được là: " + demkta,Toast.LENGTH_SHORT).show();

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Destroy Service",Toast.LENGTH_SHORT).show();

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
