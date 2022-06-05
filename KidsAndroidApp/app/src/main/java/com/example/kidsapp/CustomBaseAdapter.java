package com.example.kidsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String[] alphabets;
    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx, String[] myAlphabets){
        this.context = ctx;
        this.alphabets = myAlphabets;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return alphabets.length;
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
        view = inflater.inflate(R.layout.custom_lesson_listview,null, true);
        TextView myTextView1 = view.findViewById(R.id.textView4);

        myTextView1.setText(alphabets[i]);
        return view;
    }
}
