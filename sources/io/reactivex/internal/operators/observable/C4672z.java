package io.reactivex.internal.operators.observable;

import nc.InterfaceC5271g;
import qc.AbstractC5501a;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4672z<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5271g<? super T> f206561b;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.z$a */
    public static final class a<T> extends AbstractC5501a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final InterfaceC5271g<? super T> f206562f;

        public a(hc.G<? super T> g10, InterfaceC5271g<? super T> interfaceC5271g) {
            super(g10);
            this.f206562f = interfaceC5271g;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // hc.G
        public void onNext(T t10) {
            this.f227044a.onNext((Object) t10);
            if (this.f227048e == 0) {
                try {
                    this.f206562f.accept(t10);
                } catch (Throwable th) {
                    c(th);
                }
            }
        }

        @Override // pc.o
        @lc.f
        public T poll() throws Exception {
            T tPoll = this.f227046c.poll();
            if (tPoll != null) {
                this.f206562f.accept(tPoll);
            }
            return tPoll;
        }

        @Override // pc.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public C4672z(hc.E<T> e10, InterfaceC5271g<? super T> interfaceC5271g) {
        super(e10);
        this.f206561b = interfaceC5271g;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10, this.f206561b));
    }
}
