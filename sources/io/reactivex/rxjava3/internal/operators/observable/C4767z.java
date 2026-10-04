package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4767z<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.g<? super T> f211240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.g<? super Throwable> f211241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bc.a f211242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bc.a f211243e;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.z$a */
    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f211244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.g<? super T> f211245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bc.g<? super Throwable> f211246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bc.a f211247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bc.a f211248e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211249f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f211250g;

        public a(zc.V<? super T> actual, Bc.g<? super T> onNext, Bc.g<? super Throwable> onError, Bc.a onComplete, Bc.a onAfterTerminate) {
            this.f211244a = actual;
            this.f211245b = onNext;
            this.f211246c = onError;
            this.f211247d = onComplete;
            this.f211248e = onAfterTerminate;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211249f.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211249f.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            if (this.f211250g) {
                return;
            }
            try {
                this.f211247d.run();
                this.f211250g = true;
                this.f211244a.onComplete();
                try {
                    this.f211248e.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    Ic.a.Y(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                onError(th2);
            }
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            if (this.f211250g) {
                Ic.a.Y(t10);
                return;
            }
            this.f211250g = true;
            try {
                this.f211246c.accept(t10);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                t10 = new CompositeException(t10, th);
            }
            this.f211244a.onError(t10);
            try {
                this.f211248e.run();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                Ic.a.Y(th2);
            }
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f211250g) {
                return;
            }
            try {
                this.f211245b.accept(t10);
                this.f211244a.onNext(t10);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f211249f.dispose();
                onError(th);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211249f, d10)) {
                this.f211249f = d10;
                this.f211244a.onSubscribe(this);
            }
        }
    }

    public C4767z(zc.T<T> source, Bc.g<? super T> onNext, Bc.g<? super Throwable> onError, Bc.a onComplete, Bc.a onAfterTerminate) {
        super(source);
        this.f211240b = onNext;
        this.f211241c = onError;
        this.f211242d = onComplete;
        this.f211243e = onAfterTerminate;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        this.f210954a.a(new a(t10, this.f211240b, this.f211241c, this.f211242d, this.f211243e));
    }
}
