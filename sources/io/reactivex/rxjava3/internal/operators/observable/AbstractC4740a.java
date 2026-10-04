package io.reactivex.rxjava3.internal.operators.observable;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4740a<T, U> extends zc.N<U> implements Dc.i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc.T<T> f210954a;

    public AbstractC4740a(zc.T<T> source) {
        this.f210954a = source;
    }

    @Override // Dc.i
    public final zc.T<T> source() {
        return this.f210954a;
    }
}
