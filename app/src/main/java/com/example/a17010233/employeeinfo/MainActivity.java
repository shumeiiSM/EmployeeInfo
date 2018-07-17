package com.example.a17010233.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvInfo;

    ArrayList<EmployeeInfo> alInfoList;

    CustomAdapter caInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvInfo = findViewById(R.id.listViewName);

        alInfoList = new ArrayList<>();

        EmployeeInfo info1 = new EmployeeInfo("John", "Software Technical Leader", 3400.0f);
        EmployeeInfo info2 = new EmployeeInfo("May", "Programer", 2200.0f);
        EmployeeInfo info3 = new EmployeeInfo("John", "Software Technical Leader", 3400.0f);
        EmployeeInfo info4 = new EmployeeInfo("May", "Programer", 2200.0f);
        EmployeeInfo info5 = new EmployeeInfo("John", "Software Technical Leader", 3400.0f);
        EmployeeInfo info6 = new EmployeeInfo("May", "Programer", 2200.0f);
        EmployeeInfo info7 = new EmployeeInfo("John", "Software Technical Leader", 3400.0f);
        EmployeeInfo info8 = new EmployeeInfo("May", "Programer", 2200.0f);
        EmployeeInfo info9 = new EmployeeInfo("John", "Software Technical Leader", 3400.0f);
        EmployeeInfo info10 = new EmployeeInfo("May", "Programer", 2200.0f);
        EmployeeInfo info11 = new EmployeeInfo("John", "Software Technical Leader", 3400.0f);
        EmployeeInfo info12 = new EmployeeInfo("May", "Programer", 2200.0f);
        EmployeeInfo info13 = new EmployeeInfo("John", "Software Technical Leader", 3400.0f);
        EmployeeInfo info14 = new EmployeeInfo("May", "Programer", 2200.0f);
        EmployeeInfo info15 = new EmployeeInfo("John", "Software Technical Leader", 3400.0f);
        EmployeeInfo info16 = new EmployeeInfo("May", "Programer", 2200.0f);
        EmployeeInfo info17 = new EmployeeInfo("John", "Software Technical Leader", 3400.0f);

        alInfoList.add(info1);
        alInfoList.add(info2);
        alInfoList.add(info3);
        alInfoList.add(info4);
        alInfoList.add(info5);
        alInfoList.add(info6);
        alInfoList.add(info7);
        alInfoList.add(info8);
        alInfoList.add(info9);
        alInfoList.add(info10);
        alInfoList.add(info11);
        alInfoList.add(info12);
        alInfoList.add(info13);
        alInfoList.add(info14);
        alInfoList.add(info15);
        alInfoList.add(info16);
        alInfoList.add(info17);

        caInfo = new CustomAdapter(this, R.layout.employee_item, alInfoList);

        lvInfo.setAdapter(caInfo);
    }
}
