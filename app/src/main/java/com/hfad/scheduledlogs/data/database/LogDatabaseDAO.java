package com.hfad.scheduledlogs.data.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.hfad.scheduledlogs.data.model.Log;

import java.util.List;

@Dao
public interface LogDatabaseDAO {
    @Insert
    void insertLog(Log log);

    @Insert
    void insertLogs(Log... logs);

    @Query("SELECT * FROM LogTable WHERE id=:id")
    Log getLog(long id);

    @Update
    void updateLog(Log log);

    @Delete
    void deleteLog(Log log);

    @Query("SELECT * FROM LogTable")
    List<Log> getLogs();
}
