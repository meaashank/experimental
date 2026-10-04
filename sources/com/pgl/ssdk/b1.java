package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f161803a = 504;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f161804b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f161805c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f161806d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f161807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f161808f;

    public static void a(Context context, String str) {
        a(context, str, null);
    }

    public static synchronized String b() {
        try {
            if (TextUtils.isEmpty(f161806d)) {
                f161806d = (String) com.pgl.ssdk.ces.a.meta(303, f161808f, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f161806d;
    }

    public static void c() {
        Context context = f161808f;
        if (context != null) {
            f161803a = 102;
            o0.b(new c1(context, null));
            com.pgl.ssdk.ces.b.h().a();
            x.a();
        }
    }

    public static void a(Context context, String str, d1 d1Var) {
        if (f161808f == null) {
            f161808f = context;
        }
        int i10 = f161803a;
        if (i10 == 102 || i10 == 202 || i10 == 200) {
            return;
        }
        f161807e = System.currentTimeMillis();
        f161804b = false;
        f161805c = str;
        f161803a = 102;
        o0.b(new c1(context, d1Var));
    }

    public static synchronized Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return com.pgl.ssdk.ces.a.meta(302, f161808f, bArr);
    }

    public static String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("os", "Android");
            jSONObject.put("version", "6.4.0.0.overseas-rc.5");
            String str = f161806d;
            if (str != null && str.length() > 0) {
                jSONObject.put("token_id", f161806d);
            } else {
                try {
                    jSONObject.put("token_id", b());
                } catch (Throwable unused) {
                    jSONObject.put("token_id", "");
                }
            }
            jSONObject.put(Z3.f.f79422s, f161803a);
            return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (Throwable unused2) {
            r0.a("getGrilock Error");
            return "";
        }
    }
}
