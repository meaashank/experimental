package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import nc.InterfaceC5267c;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class i0<T, R> extends AbstractC4648a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5267c<R, ? super T, R> f206298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<R> f206299c;

    public static final class a<T, R> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super R> f206300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC5267c<R, ? super T, R> f206301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public R f206302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public io.reactivex.disposables.b f206303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f206304e;

        public a(hc.G<? super R> g10, InterfaceC5267c<R, ? super T, R> interfaceC5267c, R r10) {
            this.f206300a = g10;
            this.f206301b = interfaceC5267c;
            this.f206302c = r10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206303d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206303d.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f206304e) {
                return;
            }
            this.f206304e = true;
            this.f206300a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (this.f206304e) {
                C5666a.Y(th);
            } else {
                this.f206304e = true;
                this.f206300a.onError(th);
            }
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f206304e) {
                return;
            }
            try {
                R rApply = this.f206301b.apply(this.f206302c, t10);
                io.reactivex.internal.functions.a.g(rApply, "The accumulator returned a null value");
                this.f206302c = rApply;
                this.f206300a.onNext(rApply);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f206303d.dispose();
                onError(th);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206303d, bVar)) {
                this.f206303d = bVar;
                this.f206300a.onSubscribe(this);
                this.f206300a.onNext(this.f206302c);
            }
        }
    }

    public i0(hc.E<T> e10, Callable<R> callable, InterfaceC5267c<R, ? super T, R> interfaceC5267c) {
        super(e10);
        this.f206298b = interfaceC5267c;
        this.f206299c = callable;
    }

    @Override // hc.z
    public void C5(hc.G<? super R> g10) {
        try {
            R rCall = this.f206299c.call();
            io.reactivex.internal.functions.a.g(rCall, "The seed supplied is null");
            this.f206214a.a(new a(g10, this.f206298b, rCall));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            EmptyDisposable.error(th, g10);
        }
    }
}
