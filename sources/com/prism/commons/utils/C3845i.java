package com.prism.commons.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.prism.commons.utils.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3845i {
    public static <E> Collection<E> a(Collection<E> collection, Collection<E> collection2) {
        LinkedList linkedList = new LinkedList();
        for (E e10 : collection) {
            if (collection2.contains(e10)) {
                linkedList.add(e10);
            }
        }
        return linkedList;
    }

    public static <E> List<E> b(E e10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(e10);
        return arrayList;
    }
}
