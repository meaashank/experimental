package io.reactivex.rxjava3.internal.util;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public enum ListAddBiConsumer implements Bc.c<List, Object, List> {
    INSTANCE;

    public static <T> Bc.c<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    @Override // Bc.c
    public List apply(List t12, Object t22) {
        t12.add(t22);
        return t12;
    }
}
