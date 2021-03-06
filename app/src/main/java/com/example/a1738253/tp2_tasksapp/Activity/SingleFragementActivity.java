package com.example.a1738253.tp2_tasksapp.Activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.a1738253.tp2_tasksapp.R;

public abstract class SingleFragementActivity extends AppCompatActivity {

    protected  abstract  Fragment createFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null)
            fragment = createFragment();
        fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
    }


}
