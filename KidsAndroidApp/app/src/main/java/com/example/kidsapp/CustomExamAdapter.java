package com.example.kidsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class CustomExamAdapter extends BaseAdapter {

    Context context;
    String[] alphabets;
    int[] images;
    LayoutInflater inflater;

    public CustomExamAdapter(Context ctx, String[] myAlphabets, int[] myImages){
        this.context = ctx;
        this.alphabets = myAlphabets;
        this.images = myImages;
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
        view = inflater.inflate(R.layout.custom_exam_listview,null, true);

        Random rand_obj = new Random();
        int my_op = rand_obj.nextInt(26);
        int rand_op1 = rand_obj.nextInt(26);
        int rand_op2 = rand_obj.nextInt(26);

        TextView myTextView1 = view.findViewById(R.id.op1);
        TextView myTextView2 = view.findViewById(R.id.op2);
        TextView myTextView3 = view.findViewById(R.id.op3);
        ImageView myImageView = view.findViewById(R.id.imageIcon);

        myTextView1.setText(alphabets[rand_op2]);
        myTextView2.setText(alphabets[my_op]);
        myTextView3.setText(alphabets[rand_op1]);

        myImageView.setImageResource(images[my_op]);
        return view;
    }
}
