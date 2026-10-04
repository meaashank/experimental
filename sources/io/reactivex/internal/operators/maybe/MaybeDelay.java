package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeDelay<T> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f204807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f204808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hc.H f204809d;

    public static final class DelayMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 5566860102500855068L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f204811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f204812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final hc.H f204813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public T f204814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Throwable f204815f;

        public DelayMaybeObserver(hc.t<? super T> tVar, long j10, TimeUnit timeUnit, hc.H h10) {
            this.f204810a = tVar;
            this.f204811b = j10;
            this.f204812c = timeUnit;
            this.f204813d = h10;
        }

        public void d() {
            DisposableHelper.replace(this, this.f204813d.f(this, this.f204811b, this.f204812c));
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
            d();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f204815f = th;
            d();
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f204810a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f204814e = t10;
            d();
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f204815f;
            if (th != null) {
                this.f204810a.onError(th);
                return;
            }
            T t10 = this.f204814e;
            if (t10 != null) {
                this.f204810a.onSuccess(t10);
            } else {
                this.f204810a.onComplete();
            }
        }
    }

    public MaybeDelay(hc.w<T> wVar, long j10, TimeUnit timeUnit, hc.H h10) {
        super(wVar);
        this.f204807b = j10;
        this.f204808c = timeUnit;
        this.f204809d = h10;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204988a.b(new DelayMaybeObserver(tVar, this.f204807b, this.f204808c, this.f204809d));
    }
}
