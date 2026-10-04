package io.reactivex.rxjava3.internal.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class o<T> implements Bc.o<List<T>, List<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<? super T> f211957a;

    public o(Comparator<? super T> comparator) {
        this.f211957a = comparator;
    }

    public List<T> a(List<T> t10) {
        Collections.sort(t10, this.f211957a);
        return t10;
    }

    @Override // Bc.o
    public Object apply(Object t10) throws Throwable {
        List list = (List) t10;
        Collections.sort(list, this.f211957a);
        return list;
    }
}
