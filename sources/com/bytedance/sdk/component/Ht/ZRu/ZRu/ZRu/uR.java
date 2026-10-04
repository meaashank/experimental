package com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.Ht.ZRu.FA;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends SQLiteOpenHelper {
    final Context ZRu;

    public uR(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.ZRu = context;
    }

    private void NOt(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListMZ = mZ(sQLiteDatabase);
        if (arrayListMZ == null || arrayListMZ.size() <= 0) {
            return;
        }
        int size = arrayListMZ.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayListMZ.get(i10);
            i10++;
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", str));
        }
    }

    private void ZRu(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.ZRu.NOt(FA.Mm().uR().NOt()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.uR.mZ(FA.Mm().uR().ZRu()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.Mm.mZ(FA.Mm().uR().uR()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.Ht.ZRu(FA.Mm().uR().TFq()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.Ht.ZRu.Ht.Ht.NOt());
    }

    private ArrayList<String> mZ(SQLiteDatabase sQLiteDatabase) {
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
        } catch (Exception unused) {
        }
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            ZRu(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (i10 <= i11) {
                ZRu(sQLiteDatabase);
            } else {
                NOt(sQLiteDatabase);
                ZRu(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }
}
