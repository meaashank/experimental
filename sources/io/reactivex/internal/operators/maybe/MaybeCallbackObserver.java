package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeCallbackObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T>, io.reactivex.disposables.b, io.reactivex.observers.f {
    private static final long serialVersionUID = -6076952298809384986L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5271g<? super T> f204778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5271g<? super Throwable> f204779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5265a f204780c;

    public MaybeCallbackObserver(InterfaceC5271g<? super T> interfaceC5271g, InterfaceC5271g<? super Throwable> interfaceC5271g2, InterfaceC5265a interfaceC5265a) {
        this.f204778a = interfaceC5271g;
        this.f204779b = interfaceC5271g2;
        this.f204780c = interfaceC5265a;
    }

    @Override // io.reactivex.observers.f
    public boolean d() {
        return this.f204779b != Functions.f202952f;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // hc.t
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f204780c.run();
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            C5666a.Y(th);
        }
    }

    @Override // hc.t
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f204779b.accept(th);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            C5666a.Y(new CompositeException(th, th2));
        }
    }

    @Override // hc.t
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }

    @Override // hc.t
    public void onSuccess(T t10) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f204778a.accept(t10);
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            C5666a.Y(th);
        }
    }
}
