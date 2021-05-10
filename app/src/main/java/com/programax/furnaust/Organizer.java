package com.programax.furnaust;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.programax.furnaust.views.OreView;

import java.util.ArrayList;

public class Organizer extends AppCompatActivity implements PickerDialog.PickerDialogListener {

    ArrayList<OreView> currentOres;
    FragmentGrid frag_grid;
    PickerDialog picker;
    Button ChangeLayoutButton;
    Button ChangeOreButton;
    FragmentManager FragMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizer);
        picker = new PickerDialog();
        FragMan = getSupportFragmentManager();
        frag_grid = (FragmentGrid) getSupportFragmentManager().findFragmentById(R.id.grid_frag);
        ChangeLayoutButton = findViewById(R.id.ChangeLayoutButton);
        ChangeOreButton = findViewById(R.id.ChangeOreButton);

        ChangeLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                picker.show(FragMan, "f1");
            }
        });

    }

    @Override
    public void onPickLarge(DialogFragment dialog) {
        currentOres = frag_grid.ChangeLayout(18);
    }

    @Override
    public void onPickSmall(DialogFragment dialog) {
        currentOres = frag_grid.ChangeLayout(6);
    }

    @Override
    public void onPickRefinery(DialogFragment dialog) {
        currentOres = frag_grid.ChangeLayout(6);
    }
}