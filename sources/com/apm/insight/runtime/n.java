package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile r f137519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f137520b;

    public static r a() {
        if (f137519a == null) {
            b();
        }
        return f137519a;
    }

    private static HandlerThread b() {
        if (f137519a == null) {
            synchronized (n.class) {
                try {
                    if (f137519a == null) {
                        r rVar = new r("default_npth_thread");
                        f137519a = rVar;
                        rVar.b();
                    }
                } finally {
                }
            }
        }
        return f137519a.c();
    }
}
