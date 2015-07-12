package de.sd.ilmapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sebastian on 04.07.2015.
 */
public class PointDataSource {

    private SQLiteDatabase database;
    private PointDbHelper dbHelper;
    private String[] columns = {
            PointDbHelper.COLUMN_ID,
            PointDbHelper.COLUMN_LAT,
            PointDbHelper.COLUMN_LNG,
            PointDbHelper.COLUMN_SHORTINFO,
            PointDbHelper.COLUMN_LONGINFO,
            PointDbHelper.COLUMN_WEBLINK
    };

    public PointDataSource(Context context) {
        dbHelper = new PointDbHelper(context);

    }

    public void open() throws SQLDataException{
        database = dbHelper.getWritableDatabase();

    }

    public void close() {
        dbHelper.close();
    }

    public Point createPoint(String name) {
        ContentValues values = new ContentValues();
        values.put(PointDbHelper.COLUMN_NAME, name);
        long insertId = database.insert(PointDbHelper.TABLE_POINT,null,values);

        Cursor cursor = database.query(PointDbHelper.TABLE_POINT,
                columns,
                PointDbHelper.COLUMN_ID+ "=" +insertId,
                null,null,null,null);

        cursor.moveToFirst();

        return populatePoint(cursor);
    }



    public PointDataSource(SQLiteDatabase database) {
        this.database = database;
    }

    public List<Point> getAllPoints() {
    List<Point> pointList= new ArrayList<>();
    pointList.add(new Point(1,"Test Arnstadt",50.838116, 10.948692));
        return pointList;
    }

    private Point populatePoint(Cursor cursor){
        int idIndex=cursor.getColumnIndex(PointDbHelper.COLUMN_ID);
        int nameIndex=cursor.getColumnIndex(PointDbHelper.COLUMN_NAME);
        int latIndex=cursor.getColumnIndex(PointDbHelper.COLUMN_LAT);
        int lngIndex=cursor.getColumnIndex(PointDbHelper.COLUMN_LNG);
        int shortInfoIndex=cursor.getColumnIndex(PointDbHelper.COLUMN_SHORTINFO);
        int longInfoIndex=cursor.getColumnIndex(PointDbHelper.COLUMN_LONGINFO);
        int webLinkIndex=cursor.getColumnIndex(PointDbHelper.COLUMN_WEBLINK);

        Point point = new Point(
                cursor.getInt(idIndex),
                cursor.getString(nameIndex),
                cursor.getDouble(latIndex),
                cursor.getDouble(lngIndex));

        return point;
        //7.6 daten speichern
    }
}
