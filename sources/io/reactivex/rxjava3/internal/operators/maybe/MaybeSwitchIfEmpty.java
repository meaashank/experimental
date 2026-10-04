package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeSwitchIfEmpty<T> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.I<? extends T> f209543b;

    public static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -2223459372976438024L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zc.I<? extends T> f209545b;

        public static final class a<T> implements zc.F<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final zc.F<? super T> f209546a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AtomicReference<io.reactivex.rxjava3.disposables.d> f209547b;

            public a(zc.F<? super T> actual, AtomicReference<io.reactivex.rxjava3.disposables.d> parent) {
                this.f209546a = actual;
                this.f209547b = parent;
            }

            @Override // zc.F, zc.InterfaceC5888e
            public void onComplete() {
                this.f209546a.onComplete();
            }

            @Override // zc.F, zc.a0, zc.InterfaceC5888e
            public void onError(Throwable e10) {
                this.f209546a.onError(e10);
            }

            @Override // zc.F, zc.a0, zc.InterfaceC5888e
            public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
                DisposableHelper.setOnce(this.f209547b, d10);
            }

            @Override // zc.F, zc.a0
            public void onSuccess(T value) {
                this.f209546a.onSuccess(value);
            }
        }

        public SwitchIfEmptyMaybeObserver(zc.F<? super T> actual, zc.I<? extends T> other) {
            this.f209544a = actual;
            this.f209545b = other;
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
            io.reactivex.rxjava3.disposables.d dVar = get();
            if (dVar == DisposableHelper.DISPOSED || !compareAndSet(dVar, null)) {
                return;
            }
            this.f209545b.b(new a(this.f209544a, this));
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209544a.onError(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.setOnce(this, d10)) {
                this.f209544a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209544a.onSuccess(value);
        }
    }

    public MaybeSwitchIfEmpty(zc.I<T> source, zc.I<? extends T> other) {
        super(source);
        this.f209543b = other;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209610a.b(new SwitchIfEmptyMaybeObserver(observer, this.f209543b));
    }
}
