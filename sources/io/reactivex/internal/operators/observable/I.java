package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class I<T, R> extends AbstractC4648a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super T, ? extends Iterable<? extends R>> f205329b;

    public static final class a<T, R> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super R> f205330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super T, ? extends Iterable<? extends R>> f205331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f205332c;

        public a(hc.G<? super R> g10, nc.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f205330a = g10;
            this.f205331b = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f205332c.dispose();
            this.f205332c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205332c.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            io.reactivex.disposables.b bVar = this.f205332c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                return;
            }
            this.f205332c = disposableHelper;
            this.f205330a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            io.reactivex.disposables.b bVar = this.f205332c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                C5666a.Y(th);
            } else {
                this.f205332c = disposableHelper;
                this.f205330a.onError(th);
            }
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f205332c == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                hc.G<? super R> g10 = this.f205330a;
                for (R r10 : this.f205331b.apply(t10)) {
                    try {
                        try {
                            io.reactivex.internal.functions.a.g(r10, "The iterator returned a null value");
                            g10.onNext(r10);
                        } catch (Throwable th) {
                            io.reactivex.exceptions.a.b(th);
                            this.f205332c.dispose();
                            onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f205332c.dispose();
                        onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f205332c.dispose();
                onError(th3);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205332c, bVar)) {
                this.f205332c = bVar;
                this.f205330a.onSubscribe(this);
            }
        }
    }

    public I(hc.E<T> e10, nc.o<? super T, ? extends Iterable<? extends R>> oVar) {
        super(e10);
        this.f205329b = oVar;
    }

    @Override // hc.z
    public void C5(hc.G<? super R> g10) {
        this.f206214a.a(new a(g10, this.f205329b));
    }
}
