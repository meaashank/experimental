package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.TimeUnit;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W f211799b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W.c f211800c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final io.reactivex.rxjava3.disposables.d f211801d;

    public static final class a extends W.c {
        @Override // zc.W.c
        @yc.e
        public io.reactivex.rxjava3.disposables.d b(@yc.e Runnable run) {
            run.run();
            return c.f211801d;
        }

        @Override // zc.W.c
        @yc.e
        public io.reactivex.rxjava3.disposables.d c(@yc.e Runnable run, long delay, @yc.e TimeUnit unit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }

        @Override // zc.W.c
        @yc.e
        public io.reactivex.rxjava3.disposables.d d(@yc.e Runnable run, long initialDelay, long period, TimeUnit unit) {
            throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return false;
        }
    }

    static {
        io.reactivex.rxjava3.disposables.d dVarG = io.reactivex.rxjava3.disposables.c.g(Functions.f207353b);
        f211801d = dVarG;
        dVarG.dispose();
    }

    @Override // zc.W
    @yc.e
    public W.c c() {
        return f211800c;
    }

    @Override // zc.W
    @yc.e
    public io.reactivex.rxjava3.disposables.d e(@yc.e Runnable run) {
        run.run();
        return f211801d;
    }

    @Override // zc.W
    @yc.e
    public io.reactivex.rxjava3.disposables.d f(@yc.e Runnable run, long delay, TimeUnit unit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }

    @Override // zc.W
    @yc.e
    public io.reactivex.rxjava3.disposables.d g(@yc.e Runnable run, long initialDelay, long period, TimeUnit unit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }
}
