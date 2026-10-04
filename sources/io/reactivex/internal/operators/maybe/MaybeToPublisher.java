package io.reactivex.internal.operators.maybe;

import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes7.dex */
public enum MaybeToPublisher implements nc.o<hc.w<Object>, Publisher<Object>> {
    INSTANCE;

    public static <T> nc.o<hc.w<T>, Publisher<T>> instance() {
        return INSTANCE;
    }

    @Override // nc.o
    public Publisher<Object> apply(hc.w<Object> wVar) throws Exception {
        return new MaybeToFlowable(wVar);
    }
}
