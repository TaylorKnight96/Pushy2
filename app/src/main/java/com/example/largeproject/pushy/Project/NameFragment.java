package com.example.largeproject.pushy.Project;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.largeproject.pushy.Utils.CustomListAdapter;
import com.example.largeproject.pushy.R;
import com.example.largeproject.pushy.Utils.Project;

import java.util.ArrayList;

public class NameFragment extends Fragment{
    private static final String TAG = "NameFragment";

    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_name, container, false);
        listView = (ListView) view.findViewById(R.id.listView);

        ArrayList<Project> projects = new ArrayList<>();
        projects.add(new Project("OOP", "#FF913636"));
        projects.add(new Project("CS2", "#63bb91"));
        projects.add(new Project("OS", "#a5c268"));
        projects.add(new Project("Discrete", "#63bb91"));

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), R.layout.activity_project_card, projects);
        listView.setAdapter(adapter);

        return view;
    }
}
