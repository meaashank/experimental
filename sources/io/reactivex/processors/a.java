package io.reactivex.processors;

import hc.AbstractC4530j;
import hc.InterfaceC4535o;
import lc.InterfaceC5190c;
import lc.e;
import lc.f;
import org.reactivestreams.Processor;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T> extends AbstractC4530j<T> implements Processor<T, T>, InterfaceC4535o<T> {
    @f
    public abstract Throwable F8();

    public abstract boolean G8();

    public abstract boolean H8();

    public abstract boolean I8();

    @e
    @InterfaceC5190c
    public final a<T> J8() {
        return this instanceof b ? this : new b(this);
    }
}
