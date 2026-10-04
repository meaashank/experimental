package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableTakeUntil<T, U> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.T<? extends U> f210695b;

    public static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements zc.V<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 1418547743690811973L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f210697b = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TakeUntilMainObserver<T, U>.OtherObserver f210698c = new OtherObserver();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicThrowable f210699d = new AtomicThrowable();

        public final class OtherObserver extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.V<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            public OtherObserver() {
            }

            @Override // zc.V
            public void onComplete() {
                TakeUntilMainObserver.this.d();
            }

            @Override // zc.V
            public void onError(Throwable e10) {
                TakeUntilMainObserver.this.e(e10);
            }

            @Override // zc.V
            public void onNext(U t10) {
                DisposableHelper.dispose(this);
                TakeUntilMainObserver.this.d();
            }

            @Override // zc.V
            public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
                DisposableHelper.setOnce(this, d10);
            }
        }

        public TakeUntilMainObserver(zc.V<? super T> downstream) {
            this.f210696a = downstream;
        }

        public void d() {
            DisposableHelper.dispose(this.f210697b);
            io.reactivex.rxjava3.internal.util.g.b(this.f210696a, this, this.f210699d);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this.f210697b);
            DisposableHelper.dispose(this.f210698c);
        }

        public void e(Throwable e10) {
            DisposableHelper.dispose(this.f210697b);
            io.reactivex.rxjava3.internal.util.g.d(this.f210696a, e10, this, this.f210699d);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f210697b.get());
        }

        @Override // zc.V
        public void onComplete() {
            DisposableHelper.dispose(this.f210698c);
            io.reactivex.rxjava3.internal.util.g.b(this.f210696a, this, this.f210699d);
        }

        @Override // zc.V
        public void onError(Throwable e10) {
            DisposableHelper.dispose(this.f210698c);
            io.reactivex.rxjava3.internal.util.g.d(this.f210696a, e10, this, this.f210699d);
        }

        @Override // zc.V
        public void onNext(T t10) {
            io.reactivex.rxjava3.internal.util.g.e(this.f210696a, t10, this, this.f210699d);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            DisposableHelper.setOnce(this.f210697b, d10);
        }
    }

    public ObservableTakeUntil(zc.T<T> source, zc.T<? extends U> other) {
        super(source);
        this.f210695b = other;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> child) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(child);
        child.onSubscribe(takeUntilMainObserver);
        this.f210695b.a(takeUntilMainObserver.f210698c);
        this.f210954a.a(takeUntilMainObserver);
    }
}
