package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import uc.C5666a;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4654g<T> extends AbstractC4648a<T, Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.r<? super T> f206274b;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.g$a */
    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super Boolean> f206275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.r<? super T> f206276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f206277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f206278d;

        public a(hc.G<? super Boolean> g10, nc.r<? super T> rVar) {
            this.f206275a = g10;
            this.f206276b = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206277c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206277c.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f206278d) {
                return;
            }
            this.f206278d = true;
            this.f206275a.onNext(Boolean.FALSE);
            this.f206275a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (this.f206278d) {
                C5666a.Y(th);
            } else {
                this.f206278d = true;
                this.f206275a.onError(th);
            }
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f206278d) {
                return;
            }
            try {
                if (this.f206276b.test(t10)) {
                    this.f206278d = true;
                    this.f206277c.dispose();
                    this.f206275a.onNext(Boolean.TRUE);
                    this.f206275a.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f206277c.dispose();
                onError(th);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206277c, bVar)) {
                this.f206277c = bVar;
                this.f206275a.onSubscribe(this);
            }
        }
    }

    public C4654g(hc.E<T> e10, nc.r<? super T> rVar) {
        super(e10);
        this.f206274b = rVar;
    }

    @Override // hc.z
    public void C5(hc.G<? super Boolean> g10) {
        this.f206214a.a(new a(g10, this.f206274b));
    }
}
