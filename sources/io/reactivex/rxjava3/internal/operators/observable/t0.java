package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;

/* JADX INFO: loaded from: classes7.dex */
public final class t0<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.T<? extends T> f211191b;

    public static final class a<T> implements zc.V<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f211192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zc.T<? extends T> f211193b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f211195d = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SequentialDisposable f211194c = new SequentialDisposable();

        public a(zc.V<? super T> actual, zc.T<? extends T> other) {
            this.f211192a = actual;
            this.f211193b = other;
        }

        @Override // zc.V
        public void onComplete() {
            if (!this.f211195d) {
                this.f211192a.onComplete();
            } else {
                this.f211195d = false;
                this.f211193b.a(this);
            }
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f211192a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f211195d) {
                this.f211195d = false;
            }
            this.f211192a.onNext(t10);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            SequentialDisposable sequentialDisposable = this.f211194c;
            sequentialDisposable.getClass();
            DisposableHelper.set(sequentialDisposable, d10);
        }
    }

    public t0(zc.T<T> source, zc.T<? extends T> other) {
        super(source);
        this.f211191b = other;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        a aVar = new a(t10, this.f211191b);
        t10.onSubscribe(aVar.f211194c);
        this.f210954a.a(aVar);
    }
}
