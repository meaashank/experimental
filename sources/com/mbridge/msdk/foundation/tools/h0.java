package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;
import t7.C5617a;

/* JADX INFO: loaded from: classes5.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f156767a;

    public static synchronized ConnectivityManager a() {
        try {
        } catch (Exception e10) {
            q0.b("NetManager", e10.getMessage());
        }
        if (f156767a != null || com.mbridge.msdk.foundation.controller.c.n().d() == null) {
        } else {
            f156767a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService(C5617a.f239212e);
        }
        return f156767a;
    }
}
