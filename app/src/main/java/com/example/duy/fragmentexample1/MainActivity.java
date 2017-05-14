package com.example.duy.fragmentexample1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getFragmentManager();//quản lý frag
        FragmentTransaction transaction = fragmentManager.beginTransaction(); // begintransaction để đưa frag ment hay thay đổi
        transaction.add(R.id.container,new fragment_main()).commit();
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();//quản lý frag
                FragmentTransaction transaction = fragmentManager.beginTransaction(); // begintransaction để đưa frag ment hay thay đổi
                transaction.replace(R.id.container,new fragment_main()).commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();//quản lý frag
                FragmentTransaction transaction = fragmentManager.beginTransaction(); // begintransaction để đưa frag ment hay thay đổi
                transaction.replace(R.id.container,new fragment2_main()).commit();

            }
        });

    }



}
