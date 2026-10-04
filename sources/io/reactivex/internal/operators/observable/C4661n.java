package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import nc.InterfaceC5266b;
import uc.C5666a;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4661n<T, U> extends AbstractC4648a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<? extends U> f206374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5266b<? super U, ? super T> f206375c;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.n$a */
    public static final class a<T, U> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super U> f206376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC5266b<? super U, ? super T> f206377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final U f206378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public io.reactivex.disposables.b f206379d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f206380e;

        public a(hc.G<? super U> g10, U u10, InterfaceC5266b<? super U, ? super T> interfaceC5266b) {
            this.f206376a = g10;
            this.f206377b = interfaceC5266b;
            this.f206378c = u10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206379d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206379d.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f206380e) {
                return;
            }
            this.f206380e = true;
            this.f206376a.onNext(this.f206378c);
            this.f206376a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (this.f206380e) {
                C5666a.Y(th);
            } else {
                this.f206380e = true;
                this.f206376a.onError(th);
            }
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f206380e) {
                return;
            }
            try {
                this.f206377b.accept(this.f206378c, t10);
            } catch (Throwable th) {
                this.f206379d.dispose();
                onError(th);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206379d, bVar)) {
                this.f206379d = bVar;
                this.f206376a.onSubscribe(this);
            }
        }
    }

    public C4661n(hc.E<T> e10, Callable<? extends U> callable, InterfaceC5266b<? super U, ? super T> interfaceC5266b) {
        super(e10);
        this.f206374b = callable;
        this.f206375c = interfaceC5266b;
    }

    @Override // hc.z
    public void C5(hc.G<? super U> g10) {
        try {
            U uCall = this.f206374b.call();
            io.reactivex.internal.functions.a.g(uCall, "The initialSupplier returned a null value");
            this.f206214a.a(new a(g10, uCall, this.f206375c));
        } catch (Throwable th) {
            EmptyDisposable.error(th, g10);
        }
    }
}
