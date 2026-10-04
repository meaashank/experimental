package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class s0<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.r<? super T> f206438b;

    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.r<? super T> f206440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f206441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f206442d;

        public a(hc.G<? super T> g10, nc.r<? super T> rVar) {
            this.f206439a = g10;
            this.f206440b = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206441c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206441c.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f206442d) {
                return;
            }
            this.f206442d = true;
            this.f206439a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (this.f206442d) {
                C5666a.Y(th);
            } else {
                this.f206442d = true;
                this.f206439a.onError(th);
            }
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f206442d) {
                return;
            }
            this.f206439a.onNext(t10);
            try {
                if (this.f206440b.test(t10)) {
                    this.f206442d = true;
                    this.f206441c.dispose();
                    this.f206439a.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f206441c.dispose();
                onError(th);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206441c, bVar)) {
                this.f206441c = bVar;
                this.f206439a.onSubscribe(this);
            }
        }
    }

    public s0(hc.E<T> e10, nc.r<? super T> rVar) {
        super(e10);
        this.f206438b = rVar;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10, this.f206438b));
    }
}
