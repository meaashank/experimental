package ua;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import xa.C5800b;

/* JADX INFO: renamed from: ua.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5662b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f239651b = "download_request";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f239652a;

    /* JADX INFO: renamed from: ua.b$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f239653a = "id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f239654b = "url";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f239655c = "download_path";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239656d = "private_path";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f239657e = "flags";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f239658f = "etag";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f239659g = "downloaded_bytes";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f239660h = "total_bytes";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f239661i = "first_created_at";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f239662j = "last_modified_at";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f239663k = "request_params";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String[] f239664l = {"id", "url", "download_path", "private_path", "flags", "etag", "downloaded_bytes", "total_bytes", f239661i, f239662j, f239663k};
    }

    public C5662b(Context context) {
        this.f239652a = C5661a.a(context).getWritableDatabase();
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS download_request( id INTEGER PRIMARY KEY, url VARCHAR, download_path VARCHAR, private_path VARCHAR, flags INTEGER, etag VARCHAR, downloaded_bytes INTEGER, total_bytes INTEGER, first_created_at INTEGER, last_modified_at INTEGER, request_params VARCHAR )");
    }

    public static C5800b h(Cursor cursor) {
        C5800b c5800b = new C5800b();
        c5800b.f240538c = cursor.getLong(cursor.getColumnIndex("id"));
        c5800b.f240539d = cursor.getString(cursor.getColumnIndex("url"));
        c5800b.f240540e = cursor.getString(cursor.getColumnIndex("download_path"));
        c5800b.f240541f = cursor.getString(cursor.getColumnIndex("private_path"));
        c5800b.f240542g = cursor.getInt(cursor.getColumnIndex("flags"));
        c5800b.f240543h = cursor.getString(cursor.getColumnIndex("etag"));
        c5800b.f240544i = cursor.getLong(cursor.getColumnIndex("downloaded_bytes"));
        c5800b.f240545j = cursor.getLong(cursor.getColumnIndex("total_bytes"));
        c5800b.f240546k = cursor.getLong(cursor.getColumnIndex(a.f239661i));
        c5800b.f240547l = cursor.getLong(cursor.getColumnIndex(a.f239662j));
        c5800b.s0(cursor.getString(cursor.getColumnIndex(a.f239663k)));
        return c5800b;
    }

    public static void l(C5800b c5800b, ContentValues contentValues) {
        contentValues.put("url", c5800b.I());
        contentValues.put("download_path", c5800b.o());
        contentValues.put("private_path", c5800b.z());
        contentValues.put("flags", Integer.valueOf(c5800b.s()));
        contentValues.put("etag", c5800b.q());
        contentValues.put("downloaded_bytes", Long.valueOf(c5800b.p()));
        contentValues.put("total_bytes", Long.valueOf(c5800b.H()));
        contentValues.put(a.f239661i, Long.valueOf(c5800b.r()));
        contentValues.put(a.f239662j, Long.valueOf(c5800b.x()));
        contentValues.put(a.f239663k, c5800b.C());
    }

    public void a() {
        try {
            this.f239652a.delete(f239651b, null, null);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [long] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public xa.C5800b d(long r11) throws java.lang.Throwable {
        /*
            r10 = this;
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.f239652a     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            java.lang.String r3 = "download_request"
            java.lang.String[] r4 = ua.C5662b.a.f239664l     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            java.lang.String r5 = "id = ? "
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            if (r11 == 0) goto L2c
            boolean r12 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            if (r12 == 0) goto L2c
            xa.b r1 = h(r11)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            goto L2c
        L25:
            r0 = move-exception
            r12 = r0
            r1 = r11
            goto L41
        L29:
            r0 = move-exception
            r12 = r0
            goto L38
        L2c:
            if (r11 == 0) goto L31
            r11.close()
        L31:
            return r1
        L32:
            r0 = move-exception
            r12 = r0
            goto L41
        L35:
            r0 = move-exception
            r12 = r0
            r11 = r1
        L38:
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L25
            if (r11 == 0) goto L40
            r11.close()
        L40:
            return r1
        L41:
            if (r1 == 0) goto L46
            r1.close()
        L46:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C5662b.d(long):xa.b");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public xa.C5800b e(java.lang.String r11) throws java.lang.Throwable {
        /*
            r10 = this;
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.f239652a     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.String r3 = "download_request"
            java.lang.String[] r4 = ua.C5662b.a.f239664l     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.String r5 = "url = ? "
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            if (r11 == 0) goto L26
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            if (r0 == 0) goto L26
            xa.b r1 = h(r11)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            goto L26
        L21:
            r0 = move-exception
            r1 = r11
            goto L39
        L24:
            r0 = move-exception
            goto L30
        L26:
            if (r11 == 0) goto L2b
            r11.close()
        L2b:
            return r1
        L2c:
            r0 = move-exception
            goto L39
        L2e:
            r0 = move-exception
            r11 = r1
        L30:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L21
            if (r11 == 0) goto L38
            r11.close()
        L38:
            return r1
        L39:
            if (r1 == 0) goto L3e
            r1.close()
        L3e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C5662b.e(java.lang.String):xa.b");
    }

    public List<C5800b> f() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f239652a.query(f239651b, a.f239664l, null, null, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    do {
                        arrayList.add(h(cursorQuery));
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

    public long g(C5800b c5800b) {
        try {
            ContentValues contentValues = new ContentValues();
            l(c5800b, contentValues);
            return this.f239652a.insert(f239651b, null, contentValues);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public void i(long j10) {
        try {
            this.f239652a.delete(f239651b, "id = ? ", new String[]{String.valueOf(j10)});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void j(C5800b c5800b) {
        try {
            ContentValues contentValues = new ContentValues();
            l(c5800b, contentValues);
            this.f239652a.update(f239651b, contentValues, "id = ? ", new String[]{String.valueOf(c5800b.w())});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void k(C5800b c5800b) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("downloaded_bytes", Long.valueOf(c5800b.p()));
            contentValues.put("total_bytes", Long.valueOf(c5800b.H()));
            contentValues.put(a.f239662j, Long.valueOf(c5800b.x()));
            this.f239652a.update(f239651b, contentValues, "id = ? ", new String[]{String.valueOf(c5800b.w())});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
