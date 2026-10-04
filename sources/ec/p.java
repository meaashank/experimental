package Ec;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class p<T> implements a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f33869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0<? super T> f33870b;

    public p(AtomicReference<io.reactivex.rxjava3.disposables.d> parent, a0<? super T> downstream) {
        this.f33869a = parent;
        this.f33870b = downstream;
    }

    @Override // zc.a0, zc.InterfaceC5888e
    public void onError(Throwable e10) {
        this.f33870b.onError(e10);
    }

    @Override // zc.a0, zc.InterfaceC5888e
    public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
        DisposableHelper.replace(this.f33869a, d10);
    }

    @Override // zc.a0
    public void onSuccess(T value) {
        this.f33870b.onSuccess(value);
    }
}
