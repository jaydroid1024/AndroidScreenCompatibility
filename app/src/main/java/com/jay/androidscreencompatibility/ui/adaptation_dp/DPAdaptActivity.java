package com.jay.androidscreencompatibility.ui.adaptation_dp;

import com.jay.androidscreencompatibility.R;
import com.jay.androidscreencompatibility.ui.adaptation_density.Density;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DPAdaptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dp_adapt);
    }
}
