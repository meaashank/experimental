package io.reactivex.rxjava3.subjects;

import yc.e;
import yc.f;
import zc.N;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c<T> extends N<T> implements V<T> {
    @f
    @yc.c
    public abstract Throwable A8();

    @yc.c
    public abstract boolean B8();

    @yc.c
    public abstract boolean C8();

    @yc.c
    public abstract boolean D8();

    @e
    @yc.c
    public final c<T> E8() {
        return this instanceof b ? this : new b(this);
    }
}
