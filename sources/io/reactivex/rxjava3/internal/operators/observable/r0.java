package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class r0<T, U> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.T<U> f211153b;

    public final class a implements zc.V<U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayCompositeDisposable f211154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b<T> f211155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.observers.m<T> f211156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211157d;

        public a(ArrayCompositeDisposable frc, b<T> sus, io.reactivex.rxjava3.observers.m<T> serial) {
            this.f211154a = frc;
            this.f211155b = sus;
            this.f211156c = serial;
        }

        @Override // zc.V
        public void onComplete() {
            this.f211155b.f211162d = true;
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f211154a.dispose();
            this.f211156c.onError(t10);
        }

        @Override // zc.V
        public void onNext(U t10) {
            this.f211157d.dispose();
            this.f211155b.f211162d = true;
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211157d, d10)) {
                this.f211157d = d10;
                this.f211154a.b(1, d10);
            }
        }
    }

    public static final class b<T> implements zc.V<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f211159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayCompositeDisposable f211160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f211162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f211163e;

        public b(zc.V<? super T> actual, ArrayCompositeDisposable frc) {
            this.f211159a = actual;
            this.f211160b = frc;
        }

        @Override // zc.V
        public void onComplete() {
            this.f211160b.dispose();
            this.f211159a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f211160b.dispose();
            this.f211159a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f211163e) {
                this.f211159a.onNext(t10);
            } else if (this.f211162d) {
                this.f211163e = true;
                this.f211159a.onNext(t10);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211161c, d10)) {
                this.f211161c = d10;
                this.f211160b.b(0, d10);
            }
        }
    }

    public r0(zc.T<T> source, zc.T<U> other) {
        super(source);
        this.f211153b = other;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> child) {
        io.reactivex.rxjava3.observers.m mVar = new io.reactivex.rxjava3.observers.m(child, false);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        mVar.onSubscribe(arrayCompositeDisposable);
        b bVar = new b(mVar, arrayCompositeDisposable);
        this.f211153b.a(new a(arrayCompositeDisposable, bVar, mVar));
        this.f210954a.a(bVar);
    }
}
