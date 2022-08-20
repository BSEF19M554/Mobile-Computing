package com.example.databaseapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomBaseAdapter extends BaseAdapter {

    List<StudentModel> list;
    Context context;
    LayoutInflater li;

    public CustomBaseAdapter(Context ctx, List<StudentModel> lst){
        context = ctx;
        list = lst;
        li = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = li.inflate(R.layout.activity_custom_list_view, null);
        TextView t1 = (TextView) view.findViewById(R.id.t1);
        TextView t2 = (TextView) view.findViewById(R.id.t2);
        TextView t3 = (TextView) view.findViewById(R.id.t3);

        boolean bool = list.get(i).isEnroll();

        t1.setText(list.get(i).getName());
        t2.setText(String.valueOf(list.get(i).getRollNmber()));

        if(bool == true)
            t3.setText("Enrolled");
        else
            t3.setText("Not Enrolled");
        return view;
    }
}
