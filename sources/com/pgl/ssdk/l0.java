package com.pgl.ssdk;

/* JADX INFO: loaded from: classes5.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f161878a = -1;

    public static void a(int i10) {
        f161878a = i10;
    }

    public static String b() {
        int i10 = f161878a;
        return i10 != 0 ? i10 != 1 ? "" : "https://ssdk-va.pangle.io/ssdk/sd/token" : "https://ssdk-sg.pangle.io/ssdk/sd/token";
    }

    public static String a() {
        int i10 = f161878a;
        return i10 != 0 ? i10 != 1 ? "" : "https://ssdk-va.pangle.io/ssdk/v2/r" : "https://ssdk-sg.pangle.io/ssdk/v2/r";
    }
}
