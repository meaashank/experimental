package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class J<T> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super Throwable, ? extends T> f209369b;

    public static final class a<T> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super Throwable, ? extends T> f209371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209372c;

        public a(zc.F<? super T> actual, Bc.o<? super Throwable, ? extends T> valueSupplier) {
            this.f209370a = actual;
            this.f209371b = valueSupplier;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f209372c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f209372c.isDisposed();
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209370a.onComplete();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            try {
                T tApply = this.f209371b.apply(e10);
                Objects.requireNonNull(tApply, "The itemSupplier returned a null value");
                this.f209370a.onSuccess(tApply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f209370a.onError(new CompositeException(e10, th));
            }
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209372c, d10)) {
                this.f209372c = d10;
                this.f209370a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209370a.onSuccess(value);
        }
    }

    public J(zc.I<T> source, Bc.o<? super Throwable, ? extends T> itemSupplier) {
        super(source);
        this.f209369b = itemSupplier;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209610a.b(new a(observer, this.f209369b));
    }
}
