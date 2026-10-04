package com.prism.commons.utils;

import android.content.Context;
import com.prism.commons.utils.S;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162025a = "PREFERENCE_NAME_DEVICE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f162026b = "KEY_DEVICE_ID";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static s0<String> f162027c;

    public static String a(Context context) {
        if (f162027c == null) {
            synchronized (B.class) {
                try {
                    if (f162027c == null) {
                        S.d dVar = new S.d(context, f162025a, f162026b);
                        s0<String> s0Var = new s0<>(dVar);
                        f162027c = s0Var;
                        s0Var.f162148c = dVar;
                        if (s0Var.a() == null) {
                            f162027c.b(UUID.randomUUID().toString());
                        }
                    }
                } finally {
                }
            }
        }
        return f162027c.a();
    }
}
