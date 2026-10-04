package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableWithLatestFrom<T, U, R> extends AbstractC4740a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.c<? super T, ? super U, ? extends R> f210883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zc.T<? extends U> f210884c;

    public static final class WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -312246233408980075L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super R> f210885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.c<? super T, ? super U, ? extends R> f210886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f210887c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f210888d = new AtomicReference<>();

        public WithLatestFromObserver(zc.V<? super R> actual, Bc.c<? super T, ? super U, ? extends R> combiner) {
            this.f210885a = actual;
            this.f210886b = combiner;
        }

        public void a(Throwable e10) {
            DisposableHelper.dispose(this.f210887c);
            this.f210885a.onError(e10);
        }

        public boolean b(io.reactivex.rxjava3.disposables.d o10) {
            return DisposableHelper.setOnce(this.f210888d, o10);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this.f210887c);
            DisposableHelper.dispose(this.f210888d);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f210887c.get());
        }

        @Override // zc.V
        public void onComplete() {
            DisposableHelper.dispose(this.f210888d);
            this.f210885a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            DisposableHelper.dispose(this.f210888d);
            this.f210885a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            U u10 = get();
            if (u10 != null) {
                try {
                    R rApply = this.f210886b.apply(t10, u10);
                    Objects.requireNonNull(rApply, "The combiner returned a null value");
                    this.f210885a.onNext(rApply);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    dispose();
                    this.f210885a.onError(th);
                }
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            DisposableHelper.setOnce(this.f210887c, d10);
        }
    }

    public final class a implements zc.V<U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WithLatestFromObserver<T, U, R> f210889a;

        public a(WithLatestFromObserver<T, U, R> parent) {
            this.f210889a = parent;
        }

        @Override // zc.V
        public void onComplete() {
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f210889a.a(t10);
        }

        @Override // zc.V
        public void onNext(U t10) {
            this.f210889a.lazySet(t10);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            this.f210889a.b(d10);
        }
    }

    public ObservableWithLatestFrom(zc.T<T> source, Bc.c<? super T, ? super U, ? extends R> combiner, zc.T<? extends U> other) {
        super(source);
        this.f210883b = combiner;
        this.f210884c = other;
    }

    @Override // zc.N
    public void d6(zc.V<? super R> t10) {
        io.reactivex.rxjava3.observers.m mVar = new io.reactivex.rxjava3.observers.m(t10, false);
        WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver(mVar, this.f210883b);
        mVar.onSubscribe(withLatestFromObserver);
        this.f210884c.a(new a(withLatestFromObserver));
        this.f210954a.a(withLatestFromObserver);
    }
}
