package com.prism.fusionadsdk.internal.history;

import J6.f;
import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import androidx.appcompat.widget.O;
import w.y;

/* JADX INFO: loaded from: classes6.dex */
public class AdHistoryProvider extends ContentProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f162309b = "765-AdHistoryProvider";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f162310c = "com.app.hider.master.promax";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f162311a;

    public static class a extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f162312c = "lj_ads123.prismtd.db";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f162313d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f162314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f162315b;

        public a(Context context) {
            super(context, f162312c, (SQLiteDatabase.CursorFactory) null, 1);
            this.f162314a = -1L;
            this.f162315b = context;
            try {
                this.f162314a = f(getWritableDatabase());
            } catch (Exception e10) {
                try {
                    if (f.n() != null) {
                        f.f53216p.a(context, "initialize_max_item_id_error").c("reason", e10.getMessage()).b();
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public static long e(SQLiteDatabase sQLiteDatabase, String str) {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT MAX(_id) FROM " + str, null);
            long j10 = (cursorRawQuery == null || !cursorRawQuery.moveToNext()) ? -1L : cursorRawQuery.getLong(0);
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            if (j10 != -1) {
                return j10;
            }
            throw new RuntimeException(y.a("Error: could not query max id in ", str));
        }

        public void a(ContentValues contentValues) {
            this.f162314a = Math.max(contentValues.getAsLong("_id").longValue(), this.f162314a);
        }

        public long d() {
            if (this.f162314a < 0) {
                this.f162314a = f(getWritableDatabase());
            }
            long j10 = this.f162314a + 1;
            this.f162314a = j10;
            return j10;
        }

        public final long f(SQLiteDatabase sQLiteDatabase) {
            try {
                return e(sQLiteDatabase, com.prism.fusionadsdk.internal.history.a.f162319a);
            } catch (Throwable th) {
                try {
                    f.n().a(this.f162315b, "initializeMaxItemId").c("reason", th.getMessage()).b();
                    return 0L;
                } catch (Throwable unused) {
                    return 0L;
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            com.prism.fusionadsdk.internal.history.a.a(sQLiteDatabase, true);
            this.f162314a = f(sQLiteDatabase);
            String unused = AdHistoryProvider.f162309b;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        }
    }

    public static long c(a aVar, SQLiteDatabase sQLiteDatabase, String str, String str2, ContentValues contentValues) {
        if (contentValues == null) {
            throw new RuntimeException("Error: attempting to insert null values");
        }
        if (!contentValues.containsKey("_id")) {
            throw new RuntimeException("Error: attempting to add item without specifying an id");
        }
        aVar.a(contentValues);
        return sQLiteDatabase.insert(str, str2, contentValues);
    }

    public void b() {
        if (this.f162311a == null) {
            this.f162311a = new a(getContext());
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        b();
        b bVar = new b(uri, str, strArr);
        return this.f162311a.getWritableDatabase().delete(bVar.f162316a, bVar.f162317b, bVar.f162318c);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        b();
        b bVar = new b(uri);
        SQLiteDatabase writableDatabase = this.f162311a.getWritableDatabase();
        contentValues.put("_id", Long.valueOf(this.f162311a.d()));
        long jC = c(this.f162311a, writableDatabase, bVar.f162316a, null, contentValues);
        if (jC < 0) {
            return null;
        }
        return ContentUris.withAppendedId(uri, jC);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        b();
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        b();
        b bVar = new b(uri, str, strArr2);
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables(bVar.f162316a);
        Cursor cursorQuery = sQLiteQueryBuilder.query(this.f162311a.getWritableDatabase(), strArr, bVar.f162317b, bVar.f162318c, null, null, str2);
        cursorQuery.setNotificationUri(getContext().getContentResolver(), uri);
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        b();
        b bVar = new b(uri, str, strArr);
        return this.f162311a.getWritableDatabase().update(bVar.f162316a, contentValues, bVar.f162317b, bVar.f162318c);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f162316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f162317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f162318c;

        public b(Uri uri, String str, String[] strArr) {
            String unused = AdHistoryProvider.f162309b;
            StringBuilder sb2 = new StringBuilder("uri=");
            sb2.append(uri.toString());
            sb2.append(";whare=");
            sb2.append(str);
            sb2.append(";args=");
            sb2.append(strArr.toString());
            this.f162316a = uri.getPathSegments().get(0);
            this.f162317b = str;
            this.f162318c = strArr;
        }

        public b(Uri uri) {
            if (uri.getPathSegments().size() == 1) {
                this.f162316a = uri.getPathSegments().get(0);
                this.f162317b = null;
                this.f162318c = null;
                return;
            }
            throw new IllegalArgumentException(O.a("Invalid URI: ", uri));
        }
    }
}
