package com.dsc.tesyant.sukacare.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dsc.tesyant.sukacare.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class tabRequest extends Fragment {


    public tabRequest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_request, container, false);
    }

}
