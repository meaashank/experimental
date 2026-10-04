package io.reactivex.subjects;

import hc.G;
import hc.z;
import lc.e;
import lc.f;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c<T> extends z<T> implements G<T> {
    @f
    public abstract Throwable c8();

    public abstract boolean d8();

    public abstract boolean e8();

    public abstract boolean f8();

    @e
    public final c<T> g8() {
        return this instanceof b ? this : new b(this);
    }
}
