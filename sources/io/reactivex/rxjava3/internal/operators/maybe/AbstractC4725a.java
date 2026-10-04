package io.reactivex.rxjava3.internal.operators.maybe;

import zc.AbstractC5881C;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4725a<T, R> extends AbstractC5881C<R> implements Dc.h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc.I<T> f209610a;

    public AbstractC4725a(zc.I<T> source) {
        this.f209610a = source;
    }

    @Override // Dc.h
    public final zc.I<T> source() {
        return this.f209610a;
    }
}
