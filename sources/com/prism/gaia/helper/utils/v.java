package com.prism.gaia.helper.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class v {
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static float d(float f10, String str) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.j.a(str, " must not be NaN"));
        }
        if (Float.isInfinite(f10)) {
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.j.a(str, " must not be infinite"));
        }
        return f10;
    }

    public static float e(float f10, float f11, float f12, String str) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.j.a(str, " must not be NaN"));
        }
        if (f10 < f11) {
            throw new IllegalArgumentException(String.format("%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f11), Float.valueOf(f12)));
        }
        if (f10 <= f12) {
            return f10;
        }
        throw new IllegalArgumentException(String.format("%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f11), Float.valueOf(f12)));
    }

    public static int f(int i10, int i11, int i12, String str) {
        if (i10 < i11) {
            throw new IllegalArgumentException(String.format("%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        if (i10 <= i12) {
            return i10;
        }
        throw new IllegalArgumentException(String.format("%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    public static long g(long j10, long j11, long j12, String str) {
        if (j10 < j11) {
            throw new IllegalArgumentException(String.format("%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j11), Long.valueOf(j12)));
        }
        if (j10 <= j12) {
            return j10;
        }
        throw new IllegalArgumentException(String.format("%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j11), Long.valueOf(j12)));
    }

    @e.D(from = 0)
    public static int h(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    @e.D(from = 0)
    public static int i(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str);
    }

    public static long j(long j10) {
        if (j10 >= 0) {
            return j10;
        }
        throw new IllegalArgumentException();
    }

    public static long k(long j10, String str) {
        if (j10 >= 0) {
            return j10;
        }
        throw new IllegalArgumentException(str);
    }

    public static int l(int i10, String str) {
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalArgumentException(str);
    }

    public static float[] m(float[] fArr, float f10, float f11, String str) {
        s(fArr, str + " must not be null");
        for (int i10 = 0; i10 < fArr.length; i10++) {
            float f12 = fArr[i10];
            if (Float.isNaN(f12)) {
                throw new IllegalArgumentException(str + "[" + i10 + "] must not be NaN");
            }
            if (f12 < f10) {
                throw new IllegalArgumentException(String.format("%s[%d] is out of range of [%f, %f] (too low)", str, Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11)));
            }
            if (f12 > f11) {
                throw new IllegalArgumentException(String.format("%s[%d] is out of range of [%f, %f] (too high)", str, Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11)));
            }
        }
        return fArr;
    }

    public static <T> T[] n(T[] tArr, String str) {
        if (tArr == null) {
            throw new NullPointerException(androidx.compose.runtime.changelist.j.a(str, " must not be null"));
        }
        for (int i10 = 0; i10 < tArr.length; i10++) {
            if (tArr[i10] == null) {
                throw new NullPointerException(String.format("%s[%d] must not be null", str, Integer.valueOf(i10)));
            }
        }
        return tArr;
    }

    @NonNull
    public static <C extends Collection<T>, T> C o(C c10, String str) {
        if (c10 == null) {
            throw new NullPointerException(androidx.compose.runtime.changelist.j.a(str, " must not be null"));
        }
        Iterator it = c10.iterator();
        long j10 = 0;
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException(String.format("%s[%d] must not be null", str, Long.valueOf(j10)));
            }
            j10++;
        }
        return c10;
    }

    public static <T> Collection<T> p(Collection<T> collection, String str) {
        if (collection == null) {
            throw new NullPointerException(androidx.compose.runtime.changelist.j.a(str, " must not be null"));
        }
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.j.a(str, " is empty"));
        }
        return collection;
    }

    public static int q(int i10, int i11) {
        if ((i10 & i11) == i10) {
            return i10;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(i11) + " are allowed");
    }

    @NonNull
    public static <T> T r(T t10) {
        t10.getClass();
        return t10;
    }

    @NonNull
    public static <T> T s(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @NonNull
    public static <T> T t(T t10, String str, Object... objArr) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static void u(boolean z10) {
        v(z10, null);
    }

    public static void v(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    public static <T extends CharSequence> T w(T t10) {
        if (TextUtils.isEmpty(t10)) {
            throw new IllegalArgumentException();
        }
        return t10;
    }

    @NonNull
    public static <T extends CharSequence> T x(T t10, Object obj) {
        if (TextUtils.isEmpty(t10)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t10;
    }
}
