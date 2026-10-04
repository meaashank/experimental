package com.mbridge.msdk.dycreator.utils;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f155840a = false;

    public static void a(String str) {
        if (f155840a) {
            new SecurityManager();
            Log.e(new Throwable().getStackTrace()[1].getFileName(), str);
        }
    }
}
