package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSkipLast<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f210631b;

    public static final class SkipLastObserver<T> extends ArrayDeque<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -3807491841935125653L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f210633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210634c;

        public SkipLastObserver(zc.V<? super T> actual, int skip) {
            super(skip);
            this.f210632a = actual;
            this.f210633b = skip;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f210634c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210634c.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            this.f210632a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f210632a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f210633b == size()) {
                this.f210632a.onNext(poll());
            }
            offer(t10);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210634c, d10)) {
                this.f210634c = d10;
                this.f210632a.onSubscribe(this);
            }
        }
    }

    public ObservableSkipLast(zc.T<T> source, int skip) {
        super(source);
        this.f210631b = skip;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> observer) {
        this.f210954a.a(new SkipLastObserver(observer, this.f210631b));
    }
}
