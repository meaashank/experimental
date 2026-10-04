package io.reactivex.rxjava3.processors;

import org.reactivestreams.Processor;
import yc.c;
import yc.e;
import yc.f;
import zc.AbstractC5902t;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T> extends AbstractC5902t<T> implements Processor<T, T>, InterfaceC5907y<T> {
    @f
    @c
    public abstract Throwable f9();

    @c
    public abstract boolean g9();

    @c
    public abstract boolean h9();

    @c
    public abstract boolean i9();

    @e
    @c
    public final a<T> j9() {
        return this instanceof b ? this : new b(this);
    }
}
