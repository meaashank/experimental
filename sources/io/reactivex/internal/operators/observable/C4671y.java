package io.reactivex.internal.operators.observable;

import nc.InterfaceC5268d;
import qc.AbstractC5501a;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4671y<T, K> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super T, K> f206512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5268d<? super K, ? super K> f206513c;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.y$a */
    public static final class a<T, K> extends AbstractC5501a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final nc.o<? super T, K> f206514f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final InterfaceC5268d<? super K, ? super K> f206515g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public K f206516h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f206517i;

        public a(hc.G<? super T> g10, nc.o<? super T, K> oVar, InterfaceC5268d<? super K, ? super K> interfaceC5268d) {
            super(g10);
            this.f206514f = oVar;
            this.f206515g = interfaceC5268d;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // hc.G
        public void onNext(T t10) {
            if (this.f227047d) {
                return;
            }
            if (this.f227048e != 0) {
                this.f227044a.onNext((Object) t10);
                return;
            }
            try {
                K kApply = this.f206514f.apply(t10);
                if (this.f206517i) {
                    boolean zTest = this.f206515g.test(this.f206516h, kApply);
                    this.f206516h = kApply;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.f206517i = true;
                    this.f206516h = kApply;
                }
                this.f227044a.onNext((Object) t10);
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // pc.o
        @lc.f
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.f227046c.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f206514f.apply(tPoll);
                if (!this.f206517i) {
                    this.f206517i = true;
                    this.f206516h = kApply;
                    return tPoll;
                }
                if (!this.f206515g.test(this.f206516h, kApply)) {
                    this.f206516h = kApply;
                    return tPoll;
                }
                this.f206516h = kApply;
            }
        }

        @Override // pc.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public C4671y(hc.E<T> e10, nc.o<? super T, K> oVar, InterfaceC5268d<? super K, ? super K> interfaceC5268d) {
        super(e10);
        this.f206512b = oVar;
        this.f206513c = interfaceC5268d;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10, this.f206512b, this.f206513c));
    }
}
