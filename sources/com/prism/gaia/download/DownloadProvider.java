package com.prism.gaia.download;

import U6.b;
import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Binder;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.util.Log;
import androidx.appcompat.widget.O;
import androidx.collection.M0;
import com.android.launcher3.IconCache;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.prism.gaia.download.j;
import e.f0;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class DownloadProvider extends ContentProvider {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f164511f = "asdf-".concat("DownloadProvider");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f164512g = "downloads.db";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f164513h = 110;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f164514i = "downloads";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f164515j = "vnd.android.cursor.dir/download";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f164516k = "vnd.android.cursor.item/download";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final UriMatcher f164517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f164518m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f164519n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f164520o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f164521p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f164522q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f164523r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Uri[] f164524s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f164525t = "reason";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f164526u = "local_uri";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String[] f164527v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static HashSet<String> f164528w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final HashMap<String, String> f164529x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String[] f164530y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final List<String> f164531z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SQLiteOpenHelper f164532a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f164533b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164534c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public File f164535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @f0
    public p f164536e;

    public final class a extends SQLiteOpenHelper {
        public a(Context context) {
            super(context, DownloadProvider.f164512g, (SQLiteDatabase.CursorFactory) null, 110);
        }

        public final void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
            StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("ALTER TABLE ", str, " ADD COLUMN ", str2, C4.q.f17581a);
            sbA.append(str3);
            sQLiteDatabase.execSQL(sbA.toString());
        }

        public final void b(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS downloads");
                sQLiteDatabase.execSQL("CREATE TABLE downloads(_id INTEGER PRIMARY KEY AUTOINCREMENT,uri TEXT, method INTEGER, entity TEXT, no_integrity BOOLEAN, hint TEXT, otaupdate BOOLEAN, _data TEXT, mimetype TEXT, destination INTEGER, no_system BOOLEAN, visibility INTEGER, control INTEGER, status INTEGER, numfailed INTEGER, lastmod BIGINT, notificationpackage TEXT, notificationclass TEXT, notificationextras TEXT, cookiedata TEXT, useragent TEXT, referer TEXT, total_bytes INTEGER, current_bytes INTEGER, etag TEXT, uid INTEGER, otheruid INTEGER, title TEXT, description TEXT, scanned BOOLEAN);");
            } catch (SQLException e10) {
                Log.e(com.prism.gaia.download.a.f164590a, "couldn't create table in downloads database");
                throw e10;
            }
        }

        public final void c(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS request_headers");
            sQLiteDatabase.execSQL("CREATE TABLE request_headers(id INTEGER PRIMARY KEY AUTOINCREMENT,download_id INTEGER NOT NULL,header TEXT NOT NULL,value TEXT NOT NULL);");
        }

        public final void d(SQLiteDatabase sQLiteDatabase) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(j.b.f164704H, (Integer) 0);
            e(sQLiteDatabase, contentValues);
            contentValues.put("total_bytes", (Integer) (-1));
            e(sQLiteDatabase, contentValues);
            contentValues.put("title", "");
            e(sQLiteDatabase, contentValues);
            contentValues.put("description", "");
            e(sQLiteDatabase, contentValues);
        }

        public final void e(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
            sQLiteDatabase.update("downloads", contentValues, androidx.compose.runtime.changelist.j.a(contentValues.valueSet().iterator().next().getKey(), " is null"), null);
            contentValues.clear();
        }

        public final void f(SQLiteDatabase sQLiteDatabase) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(j.b.f164719P, Boolean.FALSE);
            sQLiteDatabase.update("downloads", contentValues, "destination != 0", null);
        }

        public final void g(SQLiteDatabase sQLiteDatabase, int i10) {
            switch (i10) {
                case 100:
                    b(sQLiteDatabase);
                    return;
                case 101:
                    c(sQLiteDatabase);
                    return;
                case 102:
                    a(sQLiteDatabase, "downloads", "is_public_api", "INTEGER NOT NULL DEFAULT 0");
                    a(sQLiteDatabase, "downloads", j.b.f164716N, "INTEGER NOT NULL DEFAULT 0");
                    a(sQLiteDatabase, "downloads", j.b.f164714M, "INTEGER NOT NULL DEFAULT 0");
                    return;
                case 103:
                    a(sQLiteDatabase, "downloads", j.b.f164719P, "INTEGER NOT NULL DEFAULT 1");
                    f(sQLiteDatabase);
                    return;
                case 104:
                    a(sQLiteDatabase, "downloads", j.b.f164720Q, "INTEGER NOT NULL DEFAULT 0");
                    return;
                case 105:
                    d(sQLiteDatabase);
                    return;
                case 106:
                    a(sQLiteDatabase, "downloads", j.b.f164722S, "TEXT");
                    a(sQLiteDatabase, "downloads", j.b.f164721R, "BOOLEAN NOT NULL DEFAULT 0");
                    return;
                case 107:
                    a(sQLiteDatabase, "downloads", j.b.f164724U, "TEXT");
                    return;
                case 108:
                    a(sQLiteDatabase, "downloads", "allow_metered", "INTEGER NOT NULL DEFAULT 1");
                    return;
                case 109:
                    a(sQLiteDatabase, "downloads", j.b.f164727X, "BOOLEAN NOT NULL DEFAULT 0");
                    return;
                case 110:
                    a(sQLiteDatabase, "downloads", "flags", "INTEGER NOT NULL DEFAULT 0");
                    return;
                default:
                    throw new IllegalStateException(android.support.v4.media.c.a("Don't know how to upgrade to ", i10));
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (com.prism.gaia.download.a.f164589J) {
                Log.v(com.prism.gaia.download.a.f164590a, "populating new database");
            }
            onUpgrade(sQLiteDatabase, 0, 110);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 == 31) {
                i10 = 100;
            } else {
                if (i10 < 100) {
                    Log.i(com.prism.gaia.download.a.f164590a, M0.a("Upgrading downloads database from version ", i10, " to version ", i11, ", which will destroy all old data"));
                } else if (i10 > i11) {
                    Log.i(com.prism.gaia.download.a.f164590a, M0.a("Downgrading downloads database from version ", i10, " (current version is ", i11, "), destroying all old data"));
                }
                i10 = 99;
            }
            while (true) {
                i10++;
                if (i10 > i11) {
                    return;
                } else {
                    g(sQLiteDatabase, i10);
                }
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public StringBuilder f164538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<String> f164539b;

        public <T> void a(String str, T... tArr) {
            if (str == null || str.isEmpty()) {
                return;
            }
            if (this.f164538a.length() != 0) {
                this.f164538a.append(" AND ");
            }
            this.f164538a.append("(");
            this.f164538a.append(str);
            this.f164538a.append(")");
            if (tArr != null) {
                for (T t10 : tArr) {
                    this.f164539b.add(t10.toString());
                }
            }
        }

        public String[] b() {
            return (String[]) this.f164539b.toArray(new String[this.f164539b.size()]);
        }

        public String c() {
            return this.f164538a.toString();
        }

        public b() {
            this.f164538a = new StringBuilder();
            this.f164539b = new ArrayList();
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f164517l = uriMatcher;
        uriMatcher.addURI(j.b.f164732b, "my_downloads", 1);
        uriMatcher.addURI(j.b.f164732b, "my_downloads/#", 2);
        uriMatcher.addURI(j.b.f164732b, "all_downloads", 3);
        uriMatcher.addURI(j.b.f164732b, "all_downloads/#", 4);
        uriMatcher.addURI(j.b.f164732b, "my_downloads/#/headers", 5);
        uriMatcher.addURI(j.b.f164732b, "all_downloads/#/headers", 5);
        uriMatcher.addURI(j.b.f164732b, "download", 1);
        uriMatcher.addURI(j.b.f164732b, "download/#", 2);
        uriMatcher.addURI(j.b.f164732b, "download/#/headers", 5);
        uriMatcher.addURI(j.b.f164732b, "public_downloads/#", 6);
        int i10 = 0;
        f164524s = new Uri[]{j.b.f164748j, j.b.f164750k};
        f164527v = new String[]{"_id", j.b.f164762q, j.b.f164768t, j.b.f164770u, "visibility", "destination", j.b.f164776x, "status", j.b.f164780z, "notificationpackage", "notificationclass", "total_bytes", j.b.f164704H, "title", "description", "uri", j.b.f164719P, "hint", j.b.f164722S, j.b.f164721R, j.b.f164724U, j.b.f164714M, "_display_name", "_size"};
        f164528w = new HashSet<>();
        while (true) {
            String[] strArr = f164527v;
            if (i10 >= strArr.length) {
                HashMap<String, String> map = new HashMap<>();
                f164529x = map;
                map.put("_display_name", "title AS _display_name");
                map.put("_size", "total_bytes AS _size");
                String[] strArr2 = {"_id", "_data AS local_filename", j.b.f164722S, "destination", "title", "description", "uri", "status", "hint", "mimetype AS media_type", "total_bytes AS total_size", "lastmod AS last_modified_timestamp", "current_bytes AS bytes_so_far", j.b.f164727X, "'placeholder' AS local_uri", "'placeholder' AS reason"};
                f164530y = strArr2;
                f164531z = Arrays.asList(strArr2);
                return;
            }
            f164528w.add(strArr[i10]);
            i10++;
        }
    }

    public static final void c(String str, ContentValues contentValues, ContentValues contentValues2) {
        Boolean asBoolean = contentValues.getAsBoolean(str);
        if (asBoolean != null) {
            contentValues2.put(str, asBoolean);
        }
    }

    public static final void d(String str, ContentValues contentValues, ContentValues contentValues2) {
        Integer asInteger = contentValues.getAsInteger(str);
        if (asInteger != null) {
            contentValues2.put(str, asInteger);
        }
    }

    public static final void e(String str, ContentValues contentValues, ContentValues contentValues2) {
        String asString = contentValues.getAsString(str);
        if (asString != null) {
            contentValues2.put(str, asString);
        }
    }

    public static final void f(String str, ContentValues contentValues, ContentValues contentValues2, String str2) {
        e(str, contentValues, contentValues2);
        if (contentValues2.containsKey(str)) {
            return;
        }
        contentValues2.put(str, str2);
    }

    public final void a(ContentValues contentValues) {
        String asString = contentValues.getAsString("hint");
        if (asString == null) {
            throw new IllegalArgumentException("DESTINATION_FILE_URI must include a file URI under COLUMN_FILE_NAME_HINT");
        }
        Uri uri = Uri.parse(asString);
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equals(b.h.f68653a)) {
            throw new IllegalArgumentException(O.a("Not a file URI: ", uri));
        }
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException(O.a("Invalid file URI: ", uri));
        }
        if (!path.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath())) {
            throw new SecurityException(O.a("Destination must be on external storage: ", uri));
        }
    }

    public final void b(ContentValues contentValues) {
        if (getContext().checkCallingOrSelfPermission(j.b.f164734c) == 0) {
            return;
        }
        getContext().enforceCallingOrSelfPermission("android.permission.INTERNET", "INTERNET permission is required to use the download manager");
        ContentValues contentValues2 = new ContentValues(contentValues);
        h(contentValues2, "is_public_api", Boolean.TRUE);
        if (contentValues2.getAsInteger("destination").intValue() == 6) {
            contentValues2.remove("total_bytes");
            contentValues2.remove(j.b.f164768t);
            contentValues2.remove("status");
        }
        h(contentValues2, "destination", 2, 4, 6);
        if (getContext().checkCallingOrSelfPermission(j.b.f164746i) == 0) {
            h(contentValues2, "visibility", 2, 0, 1, 3);
        } else {
            h(contentValues2, "visibility", 0, 1, 3);
        }
        contentValues2.remove("uri");
        contentValues2.remove("title");
        contentValues2.remove("description");
        contentValues2.remove(j.b.f164770u);
        contentValues2.remove("hint");
        contentValues2.remove("notificationpackage");
        contentValues2.remove(j.b.f164714M);
        contentValues2.remove(j.b.f164716N);
        contentValues2.remove(j.b.f164719P);
        contentValues2.remove("scanned");
        Iterator<Map.Entry<String, Object>> it = contentValues2.valueSet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().startsWith("http_header_")) {
                it.remove();
            }
        }
        if (contentValues2.size() > 0) {
            Iterator<Map.Entry<String, Object>> it2 = contentValues2.valueSet().iterator();
            while (it2.hasNext()) {
                it2.next().getKey();
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        l.n(str, f164528w);
        SQLiteDatabase writableDatabase = this.f164532a.getWritableDatabase();
        int iMatch = f164517l.match(uri);
        if (iMatch == 1 || iMatch == 2 || iMatch == 3 || iMatch == 4) {
            b bVarJ = j(uri, str, strArr, iMatch);
            g(writableDatabase, bVarJ.f164538a.toString(), bVarJ.b());
            int iDelete = writableDatabase.delete("downloads", bVarJ.f164538a.toString(), bVarJ.b());
            n(uri, iMatch);
            return iDelete;
        }
        Log.d(com.prism.gaia.download.a.f164590a, "deleting unknown/invalid URI: " + uri);
        throw new UnsupportedOperationException(O.a("Cannot delete URI: ", uri));
    }

    public final void g(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        Cursor cursorQuery = sQLiteDatabase.query("downloads", new String[]{"_id"}, str, strArr, null, null, null, null);
        try {
            cursorQuery.moveToFirst();
            while (!cursorQuery.isAfterLast()) {
                sQLiteDatabase.delete(j.b.a.f164782a, "download_id=" + cursorQuery.getLong(0), null);
                cursorQuery.moveToNext();
            }
        } finally {
            cursorQuery.close();
        }
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int iMatch = f164517l.match(uri);
        if (iMatch == 1) {
            return f164515j;
        }
        if (iMatch != 2) {
            if (iMatch == 3) {
                return f164515j;
            }
            if (iMatch != 4 && iMatch != 6) {
                if (com.prism.gaia.download.a.f164587H) {
                    Log.v(com.prism.gaia.download.a.f164590a, "calling getType on an unknown URI: " + uri);
                }
                throw new IllegalArgumentException(O.a("Unknown URI: ", uri));
            }
        }
        String strStringForQuery = DatabaseUtils.stringForQuery(this.f164532a.getReadableDatabase(), "SELECT mimetype FROM downloads WHERE _id = ?", new String[]{i(uri)});
        return (strStringForQuery == null || strStringForQuery.isEmpty()) ? f164516k : strStringForQuery;
    }

    public final void h(ContentValues contentValues, String str, Object... objArr) {
        Object obj = contentValues.get(str);
        contentValues.remove(str);
        for (Object obj2 : objArr) {
            if (obj == null && obj2 == null) {
                return;
            }
            if (obj != null && obj.equals(obj2)) {
                return;
            }
        }
        throw new SecurityException("Invalid value for " + str + ": " + obj);
    }

    public final String i(Uri uri) {
        return uri.getPathSegments().get(1);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        int i10;
        long j10;
        Integer asInteger;
        b(contentValues);
        SQLiteDatabase writableDatabase = this.f164532a.getWritableDatabase();
        int iMatch = f164517l.match(uri);
        if (iMatch != 1) {
            Log.d(com.prism.gaia.download.a.f164590a, "calling insert on an unknown/invalid URI: " + uri);
            throw new IllegalArgumentException(O.a("Unknown/Invalid URI ", uri));
        }
        ContentValues contentValues2 = new ContentValues();
        e("uri", contentValues, contentValues2);
        String asString = contentValues.getAsString(j.b.f164762q);
        if (asString != null) {
            contentValues2.put(j.b.f164762q, asString);
        }
        Boolean asBoolean = contentValues.getAsBoolean(j.b.f164764r);
        if (asBoolean != null) {
            contentValues2.put(j.b.f164764r, asBoolean);
        }
        String asString2 = contentValues.getAsString("hint");
        if (asString2 != null) {
            contentValues2.put("hint", asString2);
        }
        String asString3 = contentValues.getAsString(j.b.f164770u);
        if (asString3 != null) {
            contentValues2.put(j.b.f164770u, asString3);
        }
        Boolean asBoolean2 = contentValues.getAsBoolean("is_public_api");
        if (asBoolean2 != null) {
            contentValues2.put("is_public_api", asBoolean2);
        }
        boolean z10 = contentValues.getAsBoolean("is_public_api") == Boolean.TRUE;
        Integer asInteger2 = contentValues.getAsInteger("destination");
        if (asInteger2 != null) {
            boolean z11 = getContext().checkCallingPermission(j.b.f164744h) == 0;
            if (z10 && asInteger2.intValue() == 2 && z11) {
                asInteger2 = 1;
            }
            if (asInteger2.intValue() == 4) {
                i10 = 2;
                getContext().enforcePermission("android.permission.WRITE_EXTERNAL_STORAGE", Binder.getCallingPid(), Binder.getCallingUid(), "need WRITE_EXTERNAL_STORAGE permission to use DESTINATION_FILE_URI");
                a(contentValues);
            } else {
                i10 = 2;
            }
            contentValues2.put("destination", asInteger2);
        } else {
            i10 = 2;
        }
        Integer asInteger3 = contentValues.getAsInteger("visibility");
        if (asInteger3 != null) {
            contentValues2.put("visibility", asInteger3);
        } else if (asInteger2.intValue() == 0) {
            contentValues2.put("visibility", (Integer) 1);
        } else {
            contentValues2.put("visibility", Integer.valueOf(i10));
        }
        Integer asInteger4 = contentValues.getAsInteger(j.b.f164776x);
        if (asInteger4 != null) {
            contentValues2.put(j.b.f164776x, asInteger4);
        }
        if (contentValues.getAsInteger("destination").intValue() == 6) {
            contentValues2.put("status", (Integer) 200);
            contentValues2.put("total_bytes", contentValues.getAsLong("total_bytes"));
            contentValues2.put(j.b.f164704H, (Integer) 0);
            Integer asInteger5 = contentValues.getAsInteger("scanned");
            if (asInteger5 != null) {
                contentValues2.put("scanned", asInteger5);
            }
            String asString4 = contentValues.getAsString(j.b.f164768t);
            if (asString4 != null) {
                contentValues2.put(j.b.f164768t, asString4);
            }
        } else {
            contentValues2.put("status", (Integer) 190);
            contentValues2.put("total_bytes", (Integer) (-1));
            contentValues2.put(j.b.f164704H, (Integer) 0);
        }
        long jCurrentTimeMillis = this.f164536e.currentTimeMillis();
        contentValues2.put(j.b.f164780z, Long.valueOf(jCurrentTimeMillis));
        String asString5 = contentValues.getAsString("notificationpackage");
        String asString6 = contentValues.getAsString("notificationclass");
        if (asString5 != null && (asString6 != null || z10)) {
            try {
                this.f164536e.j(Binder.getCallingUid(), asString5);
                contentValues2.put("notificationpackage", asString5);
                if (asString6 != null) {
                    contentValues2.put("notificationclass", asString6);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String asString7 = contentValues.getAsString(j.b.f164694C);
        if (asString7 != null) {
            contentValues2.put(j.b.f164694C, asString7);
        }
        String asString8 = contentValues.getAsString("cookiedata");
        if (asString8 != null) {
            contentValues2.put("cookiedata", asString8);
        }
        String asString9 = contentValues.getAsString(j.b.f164698E);
        if (asString9 != null) {
            contentValues2.put(j.b.f164698E, asString9);
        }
        String asString10 = contentValues.getAsString(j.b.f164700F);
        if (asString10 != null) {
            contentValues2.put(j.b.f164700F, asString10);
        }
        Integer asInteger6 = contentValues.getAsInteger("otheruid");
        if (asInteger6 != null) {
            contentValues2.put("otheruid", asInteger6);
        }
        contentValues2.put("uid", Integer.valueOf(Binder.getCallingUid()));
        if (Binder.getCallingUid() == 0 && (asInteger = contentValues.getAsInteger("uid")) != null) {
            contentValues2.put("uid", asInteger);
        }
        f("title", contentValues, contentValues2, "");
        f("description", contentValues, contentValues2, "");
        if (contentValues.containsKey(j.b.f164719P)) {
            Boolean asBoolean3 = contentValues.getAsBoolean(j.b.f164719P);
            if (asBoolean3 != null) {
                contentValues2.put(j.b.f164719P, asBoolean3);
            }
        } else {
            contentValues2.put(j.b.f164719P, Boolean.valueOf(asInteger2 == null || asInteger2.intValue() == 0));
        }
        if (z10) {
            Integer asInteger7 = contentValues.getAsInteger(j.b.f164714M);
            if (asInteger7 != null) {
                contentValues2.put(j.b.f164714M, asInteger7);
            }
            Boolean asBoolean4 = contentValues.getAsBoolean(j.b.f164716N);
            if (asBoolean4 != null) {
                contentValues2.put(j.b.f164716N, asBoolean4);
            }
        }
        if (com.prism.gaia.download.a.f164589J) {
            String str = com.prism.gaia.download.a.f164590a;
            Log.v(str, "initiating download with UID " + contentValues2.getAsInteger("uid"));
            if (contentValues2.containsKey("otheruid")) {
                Log.v(str, "other UID " + contentValues2.getAsInteger("otheruid"));
            }
        }
        contentValues2.get("notificationpackage");
        long jInsert = writableDatabase.insert("downloads", null, contentValues2);
        if (jInsert == -1) {
            Log.d(com.prism.gaia.download.a.f164590a, "couldn't insert into downloads database");
            return null;
        }
        k(writableDatabase, jInsert, contentValues);
        Context context = getContext();
        if (contentValues.getAsInteger("destination").intValue() == 6 && j.b.a(asInteger3.intValue())) {
            new f(context, this.f164536e).d(jInsert, contentValues.getAsString("title"), 200, 6, jCurrentTimeMillis);
            j10 = jInsert;
        } else {
            j10 = jInsert;
        }
        n(uri, iMatch);
        return ContentUris.withAppendedId(j.b.f164748j, j10);
    }

    public final b j(Uri uri, String str, String[] strArr, int i10) {
        b bVar = new b();
        bVar.a(str, strArr);
        if (i10 == 2 || i10 == 4 || i10 == 6) {
            bVar.a("_id = ?", i(uri));
        }
        if ((i10 == 1 || i10 == 2) && getContext().checkCallingPermission(j.b.f164738e) != 0) {
            bVar.a("uid= ? OR otheruid= ?", Integer.valueOf(Binder.getCallingUid()), Integer.valueOf(Binder.getCallingPid()));
        }
        return bVar;
    }

    public final void k(SQLiteDatabase sQLiteDatabase, long j10, ContentValues contentValues) {
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("download_id", Long.valueOf(j10));
        for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
            if (entry.getKey().startsWith("http_header_")) {
                String string = entry.getValue().toString();
                if (!string.contains(com.prism.gaia.server.accounts.b.f166434b0)) {
                    throw new IllegalArgumentException("Invalid HTTP header line: ".concat(string));
                }
                String[] strArrSplit = string.split(com.prism.gaia.server.accounts.b.f166434b0, 2);
                contentValues2.put(j.b.a.f164784c, strArrSplit[0].trim());
                contentValues2.put("value", strArrSplit[1].trim());
                sQLiteDatabase.insert(j.b.a.f164782a, null, contentValues2);
            }
        }
    }

    public final void l(Uri uri, String str) {
        String str2 = com.prism.gaia.download.a.f164590a;
        Log.v(str2, "openFile uri: " + uri + ", mode: " + str + ", uid: " + Binder.getCallingUid());
        Cursor cursorQuery = query(j.b.f164748j, new String[]{"_id"}, null, null, "_id");
        if (cursorQuery == null) {
            Log.v(str2, "null cursor in openFile");
        } else {
            if (cursorQuery.moveToFirst()) {
                do {
                    Log.v(com.prism.gaia.download.a.f164590a, "row " + cursorQuery.getInt(0) + " available");
                } while (cursorQuery.moveToNext());
            } else {
                Log.v(str2, "empty cursor in openFile");
            }
            cursorQuery.close();
        }
        Cursor cursorQuery2 = query(uri, new String[]{j.b.f164768t}, null, null, null);
        if (cursorQuery2 == null) {
            Log.v(com.prism.gaia.download.a.f164590a, "null cursor in openFile");
            return;
        }
        if (cursorQuery2.moveToFirst()) {
            String string = cursorQuery2.getString(0);
            String str3 = com.prism.gaia.download.a.f164590a;
            Log.v(str3, "filename in openFile: " + string);
            if (new File(string).isFile()) {
                Log.v(str3, "file exists in openFile");
            }
        } else {
            Log.v(com.prism.gaia.download.a.f164590a, "empty cursor in openFile");
        }
        cursorQuery2.close();
    }

    public final void m(String[] strArr, String str, String[] strArr2, String str2, SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb2 = new StringBuilder("starting query, database is ");
        if (sQLiteDatabase != null) {
            sb2.append("not ");
        }
        sb2.append("null; ");
        if (strArr == null) {
            sb2.append("projection is null; ");
        } else if (strArr.length == 0) {
            sb2.append("projection is empty; ");
        } else {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                sb2.append("projection[");
                sb2.append(i10);
                sb2.append("] is ");
                sb2.append(strArr[i10]);
                sb2.append("; ");
            }
        }
        androidx.concurrent.futures.b.a(sb2, "selection is ", str, "; ");
        if (strArr2 == null) {
            sb2.append("selectionArgs is null; ");
        } else if (strArr2.length == 0) {
            sb2.append("selectionArgs is empty; ");
        } else {
            for (int i11 = 0; i11 < strArr2.length; i11++) {
                sb2.append("selectionArgs[");
                sb2.append(i11);
                sb2.append("] is ");
                sb2.append(strArr2[i11]);
                sb2.append("; ");
            }
        }
        androidx.concurrent.futures.b.a(sb2, "sort is ", str2, IconCache.EMPTY_CLASS_NAME);
        Log.v(com.prism.gaia.download.a.f164590a, sb2.toString());
    }

    public final void n(Uri uri, int i10) {
        Long lValueOf = (i10 == 2 || i10 == 4) ? Long.valueOf(Long.parseLong(i(uri))) : null;
        for (Uri uriWithAppendedId : f164524s) {
            if (lValueOf != null) {
                uriWithAppendedId = ContentUris.withAppendedId(uriWithAppendedId, lValueOf.longValue());
            }
            getContext().getContentResolver().notifyChange(uriWithAppendedId, null);
        }
    }

    public final Cursor o(SQLiteDatabase sQLiteDatabase, Uri uri) {
        return sQLiteDatabase.query(j.b.a.f164782a, new String[]{j.b.a.f164784c, "value"}, "download_id=" + i(uri), null, null, null, null);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (this.f164536e == null) {
            this.f164536e = new m(getContext());
        }
        this.f164532a = new a(getContext());
        this.f164533b = 1000;
        this.f164535d = o.h(getContext()).g();
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        int count;
        if (com.prism.gaia.download.a.f164589J) {
            l(uri, str);
        }
        Cursor cursorQuery = query(uri, new String[]{j.b.f164768t}, null, null, null);
        if (cursorQuery != null) {
            try {
                count = cursorQuery.getCount();
            } finally {
            }
        } else {
            count = 0;
        }
        if (count != 1) {
            if (count == 0) {
                throw new FileNotFoundException("No entry for " + uri);
            }
            throw new FileNotFoundException("Multiple items at " + uri);
        }
        cursorQuery.moveToFirst();
        String string = cursorQuery.getString(0);
        cursorQuery.close();
        if (string == null) {
            throw new FileNotFoundException("No filename found.");
        }
        if (!l.h(string, this.f164535d)) {
            throw new FileNotFoundException("Invalid filename: ".concat(string));
        }
        if (!CampaignEx.JSON_KEY_AD_R.equals(str)) {
            throw new FileNotFoundException("Bad mode for " + uri + ": " + str);
        }
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(new File(string), 268435456);
        if (parcelFileDescriptorOpen != null) {
            return parcelFileDescriptorOpen;
        }
        if (com.prism.gaia.download.a.f164587H) {
            Log.v(com.prism.gaia.download.a.f164590a, "couldn't open file");
        }
        throw new FileNotFoundException("couldn't open file");
    }

    public final boolean p() {
        int callingUid = Binder.getCallingUid();
        return (Binder.getCallingPid() == Process.myPid() || callingUid == this.f164533b || callingUid == this.f164534c) ? false : true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        l.n(str, f164528w);
        SQLiteDatabase readableDatabase = this.f164532a.getReadableDatabase();
        int iMatch = f164517l.match(uri);
        if (iMatch == -1) {
            if (com.prism.gaia.download.a.f164587H) {
                Log.v(com.prism.gaia.download.a.f164590a, "querying unknown URI: " + uri);
            }
            throw new IllegalArgumentException(O.a("Unknown URI: ", uri));
        }
        if (iMatch == 5) {
            if (strArr == null && str == null && str2 == null) {
                return o(readableDatabase, uri);
            }
            throw new UnsupportedOperationException("Request header queries do not support projections, selections or sorting");
        }
        b bVarJ = j(uri, str, strArr2, iMatch);
        if (p()) {
            if (strArr == null) {
                strArr = f164527v;
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    if (f164528w.contains(strArr[i10]) || f164531z.contains(strArr[i10])) {
                        arrayList.add(strArr[i10]);
                    } else {
                        String str4 = strArr[i10];
                    }
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            for (int i11 = 0; i11 < strArr.length; i11++) {
                String str5 = f164529x.get(strArr[i11]);
                if (str5 != null) {
                    strArr[i11] = str5;
                }
            }
        }
        String[] strArr3 = strArr;
        if (com.prism.gaia.download.a.f164589J) {
            str3 = str2;
            m(strArr3, str, strArr2, str3, readableDatabase);
            readableDatabase = readableDatabase;
        } else {
            str3 = str2;
        }
        Cursor cursorQuery = readableDatabase.query("downloads", strArr3, bVarJ.f164538a.toString(), bVarJ.b(), null, null, str3);
        bVarJ.f164538a.toString();
        bVarJ.b();
        cursorQuery.getCount();
        cursorQuery.setNotificationUri(getContext().getContentResolver(), uri);
        Log.v(com.prism.gaia.download.a.f164590a, "created cursor " + cursorQuery + " on behalf of " + Binder.getCallingPid());
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        ContentValues contentValues2 = contentValues;
        l.n(str, f164528w);
        SQLiteDatabase writableDatabase = this.f164532a.getWritableDatabase();
        boolean z10 = contentValues2.containsKey(j.b.f164721R) && contentValues2.getAsInteger(j.b.f164721R).intValue() == 1;
        if (Binder.getCallingPid() != Process.myPid()) {
            ContentValues contentValues3 = new ContentValues();
            String asString = contentValues2.getAsString(j.b.f164762q);
            if (asString != null) {
                contentValues3.put(j.b.f164762q, asString);
            }
            Integer asInteger = contentValues2.getAsInteger("visibility");
            if (asInteger != null) {
                contentValues3.put("visibility", asInteger);
            }
            Integer asInteger2 = contentValues2.getAsInteger(j.b.f164776x);
            if (asInteger2 != null) {
                contentValues3.put(j.b.f164776x, asInteger2);
                z10 = true;
            }
            Integer asInteger3 = contentValues2.getAsInteger(j.b.f164776x);
            if (asInteger3 != null) {
                contentValues3.put(j.b.f164776x, asInteger3);
            }
            String asString2 = contentValues2.getAsString("title");
            if (asString2 != null) {
                contentValues3.put("title", asString2);
            }
            String asString3 = contentValues2.getAsString(j.b.f164722S);
            if (asString3 != null) {
                contentValues3.put(j.b.f164722S, asString3);
            }
            String asString4 = contentValues2.getAsString("description");
            if (asString4 != null) {
                contentValues3.put("description", asString4);
            }
            Integer asInteger4 = contentValues2.getAsInteger(j.b.f164721R);
            if (asInteger4 != null) {
                contentValues3.put(j.b.f164721R, asInteger4);
            }
            contentValues2 = contentValues3;
        } else {
            String asString5 = contentValues2.getAsString(j.b.f164768t);
            if (asString5 != null) {
                Cursor cursorQuery = query(uri, new String[]{"title"}, null, null, null);
                if (!cursorQuery.moveToFirst() || cursorQuery.getString(0).isEmpty()) {
                    contentValues2.put("title", new File(asString5).getName());
                }
                cursorQuery.close();
            }
            Integer asInteger5 = contentValues2.getAsInteger("status");
            boolean z11 = asInteger5 != null && asInteger5.intValue() == 190;
            boolean zContainsKey = contentValues2.containsKey(j.b.f164720Q);
            if (z11 || zContainsKey) {
                z10 = true;
            }
        }
        int iMatch = f164517l.match(uri);
        if (iMatch != 1 && iMatch != 2 && iMatch != 3 && iMatch != 4) {
            Log.d(com.prism.gaia.download.a.f164590a, "updating unknown/invalid URI: " + uri);
            throw new UnsupportedOperationException(O.a("Cannot update URI: ", uri));
        }
        b bVarJ = j(uri, str, strArr, iMatch);
        int iUpdate = contentValues2.size() > 0 ? writableDatabase.update("downloads", contentValues2, bVarJ.f164538a.toString(), bVarJ.b()) : 0;
        n(uri, iMatch);
        if (z10) {
            getContext();
        }
        return iUpdate;
    }
}
