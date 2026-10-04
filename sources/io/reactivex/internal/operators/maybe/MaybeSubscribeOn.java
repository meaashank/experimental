package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeSubscribeOn<T> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.H f204919b;

    public static final class SubscribeOnMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 8571289934935992137L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SequentialDisposable f204920a = new SequentialDisposable();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hc.t<? super T> f204921b;

        public SubscribeOnMaybeObserver(hc.t<? super T> tVar) {
            this.f204921b = tVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            SequentialDisposable sequentialDisposable = this.f204920a;
            sequentialDisposable.getClass();
            DisposableHelper.dispose(sequentialDisposable);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // hc.t
        public void onComplete() {
            this.f204921b.onComplete();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f204921b.onError(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f204921b.onSuccess(t10);
        }
    }

    public static final class a<T> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hc.w<T> f204923b;

        public a(hc.t<? super T> tVar, hc.w<T> wVar) {
            this.f204922a = tVar;
            this.f204923b = wVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f204923b.b(this.f204922a);
        }
    }

    public MaybeSubscribeOn(hc.w<T> wVar, hc.H h10) {
        super(wVar);
        this.f204919b = h10;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        SubscribeOnMaybeObserver subscribeOnMaybeObserver = new SubscribeOnMaybeObserver(tVar);
        tVar.onSubscribe(subscribeOnMaybeObserver);
        SequentialDisposable sequentialDisposable = subscribeOnMaybeObserver.f204920a;
        io.reactivex.disposables.b bVarE = this.f204919b.e(new a(subscribeOnMaybeObserver, this.f204988a));
        sequentialDisposable.getClass();
        DisposableHelper.replace(sequentialDisposable, bVarE);
    }
}
