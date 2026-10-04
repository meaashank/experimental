package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import nc.InterfaceC5267c;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class h0<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5267c<T, T, T> f206288b;

    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC5267c<T, T, T> f206290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f206291c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f206292d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f206293e;

        public a(hc.G<? super T> g10, InterfaceC5267c<T, T, T> interfaceC5267c) {
            this.f206289a = g10;
            this.f206290b = interfaceC5267c;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206291c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206291c.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f206293e) {
                return;
            }
            this.f206293e = true;
            this.f206289a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (this.f206293e) {
                C5666a.Y(th);
            } else {
                this.f206293e = true;
                this.f206289a.onError(th);
            }
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        @Override // hc.G
        public void onNext(T t10) {
            if (this.f206293e) {
                return;
            }
            hc.G<? super T> g10 = this.f206289a;
            T t11 = this.f206292d;
            if (t11 == null) {
                this.f206292d = t10;
                g10.onNext(t10);
                return;
            }
            try {
                T tApply = this.f206290b.apply(t11, t10);
                io.reactivex.internal.functions.a.g(tApply, "The value returned by the accumulator is null");
                this.f206292d = tApply;
                g10.onNext(tApply);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f206291c.dispose();
                onError(th);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206291c, bVar)) {
                this.f206291c = bVar;
                this.f206289a.onSubscribe(this);
            }
        }
    }

    public h0(hc.E<T> e10, InterfaceC5267c<T, T, T> interfaceC5267c) {
        super(e10);
        this.f206288b = interfaceC5267c;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10, this.f206288b));
    }
}
