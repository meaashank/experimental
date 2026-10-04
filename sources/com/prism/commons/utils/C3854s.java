package com.prism.commons.utils;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.prism.commons.utils.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3854s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162139a = l0.b(C3854s.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentMap<Long, c> f162140b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile ContentObserver f162141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static DownloadManager f162142d;

    /* JADX INFO: renamed from: com.prism.commons.utils.s$a */
    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            c cVar;
            super.onChange(z10, uri);
            if (!uri.toString().matches(".*\\d+$") || (cVar = (c) C3854s.f162140b.get(Long.valueOf(Long.parseLong(uri.getLastPathSegment())))) == null) {
                return;
            }
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(cVar.c());
            Cursor cursorQuery = C3854s.f162142d.query(query);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                cVar.j();
            } else {
                cVar.f162145b = cursorQuery;
                cVar.e(cursorQuery.getInt(cursorQuery.getColumnIndex("status")), cursorQuery.getInt(cursorQuery.getColumnIndex("reason")));
            }
        }
    }

    /* JADX INFO: renamed from: com.prism.commons.utils.s$b */
    public class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f162143c;

        public b(Activity activity) {
            this.f162143c = activity;
        }

        @Override // com.prism.commons.utils.C3854s.c
        public void e(int i10, int i11) {
            if (i10 == 8) {
                j();
                A.c(this.f162143c, d());
            } else {
                if (i10 != 16) {
                    return;
                }
                f();
            }
        }
    }

    /* JADX INFO: renamed from: com.prism.commons.utils.s$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f162144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Cursor f162145b;

        public static void a(c cVar, Cursor cursor) {
            cVar.f162145b = cursor;
        }

        public static void b(c cVar, long j10) {
            cVar.f162144a = j10;
        }

        public long c() {
            return this.f162144a;
        }

        public Uri d() {
            return C3854s.f162142d.getUriForDownloadedFile(this.f162144a);
        }

        public abstract void e(int i10, int i11);

        public void f() {
            j();
            C3854s.f162142d.remove(c());
        }

        public final void g(Cursor cursor) {
            this.f162145b = cursor;
        }

        public final void h(long j10) {
            this.f162144a = j10;
        }

        public void i() {
            C3854s.f162140b.put(Long.valueOf(c()), this);
        }

        public void j() {
            C3854s.f162140b.remove(Long.valueOf(c()));
        }
    }

    public static void c(Activity activity, String str, c cVar) {
        e(activity);
        cVar.f162144a = f162142d.enqueue(new DownloadManager.Request(Uri.parse(str)).setDestinationInExternalFilesDir(activity, Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(str, null, MimeTypeMap.getFileExtensionFromUrl(str))));
        cVar.i();
    }

    public static void d(Activity activity, String str, String str2, boolean z10) {
        File file = new File(activity.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), URLUtil.guessFileName(str2, null, MimeTypeMap.getFileExtensionFromUrl(str2)));
        if (z10) {
            file.delete();
        } else if (file.exists()) {
            A.d(activity, str, file);
            return;
        }
        c(activity, str2, new b(activity));
    }

    public static void e(Context context) {
        if (f162141c != null) {
            return;
        }
        synchronized (C3854s.class) {
            try {
                if (f162141c != null) {
                    return;
                }
                f162141c = new a(null);
                f162142d = (DownloadManager) context.getSystemService("download");
                context.getContentResolver().registerContentObserver(Uri.parse("content://downloads/my_downloads"), true, f162141c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
