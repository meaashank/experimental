package com.inmobi.media;

import F5.RunnableC1138z2;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class sd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f153371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Handler f153372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f153373d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static List f153375f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sd f153370a = new sd();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final IntentFilter f153374e = new IntentFilter("android.net.wifi.SCAN_RESULTS");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Runnable f153376g = new RunnableC1138z2();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final rd f153377h = new rd();

    public static final void b() {
        f153370a.a();
    }

    public final synchronized void a() {
        Handler handler = f153372c;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(f153376g);
        if (f153373d) {
            f153373d = false;
            try {
                Context context = f153371b;
                if (context != null) {
                    context.unregisterReceiver(f153377h);
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        f153372c = null;
        f153371b = null;
    }
}
