package com.apm.insight.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.q;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile UUID f137244a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f137245b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context) {
        String string;
        if (f137244a == null) {
            synchronized (a.class) {
                if (f137244a == null) {
                    String strC = q.a().c();
                    if (strC != null) {
                        f137244a = UUID.fromString(strC);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            string = null;
                        }
                        try {
                            if (string != null) {
                                f137244a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f137244a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            q.a().b(f137244a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        try {
            if (TextUtils.isEmpty(f137245b)) {
                new a(context);
                UUID uuid = f137244a;
                if (uuid != null) {
                    f137245b = uuid.toString();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f137245b;
    }
}
