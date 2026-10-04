package G0;

import D0.f;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.C1531f0;
import e.InterfaceC4326A;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f40099a = "WeightTypeface";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f40100b = "native_instance";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f40101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC4326A("sWeightCacheLock")
    public static final C1531f0<SparseArray<Typeface>> f40102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f40103e;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
        } catch (Exception e10) {
            Log.e("WeightTypeface", e10.getClass().getName(), e10);
            declaredField = null;
        }
        f40101c = declaredField;
        f40102d = new C1531f0<>(3);
        f40103e = new Object();
    }

    @Nullable
    public static Typeface a(@NonNull b0 b0Var, @NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        if (!d()) {
            return null;
        }
        int i11 = (i10 << 1) | (z10 ? 1 : 0);
        synchronized (f40103e) {
            try {
                long jC = c(typeface);
                C1531f0<SparseArray<Typeface>> c1531f0 = f40102d;
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
                Typeface typefaceB = b(b0Var, context, typeface, i10, z10);
                if (typefaceB == null) {
                    typefaceB = e(typeface, i10, z10);
                }
                sparseArrayG.put(i11, typefaceB);
                return typefaceB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public static Typeface b(@NonNull b0 b0Var, @NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        f.d dVarN = b0Var.n(typeface);
        if (dVarN == null) {
            return null;
        }
        return b0Var.c(context, dVarN, context.getResources(), i10, z10);
    }

    public static long c(@NonNull Typeface typeface) {
        try {
            return ((Number) f40101c.get(typeface)).longValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static boolean d() {
        return f40101c != null;
    }

    public static Typeface e(Typeface typeface, int i10, boolean z10) {
        boolean z11 = i10 >= 600;
        return Typeface.create(typeface, (z11 || z10) ? !z11 ? 2 : !z10 ? 1 : 3 : 0);
    }
}
