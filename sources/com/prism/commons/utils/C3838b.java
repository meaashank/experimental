package com.prism.commons.utils;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.prism.commons.utils.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3838b {
    public static void a(int i10, int i11, int i12) throws ArrayIndexOutOfBoundsException {
        if ((i11 | i12) < 0 || i11 > i10 || i10 - i11 < i12) {
            throw new ArrayIndexOutOfBoundsException(i11);
        }
    }

    public static <T> T[] b(T[] tArr, T[] tArr2) {
        if (n(tArr2)) {
            return tArr;
        }
        if (n(tArr)) {
            return tArr2;
        }
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static boolean c(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean d(T[] tArr, T t10) {
        return m(tArr, t10) != -1;
    }

    public static <T> boolean e(T[] tArr, T[] tArr2) {
        for (T t10 : tArr2) {
            if (m(tArr, t10) != -1) {
                return true;
            }
        }
        return false;
    }

    public static <T> T[] f(Class<? extends T[]> cls, int i10) {
        return cls == Object[].class ? (T[]) new Object[i10] : (T[]) ((Object[]) Array.newInstance(cls.getComponentType(), i10));
    }

    public static <T> Collection<Integer> g(SparseArray<T> sparseArray, int[] iArr) {
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        for (int i10 : iArr) {
            hashSet.add(Integer.valueOf(i10));
        }
        int size = sparseArray.size();
        while (true) {
            int i11 = size - 1;
            if (size <= 0) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                linkedList.add(Integer.valueOf(iKeyAt));
            }
            size = i11;
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            sparseArray.remove(((Integer) it.next()).intValue());
        }
        return linkedList;
    }

    public static <T> T h(Object[] objArr, Class<?> cls) {
        int iJ = j(objArr, cls);
        if (iJ != -1) {
            return (T) objArr[iJ];
        }
        return null;
    }

    public static int i(SparseBooleanArray sparseBooleanArray, int i10) {
        int size = sparseBooleanArray.size() - 1;
        if (size < 0) {
            return -1;
        }
        int i11 = 0;
        while (i11 < size) {
            int i12 = ((i11 + size) + 1) / 2;
            if (sparseBooleanArray.keyAt(i12) < i10) {
                i11 = i12;
            } else {
                size = i12 - 1;
            }
        }
        if (sparseBooleanArray.keyAt(i11) > i10) {
            return -1;
        }
        return sparseBooleanArray.keyAt(i11);
    }

    public static int j(Object[] objArr, Class<?> cls) {
        if (!n(objArr)) {
            int i10 = -1;
            for (Object obj : objArr) {
                i10++;
                if (cls.isInstance(obj)) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public static int k(Object[] objArr, Class<?> cls, int i10) {
        if (objArr == null) {
            return -1;
        }
        while (i10 < objArr.length) {
            if (cls.isInstance(objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int l(Object[] objArr, Class<?> cls) {
        if (n(objArr)) {
            return -1;
        }
        for (int length = objArr.length; length > 0; length--) {
            int i10 = length - 1;
            if (cls.isInstance(objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public static <T> int m(T[] tArr, T t10) {
        if (tArr == null) {
            return -1;
        }
        for (int i10 = 0; i10 < tArr.length; i10++) {
            if (P.a(tArr[i10], t10)) {
                return i10;
            }
        }
        return -1;
    }

    public static <T> boolean n(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static <T> T[] o(T[] tArr, T[] tArr2, T[] tArr3) {
        if (n(tArr2)) {
            return tArr;
        }
        if (n(tArr)) {
            return tArr2;
        }
        HashSet hashSet = new HashSet(Arrays.asList(tArr));
        hashSet.addAll(Arrays.asList(tArr2));
        return (T[]) hashSet.toArray(tArr3);
    }

    public static int p(Class<?>[] clsArr, Class<?> cls) {
        if (clsArr == null) {
            return -1;
        }
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (clsArr[i10] == cls) {
                return i10;
            }
        }
        return -1;
    }

    public static int q(Class<?>[] clsArr, Class<?> cls, int i10) {
        if (clsArr == null) {
            return -1;
        }
        while (i10 < clsArr.length) {
            if (cls == clsArr[i10]) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static Object[] r(Object[] objArr, Object obj) {
        Object[] objArr2 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        objArr2[objArr.length] = obj;
        return objArr2;
    }

    public static int[] s(Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }
}
