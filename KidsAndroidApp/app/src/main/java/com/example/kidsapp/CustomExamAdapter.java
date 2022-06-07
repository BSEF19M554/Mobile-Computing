package com.example.kidsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
        return 5;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public int indexOf(String[] arr, String key){
        for(int i=0; i<arr.length; i++){
            if(key.equals(arr[i]))
                return i;
        }
        return -1;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.custom_exam_listview,null, true);

        TextView myTextView1 = view.findViewById(R.id.op1);
        TextView myTextView2 = view.findViewById(R.id.op2);
        TextView myTextView3 = view.findViewById(R.id.op3);
        ImageView myImageView = view.findViewById(R.id.imageIcon);

        Random rand_obj = new Random();
        int my_op = rand_obj.nextInt(26);
        int rand_op1 = rand_obj.nextInt(26);
        int rand_op2 = rand_obj.nextInt(26);

        switch(my_op%3){
            case 0:
                myTextView1.setText(alphabets[my_op]);
                myTextView2.setText(alphabets[rand_op1]);
                myTextView3.setText(alphabets[rand_op2]);
                myImageView.setImageResource(images[my_op]);
                break;

            case 1:
                myTextView1.setText(alphabets[rand_op1]);
                myTextView2.setText(alphabets[my_op]);
                myTextView3.setText(alphabets[rand_op2]);
                myImageView.setImageResource(images[my_op]);
                break;

            case 2:
                myTextView1.setText(alphabets[rand_op1]);
                myTextView2.setText(alphabets[rand_op2]);
                myTextView3.setText(alphabets[my_op]);
                myImageView.setImageResource(images[my_op]);
                break;
        }

        myTextView1.setOnClickListener(view1 -> {
            String text = myTextView1.getText().toString();
            int index = indexOf(alphabets, text);

            if(index == my_op)
                Toast.makeText(view1.getContext(), "Correct", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(view1.getContext(), "Wrong", Toast.LENGTH_SHORT).show();
        });

        myTextView2.setOnClickListener(view12 -> {
            String text = myTextView2.getText().toString();
            int index = indexOf(alphabets, text);

            if(index == my_op)
                Toast.makeText(view12.getContext(), "Correct", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(view12.getContext(), "Wrong", Toast.LENGTH_SHORT).show();
        });

        myTextView3.setOnClickListener(view13 -> {
            String text = myTextView3.getText().toString();
            int index = indexOf(alphabets, text);

            if(index == my_op)
                Toast.makeText(view13.getContext(), "Correct", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(view13.getContext(), "Wrong", Toast.LENGTH_SHORT).show();
        });

        return view;
    }
}
