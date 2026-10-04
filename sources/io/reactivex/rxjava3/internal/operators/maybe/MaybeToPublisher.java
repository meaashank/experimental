package io.reactivex.rxjava3.internal.operators.maybe;

import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes7.dex */
public enum MaybeToPublisher implements Bc.o<zc.I<Object>, Publisher<Object>> {
    INSTANCE;

    public static <T> Bc.o<zc.I<T>, Publisher<T>> instance() {
        return INSTANCE;
    }

    @Override // Bc.o
    public Publisher<Object> apply(zc.I<Object> t10) {
        return new MaybeToFlowable(t10);
    }
}
