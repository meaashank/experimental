package io.reactivex.internal.observers;

import hc.InterfaceC4524d;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.f;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class CallbackCompletableObserver extends AtomicReference<b> implements InterfaceC4524d, b, InterfaceC5271g<Throwable>, f {
    private static final long serialVersionUID = -4361286194466301354L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5271g<? super Throwable> f202992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5265a f202993b;

    public CallbackCompletableObserver(InterfaceC5265a interfaceC5265a) {
        this.f202992a = this;
        this.f202993b = interfaceC5265a;
    }

    @Override // nc.InterfaceC5271g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th) {
        C5666a.Y(new OnErrorNotImplementedException(th));
    }

    @Override // io.reactivex.observers.f
    public boolean d() {
        return this.f202992a != this;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // hc.InterfaceC4524d
    public void onComplete() {
        try {
            this.f202993b.run();
        } catch (Throwable th) {
            a.b(th);
            C5666a.Y(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // hc.InterfaceC4524d
    public void onError(Throwable th) {
        try {
            this.f202992a.accept(th);
        } catch (Throwable th2) {
            a.b(th2);
            C5666a.Y(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // hc.InterfaceC4524d
    public void onSubscribe(b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }

    public CallbackCompletableObserver(InterfaceC5271g<? super Throwable> interfaceC5271g, InterfaceC5265a interfaceC5265a) {
        this.f202992a = interfaceC5271g;
        this.f202993b = interfaceC5265a;
    }
}
