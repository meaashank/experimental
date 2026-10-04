package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class l0<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.c<T, T, T> f211089b;

    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f211090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.c<T, T, T> f211091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f211093d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f211094e;

        public a(zc.V<? super T> actual, Bc.c<T, T, T> accumulator) {
            this.f211090a = actual;
            this.f211091b = accumulator;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211092c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211092c.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            if (this.f211094e) {
                return;
            }
            this.f211094e = true;
            this.f211090a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            if (this.f211094e) {
                Ic.a.Y(t10);
            } else {
                this.f211094e = true;
                this.f211090a.onError(t10);
            }
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        @Override // zc.V
        public void onNext(T t10) {
            if (this.f211094e) {
                return;
            }
            zc.V<? super T> v10 = this.f211090a;
            T t11 = this.f211093d;
            if (t11 == null) {
                this.f211093d = t10;
                v10.onNext(t10);
                return;
            }
            try {
                T tApply = this.f211091b.apply(t11, t10);
                Objects.requireNonNull(tApply, "The value returned by the accumulator is null");
                this.f211093d = tApply;
                v10.onNext(tApply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f211092c.dispose();
                onError(th);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211092c, d10)) {
                this.f211092c = d10;
                this.f211090a.onSubscribe(this);
            }
        }
    }

    public l0(zc.T<T> source, Bc.c<T, T, T> accumulator) {
        super(source);
        this.f211089b = accumulator;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        this.f210954a.a(new a(t10, this.f211089b));
    }
}
