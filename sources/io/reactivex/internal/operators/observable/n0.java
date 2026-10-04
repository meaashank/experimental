package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class n0<T, U> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.E<U> f206381b;

    public final class a implements hc.G<U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayCompositeDisposable f206382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b<T> f206383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io.reactivex.observers.l<T> f206384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public io.reactivex.disposables.b f206385d;

        public a(ArrayCompositeDisposable arrayCompositeDisposable, b<T> bVar, io.reactivex.observers.l<T> lVar) {
            this.f206382a = arrayCompositeDisposable;
            this.f206383b = bVar;
            this.f206384c = lVar;
        }

        @Override // hc.G
        public void onComplete() {
            this.f206383b.f206390d = true;
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206382a.dispose();
            this.f206384c.onError(th);
        }

        @Override // hc.G
        public void onNext(U u10) {
            this.f206385d.dispose();
            this.f206383b.f206390d = true;
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206385d, bVar)) {
                this.f206385d = bVar;
                this.f206382a.b(1, bVar);
            }
        }
    }

    public static final class b<T> implements hc.G<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayCompositeDisposable f206388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f206389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f206390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f206391e;

        public b(hc.G<? super T> g10, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.f206387a = g10;
            this.f206388b = arrayCompositeDisposable;
        }

        @Override // hc.G
        public void onComplete() {
            this.f206388b.dispose();
            this.f206387a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206388b.dispose();
            this.f206387a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f206391e) {
                this.f206387a.onNext(t10);
            } else if (this.f206390d) {
                this.f206391e = true;
                this.f206387a.onNext(t10);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206389c, bVar)) {
                this.f206389c = bVar;
                this.f206388b.b(0, bVar);
            }
        }
    }

    public n0(hc.E<T> e10, hc.E<U> e11) {
        super(e10);
        this.f206381b = e11;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        io.reactivex.observers.l lVar = new io.reactivex.observers.l(g10, false);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        lVar.onSubscribe(arrayCompositeDisposable);
        b bVar = new b(lVar, arrayCompositeDisposable);
        this.f206381b.a(new a(arrayCompositeDisposable, bVar, lVar));
        this.f206214a.a(bVar);
    }
}
