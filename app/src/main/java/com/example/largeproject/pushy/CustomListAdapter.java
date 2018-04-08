package com.example.largeproject.pushy;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.largeproject.pushy.Utils.Project;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<Project>{
    private static final String TAG = "CustomListAdapter";

    private Context curContext;
    private int curResource;
    private int lastPosition = -1;

    private static class ViewHolder
    {
        TextView projectName;
        Integer color;
    }

    public CustomListAdapter(Context context,int resource, ArrayList<Project> projects)
    {
        super(context, resource, projects);
        curContext = context;
        curResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        String name = getItem(position).getName();
        String color = getItem(position).getColor();

        try
        {
            final View result;

            ViewHolder holder;

            if(convertView == null)
            {
                LayoutInflater inflater = LayoutInflater.from(curContext);
                convertView = inflater.inflate(curResource, parent, false);
                holder = new ViewHolder();
                holder.projectName = (TextView) convertView.findViewById(R.id.projectCardTitle);
                result = convertView;
                convertView.setTag(holder);
            }
            else
            {
                holder = (ViewHolder) convertView.getTag();
                result = convertView;
            }

            lastPosition = position;

            holder.projectName.setText(name);
            holder.projectName.setBackgroundColor(Color.parseColor(color));

            return convertView;
        }
        catch (IllegalArgumentException e){
            Log.e(TAG, "getView: IllegalArgumentException: " + e.getMessage());
            return convertView;
        }



    }

}
