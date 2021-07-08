package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildStudentList();
        setRecyclerView();
    }

    private void initViews(){
        mRecyclerView=findViewById(R.id.recyclerView);
    }

    private void buildStudentList() {
        studentList =new ArrayList<>();
        Student student1=new Student("Anush", 23, "Emp123");
        studentList.add(student1);

        Student student2=new Student("Amol", 22, "Emp124");
        studentList.add(student2);

        for(int i=3;i<16;i++){
            Student student=new Student("Student "+i, 21,"Emp12"+2+i);
            studentList.add(student);
        }
    }

    private void setRecyclerView(){
        StudentAdapter studentAdapter=new StudentAdapter(studentList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(studentAdapter);
    }

}