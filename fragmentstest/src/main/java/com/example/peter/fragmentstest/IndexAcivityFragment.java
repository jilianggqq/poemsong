package com.example.peter.fragmentstest;

import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
//import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import peter.itu.util.T;

/**
 * A placeholder fragment containing a simple view.
 */
public class IndexAcivityFragment extends Fragment {
    Button btnShowCalculate;
    Button btnViewFragments;
    private static final String Tag = IndexAcivityFragment.class.getSimpleName();

    public IndexAcivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_index_acivity, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnShowCalculate = (Button) getActivity().findViewById(R.id.btnShowCalculate);
        View dl = getActivity().findViewById(R.id.details_layout);
        boolean isLand = false;
        if (dl != null)
            isLand = true;
//        1. show calculate display
        final boolean finalIsLand = isLand;
        btnShowCalculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                T.showLong(getActivity(), "test");
                if (finalIsLand) {
                    Log.d(Tag, "finalIsLand is true");
                    getFragmentManager().beginTransaction().replace(R.id.details_layout, new CalculateFragment()).commit();

                } else {
                    Intent intent = new Intent(getActivity(), CalculateActivity.class);
                    startActivity(intent);
                }
            }
        });

        btnViewFragments = (Button) getActivity().findViewById(R.id.btnFragment);
        btnViewFragments.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                T.showLong(getActivity(), "test");
                Intent intent = new Intent(getActivity(), MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}
