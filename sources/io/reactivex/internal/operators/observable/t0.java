package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class t0<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.r<? super T> f206458b;

    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.r<? super T> f206460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f206461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f206462d;

        public a(hc.G<? super T> g10, nc.r<? super T> rVar) {
            this.f206459a = g10;
            this.f206460b = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206461c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206461c.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f206462d) {
                return;
            }
            this.f206462d = true;
            this.f206459a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (this.f206462d) {
                C5666a.Y(th);
            } else {
                this.f206462d = true;
                this.f206459a.onError(th);
            }
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f206462d) {
                return;
            }
            try {
                if (this.f206460b.test(t10)) {
                    this.f206459a.onNext(t10);
                    return;
                }
                this.f206462d = true;
                this.f206461c.dispose();
                this.f206459a.onComplete();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f206461c.dispose();
                onError(th);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206461c, bVar)) {
                this.f206461c = bVar;
                this.f206459a.onSubscribe(this);
            }
        }
    }

    public t0(hc.E<T> e10, nc.r<? super T> rVar) {
        super(e10);
        this.f206458b = rVar;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10, this.f206458b));
    }
}
