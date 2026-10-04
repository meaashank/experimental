package G0;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.C1531f0;
import e.InterfaceC4326A;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@e.T(21)
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f40105a = "WeightTypeface";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f40106b = "native_instance";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f40107c = "nativeCreateFromTypeface";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f40108d = "nativeCreateWeightAlias";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Field f40109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f40110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Method f40111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Constructor<Typeface> f40112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InterfaceC4326A("sWeightCacheLock")
    public static final C1531f0<SparseArray<Typeface>> f40113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f40114j;

    static {
        Field declaredField;
        Constructor<Typeface> declaredConstructor;
        Method declaredMethod;
        Method declaredMethod2;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            try {
                declaredMethod = Typeface.class.getDeclaredMethod(f40107c, cls, cls2);
                declaredMethod.setAccessible(true);
                declaredMethod2 = Typeface.class.getDeclaredMethod(f40108d, cls, cls2);
                declaredMethod2.setAccessible(true);
                declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
                declaredConstructor.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                e = e10;
                Log.e("WeightTypeface", e.getClass().getName(), e);
                declaredField = null;
                declaredConstructor = null;
                declaredMethod = null;
                declaredMethod2 = null;
            }
        } catch (NoSuchFieldException | NoSuchMethodException e11) {
            e = e11;
        }
        f40109e = declaredField;
        f40110f = declaredMethod;
        f40111g = declaredMethod2;
        f40112h = declaredConstructor;
        f40113i = new C1531f0<>(3);
        f40114j = new Object();
    }

    @Nullable
    public static Typeface a(long j10) {
        try {
            return f40112h.newInstance(Long.valueOf(j10));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Nullable
    public static Typeface b(@NonNull Typeface typeface, int i10, boolean z10) {
        if (!d()) {
            return null;
        }
        int i11 = (i10 << 1) | (z10 ? 1 : 0);
        synchronized (f40114j) {
            try {
                long jC = c(typeface);
                C1531f0<SparseArray<Typeface>> c1531f0 = f40113i;
                SparseArray<Typeface> sparseArrayG = c1531f0.g(jC);
                if (sparseArrayG == null) {
                    sparseArrayG = new SparseArray<>(4);
                    c1531f0.m(jC, sparseArrayG);
                } else {
                    Typeface typeface2 = sparseArrayG.get(i11);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface typefaceA = z10 == typeface.isItalic() ? a(f(jC, i10)) : a(e(jC, i10, z10));
                sparseArrayG.put(i11, typefaceA);
                return typefaceA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long c(@NonNull Typeface typeface) {
        try {
            return f40109e.getLong(typeface);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static boolean d() {
        return f40109e != null;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static long e(long j10, int i10, boolean z10) {
        try {
            Long l10 = (Long) f40110f.invoke(null, Long.valueOf(j10), Integer.valueOf(z10 ? 2 : 0));
            l10.longValue();
            return ((Long) f40111g.invoke(null, l10, Integer.valueOf(i10))).longValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static long f(long j10, int i10) {
        try {
            return ((Long) f40111g.invoke(null, Long.valueOf(j10), Integer.valueOf(i10))).longValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
