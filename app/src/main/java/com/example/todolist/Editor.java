package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.sql.Date;
import java.sql.Struct;

public class Editor extends AppCompatActivity {

    private EditText taskEditText;
    private EditText DeadLineEditTexxt;
    private EditText discriptinEditText;
    private String task;
    private String deadLine;
    private String discription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        taskEditText = findViewById(R.id.editTextTitle);
        taskEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                task = taskEditText.getText().toString();
            }
        });

        DeadLineEditTexxt = findViewById(R.id.editTextDaedLine);
        DeadLineEditTexxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                deadLine = DeadLineEditTexxt.getText().toString();
            }
        });

        discriptinEditText = findViewById(R.id.editTextDsiption);
        discriptinEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                 discription = discriptinEditText.getText().toString();
            }
        });

        EntryDatabase db = Room.databaseBuilder(
                this,
                EntryDatabase.class,
                "ToDoData.db")
                .build();
        EntryDao dao = db.entryDao();

        Entry entry = new Entry();
        entry.task = task;
        entry.deadLine = deadLine;
        entry.discription = discription;
        entry.done = false;
        dao.insert(entry);
    }
}