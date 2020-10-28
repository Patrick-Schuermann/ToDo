package com.example.todolist;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.RoomDatabase;



@Entity
    public class Entry {
        @PrimaryKey(autoGenerate = true)
        public int id;
        @ColumnInfo
        public String task;
        public String deadLine;
        public String discription;
        boolean done;
    }

