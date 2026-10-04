package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class Z<T, R> extends AbstractC4648a<T, hc.E<? extends R>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super T, ? extends hc.E<? extends R>> f206206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nc.o<? super Throwable, ? extends hc.E<? extends R>> f206207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable<? extends hc.E<? extends R>> f206208d;

    public static final class a<T, R> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super hc.E<? extends R>> f206209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super T, ? extends hc.E<? extends R>> f206210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final nc.o<? super Throwable, ? extends hc.E<? extends R>> f206211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Callable<? extends hc.E<? extends R>> f206212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.disposables.b f206213e;

        public a(hc.G<? super hc.E<? extends R>> g10, nc.o<? super T, ? extends hc.E<? extends R>> oVar, nc.o<? super Throwable, ? extends hc.E<? extends R>> oVar2, Callable<? extends hc.E<? extends R>> callable) {
            this.f206209a = g10;
            this.f206210b = oVar;
            this.f206211c = oVar2;
            this.f206212d = callable;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206213e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206213e.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            try {
                hc.E<? extends R> eCall = this.f206212d.call();
                io.reactivex.internal.functions.a.g(eCall, "The onComplete ObservableSource returned is null");
                this.f206209a.onNext(eCall);
                this.f206209a.onComplete();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f206209a.onError(th);
            }
        }

        @Override // hc.G
        public void onError(Throwable th) {
            try {
                hc.E<? extends R> eApply = this.f206211c.apply(th);
                io.reactivex.internal.functions.a.g(eApply, "The onError ObservableSource returned is null");
                this.f206209a.onNext(eApply);
                this.f206209a.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f206209a.onError(new CompositeException(th, th2));
            }
        }

        @Override // hc.G
        public void onNext(T t10) {
            try {
                hc.E<? extends R> eApply = this.f206210b.apply(t10);
                io.reactivex.internal.functions.a.g(eApply, "The onNext ObservableSource returned is null");
                this.f206209a.onNext(eApply);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f206209a.onError(th);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206213e, bVar)) {
                this.f206213e = bVar;
                this.f206209a.onSubscribe(this);
            }
        }
    }

    public Z(hc.E<T> e10, nc.o<? super T, ? extends hc.E<? extends R>> oVar, nc.o<? super Throwable, ? extends hc.E<? extends R>> oVar2, Callable<? extends hc.E<? extends R>> callable) {
        super(e10);
        this.f206206b = oVar;
        this.f206207c = oVar2;
        this.f206208d = callable;
    }

    @Override // hc.z
    public void C5(hc.G<? super hc.E<? extends R>> g10) {
        this.f206214a.a(new a(g10, this.f206206b, this.f206207c, this.f206208d));
    }
}
