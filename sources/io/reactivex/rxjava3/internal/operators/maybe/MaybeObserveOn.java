package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeObserveOn<T> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f209528b;

    public static final class ObserveOnMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final W f209530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f209531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Throwable f209532d;

        public ObserveOnMaybeObserver(zc.F<? super T> actual, W scheduler) {
            this.f209529a = actual;
            this.f209530b = scheduler;
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
            DisposableHelper.replace(this, this.f209530b.e(this));
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209532d = e10;
            DisposableHelper.replace(this, this.f209530b.e(this));
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.setOnce(this, d10)) {
                this.f209529a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209531c = value;
            DisposableHelper.replace(this, this.f209530b.e(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f209532d;
            if (th != null) {
                this.f209532d = null;
                this.f209529a.onError(th);
                return;
            }
            T t10 = this.f209531c;
            if (t10 == null) {
                this.f209529a.onComplete();
            } else {
                this.f209531c = null;
                this.f209529a.onSuccess(t10);
            }
        }
    }

    public MaybeObserveOn(zc.I<T> source, W scheduler) {
        super(source);
        this.f209528b = scheduler;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209610a.b(new ObserveOnMaybeObserver(observer, this.f209528b));
    }
}
