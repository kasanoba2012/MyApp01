package com.example.myapp01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Spinner manufacturer;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;


    ArrayList<String> carList;
    ArrayAdapter<String> carArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_choose_activity);

        arrayList = new ArrayList<>();
        arrayList.add("기아");
        arrayList.add("현대");
        arrayList.add("아우디");
        arrayList.add("르노삼성");
        arrayList.add("포드");
        arrayList.add("비엠더블유");
        arrayList.add("쌍용");

        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                arrayList);
        manufacturer = (Spinner)findViewById(R.id.manufacturer);
        manufacturer.setAdapter(arrayAdapter);
        manufacturer.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("선택확인", arrayList.get(i));
                if (arrayList.get(i) == "기아") {
                    Log.i("선택확인2", "기아가선택됐다");
                }
                Toast.makeText(getApplicationContext(),arrayList.get(i)+"가 선택되었습니다.",
                        Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    }
}