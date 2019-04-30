package com.example.computer.butterknifeandfragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        FragmentManager fragmentManager = getSupportFragmentManager();
        RecyclerViewFragment fragment = new RecyclerViewFragment();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(android.R.id.content, fragment, "fragment");
        transaction.commit();
    }
}
