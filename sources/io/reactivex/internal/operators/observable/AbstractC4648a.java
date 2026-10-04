package io.reactivex.internal.operators.observable;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4648a<T, U> extends hc.z<U> implements pc.g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc.E<T> f206214a;

    public AbstractC4648a(hc.E<T> e10) {
        this.f206214a = e10;
    }

    @Override // pc.g
    public final hc.E<T> source() {
        return this.f206214a;
    }
}
