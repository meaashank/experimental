package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC5267c;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableWithLatestFrom<T, U, R> extends AbstractC4648a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5267c<? super T, ? super U, ? extends R> f206135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hc.E<? extends U> f206136c;

    public static final class WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements hc.G<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -312246233408980075L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super R> f206137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC5267c<? super T, ? super U, ? extends R> f206138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.disposables.b> f206139c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference<io.reactivex.disposables.b> f206140d = new AtomicReference<>();

        public WithLatestFromObserver(hc.G<? super R> g10, InterfaceC5267c<? super T, ? super U, ? extends R> interfaceC5267c) {
            this.f206137a = g10;
            this.f206138b = interfaceC5267c;
        }

        public void a(Throwable th) {
            DisposableHelper.dispose(this.f206139c);
            this.f206137a.onError(th);
        }

        public boolean b(io.reactivex.disposables.b bVar) {
            return DisposableHelper.setOnce(this.f206140d, bVar);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f206139c);
            DisposableHelper.dispose(this.f206140d);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f206139c.get());
        }

        @Override // hc.G
        public void onComplete() {
            DisposableHelper.dispose(this.f206140d);
            this.f206137a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.f206140d);
            this.f206137a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            U u10 = get();
            if (u10 != null) {
                try {
                    R rApply = this.f206138b.apply(t10, u10);
                    io.reactivex.internal.functions.a.g(rApply, "The combiner returned a null value");
                    this.f206137a.onNext(rApply);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    dispose();
                    this.f206137a.onError(th);
                }
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f206139c, bVar);
        }
    }

    public final class a implements hc.G<U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WithLatestFromObserver<T, U, R> f206141a;

        public a(WithLatestFromObserver<T, U, R> withLatestFromObserver) {
            this.f206141a = withLatestFromObserver;
        }

        @Override // hc.G
        public void onComplete() {
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206141a.a(th);
        }

        @Override // hc.G
        public void onNext(U u10) {
            this.f206141a.lazySet(u10);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f206141a.b(bVar);
        }
    }

    public ObservableWithLatestFrom(hc.E<T> e10, InterfaceC5267c<? super T, ? super U, ? extends R> interfaceC5267c, hc.E<? extends U> e11) {
        super(e10);
        this.f206135b = interfaceC5267c;
        this.f206136c = e11;
    }

    @Override // hc.z
    public void C5(hc.G<? super R> g10) {
        io.reactivex.observers.l lVar = new io.reactivex.observers.l(g10, false);
        WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver(lVar, this.f206135b);
        lVar.onSubscribe(withLatestFromObserver);
        this.f206136c.a(new a(withLatestFromObserver));
        this.f206214a.a(withLatestFromObserver);
    }
}
