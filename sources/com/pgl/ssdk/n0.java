package com.pgl.ssdk;

import java.lang.Thread;

/* JADX INFO: loaded from: classes5.dex */
public class n0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile n0 f161897a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f161899c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f161898b = Thread.getDefaultUncaughtExceptionHandler();

    private n0() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static n0 b() {
        if (f161897a == null) {
            synchronized (n0.class) {
                try {
                    if (f161897a == null) {
                        f161897a = new n0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f161897a;
    }

    public boolean a() {
        return this.f161899c;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f161899c = true;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f161898b;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
