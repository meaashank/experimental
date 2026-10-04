package com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.Ht.ZRu.FA;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class NOt {
    private Context NOt;
    private C0405NOt ZRu;

    public class ZRu extends AbstractCursor {
        private ZRu() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i10) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i10) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i10) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i10) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i10) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i10) {
            return true;
        }
    }

    public NOt(Context context) {
        try {
            this.NOt = context.getApplicationContext();
            if (this.ZRu == null) {
                this.ZRu = new C0405NOt();
            }
        } catch (Throwable unused) {
        }
    }

    public C0405NOt ZRu() {
        return this.ZRu;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.NOt$NOt, reason: collision with other inner class name */
    public class C0405NOt {
        private volatile SQLiteDatabase NOt = null;

        public C0405NOt() {
        }

        private boolean NOt() {
            SQLiteDatabase sQLiteDatabase = this.NOt;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        private void ZRu() {
            boolean zNOt;
            try {
                if (this.NOt != null && this.NOt.isOpen()) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.NOt == null || !this.NOt.isOpen()) {
                            this.NOt = FA.Mm().uR().ZRu(FA.Mm().Ht());
                            this.NOt.setLockingEnabled(false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } finally {
                if (!zNOt) {
                }
            }
        }

        public void ZRu(String str) throws SQLException {
            try {
                ZRu();
                this.NOt.execSQL(str);
            } catch (Throwable th) {
                if (NOt()) {
                    throw th;
                }
            }
        }

        public Cursor ZRu(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                ZRu();
                return this.NOt.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                ZRu zRu = new ZRu();
                if (NOt()) {
                    throw th;
                }
                return zRu;
            }
        }

        public int ZRu(String str, ContentValues contentValues, String str2, String[] strArr) throws Exception {
            try {
                ZRu();
                return this.NOt.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                if (NOt()) {
                    throw e10;
                }
                return 0;
            }
        }

        public long ZRu(String str, String str2, ContentValues contentValues) throws Exception {
            try {
                ZRu();
                return this.NOt.insert(str, str2, contentValues);
            } catch (Exception e10) {
                if (NOt()) {
                    throw e10;
                }
                return -1L;
            }
        }

        public synchronized void ZRu(String str, String str2, List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list) {
            JSONObject jSONObjectMm;
            try {
                try {
                    ZRu();
                    this.NOt.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu = list.get(i10);
                        if (zRu != null && (jSONObjectMm = zRu.Mm()) != null) {
                            contentValues.put("id", zRu.mZ());
                            String strNOt = FA.Mm().yBV().NOt(jSONObjectMm.toString());
                            if (!TextUtils.isEmpty(strNOt)) {
                                contentValues.put("value", strNOt);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.uR() && zRu.aT() > 0 && (zRu.uR() == 0 || zRu.uR() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(zRu.aT()));
                                }
                                this.NOt.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.NOt.setTransactionSuccessful();
                    list.size();
                    if (this.NOt != null) {
                        this.NOt.endTransaction();
                    }
                } catch (Exception e10) {
                    list.size();
                    if (!NOt()) {
                        if (this.NOt != null) {
                            this.NOt.endTransaction();
                        }
                    } else {
                        throw e10;
                    }
                }
            } catch (Throwable th) {
                if (this.NOt != null) {
                    this.NOt.endTransaction();
                }
                throw th;
            }
        }

        public int ZRu(String str, String str2, String[] strArr) throws Exception {
            try {
                ZRu();
                return this.NOt.delete(str, str2, strArr);
            } catch (Exception e10) {
                if (NOt()) {
                    throw e10;
                }
                return 0;
            }
        }
    }
}
