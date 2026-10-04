package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import zc.F;
import zc.InterfaceC5888e;
import zc.K;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class f<T> implements a0<T>, F<T>, InterfaceC5888e, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0<? super K<T>> f209929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f209930b;

    public f(a0<? super K<T>> downstream) {
        this.f209929a = downstream;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        this.f209930b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return this.f209930b.isDisposed();
    }

    @Override // zc.F, zc.InterfaceC5888e
    public void onComplete() {
        this.f209929a.onSuccess(K.f241332b);
    }

    @Override // zc.a0, zc.InterfaceC5888e
    public void onError(Throwable e10) {
        this.f209929a.onSuccess(K.b(e10));
    }

    @Override // zc.a0, zc.InterfaceC5888e
    public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
        if (DisposableHelper.validate(this.f209930b, d10)) {
            this.f209930b = d10;
            this.f209929a.onSubscribe(this);
        }
    }

    @Override // zc.a0
    public void onSuccess(T t10) {
        this.f209929a.onSuccess(K.c(t10));
    }
}
