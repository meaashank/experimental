package dagger.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f194921a = 1073741824;

    public static int a(int expectedSize) {
        if (expectedSize < 3) {
            return expectedSize + 1;
        }
        if (expectedSize < 1073741824) {
            return (int) ((expectedSize / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(List<?> list) {
        if (list.size() < 2) {
            return false;
        }
        return list.size() != new HashSet(list).size();
    }

    public static <T> HashSet<T> c(int expectedSize) {
        return new HashSet<>(a(expectedSize));
    }

    public static <K, V> LinkedHashMap<K, V> d(int expectedSize) {
        return new LinkedHashMap<>(a(expectedSize));
    }

    public static <T> List<T> e(int size) {
        return size == 0 ? Collections.EMPTY_LIST : new ArrayList(size);
    }
}
