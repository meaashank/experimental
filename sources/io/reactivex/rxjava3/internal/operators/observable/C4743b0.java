package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4743b0<T, U> extends AbstractC4740a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super T, ? extends U> f210960b;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.b0$a */
    public static final class a<T, U> extends Ec.a<T, U> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Bc.o<? super T, ? extends U> f210961f;

        public a(zc.V<? super U> actual, Bc.o<? super T, ? extends U> mapper) {
            super(actual);
            this.f210961f = mapper;
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
                U uApply = this.f210961f.apply(t10);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                this.f33807a.onNext((Object) uApply);
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // Dc.q
        @yc.f
        public U poll() throws Throwable {
            T tPoll = this.f33809c.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f210961f.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }

        @Override // Dc.m
        public int requestFusion(int mode) {
            return d(mode);
        }
    }

    public C4743b0(zc.T<T> source, Bc.o<? super T, ? extends U> function) {
        super(source);
        this.f210960b = function;
    }

    @Override // zc.N
    public void d6(zc.V<? super U> t10) {
        this.f210954a.a(new a(t10, this.f210960b));
    }
}
