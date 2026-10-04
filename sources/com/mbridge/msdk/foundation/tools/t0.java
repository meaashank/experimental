package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f156842a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f156843b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f156844c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f156845d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f156846e;

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            t0.b();
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f156843b) {
                return;
            }
            f156843b = true;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                f156842a = externalFilesDir.getAbsolutePath();
            }
            try {
                b(context);
            } catch (Exception unused) {
                b(context);
            }
        } catch (Exception e10) {
            q0.b("SameSDCardTool", e10.getMessage());
        }
    }

    private static void b(Context context) {
        File externalFilesDir;
        if (TextUtils.isEmpty(f156842a) && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
            f156842a = externalFilesDir.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(f156842a)) {
            com.mbridge.msdk.foundation.same.directory.e.a(new com.mbridge.msdk.foundation.same.directory.d(f156842a));
            com.mbridge.msdk.foundation.same.directory.e.b().a();
        }
        b();
    }

    public static int c() {
        return f156845d;
    }

    public static int a() {
        if (System.currentTimeMillis() - f156846e > com.prism.gaia.server.content.j.f167261b0) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a());
        }
        return f156844c;
    }

    public static void b() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks();
            f156845d = Long.valueOf(((((long) statFs.getBlockCount()) * blockSize) / 1000) / 1000).intValue();
            f156844c = Long.valueOf(((availableBlocks * blockSize) / 1000) / 1000).intValue();
            f156846e = System.currentTimeMillis();
        } catch (Exception e10) {
            q0.b("SameSDCardTool", e10.getMessage());
        }
    }
}
