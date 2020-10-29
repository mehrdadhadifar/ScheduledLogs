package com.hfad.scheduledlogs.data.repository;

import android.content.Context;

import androidx.room.Room;

import com.hfad.scheduledlogs.data.database.LogDatabase;
import com.hfad.scheduledlogs.data.model.Log;
import com.hfad.scheduledlogs.network.NameService;
import com.hfad.scheduledlogs.network.RetrofitInstance;

import retrofit2.Retrofit;


public class LogRepository {
    private static LogRepository sLogRepository;
    private static Context sContext;
    private LogDatabase mLogDatabase;
    private NameService mNameService;

    public static LogRepository getInstance(Context context) {
        sContext = context.getApplicationContext();
        if (sLogRepository == null)
            sLogRepository = new LogRepository();
        return sLogRepository;
    }

    public LogRepository() {
        mLogDatabase = Room.databaseBuilder(sContext
                , LogDatabase.class
                , "LogDB")
                .allowMainThreadQueries().build();
        Retrofit retrofit = RetrofitInstance.getInstance();
        mNameService = retrofit.create(NameService.class);
    }

    public void insertLog(Log log) {
        mLogDatabase.mLogDatabaseDAO().insertLog(log);
    }
}
