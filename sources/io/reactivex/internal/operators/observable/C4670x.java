package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Collection;
import java.util.concurrent.Callable;
import qc.AbstractC5501a;
import uc.C5666a;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4670x<T, K> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super T, K> f206491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<? extends Collection<? super K>> f206492c;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.x$a */
    public static final class a<T, K> extends AbstractC5501a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Collection<? super K> f206493f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final nc.o<? super T, K> f206494g;

        public a(hc.G<? super T> g10, nc.o<? super T, K> oVar, Collection<? super K> collection) {
            super(g10);
            this.f206494g = oVar;
            this.f206493f = collection;
        }

        @Override // qc.AbstractC5501a, pc.o
        public void clear() {
            this.f206493f.clear();
            super.clear();
        }

        @Override // qc.AbstractC5501a, hc.G
        public void onComplete() {
            if (this.f227047d) {
                return;
            }
            this.f227047d = true;
            this.f206493f.clear();
            this.f227044a.onComplete();
        }

        @Override // qc.AbstractC5501a, hc.G
        public void onError(Throwable th) {
            if (this.f227047d) {
                C5666a.Y(th);
                return;
            }
            this.f227047d = true;
            this.f206493f.clear();
            this.f227044a.onError(th);
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
                K kApply = this.f206494g.apply(t10);
                io.reactivex.internal.functions.a.g(kApply, "The keySelector returned a null key");
                if (this.f206493f.add(kApply)) {
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
            Collection<? super K> collection;
            K kApply;
            do {
                tPoll = this.f227046c.poll();
                if (tPoll == null) {
                    break;
                }
                collection = this.f206493f;
                kApply = this.f206494g.apply(tPoll);
                io.reactivex.internal.functions.a.g(kApply, "The keySelector returned a null key");
            } while (!collection.add(kApply));
            return tPoll;
        }

        @Override // pc.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public C4670x(hc.E<T> e10, nc.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        super(e10);
        this.f206491b = oVar;
        this.f206492c = callable;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        try {
            Collection<? super K> collectionCall = this.f206492c.call();
            io.reactivex.internal.functions.a.g(collectionCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f206214a.a(new a(g10, this.f206491b, collectionCall));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            EmptyDisposable.error(th, g10);
        }
    }
}
