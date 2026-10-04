package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import com.inmobi.media.M9;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public abstract class M9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f152231a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f152232b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f152233c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f152234d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f152235e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f152236f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f152237g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f152238h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f152239i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f152240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f152241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f152242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f152243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Location f152244n;

    public static void a(final boolean z10) {
        f152232b = Boolean.valueOf(z10);
        final Context contextD = C3657nb.d();
        if (contextD != null) {
            C3657nb.a(new Runnable() { // from class: F5.Z
                @Override // java.lang.Runnable
                public final void run() {
                    M9.a(contextD, z10);
                }
            });
        }
    }

    public static Location b() {
        Location location = f152244n;
        if (location != null) {
            return location;
        }
        Context contextD = C3657nb.d();
        Location location2 = null;
        if (contextD == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = K5.f152164b;
        String string = J5.a(contextD, "user_info_store").f152165a.getString("user_location", null);
        if (string == null) {
            return null;
        }
        Location location3 = new Location("");
        try {
            String[] strArr = (String[]) new Regex(",").r(string, 0).toArray(new String[0]);
            location3.setLatitude(Double.parseDouble(strArr[0]));
            location3.setLongitude(Double.parseDouble(strArr[1]));
            location3.setAccuracy(Float.parseFloat(strArr[2]));
            location3.setTime(Long.parseLong(strArr[3]));
            location2 = location3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
        }
        f152244n = location2;
        return location2;
    }

    public static boolean c() {
        Boolean bool = f152232b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Context contextD = C3657nb.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = K5.f152164b;
            f152232b = Boolean.valueOf(J5.a(contextD, "user_info_store").f152165a.getBoolean("user_age_restricted", false));
        }
        Boolean bool2 = f152232b;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }

    public static final void a(Context it, boolean z10) {
        kotlin.jvm.internal.G.p(it, "$it");
        ConcurrentHashMap concurrentHashMap = K5.f152164b;
        J5.a(it, "user_info_store").a("user_age_restricted", z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap a() {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.M9.a():java.util.HashMap");
    }
}
