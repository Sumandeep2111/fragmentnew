package com.example.fragmentdemo;


import android.icu.text.Transliterator;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DescriptionFragment extends Fragment {

    public void setPosition_id(long position_id) {
        this.position_id = position_id;
    }

    private long position_id;

    public DescriptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_description, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null){
            TextView title_text = view.findViewById(R.id.title_position);
            TextView description_text = view.findViewById(R.id.description_position);
            position position_text = position.position[(int) position_id];
            title_text.setText(position_text.getTitle());
            description_text.setText(position_text.getDescription());
        }
    }
}
