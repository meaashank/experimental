package com.pgl.ssdk;

/* JADX INFO: loaded from: classes5.dex */
public class v0 {
    public static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod(w7.i.f240158w, String.class).invoke(null, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
