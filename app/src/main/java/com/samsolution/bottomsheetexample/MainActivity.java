package com.samsolution.bottomsheetexample;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout bottomsheetlayout, driverLayout;
    private BottomSheetBehavior bottomSheetBehavior;

    ImageView imgshare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomsheetlayout =  findViewById(R.id.bottomSheet);
        driverLayout =  findViewById(R.id.driverLayout);
        imgshare = findViewById(R.id.shareimg);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomsheetlayout);

        //STATE_HIDDEN
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        
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

        driverLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked on Driver Layout", Toast.LENGTH_SHORT).show();
            }
        });
        
    }
}
