package com.example.rogue_2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moveTaskToBack(true);
    }

    @Override
    public void onResume(){
        super.onResume();
        setContentView(R.layout.activity_main);
    }
}
