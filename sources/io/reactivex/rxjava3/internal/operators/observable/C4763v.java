package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.EmptyComponent;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4763v<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.v$a */
    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zc.V<? super T> f211206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211207b;

        public a(zc.V<? super T> downstream) {
            this.f211206a = downstream;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            io.reactivex.rxjava3.disposables.d dVar = this.f211207b;
            this.f211207b = EmptyComponent.INSTANCE;
            this.f211206a = EmptyComponent.asObserver();
            dVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211207b.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            zc.V<? super T> v10 = this.f211206a;
            this.f211207b = EmptyComponent.INSTANCE;
            this.f211206a = EmptyComponent.asObserver();
            v10.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            zc.V<? super T> v10 = this.f211206a;
            this.f211207b = EmptyComponent.INSTANCE;
            this.f211206a = EmptyComponent.asObserver();
            v10.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            this.f211206a.onNext(t10);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211207b, d10)) {
                this.f211207b = d10;
                this.f211206a.onSubscribe(this);
            }
        }
    }

    public C4763v(zc.T<T> source) {
        super(source);
    }

    @Override // zc.N
    public void d6(zc.V<? super T> observer) {
        this.f210954a.a(new a(observer));
    }
}
