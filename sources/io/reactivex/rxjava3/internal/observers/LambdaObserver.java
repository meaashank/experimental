package io.reactivex.rxjava3.internal.observers;

import Bc.a;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observers.g;
import java.util.concurrent.atomic.AtomicReference;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public final class LambdaObserver<T> extends AtomicReference<d> implements V<T>, d, g {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bc.g<? super T> f207602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.g<? super Throwable> f207603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f207604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bc.g<? super d> f207605d;

    public LambdaObserver(Bc.g<? super T> onNext, Bc.g<? super Throwable> onError, a onComplete, Bc.g<? super d> onSubscribe) {
        this.f207602a = onNext;
        this.f207603b = onError;
        this.f207604c = onComplete;
        this.f207605d = onSubscribe;
    }

    @Override // io.reactivex.rxjava3.observers.g
    public boolean d() {
        return this.f207603b != Functions.f207357f;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // zc.V
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f207604c.run();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(th);
        }
    }

    @Override // zc.V
    public void onError(Throwable t10) {
        if (isDisposed()) {
            Ic.a.Y(t10);
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f207603b.accept(t10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(new CompositeException(t10, th));
        }
    }

    @Override // zc.V
    public void onNext(T t10) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f207602a.accept(t10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // zc.V
    public void onSubscribe(d d10) {
        if (DisposableHelper.setOnce(this, d10)) {
            try {
                this.f207605d.accept(this);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                d10.dispose();
                onError(th);
            }
        }
    }
}
