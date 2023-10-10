package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    ListView listView;
    Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Button btn;
        btn=findViewById(R.id.btnNext);

        Intent iNext= new Intent(HomePage.this,SecondPage.class);
        iNext.putExtra("title","Student Details");
        iNext.putExtra("School","CarX High school");
        iNext.putExtra("studentName","Shashank");
        iNext.putExtra("RollNo",47);
        iNext.putExtra("marks",420);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iNext);
            }
        });

        listView= findViewById(R.id.listview);
        spin=findViewById(R.id.spin);
        ArrayList<String> arrNames= new ArrayList<>();
        ArrayList<String> arrID= new ArrayList<>();

        arrNames.add("SHASHANK"); arrNames.add("SAHANA");
        arrNames.add("SHANTHA");
        arrNames.add("SAHANA"); arrNames.add("SHAMANTH");
        arrNames.add("SOUMYA"); arrNames.add("RAMYA");
        arrNames.add("KIRAN"); arrNames.add("KEERTHI");
        arrNames.add("HARISH"); arrNames.add("TARA");
        arrNames.add("RASHMI"); arrNames.add("SIRI");
        arrNames.add("ANITHA");arrNames.add("DIGANTH");
        arrNames.add("DHANVI");arrNames.add("SAMIKSHA");
        arrNames.add("SHASHANK");arrNames.add("SAHANA");


        ArrayAdapter<String> adp = new ArrayAdapter<>(getApplication(), android.R.layout.simple_list_item_1,arrNames);

        listView.setAdapter(adp);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Toast.makeText(HomePage.this, "You clicked on the first Item", Toast.LENGTH_SHORT).show();
                }
            }
        });

        arrID.add("Aadhaar card");
        arrID.add("PAN card");
        arrID.add("VoterID");
        arrID.add("Driving Licence");
        arrID.add("Ration Card");

        ArrayAdapter<String> sadp = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arrID);
        spin.setAdapter(sadp);

        AutoCompleteTextView atc= findViewById(R.id.atc);
        ArrayList<String> arrlng= new ArrayList<>();
        arrlng.add("Java");arrlng.add("SQL");arrlng.add("PHP");arrlng.add("MONGODB");arrlng.add("JAVASCRIPT");
        arrlng.add("PYTHON");arrlng.add("C");arrlng.add("C++");arrlng.add("JQUERY");
        arrlng.add("AJAX");arrlng.add("DOTNET");arrlng.add("RUBY");arrlng.add("KAFKA");arrlng.add("DOCKER");

        ArrayAdapter<String> ladp=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrlng);
        atc.setAdapter(ladp);
        atc.setThreshold(1);
    }
}