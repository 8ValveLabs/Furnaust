package com.programax.furnaust;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Organizer extends AppCompatActivity {

    FragmentGrid frag_grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizer);
        frag_grid = (FragmentGrid) getSupportFragmentManager().findFragmentById(R.id.grid_frag);
    }

}