package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class m0<T, R> extends AbstractC4740a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.c<R, ? super T, R> f211102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.s<R> f211103c;

    public static final class a<T, R> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super R> f211104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.c<R, ? super T, R> f211105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public R f211106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f211108e;

        public a(zc.V<? super R> actual, Bc.c<R, ? super T, R> accumulator, R value) {
            this.f211104a = actual;
            this.f211105b = accumulator;
            this.f211106c = value;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211107d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211107d.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            if (this.f211108e) {
                return;
            }
            this.f211108e = true;
            this.f211104a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            if (this.f211108e) {
                Ic.a.Y(t10);
            } else {
                this.f211108e = true;
                this.f211104a.onError(t10);
            }
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f211108e) {
                return;
            }
            try {
                R rApply = this.f211105b.apply(this.f211106c, t10);
                Objects.requireNonNull(rApply, "The accumulator returned a null value");
                this.f211106c = rApply;
                this.f211104a.onNext(rApply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f211107d.dispose();
                onError(th);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.validate(this.f211107d, dVar)) {
                this.f211107d = dVar;
                this.f211104a.onSubscribe(this);
                this.f211104a.onNext(this.f211106c);
            }
        }
    }

    public m0(zc.T<T> source, Bc.s<R> seedSupplier, Bc.c<R, ? super T, R> accumulator) {
        super(source);
        this.f211102b = accumulator;
        this.f211103c = seedSupplier;
    }

    @Override // zc.N
    public void d6(zc.V<? super R> t10) {
        try {
            R r10 = this.f211103c.get();
            Objects.requireNonNull(r10, "The seed supplied is null");
            this.f210954a.a(new a(t10, this.f211102b, r10));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            EmptyDisposable.error(th, t10);
        }
    }
}
