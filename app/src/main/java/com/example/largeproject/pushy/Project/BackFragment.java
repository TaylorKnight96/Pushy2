package com.example.largeproject.pushy.Project;

import android.support.v4.app.Fragment;;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.largeproject.pushy.R;

public class BackFragment extends Fragment{
    private static final String TAG = "BackFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_back, container, false);

        return view;
    }
}
