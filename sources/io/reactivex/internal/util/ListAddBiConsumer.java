package io.reactivex.internal.util;

import java.util.List;
import nc.InterfaceC5267c;

/* JADX INFO: loaded from: classes7.dex */
public enum ListAddBiConsumer implements InterfaceC5267c<List, Object, List> {
    INSTANCE;

    public static <T> InterfaceC5267c<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    @Override // nc.InterfaceC5267c
    public List apply(List list, Object obj) throws Exception {
        list.add(obj);
        return list;
    }
}
