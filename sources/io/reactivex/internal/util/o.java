package io.reactivex.internal.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class o<T> implements nc.o<List<T>, List<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<? super T> f207208a;

    public o(Comparator<? super T> comparator) {
        this.f207208a = comparator;
    }

    public List<T> a(List<T> list) throws Exception {
        Collections.sort(list, this.f207208a);
        return list;
    }

    @Override // nc.o
    public Object apply(Object obj) throws Exception {
        List list = (List) obj;
        Collections.sort(list, this.f207208a);
        return list;
    }
}
