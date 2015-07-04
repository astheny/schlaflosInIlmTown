package de.sd.ilmapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.StringReader;

/**
 * Created by Sebastian on 04.07.2015.
 */
public class PointDbHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "point.db";
    public static final int DB_VERSION = 1;
    public static final String TABLE_POINT = "Points";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_LAT = "Lat";
    public static final String COLUMN_LNG = "Lng";
    public static final String COLUMN_SHORTINFO = "shortInfo";
    public static final String COLUMN_LONGINFO = "longInfo";
    public static final String COLUMN_WEBLINK = "webLink";

    public static final String SQL_CREATE =
            "create table"+TABLE_POINT+"("+
                    COLUMN_ID+" integer primary key autoincrement, "+
                    COLUMN_NAME+ " text not null"+
                    COLUMN_LAT+" integer not null"+
                    COLUMN_LNG+" integer not null"+
                    COLUMN_SHORTINFO+" text"+
                    COLUMN_LONGINFO+" text"+
                    COLUMN_WEBLINK+" text);";


    public PointDbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
