package com.prism.gaia.helper.utils;

import android.os.SystemClock;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f165194a = "debug.gaia.fault";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f165195b = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile String f165196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile long f165197d;

    public static boolean a(String str) {
        return false;
    }

    public static String b() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j10 = f165197d;
        if (j10 != 0 && jUptimeMillis - j10 < 1000) {
            return f165196c;
        }
        String strC = c();
        f165196c = strC;
        f165197d = jUptimeMillis;
        return strC;
    }

    public static String c() {
        Process processStart;
        try {
            processStart = new ProcessBuilder("getprop", f165194a).redirectErrorStream(true).start();
        } catch (Throwable unused) {
            processStart = null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream()));
            try {
                String line = bufferedReader.readLine();
                String strTrim = line == null ? null : line.trim();
                bufferedReader.close();
                processStart.destroy();
                return strTrim;
            } finally {
            }
        } catch (Throwable unused2) {
            if (processStart != null) {
                processStart.destroy();
            }
            return null;
        }
    }
}
