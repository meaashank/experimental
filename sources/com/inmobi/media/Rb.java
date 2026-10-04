package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K5 f152414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f152415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Integer f152416c;

    static {
        K5 k5A;
        Context contextD = C3657nb.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = K5.f152164b;
            k5A = J5.a(contextD, "imtelemetrydboverflow");
        } else {
            k5A = null;
        }
        f152414a = k5A;
        f152415b = -1;
    }

    public static int a() {
        if (f152415b == -1) {
            K5 k52 = f152414a;
            f152415b = k52 != null ? k52.f152165a.getInt("count", 0) : 0;
        }
        return f152415b;
    }
}
