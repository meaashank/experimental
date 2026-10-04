package com.bytedance.sdk.openadsdk.yBV.ZRu;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.lp;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu extends SQLiteOpenHelper {
    private static volatile ZRu NOt;
    final Context ZRu;

    private ZRu(Context context) {
        super(context, "pag_monitor.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.ZRu = context;
    }

    public static SQLiteDatabase NOt() {
        try {
            ZRu zRuMZ = mZ();
            if (zRuMZ == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = zRuMZ.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    public static SQLiteDatabase ZRu() {
        try {
            ZRu zRuMZ = mZ();
            if (zRuMZ == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = zRuMZ.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    private static ZRu mZ() {
        if (NOt == null) {
            synchronized (ZRu.class) {
                try {
                    if (NOt == null) {
                        NOt = new ZRu(com.bytedance.sdk.openadsdk.yBV.ZRu.ZRu());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return NOt;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )");
        } catch (Throwable th) {
            Log.e("MonitorSQLiteOpenHelper", th.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (i10 <= i11) {
                onCreate(sQLiteDatabase);
            } else {
                ZRu(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    private ArrayList<String> NOt(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                cursorRawQuery.close();
            }
            return arrayList;
        } catch (Exception e10) {
            lp.ZRu("MonitorSQLiteOpenHelper", e10.getMessage());
            return arrayList;
        }
    }

    private void ZRu(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListNOt = NOt(sQLiteDatabase);
        if (arrayListNOt == null || arrayListNOt.size() <= 0) {
            return;
        }
        int size = arrayListNOt.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayListNOt.get(i10);
            i10++;
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", str));
        }
    }
}
