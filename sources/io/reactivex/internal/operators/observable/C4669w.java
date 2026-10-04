package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4669w<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.w$a */
    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public hc.G<? super T> f206484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.disposables.b f206485b;

        public a(hc.G<? super T> g10) {
            this.f206484a = g10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            io.reactivex.disposables.b bVar = this.f206485b;
            this.f206485b = EmptyComponent.INSTANCE;
            this.f206484a = EmptyComponent.asObserver();
            bVar.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206485b.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            hc.G<? super T> g10 = this.f206484a;
            this.f206485b = EmptyComponent.INSTANCE;
            this.f206484a = EmptyComponent.asObserver();
            g10.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            hc.G<? super T> g10 = this.f206484a;
            this.f206485b = EmptyComponent.INSTANCE;
            this.f206484a = EmptyComponent.asObserver();
            g10.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            this.f206484a.onNext(t10);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206485b, bVar)) {
                this.f206485b = bVar;
                this.f206484a.onSubscribe(this);
            }
        }
    }

    public C4669w(hc.E<T> e10) {
        super(e10);
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10));
    }
}
