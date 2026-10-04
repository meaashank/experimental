package io.reactivex.internal.observers;

import hc.G;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.a;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;
import nc.r;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<b> implements G<T>, b {
    private static final long serialVersionUID = -4403180040475402120L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r<? super T> f203004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5271g<? super Throwable> f203005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5265a f203006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f203007d;

    public ForEachWhileObserver(r<? super T> rVar, InterfaceC5271g<? super Throwable> interfaceC5271g, InterfaceC5265a interfaceC5265a) {
        this.f203004a = rVar;
        this.f203005b = interfaceC5271g;
        this.f203006c = interfaceC5265a;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // hc.G
    public void onComplete() {
        if (this.f203007d) {
            return;
        }
        this.f203007d = true;
        try {
            this.f203006c.run();
        } catch (Throwable th) {
            a.b(th);
            C5666a.Y(th);
        }
    }

    @Override // hc.G
    public void onError(Throwable th) {
        if (this.f203007d) {
            C5666a.Y(th);
            return;
        }
        this.f203007d = true;
        try {
            this.f203005b.accept(th);
        } catch (Throwable th2) {
            a.b(th2);
            C5666a.Y(new CompositeException(th, th2));
        }
    }

    @Override // hc.G
    public void onNext(T t10) {
        if (this.f203007d) {
            return;
        }
        try {
            if (this.f203004a.test(t10)) {
                return;
            }
            DisposableHelper.dispose(this);
            onComplete();
        } catch (Throwable th) {
            a.b(th);
            DisposableHelper.dispose(this);
            onError(th);
        }
    }

    @Override // hc.G
    public void onSubscribe(b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }
}
