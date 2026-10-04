package com.inmobi.media;

import java.lang.Thread;

/* JADX INFO: loaded from: classes5.dex */
public final class Q2 extends AbstractC3565h3 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f152386b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC3551g3 listener) {
        super(listener);
        kotlin.jvm.internal.G.p(listener, "listener");
        this.f152386b = uncaughtExceptionHandler;
    }

    @Override // com.inmobi.media.AbstractC3565h3
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // com.inmobi.media.AbstractC3565h3
    public final void b() {
        Thread.setDefaultUncaughtExceptionHandler(this.f152386b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t10, Throwable e10) {
        kotlin.jvm.internal.G.p(t10, "t");
        kotlin.jvm.internal.G.p(e10, "e");
        ((C3579i3) this.f152969a).a(new R2(t10, e10));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f152386b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t10, e10);
        }
    }
}
