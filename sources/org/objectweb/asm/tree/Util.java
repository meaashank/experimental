package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class Util {
    private Util() {
    }

    public static <T> List<T> add(List<T> list, T t10) {
        if (list == null) {
            list = new ArrayList<>(1);
        }
        list.add(t10);
        return list;
    }

    public static <T> List<T> asArrayList(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(null);
        }
        return arrayList;
    }

    public static <T> List<T> asArrayList(T[] tArr) {
        if (tArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t10 : tArr) {
            arrayList.add(t10);
        }
        return arrayList;
    }

    public static List<Byte> asArrayList(byte[] bArr) {
        if (bArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static List<Boolean> asArrayList(boolean[] zArr) {
        if (zArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static List<Short> asArrayList(short[] sArr) {
        if (sArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static List<Character> asArrayList(char[] cArr) {
        if (cArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    public static List<Integer> asArrayList(int[] iArr) {
        if (iArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static List<Float> asArrayList(float[] fArr) {
        if (fArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static List<Long> asArrayList(long[] jArr) {
        if (jArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static List<Double> asArrayList(double[] dArr) {
        if (dArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static <T> List<T> asArrayList(int i10, T[] tArr) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(tArr[i11]);
        }
        return arrayList;
    }
}
