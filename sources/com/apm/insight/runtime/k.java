package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static MonitorCrash f137503a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f137504b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f137505c;

    public static MonitorCrash a() {
        if (f137503a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 1030851L, "1.3.8.nourl-rc.1", "com.apm.insight");
            f137503a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f137503a;
    }

    public static void a(Throwable th, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (f137504b == -1) {
            f137504b = 5;
        }
        int i10 = f137505c;
        if (i10 < f137504b) {
            f137505c = i10 + 1;
            a().reportCustomErr(str, "INNER", th);
        }
    }
}
