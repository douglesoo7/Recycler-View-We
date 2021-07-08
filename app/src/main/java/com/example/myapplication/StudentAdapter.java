package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    private ArrayList<Student> studentsList;
    public StudentAdapter(ArrayList<Student> studentsList){
        this.studentsList=studentsList;

    }

    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student= studentsList.get(position);
        holder.setData(student);
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }
}
