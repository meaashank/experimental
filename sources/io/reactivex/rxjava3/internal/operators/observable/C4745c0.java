package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4745c0<T, R> extends AbstractC4740a<T, zc.T<? extends R>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super T, ? extends zc.T<? extends R>> f210967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.o<? super Throwable, ? extends zc.T<? extends R>> f210968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bc.s<? extends zc.T<? extends R>> f210969d;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.c0$a */
    public static final class a<T, R> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super zc.T<? extends R>> f210970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super T, ? extends zc.T<? extends R>> f210971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bc.o<? super Throwable, ? extends zc.T<? extends R>> f210972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bc.s<? extends zc.T<? extends R>> f210973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210974e;

        public a(zc.V<? super zc.T<? extends R>> actual, Bc.o<? super T, ? extends zc.T<? extends R>> onNextMapper, Bc.o<? super Throwable, ? extends zc.T<? extends R>> onErrorMapper, Bc.s<? extends zc.T<? extends R>> onCompleteSupplier) {
            this.f210970a = actual;
            this.f210971b = onNextMapper;
            this.f210972c = onErrorMapper;
            this.f210973d = onCompleteSupplier;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f210974e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210974e.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            try {
                zc.T<? extends R> t10 = this.f210973d.get();
                Objects.requireNonNull(t10, "The onComplete ObservableSource returned is null");
                this.f210970a.onNext(t10);
                this.f210970a.onComplete();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f210970a.onError(th);
            }
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            try {
                zc.T<? extends R> tApply = this.f210972c.apply(t10);
                Objects.requireNonNull(tApply, "The onError ObservableSource returned is null");
                this.f210970a.onNext(tApply);
                this.f210970a.onComplete();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f210970a.onError(new CompositeException(t10, th));
            }
        }

        @Override // zc.V
        public void onNext(T t10) {
            try {
                zc.T<? extends R> tApply = this.f210971b.apply(t10);
                Objects.requireNonNull(tApply, "The onNext ObservableSource returned is null");
                this.f210970a.onNext(tApply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f210970a.onError(th);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210974e, d10)) {
                this.f210974e = d10;
                this.f210970a.onSubscribe(this);
            }
        }
    }

    public C4745c0(zc.T<T> source, Bc.o<? super T, ? extends zc.T<? extends R>> onNextMapper, Bc.o<? super Throwable, ? extends zc.T<? extends R>> onErrorMapper, Bc.s<? extends zc.T<? extends R>> onCompleteSupplier) {
        super(source);
        this.f210967b = onNextMapper;
        this.f210968c = onErrorMapper;
        this.f210969d = onCompleteSupplier;
    }

    @Override // zc.N
    public void d6(zc.V<? super zc.T<? extends R>> t10) {
        this.f210954a.a(new a(t10, this.f210967b, this.f210968c, this.f210969d));
    }
}
