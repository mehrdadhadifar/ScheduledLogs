package com.hfad.scheduledlogs.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "LogTable")
public class Log {
    @PrimaryKey(autoGenerate = true)
    long id;
    @ColumnInfo(name = "date")
    String mDate;
    @ColumnInfo(name = "time")
    String mTime;
    @ColumnInfo(name = "name")
    String mName;
    @ColumnInfo(name = "wifiState")
    String mWifiState;

    public Log() {
    }
}
