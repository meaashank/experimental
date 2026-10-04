package com.android.launcher3.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.util.Log;
import com.android.launcher3.Utilities;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SQLiteCacheHelper {
    private static final boolean NO_ICON_CACHE = Utilities.isPropertyEnabled(LogConfig.MEMORY_ONLY_ICON_CACHE);
    private static final String TAG = "SQLiteCacheHelper";
    private boolean mIgnoreWrites;
    private final MySQLiteOpenHelper mOpenHelper;
    private final String mTableName;

    public class MySQLiteOpenHelper extends NoLocaleSQLiteHelper {
        public MySQLiteOpenHelper(Context context, String str, int i10) {
            super(context, str, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDB(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + SQLiteCacheHelper.this.mTableName);
            onCreate(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            SQLiteCacheHelper.this.onCreateTable(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 != i11) {
                clearDB(sQLiteDatabase);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 != i11) {
                clearDB(sQLiteDatabase);
            }
        }
    }

    public SQLiteCacheHelper(Context context, String str, int i10, String str2) {
        str = NO_ICON_CACHE ? null : str;
        this.mTableName = str2;
        this.mOpenHelper = new MySQLiteOpenHelper(context, str, i10);
        this.mIgnoreWrites = false;
    }

    private void onDiskFull(SQLiteFullException sQLiteFullException) {
        Log.e(TAG, "Disk full, all write operations will be ignored", sQLiteFullException);
        this.mIgnoreWrites = true;
    }

    public void clear() {
        MySQLiteOpenHelper mySQLiteOpenHelper = this.mOpenHelper;
        mySQLiteOpenHelper.clearDB(mySQLiteOpenHelper.getWritableDatabase());
    }

    public void delete(String str, String[] strArr) {
        if (this.mIgnoreWrites) {
            return;
        }
        try {
            this.mOpenHelper.getWritableDatabase().delete(this.mTableName, str, strArr);
        } catch (SQLiteFullException e10) {
            onDiskFull(e10);
        } catch (SQLiteException e11) {
            Log.d(TAG, "Ignoring sqlite exception", e11);
        }
    }

    public void insertOrReplace(ContentValues contentValues) {
        if (this.mIgnoreWrites) {
            return;
        }
        try {
            this.mOpenHelper.getWritableDatabase().insertWithOnConflict(this.mTableName, null, contentValues, 5);
        } catch (SQLiteFullException e10) {
            onDiskFull(e10);
        } catch (SQLiteException e11) {
            Log.d(TAG, "Ignoring sqlite exception", e11);
        }
    }

    public abstract void onCreateTable(SQLiteDatabase sQLiteDatabase);

    public Cursor query(String[] strArr, String str, String[] strArr2) {
        return this.mOpenHelper.getReadableDatabase().query(this.mTableName, strArr, str, strArr2, null, null, null);
    }
}
