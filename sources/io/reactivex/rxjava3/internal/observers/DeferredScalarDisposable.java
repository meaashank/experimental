package io.reactivex.rxjava3.internal.observers;

import Ic.a;
import yc.f;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f207585c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f207586d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f207587e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f207588f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f207589g = 32;
    private static final long serialVersionUID = -5502432239815349361L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V<? super T> f207590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f207591b;

    public DeferredScalarDisposable(V<? super T> downstream) {
        this.f207590a = downstream;
    }

    @Override // Dc.q
    public final void clear() {
        lazySet(32);
        this.f207591b = null;
    }

    public final void d() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f207590a.onComplete();
    }

    public void dispose() {
        set(4);
        this.f207591b = null;
    }

    public final void e(T value) {
        int i10 = get();
        if ((i10 & 54) != 0) {
            return;
        }
        V<? super T> v10 = this.f207590a;
        if (i10 == 8) {
            this.f207591b = value;
            lazySet(16);
            v10.onNext(null);
        } else {
            lazySet(2);
            v10.onNext(value);
        }
        if (get() != 4) {
            v10.onComplete();
        }
    }

    public final void f(Throwable t10) {
        if ((get() & 54) != 0) {
            a.Y(t10);
        } else {
            lazySet(2);
            this.f207590a.onError(t10);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // Dc.q
    public final boolean isEmpty() {
        return get() != 16;
    }

    public final boolean j() {
        return getAndSet(4) != 4;
    }

    @Override // Dc.q
    @f
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        T t10 = this.f207591b;
        this.f207591b = null;
        lazySet(32);
        return t10;
    }

    @Override // Dc.m
    public final int requestFusion(int mode) {
        if ((mode & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}
