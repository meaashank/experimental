package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeUnsubscribeOn<T> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.H f204967b;

    public static final class UnsubscribeOnMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hc.H f204969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f204970c;

        public UnsubscribeOnMaybeObserver(hc.t<? super T> tVar, hc.H h10) {
            this.f204968a = tVar;
            this.f204969b = h10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            io.reactivex.disposables.b andSet = getAndSet(disposableHelper);
            if (andSet != disposableHelper) {
                this.f204970c = andSet;
                this.f204969b.e(this);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // hc.t
        public void onComplete() {
            this.f204968a.onComplete();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f204968a.onError(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f204968a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f204968a.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f204970c.dispose();
        }
    }

    public MaybeUnsubscribeOn(hc.w<T> wVar, hc.H h10) {
        super(wVar);
        this.f204967b = h10;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204988a.b(new UnsubscribeOnMaybeObserver(tVar, this.f204967b));
    }
}
