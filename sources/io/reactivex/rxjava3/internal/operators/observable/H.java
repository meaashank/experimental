package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class H<T, R> extends AbstractC4740a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super T, ? extends Iterable<? extends R>> f209985b;

    public static final class a<T, R> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super R> f209986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super T, ? extends Iterable<? extends R>> f209987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209988c;

        public a(zc.V<? super R> actual, Bc.o<? super T, ? extends Iterable<? extends R>> mapper) {
            this.f209986a = actual;
            this.f209987b = mapper;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f209988c.dispose();
            this.f209988c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f209988c.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            io.reactivex.rxjava3.disposables.d dVar = this.f209988c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (dVar == disposableHelper) {
                return;
            }
            this.f209988c = disposableHelper;
            this.f209986a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable e10) {
            io.reactivex.rxjava3.disposables.d dVar = this.f209988c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (dVar == disposableHelper) {
                Ic.a.Y(e10);
            } else {
                this.f209988c = disposableHelper;
                this.f209986a.onError(e10);
            }
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f209988c == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                zc.V<? super R> v10 = this.f209986a;
                for (R r10 : this.f209987b.apply(t10)) {
                    try {
                        try {
                            Objects.requireNonNull(r10, "The iterator returned a null value");
                            v10.onNext(r10);
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.a.b(th);
                            this.f209988c.dispose();
                            onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.b(th2);
                        this.f209988c.dispose();
                        onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.b(th3);
                this.f209988c.dispose();
                onError(th3);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209988c, d10)) {
                this.f209988c = d10;
                this.f209986a.onSubscribe(this);
            }
        }
    }

    public H(zc.T<T> source, Bc.o<? super T, ? extends Iterable<? extends R>> mapper) {
        super(source);
        this.f209985b = mapper;
    }

    @Override // zc.N
    public void d6(zc.V<? super R> observer) {
        this.f210954a.a(new a(observer, this.f209985b));
    }
}
