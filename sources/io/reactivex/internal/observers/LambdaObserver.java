package io.reactivex.internal.observers;

import hc.G;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.observers.f;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class LambdaObserver<T> extends AtomicReference<b> implements G<T>, b, f {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5271g<? super T> f203013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5271g<? super Throwable> f203014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5265a f203015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC5271g<? super b> f203016d;

    public LambdaObserver(InterfaceC5271g<? super T> interfaceC5271g, InterfaceC5271g<? super Throwable> interfaceC5271g2, InterfaceC5265a interfaceC5265a, InterfaceC5271g<? super b> interfaceC5271g3) {
        this.f203013a = interfaceC5271g;
        this.f203014b = interfaceC5271g2;
        this.f203015c = interfaceC5265a;
        this.f203016d = interfaceC5271g3;
    }

    @Override // io.reactivex.observers.f
    public boolean d() {
        return this.f203014b != Functions.f202952f;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // hc.G
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f203015c.run();
        } catch (Throwable th) {
            a.b(th);
            C5666a.Y(th);
        }
    }

    @Override // hc.G
    public void onError(Throwable th) {
        if (isDisposed()) {
            C5666a.Y(th);
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f203014b.accept(th);
        } catch (Throwable th2) {
            a.b(th2);
            C5666a.Y(new CompositeException(th, th2));
        }
    }

    @Override // hc.G
    public void onNext(T t10) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f203013a.accept(t10);
        } catch (Throwable th) {
            a.b(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // hc.G
    public void onSubscribe(b bVar) {
        if (DisposableHelper.setOnce(this, bVar)) {
            try {
                this.f203016d.accept(this);
            } catch (Throwable th) {
                a.b(th);
                bVar.dispose();
                onError(th);
            }
        }
    }
}
