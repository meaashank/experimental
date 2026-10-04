package com.inmobi.media;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class R2 extends C3525e5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StackTraceElement[] f152406g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R2(Thread thread, Throwable error) {
        super("crashReporting", "CrashEvent", Cc.a(thread, error));
        kotlin.jvm.internal.G.p(thread, "thread");
        kotlin.jvm.internal.G.p(error, "error");
        StackTraceElement[] stackTrace = error.getStackTrace();
        kotlin.jvm.internal.G.o(stackTrace, "getStackTrace(...)");
        this.f152406g = stackTrace;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public R2(String str) {
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        super(string, "crashReporting", "CatchEvent", str);
    }
}
