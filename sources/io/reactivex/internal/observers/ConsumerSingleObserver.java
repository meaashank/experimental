package io.reactivex.internal.observers;

import hc.L;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.observers.f;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC5271g;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class ConsumerSingleObserver<T> extends AtomicReference<b> implements L<T>, b, f {
    private static final long serialVersionUID = -7012088219455310787L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5271g<? super T> f202994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5271g<? super Throwable> f202995b;

    public ConsumerSingleObserver(InterfaceC5271g<? super T> interfaceC5271g, InterfaceC5271g<? super Throwable> interfaceC5271g2) {
        this.f202994a = interfaceC5271g;
        this.f202995b = interfaceC5271g2;
    }

    @Override // io.reactivex.observers.f
    public boolean d() {
        return this.f202995b != Functions.f202952f;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // hc.L
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f202995b.accept(th);
        } catch (Throwable th2) {
            a.b(th2);
            C5666a.Y(new CompositeException(th, th2));
        }
    }

    @Override // hc.L
    public void onSubscribe(b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }

    @Override // hc.L
    public void onSuccess(T t10) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f202994a.accept(t10);
        } catch (Throwable th) {
            a.b(th);
            C5666a.Y(th);
        }
    }
}
