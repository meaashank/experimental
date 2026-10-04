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
@e.T(26)
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f40115a = "WeightTypeface";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f40116b = "native_instance";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f40117c = "nativeCreateFromTypefaceWithExactStyle";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Field f40118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f40119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Constructor<Typeface> f40120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InterfaceC4326A("sWeightCacheLock")
    public static final C1531f0<SparseArray<Typeface>> f40121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f40122h;

    static {
        Field declaredField;
        Constructor<Typeface> declaredConstructor;
        Method declaredMethod;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod(f40117c, cls, Integer.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e10) {
            Log.e("WeightTypeface", e10.getClass().getName(), e10);
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
        }
        f40118d = declaredField;
        f40119e = declaredMethod;
        f40120f = declaredConstructor;
        f40121g = new C1531f0<>(3);
        f40122h = new Object();
    }

    @Nullable
    public static Typeface a(long j10) {
        try {
            return f40120f.newInstance(Long.valueOf(j10));
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
        synchronized (f40122h) {
            try {
                long jC = c(typeface);
                C1531f0<SparseArray<Typeface>> c1531f0 = f40121g;
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
                Typeface typefaceA = a(e(jC, i10, z10));
                sparseArrayG.put(i11, typefaceA);
                return typefaceA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long c(@NonNull Typeface typeface) {
        try {
            return f40118d.getLong(typeface);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static boolean d() {
        return f40118d != null;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static long e(long j10, int i10, boolean z10) {
        try {
            return ((Long) f40119e.invoke(null, Long.valueOf(j10), Integer.valueOf(i10), Boolean.valueOf(z10))).longValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
