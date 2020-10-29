package com.hfad.scheduledlogs.data.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.hfad.scheduledlogs.data.model.Log;

@Database(entities = {Log.class},version = 1,exportSchema = false)
public abstract class LogDatabase extends RoomDatabase {
    public abstract LogDatabaseDAO mLogDatabaseDAO();
}
