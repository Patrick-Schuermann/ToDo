package com.example.todolist;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Entry.class}, version = 1)
public abstract class EntryDatabase extends RoomDatabase {
    public abstract EntryDao entryDao();
}