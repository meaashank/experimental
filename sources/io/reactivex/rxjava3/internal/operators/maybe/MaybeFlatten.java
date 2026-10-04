package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeFlatten<T, R> extends AbstractC4725a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super T, ? extends zc.I<? extends R>> f209509b;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 4375739915521278546L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super R> f209510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super T, ? extends zc.I<? extends R>> f209511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209512c;

        public final class a implements zc.F<R> {
            public a() {
            }

            @Override // zc.F, zc.InterfaceC5888e
            public void onComplete() {
                FlatMapMaybeObserver.this.f209510a.onComplete();
            }

            @Override // zc.F, zc.a0, zc.InterfaceC5888e
            public void onError(Throwable e10) {
                FlatMapMaybeObserver.this.f209510a.onError(e10);
            }

            @Override // zc.F, zc.a0, zc.InterfaceC5888e
            public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
                DisposableHelper.setOnce(FlatMapMaybeObserver.this, d10);
            }

            @Override // zc.F, zc.a0
            public void onSuccess(R value) {
                FlatMapMaybeObserver.this.f209510a.onSuccess(value);
            }
        }

        public FlatMapMaybeObserver(zc.F<? super R> actual, Bc.o<? super T, ? extends zc.I<? extends R>> mapper) {
            this.f209510a = actual;
            this.f209511b = mapper;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this);
            this.f209512c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209510a.onComplete();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209510a.onError(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209512c, d10)) {
                this.f209512c = d10;
                this.f209510a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            try {
                zc.I<? extends R> iApply = this.f209511b.apply(value);
                Objects.requireNonNull(iApply, "The mapper returned a null MaybeSource");
                zc.I<? extends R> i10 = iApply;
                if (isDisposed()) {
                    return;
                }
                i10.b(new a());
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f209510a.onError(th);
            }
        }
    }

    public MaybeFlatten(zc.I<T> source, Bc.o<? super T, ? extends zc.I<? extends R>> mapper) {
        super(source);
        this.f209509b = mapper;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super R> observer) {
        this.f209610a.b(new FlatMapMaybeObserver(observer, this.f209509b));
    }
}
