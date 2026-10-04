package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class F<T, R> extends AbstractC4725a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super T, ? extends R> f209359b;

    public static final class a<T, R> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super R> f209360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super T, ? extends R> f209361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209362c;

        public a(zc.F<? super R> actual, Bc.o<? super T, ? extends R> mapper) {
            this.f209360a = actual;
            this.f209361b = mapper;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            io.reactivex.rxjava3.disposables.d dVar = this.f209362c;
            this.f209362c = DisposableHelper.DISPOSED;
            dVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f209362c.isDisposed();
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209360a.onComplete();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209360a.onError(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209362c, d10)) {
                this.f209362c = d10;
                this.f209360a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            try {
                R rApply = this.f209361b.apply(value);
                Objects.requireNonNull(rApply, "The mapper returned a null item");
                this.f209360a.onSuccess(rApply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f209360a.onError(th);
            }
        }
    }

    public F(zc.I<T> source, Bc.o<? super T, ? extends R> mapper) {
        super(source);
        this.f209359b = mapper;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super R> observer) {
        this.f209610a.b(new a(observer, this.f209359b));
    }
}
