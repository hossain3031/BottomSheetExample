package com.samsolution.bottomsheetexample;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout bottomsheetlayout;
    private BottomSheetBehavior bottomSheetBehavior;

    ImageView imgshare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomsheetlayout =  findViewById(R.id.bottomSheet);
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

    }
}
