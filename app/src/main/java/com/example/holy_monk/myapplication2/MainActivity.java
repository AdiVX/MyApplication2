package com.example.holy_monk.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void testUpload()
    {
        int i = 123 + 123;
        int ab = 87 * 9824;
        int ii = i + ab;
    }
}
