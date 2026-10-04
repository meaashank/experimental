package io.reactivex.internal.schedulers;

import hc.H;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H f207051b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H.c f207052c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final io.reactivex.disposables.b f207053d;

    public static final class a extends H.c {
        @Override // hc.H.c
        @lc.e
        public io.reactivex.disposables.b b(@lc.e Runnable runnable) {
            runnable.run();
            return c.f207053d;
        }

        @Override // hc.H.c
        @lc.e
        public io.reactivex.disposables.b c(@lc.e Runnable runnable, long j10, @lc.e TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }

        @Override // hc.H.c
        @lc.e
        public io.reactivex.disposables.b d(@lc.e Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return false;
        }
    }

    static {
        io.reactivex.disposables.b bVarF = io.reactivex.disposables.c.f(Functions.f202948b);
        f207053d = bVarF;
        bVarF.dispose();
    }

    @Override // hc.H
    @lc.e
    public H.c c() {
        return f207052c;
    }

    @Override // hc.H
    @lc.e
    public io.reactivex.disposables.b e(@lc.e Runnable runnable) {
        runnable.run();
        return f207053d;
    }

    @Override // hc.H
    @lc.e
    public io.reactivex.disposables.b f(@lc.e Runnable runnable, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }

    @Override // hc.H
    @lc.e
    public io.reactivex.disposables.b g(@lc.e Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }
}
