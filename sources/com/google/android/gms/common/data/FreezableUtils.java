package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.parser.ParseErrorList;

/* JADX INFO: loaded from: classes3.dex */
public final class FreezableUtils {
    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull ArrayList<E> arrayList) {
        ParseErrorList parseErrorList = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            parseErrorList.add(arrayList.get(i10).freeze());
        }
        return parseErrorList;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@NonNull Iterable<E> iterable) {
        ParseErrorList parseErrorList = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            parseErrorList.add(it.next().freeze());
        }
        return parseErrorList;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull E[] eArr) {
        ParseErrorList parseErrorList = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e10 : eArr) {
            parseErrorList.add(e10.freeze());
        }
        return parseErrorList;
    }
}
