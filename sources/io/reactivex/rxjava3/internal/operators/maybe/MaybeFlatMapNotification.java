package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeFlatMapNotification<T, R> extends AbstractC4725a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super T, ? extends zc.I<? extends R>> f209494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.o<? super Throwable, ? extends zc.I<? extends R>> f209495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bc.s<? extends zc.I<? extends R>> f209496d;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 4375739915521278546L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super R> f209497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super T, ? extends zc.I<? extends R>> f209498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bc.o<? super Throwable, ? extends zc.I<? extends R>> f209499c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bc.s<? extends zc.I<? extends R>> f209500d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209501e;

        public final class a implements zc.F<R> {
            public a() {
            }

            @Override // zc.F, zc.InterfaceC5888e
            public void onComplete() {
                FlatMapMaybeObserver.this.f209497a.onComplete();
            }

            @Override // zc.F, zc.a0, zc.InterfaceC5888e
            public void onError(Throwable e10) {
                FlatMapMaybeObserver.this.f209497a.onError(e10);
            }

            @Override // zc.F, zc.a0, zc.InterfaceC5888e
            public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
                DisposableHelper.setOnce(FlatMapMaybeObserver.this, d10);
            }

            @Override // zc.F, zc.a0
            public void onSuccess(R value) {
                FlatMapMaybeObserver.this.f209497a.onSuccess(value);
            }
        }

        public FlatMapMaybeObserver(zc.F<? super R> actual, Bc.o<? super T, ? extends zc.I<? extends R>> onSuccessMapper, Bc.o<? super Throwable, ? extends zc.I<? extends R>> onErrorMapper, Bc.s<? extends zc.I<? extends R>> onCompleteSupplier) {
            this.f209497a = actual;
            this.f209498b = onSuccessMapper;
            this.f209499c = onErrorMapper;
            this.f209500d = onCompleteSupplier;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this);
            this.f209501e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            try {
                zc.I<? extends R> i10 = this.f209500d.get();
                Objects.requireNonNull(i10, "The onCompleteSupplier returned a null MaybeSource");
                zc.I<? extends R> i11 = i10;
                if (isDisposed()) {
                    return;
                }
                i11.b(new a());
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f209497a.onError(th);
            }
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            try {
                zc.I<? extends R> iApply = this.f209499c.apply(e10);
                Objects.requireNonNull(iApply, "The onErrorMapper returned a null MaybeSource");
                zc.I<? extends R> i10 = iApply;
                if (isDisposed()) {
                    return;
                }
                i10.b(new a());
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f209497a.onError(new CompositeException(e10, th));
            }
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209501e, d10)) {
                this.f209501e = d10;
                this.f209497a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            try {
                zc.I<? extends R> iApply = this.f209498b.apply(value);
                Objects.requireNonNull(iApply, "The onSuccessMapper returned a null MaybeSource");
                zc.I<? extends R> i10 = iApply;
                if (isDisposed()) {
                    return;
                }
                i10.b(new a());
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f209497a.onError(th);
            }
        }
    }

    public MaybeFlatMapNotification(zc.I<T> source, Bc.o<? super T, ? extends zc.I<? extends R>> onSuccessMapper, Bc.o<? super Throwable, ? extends zc.I<? extends R>> onErrorMapper, Bc.s<? extends zc.I<? extends R>> onCompleteSupplier) {
        super(source);
        this.f209494b = onSuccessMapper;
        this.f209495c = onErrorMapper;
        this.f209496d = onCompleteSupplier;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super R> observer) {
        this.f209610a.b(new FlatMapMaybeObserver(observer, this.f209494b, this.f209495c, this.f209496d));
    }
}
