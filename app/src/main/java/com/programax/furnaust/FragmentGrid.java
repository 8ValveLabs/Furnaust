package com.programax.furnaust;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.widget.GridLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.programax.furnaust.views.OreView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentGrid#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentGrid extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    private GridLayout bounds;
    private ArrayList<OreView> OreViews;


    private ArrayList<OreView> ChangeLayout(int GridSize)
    {
        OreViews = new ArrayList<OreView>(GridSize+1);
        OreView ore;
        for (int ctr = 0; ctr < GridSize; ctr++){
            ore = new OreView(getContext());
            ore.setImageResource(R.drawable.empty_grid);
            bounds.addView(ore);
            OreViews.add(ore);
        }
        return OreViews;
    }

    public FragmentGrid() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_grid.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentGrid newInstance(String param1, String param2) {
        FragmentGrid fragment = new FragmentGrid();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bounds = getView().findViewById(R.id.bounds);
        OreViews = ChangeLayout(18);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_grid, container, false);

    }
}