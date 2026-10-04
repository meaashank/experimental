package Eb;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f33653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object f33654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f33655c;

    public i2(@NotNull String namespace) {
        kotlin.jvm.internal.G.p(namespace, "namespace");
        this.f33653a = namespace;
        this.f33654b = new Object();
    }

    public final void a(@NotNull ed.l<? super i2, kotlin.L0> func) {
        kotlin.jvm.internal.G.p(func, "func");
        synchronized (this.f33654b) {
            func.invoke(this);
        }
    }

    public final boolean b() {
        return this.f33655c;
    }

    @NotNull
    public final String c() {
        return this.f33653a;
    }

    public final void d(boolean z10) {
        this.f33655c = z10;
    }
}
