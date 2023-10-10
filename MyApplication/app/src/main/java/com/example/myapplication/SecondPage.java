package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        Intent intent=getIntent();
        String title = intent.getStringExtra("title");
        String School = intent.getStringExtra("School");
        String studentName = intent.getStringExtra("studentName");
        int RollNo = intent.getIntExtra("RollNo",0);
        int marks = intent.getIntExtra("marks",0);

        TextView txtStudent;
        txtStudent = findViewById(R.id.studentInfo);

        txtStudent.setText("School: "+School+ "\nstudentName: "+studentName +"\nRollNo: "+RollNo +"\nmarks: "+marks);

        getSupportActionBar().setTitle("title");

    }
}