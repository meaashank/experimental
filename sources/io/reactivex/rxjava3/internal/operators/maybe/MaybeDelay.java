package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeDelay<T> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f209432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f209433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W f209434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f209435e;

    public static final class DelayMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 5566860102500855068L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f209437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f209438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final W f209439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f209440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public T f209441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Throwable f209442g;

        public DelayMaybeObserver(zc.F<? super T> actual, long delay, TimeUnit unit, W scheduler, boolean delayError) {
            this.f209436a = actual;
            this.f209437b = delay;
            this.f209438c = unit;
            this.f209439d = scheduler;
            this.f209440e = delayError;
        }

        public void a(long delay) {
            DisposableHelper.replace(this, this.f209439d.f(this, delay, this.f209438c));
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            a(this.f209437b);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209442g = e10;
            a(this.f209440e ? this.f209437b : 0L);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.setOnce(this, d10)) {
                this.f209436a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209441f = value;
            a(this.f209437b);
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f209442g;
            if (th != null) {
                this.f209436a.onError(th);
                return;
            }
            T t10 = this.f209441f;
            if (t10 != null) {
                this.f209436a.onSuccess(t10);
            } else {
                this.f209436a.onComplete();
            }
        }
    }

    public MaybeDelay(zc.I<T> source, long delay, TimeUnit unit, W scheduler, boolean delayError) {
        super(source);
        this.f209432b = delay;
        this.f209433c = unit;
        this.f209434d = scheduler;
        this.f209435e = delayError;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209610a.b(new DelayMaybeObserver(observer, this.f209432b, this.f209433c, this.f209434d, this.f209435e));
    }
}
