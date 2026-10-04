package com.prism.fusionadsdk.internal.history;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162319a = "AD_HISTORY";

    /* JADX INFO: renamed from: com.prism.fusionadsdk.internal.history.a$a, reason: collision with other inner class name */
    public static class C0665a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f162320a = "_id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f162321b = "adid";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f162322c = "requestCount";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f162323d = "showCount";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f162324e = "lastShowTime";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f162325f = "lastReqTime";
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z10) {
        sQLiteDatabase.execSQL("CREATE TABLE " + (z10 ? " IF NOT EXISTS " : "") + "AD_HISTORY (_id INTEGER PRIMARY KEY,adid TEXT,other TEXT,requestCount INTEGER,showCount INTEGER,lastShowTime INTEGER,lastReqTime INTEGER);");
    }

    public static Uri b() {
        return Uri.parse("content://com.app.hider.master.promax.ad_history.provider/AD_HISTORY");
    }
}
