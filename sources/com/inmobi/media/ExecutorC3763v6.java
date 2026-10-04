package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.inmobi.media.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ExecutorC3763v6 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f153451a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.G.p(runnable, "runnable");
        this.f153451a.post(runnable);
    }
}
