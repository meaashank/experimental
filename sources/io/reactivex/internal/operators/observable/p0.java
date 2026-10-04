package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: loaded from: classes7.dex */
public final class p0<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.E<? extends T> f206408b;

    public static final class a<T> implements hc.G<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hc.E<? extends T> f206410b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f206412d = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SequentialDisposable f206411c = new SequentialDisposable();

        public a(hc.G<? super T> g10, hc.E<? extends T> e10) {
            this.f206409a = g10;
            this.f206410b = e10;
        }

        @Override // hc.G
        public void onComplete() {
            if (!this.f206412d) {
                this.f206409a.onComplete();
            } else {
                this.f206412d = false;
                this.f206410b.a(this);
            }
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206409a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f206412d) {
                this.f206412d = false;
            }
            this.f206409a.onNext(t10);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            SequentialDisposable sequentialDisposable = this.f206411c;
            sequentialDisposable.getClass();
            DisposableHelper.set(sequentialDisposable, bVar);
        }
    }

    public p0(hc.E<T> e10, hc.E<? extends T> e11) {
        super(e10);
        this.f206408b = e11;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        a aVar = new a(g10, this.f206408b);
        g10.onSubscribe(aVar.f206411c);
        this.f206214a.a(aVar);
    }
}
