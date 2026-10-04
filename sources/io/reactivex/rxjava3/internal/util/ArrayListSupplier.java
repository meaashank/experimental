package io.reactivex.rxjava3.internal.util;

import Bc.s;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public enum ArrayListSupplier implements s<List<Object>>, Bc.o<Object, List<Object>> {
    INSTANCE;

    public static <T, O> Bc.o<O, List<T>> asFunction() {
        return INSTANCE;
    }

    public static <T> s<List<T>> asSupplier() {
        return INSTANCE;
    }

    @Override // Bc.o
    public List<Object> apply(Object o10) {
        return new ArrayList();
    }

    @Override // Bc.s
    public List<Object> get() {
        return new ArrayList();
    }
}
