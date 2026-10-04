package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeOnErrorNext<T> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super Throwable, ? extends zc.I<? extends T>> f209533b;

    public static final class OnErrorNextMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 2026620218879969836L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super Throwable, ? extends zc.I<? extends T>> f209535b;

        public static final class a<T> implements zc.F<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final zc.F<? super T> f209536a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AtomicReference<io.reactivex.rxjava3.disposables.d> f209537b;

            public a(zc.F<? super T> actual, AtomicReference<io.reactivex.rxjava3.disposables.d> d10) {
                this.f209536a = actual;
                this.f209537b = d10;
            }

            @Override // zc.F, zc.InterfaceC5888e
            public void onComplete() {
                this.f209536a.onComplete();
            }

            @Override // zc.F, zc.a0, zc.InterfaceC5888e
            public void onError(Throwable e10) {
                this.f209536a.onError(e10);
            }

            @Override // zc.F, zc.a0, zc.InterfaceC5888e
            public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
                DisposableHelper.setOnce(this.f209537b, d10);
            }

            @Override // zc.F, zc.a0
            public void onSuccess(T value) {
                this.f209536a.onSuccess(value);
            }
        }

        public OnErrorNextMaybeObserver(zc.F<? super T> actual, Bc.o<? super Throwable, ? extends zc.I<? extends T>> resumeFunction) {
            this.f209534a = actual;
            this.f209535b = resumeFunction;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209534a.onComplete();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            try {
                zc.I<? extends T> iApply = this.f209535b.apply(e10);
                Objects.requireNonNull(iApply, "The resumeFunction returned a null MaybeSource");
                zc.I<? extends T> i10 = iApply;
                DisposableHelper.replace(this, null);
                i10.b(new a(this.f209534a, this));
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f209534a.onError(new CompositeException(e10, th));
            }
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.setOnce(this, d10)) {
                this.f209534a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209534a.onSuccess(value);
        }
    }

    public MaybeOnErrorNext(zc.I<T> source, Bc.o<? super Throwable, ? extends zc.I<? extends T>> resumeFunction) {
        super(source);
        this.f209533b = resumeFunction;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209610a.b(new OnErrorNextMaybeObserver(observer, this.f209533b));
    }
}
