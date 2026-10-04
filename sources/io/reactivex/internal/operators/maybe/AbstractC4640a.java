package io.reactivex.internal.operators.maybe;

/* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4640a<T, R> extends hc.q<R> implements pc.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc.w<T> f204988a;

    public AbstractC4640a(hc.w<T> wVar) {
        this.f204988a = wVar;
    }

    @Override // pc.f
    public final hc.w<T> source() {
        return this.f204988a;
    }
}
