package com.example.sam.horizontalcardview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> headingInput;
    private ArrayList<String> date;
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> headingInput, ArrayList<String> date, Context mContext) {
        this.headingInput = headingInput;
        this.date = date;
        this.mContext = mContext;
    }

    //vars


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_news,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        viewHolder.heading.setText(headingInput.get(position));
        viewHolder.date.setText(date.get(position));
        viewHolder.dot.setImageResource(R.drawable.bluebullet);
        viewHolder.article.setText("Article");
        viewHolder.view.setText("View");
        viewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Opening Blog", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return headingInput.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        TextView heading,date,article;
        Button view;
        ImageView dot;

        public ViewHolder( View itemView) {
            super(itemView);
            heading = itemView.findViewById(R.id.heading);
            date = itemView.findViewById(R.id.date);
            article = itemView.findViewById(R.id.article);
            view = itemView.findViewById(R.id.view);
            dot = itemView.findViewById(R.id.dot);

        }
    }
}
