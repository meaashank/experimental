package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.a1;

/* JADX INFO: loaded from: classes5.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0<x0> f161941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a1 f161942b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final w0 f161943a = new w0();
    }

    public static w0 a() {
        return b.f161943a;
    }

    public a1 b() {
        if (this.f161942b == null) {
            synchronized (w0.class) {
                try {
                    if (this.f161942b == null) {
                        this.f161942b = a("ssdk_net_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f161942b;
    }

    public a1 c() {
        if (this.f161942b == null) {
            synchronized (w0.class) {
                try {
                    if (this.f161942b == null) {
                        this.f161942b = a("ssdk_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f161942b;
    }

    private w0() {
        this.f161941a = z0.a(2);
    }

    public a1 a(String str) {
        return b(null, str);
    }

    private x0 a(a1.a aVar, String str) {
        if (n0.b().a()) {
            return null;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            return new x0(handlerThread, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public a1 b(a1.a aVar, String str) {
        x0 x0Var = (x0) this.f161941a.a();
        if (x0Var != null) {
            x0Var.a(aVar);
            x0Var.a(str);
            return x0Var;
        }
        return a(aVar, str);
    }
}
