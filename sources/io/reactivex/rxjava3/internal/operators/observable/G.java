package io.reactivex.rxjava3.internal.operators.observable;

/* JADX INFO: loaded from: classes7.dex */
public final class G<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.r<? super T> f209983b;

    public static final class a<T> extends Ec.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Bc.r<? super T> f209984f;

        public a(zc.V<? super T> actual, Bc.r<? super T> filter) {
            super(actual);
            this.f209984f = filter;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // zc.V
        public void onNext(T t10) {
            if (this.f33811e != 0) {
                this.f33807a.onNext(null);
                return;
            }
            try {
                if (this.f209984f.test(t10)) {
                    this.f33807a.onNext((Object) t10);
                }
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // Dc.q
        @yc.f
        public T poll() throws Throwable {
            T tPoll;
            do {
                tPoll = this.f33809c.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f209984f.test(tPoll));
            return tPoll;
        }

        @Override // Dc.m
        public int requestFusion(int mode) {
            return d(mode);
        }
    }

    public G(zc.T<T> source, Bc.r<? super T> predicate) {
        super(source);
        this.f209983b = predicate;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> observer) {
        this.f210954a.a(new a(observer, this.f209983b));
    }
}
