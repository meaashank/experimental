package io.reactivex.internal.observers;

import hc.G;
import lc.f;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f202996c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f202997d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f202998e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f202999f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f203000g = 32;
    private static final long serialVersionUID = -5502432239815349361L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G<? super T> f203001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f203002b;

    public DeferredScalarDisposable(G<? super T> g10) {
        this.f203001a = g10;
    }

    @Override // pc.o
    public final void clear() {
        lazySet(32);
        this.f203002b = null;
    }

    public final void d() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f203001a.onComplete();
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        set(4);
        this.f203002b = null;
    }

    public final void e(T t10) {
        int i10 = get();
        if ((i10 & 54) != 0) {
            return;
        }
        G<? super T> g10 = this.f203001a;
        if (i10 == 8) {
            this.f203002b = t10;
            lazySet(16);
            g10.onNext(null);
        } else {
            lazySet(2);
            g10.onNext(t10);
        }
        if (get() != 4) {
            g10.onComplete();
        }
    }

    public final void f(Throwable th) {
        if ((get() & 54) != 0) {
            C5666a.Y(th);
        } else {
            lazySet(2);
            this.f203001a.onError(th);
        }
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // pc.o
    public final boolean isEmpty() {
        return get() != 16;
    }

    public final boolean j() {
        return getAndSet(4) != 4;
    }

    @Override // pc.o
    @f
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t10 = this.f203002b;
        this.f203002b = null;
        lazySet(32);
        return t10;
    }

    @Override // pc.k
    public final int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}
