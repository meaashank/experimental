package io.reactivex.rxjava3.internal.operators.observable;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4766y<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.g<? super T> f211231b;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.y$a */
    public static final class a<T> extends Ec.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Bc.g<? super T> f211232f;

        public a(zc.V<? super T> actual, Bc.g<? super T> onAfterNext) {
            super(actual);
            this.f211232f = onAfterNext;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // zc.V
        public void onNext(T t10) {
            this.f33807a.onNext((Object) t10);
            if (this.f33811e == 0) {
                try {
                    this.f211232f.accept(t10);
                } catch (Throwable th) {
                    c(th);
                }
            }
        }

        @Override // Dc.q
        @yc.f
        public T poll() throws Throwable {
            T tPoll = this.f33809c.poll();
            if (tPoll != null) {
                this.f211232f.accept(tPoll);
            }
            return tPoll;
        }

        @Override // Dc.m
        public int requestFusion(int mode) {
            return d(mode);
        }
    }

    public C4766y(zc.T<T> source, Bc.g<? super T> onAfterNext) {
        super(source);
        this.f211231b = onAfterNext;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> observer) {
        this.f210954a.a(new a(observer, this.f211231b));
    }
}
