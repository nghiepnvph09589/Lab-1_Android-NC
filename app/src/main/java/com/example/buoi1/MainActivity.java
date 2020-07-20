package com.example.buoi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    String id = "PH09589";
    String name = "NghiepNV";
    String lop = "PT15251";
    EditText editText, edText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edText);
//        edText2 = findViewById(R.id.edText2);
    }


    public void star(View view) {
        intent = new Intent(MainActivity.this,MyService.class);
        intent.putExtra("id",id);
        intent.putExtra("name",name);
        intent.putExtra("lop",lop);
        startService(intent);
    }

    public void stop(View view) {
        intent = new Intent(MainActivity.this,MyService.class);
        stopService(intent);
    }

    public void tim(View view) {
        intent = new Intent(MainActivity.this,MyService2.class);
        String a = editText.getText().toString();
//        String kt = edText2.getText().toString().toCharArray();
        intent.putExtra("text", a);

//        Toast.makeText(getApplicationContext(),a,Toast.LENGTH_SHORT).show();
        startService(intent);
    }
}
