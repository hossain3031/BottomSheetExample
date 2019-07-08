package com.samsolution.bottomsheetexample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private BottomSheetBehavior<LinearLayout> bottomSheetBehavior;

    ListView countryListLV;

    String[] countryListData = {"Bangladesh", "India", "Pakistan", "Dhaka", "Khulna", "Bhola", "Bangladesh", "India", "Pakistan", "Dhaka", "Khulna", "Bhola", "Bangladesh", "India", "Pakistan", "Dhaka", "Khulna", "Bhola", "Bangladesh", "India", "Pakistan", "Dhaka", "Khulna", "Bhola", "Bangladesh", "India", "Pakistan", "Dhaka", "Khulna", "Bhola", "Bangladesh", "India", "Pakistan", "Dhaka", "Khulna", "Bhola"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout bottomsheetlayout = findViewById(R.id.bottomSheet);
        //LinearLayout driverLayout = findViewById(R.id.driverLayout);

        countryListLV = findViewById(R.id.countryList);

        ImageView imgshare = findViewById(R.id.shareimg);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomsheetlayout);

        //STATE_HIDDEN
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);

        countryListLV.setBackgroundColor(Color.WHITE);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, countryListData);
        countryListLV.setAdapter(adapter);
        //STATE_COLLAPSED
        //bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        //STATE_EXPANDED
        //bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

        imgshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //STATE_EXPANDED
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });

        countryListLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, " " + countryListData[position], Toast.LENGTH_SHORT).show();
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
            }
        });
    }
}
