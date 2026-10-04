package io.reactivex.internal.operators.observable;

import qc.AbstractC5501a;

/* JADX INFO: loaded from: classes7.dex */
public final class Y<T, U> extends AbstractC4648a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super T, ? extends U> f206204b;

    public static final class a<T, U> extends AbstractC5501a<T, U> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final nc.o<? super T, ? extends U> f206205f;

        public a(hc.G<? super U> g10, nc.o<? super T, ? extends U> oVar) {
            super(g10);
            this.f206205f = oVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // hc.G
        public void onNext(T t10) {
            if (this.f227047d) {
                return;
            }
            if (this.f227048e != 0) {
                this.f227044a.onNext(null);
                return;
            }
            try {
                U uApply = this.f206205f.apply(t10);
                io.reactivex.internal.functions.a.g(uApply, "The mapper function returned a null value.");
                this.f227044a.onNext((Object) uApply);
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // pc.o
        @lc.f
        public U poll() throws Exception {
            T tPoll = this.f227046c.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f206205f.apply(tPoll);
            io.reactivex.internal.functions.a.g(uApply, "The mapper function returned a null value.");
            return uApply;
        }

        @Override // pc.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public Y(hc.E<T> e10, nc.o<? super T, ? extends U> oVar) {
        super(e10);
        this.f206204b = oVar;
    }

    @Override // hc.z
    public void C5(hc.G<? super U> g10) {
        this.f206214a.a(new a(g10, this.f206204b));
    }
}
