package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC5267c;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeFlatMapBiSelector<T, U, R> extends AbstractC4640a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super T, ? extends hc.w<? extends U>> f204847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5267c<? super T, ? super U, ? extends R> f204848c;

    public static final class FlatMapBiMainObserver<T, U, R> implements hc.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nc.o<? super T, ? extends hc.w<? extends U>> f204849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InnerObserver<T, U, R> f204850b;

        public static final class InnerObserver<T, U, R> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<U> {
            private static final long serialVersionUID = -2897979525538174559L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final hc.t<? super R> f204851a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterfaceC5267c<? super T, ? super U, ? extends R> f204852b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public T f204853c;

            public InnerObserver(hc.t<? super R> tVar, InterfaceC5267c<? super T, ? super U, ? extends R> interfaceC5267c) {
                this.f204851a = tVar;
                this.f204852b = interfaceC5267c;
            }

            @Override // hc.t
            public void onComplete() {
                this.f204851a.onComplete();
            }

            @Override // hc.t
            public void onError(Throwable th) {
                this.f204851a.onError(th);
            }

            @Override // hc.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // hc.t
            public void onSuccess(U u10) {
                T t10 = this.f204853c;
                this.f204853c = null;
                try {
                    R rApply = this.f204852b.apply(t10, u10);
                    io.reactivex.internal.functions.a.g(rApply, "The resultSelector returned a null value");
                    this.f204851a.onSuccess(rApply);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f204851a.onError(th);
                }
            }
        }

        public FlatMapBiMainObserver(hc.t<? super R> tVar, nc.o<? super T, ? extends hc.w<? extends U>> oVar, InterfaceC5267c<? super T, ? super U, ? extends R> interfaceC5267c) {
            this.f204850b = new InnerObserver<>(tVar, interfaceC5267c);
            this.f204849a = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f204850b);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f204850b.get());
        }

        @Override // hc.t
        public void onComplete() {
            this.f204850b.f204851a.onComplete();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f204850b.f204851a.onError(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this.f204850b, bVar)) {
                this.f204850b.f204851a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            try {
                hc.w<? extends U> wVarApply = this.f204849a.apply(t10);
                io.reactivex.internal.functions.a.g(wVarApply, "The mapper returned a null MaybeSource");
                hc.w<? extends U> wVar = wVarApply;
                if (DisposableHelper.replace(this.f204850b, null)) {
                    InnerObserver<T, U, R> innerObserver = this.f204850b;
                    innerObserver.f204853c = t10;
                    wVar.b(innerObserver);
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f204850b.f204851a.onError(th);
            }
        }
    }

    public MaybeFlatMapBiSelector(hc.w<T> wVar, nc.o<? super T, ? extends hc.w<? extends U>> oVar, InterfaceC5267c<? super T, ? super U, ? extends R> interfaceC5267c) {
        super(wVar);
        this.f204847b = oVar;
        this.f204848c = interfaceC5267c;
    }

    @Override // hc.q
    public void o1(hc.t<? super R> tVar) {
        this.f204988a.b(new FlatMapBiMainObserver(tVar, this.f204847b, this.f204848c));
    }
}
