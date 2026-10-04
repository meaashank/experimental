package io.reactivex.rxjava3.internal.operators.observable;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4765x<T, K> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super T, K> f211220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.d<? super K, ? super K> f211221c;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.x$a */
    public static final class a<T, K> extends Ec.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Bc.o<? super T, K> f211222f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Bc.d<? super K, ? super K> f211223g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public K f211224h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f211225i;

        public a(zc.V<? super T> actual, Bc.o<? super T, K> keySelector, Bc.d<? super K, ? super K> comparer) {
            super(actual);
            this.f211222f = keySelector;
            this.f211223g = comparer;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // zc.V
        public void onNext(T t10) {
            if (this.f33810d) {
                return;
            }
            if (this.f33811e != 0) {
                this.f33807a.onNext((Object) t10);
                return;
            }
            try {
                K kApply = this.f211222f.apply(t10);
                if (this.f211225i) {
                    boolean zTest = this.f211223g.test(this.f211224h, kApply);
                    this.f211224h = kApply;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.f211225i = true;
                    this.f211224h = kApply;
                }
                this.f33807a.onNext((Object) t10);
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // Dc.q
        @yc.f
        public T poll() throws Throwable {
            while (true) {
                T tPoll = this.f33809c.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f211222f.apply(tPoll);
                if (!this.f211225i) {
                    this.f211225i = true;
                    this.f211224h = kApply;
                    return tPoll;
                }
                if (!this.f211223g.test(this.f211224h, kApply)) {
                    this.f211224h = kApply;
                    return tPoll;
                }
                this.f211224h = kApply;
            }
        }

        @Override // Dc.m
        public int requestFusion(int mode) {
            return d(mode);
        }
    }

    public C4765x(zc.T<T> source, Bc.o<? super T, K> keySelector, Bc.d<? super K, ? super K> comparer) {
        super(source);
        this.f211220b = keySelector;
        this.f211221c = comparer;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> observer) {
        this.f210954a.a(new a(observer, this.f211220b, this.f211221c));
    }
}
