package weeklyfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import application.first.ant.antdeveloperapplication.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Day3Fragment extends Fragment {


    public Day3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_day3, container, false);
    }

}
