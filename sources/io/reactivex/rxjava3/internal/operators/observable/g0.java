package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;

/* JADX INFO: loaded from: classes7.dex */
public final class g0<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super Throwable, ? extends zc.T<? extends T>> f211008b;

    public static final class a<T> implements zc.V<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f211009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super Throwable, ? extends zc.T<? extends T>> f211010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SequentialDisposable f211011c = new SequentialDisposable();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f211012d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f211013e;

        public a(zc.V<? super T> actual, Bc.o<? super Throwable, ? extends zc.T<? extends T>> nextSupplier) {
            this.f211009a = actual;
            this.f211010b = nextSupplier;
        }

        @Override // zc.V
        public void onComplete() {
            if (this.f211013e) {
                return;
            }
            this.f211013e = true;
            this.f211012d = true;
            this.f211009a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            if (this.f211012d) {
                if (this.f211013e) {
                    Ic.a.Y(t10);
                    return;
                } else {
                    this.f211009a.onError(t10);
                    return;
                }
            }
            this.f211012d = true;
            try {
                zc.T<? extends T> tApply = this.f211010b.apply(t10);
                if (tApply != null) {
                    tApply.a(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(t10);
                this.f211009a.onError(nullPointerException);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f211009a.onError(new CompositeException(t10, th));
            }
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f211013e) {
                return;
            }
            this.f211009a.onNext(t10);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            SequentialDisposable sequentialDisposable = this.f211011c;
            sequentialDisposable.getClass();
            DisposableHelper.replace(sequentialDisposable, d10);
        }
    }

    public g0(zc.T<T> source, Bc.o<? super Throwable, ? extends zc.T<? extends T>> nextSupplier) {
        super(source);
        this.f211008b = nextSupplier;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        a aVar = new a(t10, this.f211008b);
        t10.onSubscribe(aVar.f211011c);
        this.f210954a.a(aVar);
    }
}
