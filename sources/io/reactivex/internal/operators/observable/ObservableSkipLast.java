package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSkipLast<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f205932b;

    public static final class SkipLastObserver<T> extends ArrayDeque<T> implements hc.G<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -3807491841935125653L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f205933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f205934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f205935c;

        public SkipLastObserver(hc.G<? super T> g10, int i10) {
            super(i10);
            this.f205933a = g10;
            this.f205934b = i10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f205935c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205935c.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            this.f205933a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f205933a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f205934b == size()) {
                this.f205933a.onNext(poll());
            }
            offer(t10);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205935c, bVar)) {
                this.f205935c = bVar;
                this.f205933a.onSubscribe(this);
            }
        }
    }

    public ObservableSkipLast(hc.E<T> e10, int i10) {
        super(e10);
        this.f205932b = i10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new SkipLastObserver(g10, this.f205932b));
    }
}
