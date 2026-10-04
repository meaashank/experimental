package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4764w<T, K> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super T, K> f211211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.s<? extends Collection<? super K>> f211212c;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.w$a */
    public static final class a<T, K> extends Ec.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Collection<? super K> f211213f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Bc.o<? super T, K> f211214g;

        public a(zc.V<? super T> actual, Bc.o<? super T, K> keySelector, Collection<? super K> collection) {
            super(actual);
            this.f211214g = keySelector;
            this.f211213f = collection;
        }

        @Override // Ec.a, Dc.q
        public void clear() {
            this.f211213f.clear();
            super.clear();
        }

        @Override // Ec.a, zc.V
        public void onComplete() {
            if (this.f33810d) {
                return;
            }
            this.f33810d = true;
            this.f211213f.clear();
            this.f33807a.onComplete();
        }

        @Override // Ec.a, zc.V
        public void onError(Throwable e10) {
            if (this.f33810d) {
                Ic.a.Y(e10);
                return;
            }
            this.f33810d = true;
            this.f211213f.clear();
            this.f33807a.onError(e10);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // zc.V
        public void onNext(T t10) {
            if (this.f33810d) {
                return;
            }
            if (this.f33811e != 0) {
                this.f33807a.onNext(null);
                return;
            }
            try {
                K kApply = this.f211214g.apply(t10);
                Objects.requireNonNull(kApply, "The keySelector returned a null key");
                if (this.f211213f.add(kApply)) {
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
            Collection<? super K> collection;
            K kApply;
            do {
                tPoll = this.f33809c.poll();
                if (tPoll == null) {
                    break;
                }
                collection = this.f211213f;
                kApply = this.f211214g.apply(tPoll);
                Objects.requireNonNull(kApply, "The keySelector returned a null key");
            } while (!collection.add(kApply));
            return tPoll;
        }

        @Override // Dc.m
        public int requestFusion(int mode) {
            return d(mode);
        }
    }

    public C4764w(zc.T<T> source, Bc.o<? super T, K> keySelector, Bc.s<? extends Collection<? super K>> collectionSupplier) {
        super(source);
        this.f211211b = keySelector;
        this.f211212c = collectionSupplier;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> observer) {
        try {
            Collection<? super K> collection = this.f211212c.get();
            ExceptionHelper.d(collection, "The collectionSupplier returned a null Collection.");
            this.f210954a.a(new a(observer, this.f211211b, collection));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            EmptyDisposable.error(th, observer);
        }
    }
}
