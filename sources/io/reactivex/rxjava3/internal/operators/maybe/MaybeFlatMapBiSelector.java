package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeFlatMapBiSelector<T, U, R> extends AbstractC4725a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super T, ? extends zc.I<? extends U>> f209474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.c<? super T, ? super U, ? extends R> f209475c;

    public static final class FlatMapBiMainObserver<T, U, R> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bc.o<? super T, ? extends zc.I<? extends U>> f209476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InnerObserver<T, U, R> f209477b;

        public static final class InnerObserver<T, U, R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<U> {
            private static final long serialVersionUID = -2897979525538174559L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final zc.F<? super R> f209478a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Bc.c<? super T, ? super U, ? extends R> f209479b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public T f209480c;

            public InnerObserver(zc.F<? super R> actual, Bc.c<? super T, ? super U, ? extends R> resultSelector) {
                this.f209478a = actual;
                this.f209479b = resultSelector;
            }

            @Override // zc.F, zc.InterfaceC5888e
            public void onComplete() {
                this.f209478a.onComplete();
            }

            @Override // zc.F, zc.a0, zc.InterfaceC5888e
            public void onError(Throwable e10) {
                this.f209478a.onError(e10);
            }

            @Override // zc.F, zc.a0, zc.InterfaceC5888e
            public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
                DisposableHelper.setOnce(this, d10);
            }

            @Override // zc.F, zc.a0
            public void onSuccess(U value) {
                T t10 = this.f209480c;
                this.f209480c = null;
                try {
                    R rApply = this.f209479b.apply(t10, value);
                    Objects.requireNonNull(rApply, "The resultSelector returned a null value");
                    this.f209478a.onSuccess(rApply);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    this.f209478a.onError(th);
                }
            }
        }

        public FlatMapBiMainObserver(zc.F<? super R> actual, Bc.o<? super T, ? extends zc.I<? extends U>> mapper, Bc.c<? super T, ? super U, ? extends R> resultSelector) {
            this.f209477b = new InnerObserver<>(actual, resultSelector);
            this.f209476a = mapper;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this.f209477b);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f209477b.get());
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209477b.f209478a.onComplete();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209477b.f209478a.onError(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.setOnce(this.f209477b, d10)) {
                this.f209477b.f209478a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T t10) {
            try {
                zc.I<? extends U> iApply = this.f209476a.apply(t10);
                Objects.requireNonNull(iApply, "The mapper returned a null MaybeSource");
                zc.I<? extends U> i10 = iApply;
                if (DisposableHelper.replace(this.f209477b, null)) {
                    InnerObserver<T, U, R> innerObserver = this.f209477b;
                    innerObserver.f209480c = t10;
                    i10.b(innerObserver);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f209477b.f209478a.onError(th);
            }
        }
    }

    public MaybeFlatMapBiSelector(zc.I<T> source, Bc.o<? super T, ? extends zc.I<? extends U>> mapper, Bc.c<? super T, ? super U, ? extends R> resultSelector) {
        super(source);
        this.f209474b = mapper;
        this.f209475c = resultSelector;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super R> observer) {
        this.f209610a.b(new FlatMapBiMainObserver(observer, this.f209474b, this.f209475c));
    }
}
