package G0;

import D0.f;
import Q0.l;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@e.T(26)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class Y extends W {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f40072A = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f40073t = "TypefaceCompatApi26Impl";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f40074u = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f40075v = "addFontFromAssetManager";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f40076w = "addFontFromBuffer";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f40077x = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f40078y = "freeze";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f40079z = "abortCreation";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Class<?> f40080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Constructor<?> f40081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f40082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Method f40083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Method f40084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Method f40085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Method f40086s;

    public Y() {
        Class<?> clsD;
        Constructor<?> constructorE;
        Method methodA;
        Method methodB;
        Method methodF;
        Method methodZ;
        Method methodC;
        try {
            clsD = D();
            constructorE = E(clsD);
            methodA = A(clsD);
            methodB = B(clsD);
            methodF = F(clsD);
            methodZ = z(clsD);
            methodC = C(clsD);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e(f40073t, "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            clsD = null;
            constructorE = null;
            methodA = null;
            methodB = null;
            methodF = null;
            methodZ = null;
            methodC = null;
        }
        this.f40080m = clsD;
        this.f40081n = constructorE;
        this.f40082o = methodA;
        this.f40083p = methodB;
        this.f40084q = methodF;
        this.f40085r = methodZ;
        this.f40086s = methodC;
    }

    public Method A(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(f40075v, AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method B(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(f40076w, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method C(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> D() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor<?> E(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(null);
    }

    public Method F(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f40078y, null);
    }

    @Override // G0.W, G0.b0
    @Nullable
    public Typeface b(Context context, f.d dVar, Resources resources, int i10) {
        if (!y()) {
            return super.b(context, dVar, resources, i10);
        }
        Object objT = t();
        if (objT == null) {
            return null;
        }
        f.e[] eVarArr = dVar.f17631a;
        int length = eVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            f.e eVar = eVarArr[i11];
            Context context2 = context;
            if (!v(context2, objT, eVar.f17632a, eVar.f17636e, eVar.f17633b, eVar.f17634c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(eVar.f17635d))) {
                u(objT);
                return null;
            }
            i11++;
            context = context2;
        }
        if (x(objT)) {
            return q(objT);
        }
        return null;
    }

    @Override // G0.W, G0.b0
    @Nullable
    public Typeface d(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull l.c[] cVarArr, int i10) {
        Typeface typefaceQ;
        Object obj;
        if (cVarArr.length >= 1) {
            if (y()) {
                Map<Uri, ByteBuffer> mapH = c0.h(context, cVarArr, cancellationSignal);
                Object objT = t();
                if (objT != null) {
                    int length = cVarArr.length;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < length) {
                        l.c cVar = cVarArr[i11];
                        ByteBuffer byteBuffer = mapH.get(cVar.d());
                        if (byteBuffer == null) {
                            obj = objT;
                        } else {
                            boolean zW = w(objT, byteBuffer, cVar.c(), cVar.e(), cVar.f() ? 1 : 0);
                            obj = objT;
                            if (!zW) {
                                u(obj);
                                return null;
                            }
                            z10 = true;
                        }
                        i11++;
                        objT = obj;
                        z10 = z10;
                    }
                    Object obj2 = objT;
                    if (!z10) {
                        u(obj2);
                        return null;
                    }
                    if (x(obj2) && (typefaceQ = q(obj2)) != null) {
                        return Typeface.create(typefaceQ, i10);
                    }
                }
            } else {
                l.c cVarM = m(cVarArr, i10);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(cVarM.d(), CampaignEx.JSON_KEY_AD_R, cancellationSignal);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(cVarM.e()).setItalic(cVarM.f()).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    } else if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }

    @Override // G0.b0
    @Nullable
    @e.T(29)
    public /* bridge */ /* synthetic */ Typeface e(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull List list, int i10) {
        super.e(context, cancellationSignal, list, i10);
        throw null;
    }

    @Override // G0.b0
    @Nullable
    public Typeface g(Context context, Resources resources, int i10, String str, int i11) {
        if (!y()) {
            return super.g(context, resources, i10, str, i11);
        }
        Object objT = t();
        if (objT == null) {
            return null;
        }
        if (!v(context, objT, str, 0, -1, -1, null)) {
            u(objT);
            return null;
        }
        if (x(objT)) {
            return q(objT);
        }
        return null;
    }

    @Override // G0.W, G0.b0
    @NonNull
    public Typeface h(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        Typeface typefaceB;
        try {
            typefaceB = f0.b(typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        return typefaceB == null ? super.h(context, typeface, i10, z10) : typefaceB;
    }

    @Nullable
    public Typeface q(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f40080m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f40086s.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Nullable
    public final Object t() {
        try {
            return this.f40081n.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void u(Object obj) {
        try {
            this.f40085r.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean v(Context context, Object obj, String str, int i10, int i11, int i12, @Nullable FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f40082o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean w(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f40083p.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean x(Object obj) {
        try {
            return ((Boolean) this.f40084q.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean y() {
        if (this.f40082o == null) {
            Log.w(f40073t, "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f40082o != null;
    }

    public Method z(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f40079z, null);
    }
}
