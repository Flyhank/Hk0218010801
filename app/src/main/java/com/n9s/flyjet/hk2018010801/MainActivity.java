package com.n9s.flyjet.hk2018010801;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity
{
    AutoCompleteTextView act;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String str[] = {"Aaab", "aac", "bbc", "bac", "ccc"};
        act = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this, android.R.layout.simple_list_item_1, str);
        act.setThreshold(1);       //輸入一個字跳出符合選項
        act.setAdapter(adapter);


        String[][] data = 

    }
}
