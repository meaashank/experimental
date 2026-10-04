package io.reactivex.internal.operators.observable;

import qc.AbstractC5501a;

/* JADX INFO: loaded from: classes7.dex */
public final class H<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.r<? super T> f205327b;

    public static final class a<T> extends AbstractC5501a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final nc.r<? super T> f205328f;

        public a(hc.G<? super T> g10, nc.r<? super T> rVar) {
            super(g10);
            this.f205328f = rVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // hc.G
        public void onNext(T t10) {
            if (this.f227048e != 0) {
                this.f227044a.onNext(null);
                return;
            }
            try {
                if (this.f205328f.test(t10)) {
                    this.f227044a.onNext((Object) t10);
                }
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // pc.o
        @lc.f
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f227046c.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f205328f.test(tPoll));
            return tPoll;
        }

        @Override // pc.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public H(hc.E<T> e10, nc.r<? super T> rVar) {
        super(e10);
        this.f205327b = rVar;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10, this.f205327b));
    }
}
