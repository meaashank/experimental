package com.inmobi.media;

import android.os.Handler;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Ib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kotlin.G f152066a = kotlin.I.a(Hb.f152034a);

    @dd.o
    public static final void a(@NotNull Runnable runnable, long j10) {
        kotlin.jvm.internal.G.p(runnable, "runnable");
        ((Handler) f152066a.getValue()).postDelayed(runnable, j10);
    }

    @dd.o
    public static final void a(@NotNull Runnable runnable) {
        kotlin.jvm.internal.G.p(runnable, "runnable");
        ((Handler) f152066a.getValue()).post(runnable);
    }
}
