package com.inmobi.media;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class V4 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f152515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152516b;

    public V4(@NotNull String name, boolean z10) {
        kotlin.jvm.internal.G.p(name, "name");
        this.f152515a = z10;
        this.f152516b = T.a("TIM-", name);
    }

    public final boolean a() {
        return this.f152515a;
    }

    @Override // java.util.concurrent.ThreadFactory
    @Nullable
    public Thread newThread(@NotNull Runnable r10) {
        kotlin.jvm.internal.G.p(r10, "r");
        try {
            Thread thread = new Thread(r10, this.f152516b);
            thread.setDaemon(this.f152515a);
            return thread;
        } catch (InternalError e10) {
            e10.toString();
            return null;
        }
    }

    public /* synthetic */ V4(String str, boolean z10, int i10, C4969v c4969v) {
        this(str, (i10 & 2) != 0 ? false : z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public V4(@NotNull String name) {
        this(name, false);
        kotlin.jvm.internal.G.p(name, "name");
    }
}
