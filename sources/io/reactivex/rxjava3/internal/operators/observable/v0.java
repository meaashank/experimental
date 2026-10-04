package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class v0<T> extends AbstractC4740a<T, T> {

    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f211208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f211210c;

        public a(zc.V<? super T> downstream) {
            this.f211208a = downstream;
        }

        public void a() {
            T t10 = this.f211210c;
            if (t10 != null) {
                this.f211210c = null;
                this.f211208a.onNext(t10);
            }
            this.f211208a.onComplete();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211210c = null;
            this.f211209b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211209b.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            a();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f211210c = null;
            this.f211208a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            this.f211210c = t10;
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211209b, d10)) {
                this.f211209b = d10;
                this.f211208a.onSubscribe(this);
            }
        }
    }

    public v0(zc.T<T> source) {
        super(source);
    }

    @Override // zc.N
    public void d6(zc.V<? super T> observer) {
        this.f210954a.a(new a(observer));
    }
}
