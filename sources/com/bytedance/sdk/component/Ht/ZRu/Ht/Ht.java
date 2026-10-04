package com.bytedance.sdk.component.Ht.ZRu.Ht;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Ht implements TFq {
    private Context ZRu;

    public Ht(Context context) {
        this.ZRu = context;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.Ht.TFq
    public void NOt(uR uRVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", uRVar.ZRu());
        contentValues.put("url", uRVar.NOt());
        contentValues.put("replaceholder", Integer.valueOf(uRVar.mZ() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(uRVar.uR()));
        contentValues.put("error_code", uRVar.Mm());
        contentValues.put("error_msg", uRVar.Vor());
        contentValues.put("url_type", Integer.valueOf(uRVar.TFq()));
        contentValues.put("ad_id", uRVar.Ht());
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.mZ.ZRu(this.ZRu, "trackurl", contentValues, "id=?", new String[]{uRVar.ZRu()});
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.Ht.TFq
    public List<uR> ZRu() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorZRu = com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.mZ.ZRu(this.ZRu, "trackurl", null, null, null, null, null, null);
        if (cursorZRu != null) {
            while (cursorZRu.moveToNext()) {
                try {
                    try {
                        String string = cursorZRu.getString(cursorZRu.getColumnIndex("id"));
                        String string2 = cursorZRu.getString(cursorZRu.getColumnIndex("url"));
                        boolean z10 = cursorZRu.getInt(cursorZRu.getColumnIndex("replaceholder")) > 0;
                        int i10 = cursorZRu.getInt(cursorZRu.getColumnIndex("retry"));
                        int i11 = cursorZRu.getInt(cursorZRu.getColumnIndex("url_type"));
                        String string3 = cursorZRu.getString(cursorZRu.getColumnIndex("ad_id"));
                        String string4 = cursorZRu.getString(cursorZRu.getColumnIndex("error_code"));
                        String string5 = cursorZRu.getString(cursorZRu.getColumnIndex("error_msg"));
                        uR uRVar = new uR(string, string2, z10, i11, string3);
                        uRVar.ZRu(i10);
                        if (!TextUtils.isEmpty(string4)) {
                            uRVar.ZRu(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            uRVar.NOt(string5);
                        }
                        linkedList.add(uRVar);
                    } catch (Throwable unused) {
                        return linkedList;
                    }
                } finally {
                    cursorZRu.close();
                }
            }
            return linkedList;
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.Ht.TFq
    public void mZ(uR uRVar) {
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.mZ.ZRu(this.ZRu, "trackurl", "id=?", new String[]{uRVar.ZRu()});
    }

    public static String NOt() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.Ht.TFq
    public uR ZRu(String str) {
        Cursor cursorZRu = com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.mZ.ZRu(this.ZRu, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (cursorZRu != null && cursorZRu.moveToFirst()) {
            try {
                String string = cursorZRu.getString(cursorZRu.getColumnIndex("id"));
                String string2 = cursorZRu.getString(cursorZRu.getColumnIndex("url"));
                boolean z10 = cursorZRu.getInt(cursorZRu.getColumnIndex("replaceholder")) > 0;
                int i10 = cursorZRu.getInt(cursorZRu.getColumnIndex("retry"));
                int i11 = cursorZRu.getInt(cursorZRu.getColumnIndex("url_type"));
                String string3 = cursorZRu.getString(cursorZRu.getColumnIndex("ad_id"));
                String string4 = cursorZRu.getString(cursorZRu.getColumnIndex("error_code"));
                String string5 = cursorZRu.getString(cursorZRu.getColumnIndex("error_msg"));
                uR uRVar = new uR(string, string2, z10, i11, string3);
                uRVar.ZRu(i10);
                if (!TextUtils.isEmpty(string4)) {
                    uRVar.ZRu(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    uRVar.NOt(string5);
                }
                return uRVar;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    cursorZRu.close();
                    cursorZRu = null;
                } finally {
                    cursorZRu.close();
                }
            }
        }
        if (cursorZRu != null) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.Ht.TFq
    public void ZRu(uR uRVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", uRVar.ZRu());
        contentValues.put("url", uRVar.NOt());
        contentValues.put("replaceholder", Integer.valueOf(uRVar.mZ() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(uRVar.uR()));
        contentValues.put("url_type", Integer.valueOf(uRVar.TFq()));
        contentValues.put("ad_id", uRVar.Ht());
        contentValues.put("error_code", uRVar.Mm());
        contentValues.put("error_msg", uRVar.Vor());
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.mZ.ZRu(this.ZRu, "trackurl", contentValues);
    }
}
