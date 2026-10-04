package G0;

import D0.f;
import Q0.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.U0;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@e.T(24)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class X extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f40064d = "TypefaceCompatApi24Impl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f40065e = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f40066f = "addFontWeightStyle";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f40067g = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Class<?> f40068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Constructor<?> f40069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Method f40070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Method f40071k;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e(f40064d, e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f40069i = constructor;
        f40068h = cls;
        f40070j = method2;
        f40071k = method;
    }

    public static boolean p(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f40070j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface q(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f40068h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f40071k.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean r() {
        Method method = f40070j;
        if (method == null) {
            Log.w(f40064d, "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object s() {
        try {
            return f40069i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // G0.b0
    @Nullable
    public Typeface b(Context context, f.d dVar, Resources resources, int i10) {
        Object objS = s();
        if (objS == null) {
            return null;
        }
        for (f.e eVar : dVar.f17631a) {
            ByteBuffer byteBufferB = c0.b(context, resources, eVar.f17637f);
            if (byteBufferB == null || !p(objS, byteBufferB, eVar.f17636e, eVar.f17633b, eVar.f17634c)) {
                return null;
            }
        }
        return q(objS);
    }

    @Override // G0.b0
    @Nullable
    public Typeface d(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull l.c[] cVarArr, int i10) {
        Object objS = s();
        if (objS == null) {
            return null;
        }
        U0 u02 = new U0();
        for (l.c cVar : cVarArr) {
            Uri uriD = cVar.d();
            ByteBuffer byteBufferF = (ByteBuffer) u02.get(uriD);
            if (byteBufferF == null) {
                byteBufferF = c0.f(context, cancellationSignal, uriD);
                u02.put(uriD, byteBufferF);
            }
            if (byteBufferF == null || !p(objS, byteBufferF, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        Typeface typefaceQ = q(objS);
        if (typefaceQ == null) {
            return null;
        }
        return Typeface.create(typefaceQ, i10);
    }

    @Override // G0.b0
    @NonNull
    public Typeface h(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        Typeface typefaceB;
        try {
            typefaceB = e0.b(typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        return typefaceB == null ? super.h(context, typeface, i10, z10) : typefaceB;
    }
}
