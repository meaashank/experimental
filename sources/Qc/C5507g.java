package qc;

import hc.G;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;
import uc.C5666a;

/* JADX INFO: renamed from: qc.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5507g<T> implements G<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G<? super T> f227057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5271g<? super io.reactivex.disposables.b> f227058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5265a f227059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.reactivex.disposables.b f227060d;

    public C5507g(G<? super T> g10, InterfaceC5271g<? super io.reactivex.disposables.b> interfaceC5271g, InterfaceC5265a interfaceC5265a) {
        this.f227057a = g10;
        this.f227058b = interfaceC5271g;
        this.f227059c = interfaceC5265a;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        try {
            this.f227059c.run();
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            C5666a.Y(th);
        }
        this.f227060d.dispose();
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f227060d.isDisposed();
    }

    @Override // hc.G
    public void onComplete() {
        if (this.f227060d != DisposableHelper.DISPOSED) {
            this.f227057a.onComplete();
        }
    }

    @Override // hc.G
    public void onError(Throwable th) {
        if (this.f227060d != DisposableHelper.DISPOSED) {
            this.f227057a.onError(th);
        } else {
            C5666a.Y(th);
        }
    }

    @Override // hc.G
    public void onNext(T t10) {
        this.f227057a.onNext(t10);
    }

    @Override // hc.G
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        try {
            this.f227058b.accept(bVar);
            if (DisposableHelper.validate(this.f227060d, bVar)) {
                this.f227060d = bVar;
                this.f227057a.onSubscribe(this);
            }
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            bVar.dispose();
            this.f227060d = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th, this.f227057a);
        }
    }
}
