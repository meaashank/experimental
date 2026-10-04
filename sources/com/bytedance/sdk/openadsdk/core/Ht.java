package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class Ht {
    private static final Object mZ = new Object();
    private Context NOt;
    private mZ ZRu;

    public class NOt extends AbstractCursor {
        private NOt() {
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

    public Ht(Context context) {
        try {
            this.NOt = context == null ? WMI.ZRu() : context.getApplicationContext();
            if (this.ZRu == null) {
                this.ZRu = new mZ();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context mZ() {
        Context context = this.NOt;
        return context == null ? WMI.ZRu() : context;
    }

    public class mZ {
        private SQLiteDatabase NOt = null;

        public mZ() {
        }

        private synchronized boolean Ht() {
            SQLiteDatabase sQLiteDatabase = this.NOt;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.inTransaction()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized void TFq() {
            try {
                synchronized (Ht.mZ) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.NOt;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            Ht ht = Ht.this;
                            SQLiteDatabase writableDatabase = ht.new ZRu(ht.mZ()).getWritableDatabase();
                            this.NOt = writableDatabase;
                            writableDatabase.setLockingEnabled(false);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lp.ZRu("DBHelper", th.getMessage());
                if (Ht()) {
                    throw th;
                }
            }
        }

        public synchronized void NOt() {
            TFq();
            SQLiteDatabase sQLiteDatabase = this.NOt;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public SQLiteDatabase ZRu() {
            TFq();
            return this.NOt;
        }

        public synchronized void mZ() {
            TFq();
            SQLiteDatabase sQLiteDatabase = this.NOt;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void uR() {
            TFq();
            SQLiteDatabase sQLiteDatabase = this.NOt;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        public synchronized void ZRu(String str) throws SQLException {
            try {
                TFq();
                this.NOt.execSQL(str);
            } catch (Throwable th) {
                if (Ht()) {
                    throw th;
                }
            }
        }

        public synchronized Cursor ZRu(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                TFq();
                cursorQuery = this.NOt.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lp.ZRu("DBHelper", th.getMessage());
                NOt nOt = new NOt();
                if (Ht()) {
                    throw th;
                }
                cursorQuery = nOt;
            }
            return cursorQuery;
        }

        public synchronized int ZRu(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                TFq();
                iUpdate = this.NOt.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.lp.ZRu("DBHelper", e10.getMessage());
                if (Ht()) {
                    throw e10;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        public synchronized long ZRu(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                TFq();
                jReplace = this.NOt.replace(str, str2, contentValues);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.lp.ZRu("DBHelper", e10.getMessage());
                if (Ht()) {
                    throw e10;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        public synchronized int ZRu(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                TFq();
                iDelete = this.NOt.delete(str, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.lp.ZRu("DBHelper", e10.getMessage());
                if (Ht()) {
                    throw e10;
                }
                iDelete = 0;
            }
            return iDelete;
        }
    }

    public mZ ZRu() {
        return this.ZRu;
    }

    public class ZRu extends SQLiteOpenHelper {
        final Context ZRu;

        public ZRu(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 11);
            this.ZRu = context;
        }

        private void NOt(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.ZH.ZRu.mZ.uR());
        }

        private void ZRu(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uR.uR.ZRu());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uR.Vor.mZ());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uR.edo.ZRu());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uR.sAl.ZRu());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.Zf.NOt.ZRu());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uR.yBV.mZ());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.ZRu.NOt.NOt.mZ());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.ZH.ZRu.mZ.mZ());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uR.oK.ZRu());
        }

        private void mZ(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayListUR = uR(sQLiteDatabase);
            if (arrayListUR == null || arrayListUR.size() <= 0) {
                return;
            }
            int size = arrayListUR.size();
            int i10 = 0;
            while (i10 < size) {
                String str = arrayListUR.get(i10);
                i10++;
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", str));
            }
        }

        private ArrayList<String> uR(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        String string = cursorRawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return arrayList;
                }
            } catch (Exception unused) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
            return arrayList;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                ZRu(sQLiteDatabase, this.ZRu);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lp.ZRu("DBHelper", th.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 > i11) {
                try {
                    mZ(sQLiteDatabase);
                    ZRu(sQLiteDatabase, Ht.this.NOt);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.NOt(th.getMessage());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0012 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0016 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            /*
                r0 = this;
                if (r2 <= r3) goto L5
                r0.mZ(r1)     // Catch: java.lang.Throwable -> L43
            L5:
                com.bytedance.sdk.openadsdk.core.Ht r3 = com.bytedance.sdk.openadsdk.core.Ht.this     // Catch: java.lang.Throwable -> L43
                android.content.Context r3 = com.bytedance.sdk.openadsdk.core.Ht.NOt(r3)     // Catch: java.lang.Throwable -> L43
                r0.ZRu(r1, r3)     // Catch: java.lang.Throwable -> L43
                switch(r2) {
                    case 1: goto L40;
                    case 2: goto L37;
                    case 3: goto L2c;
                    case 4: goto L21;
                    case 5: goto L16;
                    case 6: goto L12;
                    default: goto L11;
                }     // Catch: java.lang.Throwable -> L43
            L11:
                goto L43
            L12:
                r0.ZRu(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L16:
                java.lang.String r3 = com.bytedance.sdk.openadsdk.uR.sAl.ZRu()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.ZRu(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L21:
                java.lang.String r3 = com.bytedance.sdk.component.adexpress.ZRu.NOt.NOt.mZ()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.ZRu(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L2c:
                java.lang.String r3 = com.bytedance.sdk.openadsdk.uR.edo.ZRu()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.ZRu(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L37:
                java.lang.String r3 = "DROP TABLE IF EXISTS 'ad_video_info';"
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.ZRu(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L40:
                r0.ZRu(r1)     // Catch: java.lang.Throwable -> L43
            L43:
                r3 = 11
                if (r2 >= r3) goto L58
                r0.NOt(r1)     // Catch: java.lang.Throwable -> L4e
                com.bytedance.sdk.openadsdk.Zf.NOt.ZRu(r1)     // Catch: java.lang.Throwable -> L4e
                goto L58
            L4e:
                r1 = move-exception
                java.lang.String r2 = "DBHelper"
                java.lang.String r1 = r1.getMessage()
                com.bytedance.sdk.component.utils.lp.ZRu(r2, r1)
            L58:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.Ht.ZRu.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
        }

        private void ZRu(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uR.uR.NOt());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uR.Vor.uR());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uR.edo.NOt());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uR.sAl.NOt());
        }
    }
}
