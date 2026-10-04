package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeFlatMapNotification<T, R> extends AbstractC4640a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super T, ? extends hc.w<? extends R>> f204867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nc.o<? super Throwable, ? extends hc.w<? extends R>> f204868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable<? extends hc.w<? extends R>> f204869d;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 4375739915521278546L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super R> f204870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super T, ? extends hc.w<? extends R>> f204871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final nc.o<? super Throwable, ? extends hc.w<? extends R>> f204872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Callable<? extends hc.w<? extends R>> f204873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.disposables.b f204874e;

        public final class a implements hc.t<R> {
            public a() {
            }

            @Override // hc.t
            public void onComplete() {
                FlatMapMaybeObserver.this.f204870a.onComplete();
            }

            @Override // hc.t
            public void onError(Throwable th) {
                FlatMapMaybeObserver.this.f204870a.onError(th);
            }

            @Override // hc.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(FlatMapMaybeObserver.this, bVar);
            }

            @Override // hc.t
            public void onSuccess(R r10) {
                FlatMapMaybeObserver.this.f204870a.onSuccess(r10);
            }
        }

        public FlatMapMaybeObserver(hc.t<? super R> tVar, nc.o<? super T, ? extends hc.w<? extends R>> oVar, nc.o<? super Throwable, ? extends hc.w<? extends R>> oVar2, Callable<? extends hc.w<? extends R>> callable) {
            this.f204870a = tVar;
            this.f204871b = oVar;
            this.f204872c = oVar2;
            this.f204873d = callable;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            this.f204874e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // hc.t
        public void onComplete() {
            try {
                hc.w<? extends R> wVarCall = this.f204873d.call();
                io.reactivex.internal.functions.a.g(wVarCall, "The onCompleteSupplier returned a null MaybeSource");
                wVarCall.b(new a());
            } catch (Exception e10) {
                io.reactivex.exceptions.a.b(e10);
                this.f204870a.onError(e10);
            }
        }

        @Override // hc.t
        public void onError(Throwable th) {
            try {
                hc.w<? extends R> wVarApply = this.f204872c.apply(th);
                io.reactivex.internal.functions.a.g(wVarApply, "The onErrorMapper returned a null MaybeSource");
                wVarApply.b(new a());
            } catch (Exception e10) {
                io.reactivex.exceptions.a.b(e10);
                this.f204870a.onError(new CompositeException(th, e10));
            }
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f204874e, bVar)) {
                this.f204874e = bVar;
                this.f204870a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            try {
                hc.w<? extends R> wVarApply = this.f204871b.apply(t10);
                io.reactivex.internal.functions.a.g(wVarApply, "The onSuccessMapper returned a null MaybeSource");
                wVarApply.b(new a());
            } catch (Exception e10) {
                io.reactivex.exceptions.a.b(e10);
                this.f204870a.onError(e10);
            }
        }
    }

    public MaybeFlatMapNotification(hc.w<T> wVar, nc.o<? super T, ? extends hc.w<? extends R>> oVar, nc.o<? super Throwable, ? extends hc.w<? extends R>> oVar2, Callable<? extends hc.w<? extends R>> callable) {
        super(wVar);
        this.f204867b = oVar;
        this.f204868c = oVar2;
        this.f204869d = callable;
    }

    @Override // hc.q
    public void o1(hc.t<? super R> tVar) {
        this.f204988a.b(new FlatMapMaybeObserver(tVar, this.f204867b, this.f204868c, this.f204869d));
    }
}
