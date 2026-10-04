package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeDoFinally<T> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.a f209461b;

    public static final class DoFinallyObserver<T> extends AtomicInteger implements zc.F<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.a f209463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209464c;

        public DoFinallyObserver(zc.F<? super T> actual, Bc.a onFinally) {
            this.f209462a = actual;
            this.f209463b = onFinally;
        }

        public void d() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f209463b.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    Ic.a.Y(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f209464c.dispose();
            d();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f209464c.isDisposed();
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209462a.onComplete();
            d();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable t10) {
            this.f209462a.onError(t10);
            d();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209464c, d10)) {
                this.f209464c = d10;
                this.f209462a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T t10) {
            this.f209462a.onSuccess(t10);
            d();
        }
    }

    public MaybeDoFinally(zc.I<T> source, Bc.a onFinally) {
        super(source);
        this.f209461b = onFinally;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209610a.b(new DoFinallyObserver(observer, this.f209461b));
    }
}
