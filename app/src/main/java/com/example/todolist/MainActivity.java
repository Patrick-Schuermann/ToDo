package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button EditorButton = this.findViewById(R.id.buttonToEditor);
        EditorButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, Editor.class);
            startActivity(intent);
        });

        Button doneButton = this.findViewById(R.id.buttonToDone);
        doneButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, DoneList.class);
            startActivity(intent);
        });
    }
}