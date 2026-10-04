package io.reactivex.rxjava3.internal.util;

import Bc.s;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public enum HashMapSupplier implements s<Map<Object, Object>> {
    INSTANCE;

    public static <K, V> s<Map<K, V>> asSupplier() {
        return INSTANCE;
    }

    @Override // Bc.s
    public Map<Object, Object> get() {
        return new HashMap();
    }
}
