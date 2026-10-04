package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeObserveOn<T> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.H f204907b;

    public static final class ObserveOnMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hc.H f204909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f204910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Throwable f204911d;

        public ObserveOnMaybeObserver(hc.t<? super T> tVar, hc.H h10) {
            this.f204908a = tVar;
            this.f204909b = h10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // hc.t
        public void onComplete() {
            DisposableHelper.replace(this, this.f204909b.e(this));
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f204911d = th;
            DisposableHelper.replace(this, this.f204909b.e(this));
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f204908a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f204910c = t10;
            DisposableHelper.replace(this, this.f204909b.e(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f204911d;
            if (th != null) {
                this.f204911d = null;
                this.f204908a.onError(th);
                return;
            }
            T t10 = this.f204910c;
            if (t10 == null) {
                this.f204908a.onComplete();
            } else {
                this.f204910c = null;
                this.f204908a.onSuccess(t10);
            }
        }
    }

    public MaybeObserveOn(hc.w<T> wVar, hc.H h10) {
        super(wVar);
        this.f204907b = h10;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204988a.b(new ObserveOnMaybeObserver(tVar, this.f204907b));
    }
}
