package ua;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import ta.C5626a;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f239665b = "downloaded_file";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f239666a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f239667a = "id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f239668b = "url";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f239669c = "download_path";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239670d = "private_path";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f239671e = "total_bytes";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f239672f = "created_at";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String[] f239673g = {"id", "url", "download_path", "private_path", "total_bytes", f239672f};
    }

    public c(Context context) {
        this.f239666a = C5661a.a(context).getWritableDatabase();
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloaded_file( id INTEGER PRIMARY KEY, url VARCHAR, download_path VARCHAR, private_path VARCHAR, total_bytes INTEGER, created_at INTEGER )");
    }

    public static C5626a i(C5626a c5626a, Cursor cursor) {
        c5626a.j(cursor.getLong(cursor.getColumnIndex("id")));
        c5626a.m(cursor.getString(cursor.getColumnIndex("url")));
        c5626a.i(cursor.getString(cursor.getColumnIndex("download_path")));
        c5626a.k(cursor.getString(cursor.getColumnIndex("private_path")));
        c5626a.l(cursor.getLong(cursor.getColumnIndex("total_bytes")));
        c5626a.h(cursor.getLong(cursor.getColumnIndex(a.f239672f)));
        return c5626a;
    }

    public static void m(C5626a c5626a, ContentValues contentValues) {
        contentValues.put("url", c5626a.g());
        contentValues.put("download_path", c5626a.c());
        contentValues.put("private_path", c5626a.e());
        contentValues.put("total_bytes", Long.valueOf(c5626a.f()));
        contentValues.put(a.f239672f, Long.valueOf(c5626a.b()));
    }

    public void a() {
        try {
            this.f239666a.delete(f239665b, null, null);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ta.C5626a d(long r11) throws java.lang.Throwable {
        /*
            r10 = this;
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.f239666a     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3a
            java.lang.String r3 = "downloaded_file"
            java.lang.String[] r4 = ua.c.a.f239673g     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3a
            java.lang.String r5 = "id = ? "
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3a
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3a
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3a
            if (r11 == 0) goto L31
            boolean r12 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2e
            if (r12 == 0) goto L31
            ta.a r12 = new ta.a     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2e
            r12.<init>()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2e
            i(r12, r11)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2e
            r1 = r12
            goto L31
        L2a:
            r0 = move-exception
            r12 = r0
            r1 = r11
            goto L46
        L2e:
            r0 = move-exception
            r12 = r0
            goto L3d
        L31:
            if (r11 == 0) goto L36
            r11.close()
        L36:
            return r1
        L37:
            r0 = move-exception
            r12 = r0
            goto L46
        L3a:
            r0 = move-exception
            r12 = r0
            r11 = r1
        L3d:
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L2a
            if (r11 == 0) goto L45
            r11.close()
        L45:
            return r1
        L46:
            if (r1 == 0) goto L4b
            r1.close()
        L4b:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.c.d(long):ta.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ta.C5626a e(java.lang.String r11) throws java.lang.Throwable {
        /*
            r10 = this;
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.f239666a     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            java.lang.String r3 = "downloaded_file"
            java.lang.String[] r4 = ua.c.a.f239673g     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            java.lang.String r5 = "url = ? "
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            if (r11 == 0) goto L2b
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            if (r0 == 0) goto L2b
            ta.a r0 = new ta.a     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            i(r0, r11)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            r1 = r0
            goto L2b
        L26:
            r0 = move-exception
            r1 = r11
            goto L3e
        L29:
            r0 = move-exception
            goto L35
        L2b:
            if (r11 == 0) goto L30
            r11.close()
        L30:
            return r1
        L31:
            r0 = move-exception
            goto L3e
        L33:
            r0 = move-exception
            r11 = r1
        L35:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L26
            if (r11 == 0) goto L3d
            r11.close()
        L3d:
            return r1
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.c.e(java.lang.String):ta.a");
    }

    public List<C5626a> f() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f239666a.query(f239665b, a.f239673g, null, null, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    do {
                        C5626a c5626a = new C5626a();
                        i(c5626a, cursorQuery);
                        arrayList.add(c5626a);
                    } while (cursorQuery.moveToNext());
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                    return arrayList;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public List<C5626a> g(int i10) {
        ArrayList arrayList = new ArrayList();
        long j10 = ((long) (i10 * 86400)) * 1000;
        Cursor cursorRawQuery = null;
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() - j10;
                cursorRawQuery = this.f239666a.rawQuery("SELECT * FROM downloaded_file WHERE created_at <= " + jCurrentTimeMillis, null);
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    do {
                        C5626a c5626a = new C5626a();
                        i(c5626a, cursorRawQuery);
                        arrayList.add(c5626a);
                    } while (cursorRawQuery.moveToNext());
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return arrayList;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public long h(C5626a c5626a) {
        try {
            ContentValues contentValues = new ContentValues();
            m(c5626a, contentValues);
            return this.f239666a.insert(f239665b, null, contentValues);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public void j(long j10) {
        try {
            this.f239666a.delete(f239665b, "id = ? ", new String[]{String.valueOf(j10)});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void k(String str) {
        try {
            this.f239666a.delete(f239665b, "url = ? ", new String[]{str});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void l(C5626a c5626a) {
        try {
            ContentValues contentValues = new ContentValues();
            m(c5626a, contentValues);
            this.f239666a.update(f239665b, contentValues, "id = ? ", new String[]{String.valueOf(c5626a.d())});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
