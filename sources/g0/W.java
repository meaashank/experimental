package G0;

import D0.f;
import Q0.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@e.T(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class W extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f40055d = "TypefaceCompatApi21Impl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f40056e = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f40057f = "addFontWeightStyle";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f40058g = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Class<?> f40059h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Constructor<?> f40060i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Method f40061j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Method f40062k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f40063l = false;

    public static boolean p(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException {
        s();
        try {
            try {
                return ((Boolean) f40061j.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
            } catch (InvocationTargetException e10) {
                e = e10;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e11) {
            e = e11;
        }
    }

    private static Typeface q(Object obj) throws NoSuchMethodException {
        s();
        try {
            Object objNewInstance = Array.newInstance(f40059h, 1);
            Array.set(objNewInstance, 0, obj);
            try {
                return (Typeface) f40062k.invoke(null, objNewInstance);
            } catch (InvocationTargetException e10) {
                e = e10;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e11) {
            e = e11;
        }
    }

    public static void s() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f40063l) {
            return;
        }
        f40063l = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e(f40055d, e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f40060i = constructor;
        f40059h = cls;
        f40061j = method2;
        f40062k = method;
    }

    private static Object t() throws NoSuchMethodException {
        s();
        try {
            return f40060i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // G0.b0
    public Typeface b(Context context, f.d dVar, Resources resources, int i10) throws NoSuchMethodException {
        Object objT = t();
        for (f.e eVar : dVar.f17631a) {
            File fileE = c0.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!c0.c(fileE, resources, eVar.f17637f)) {
                    return null;
                }
                if (!p(objT, fileE.getPath(), eVar.f17633b, eVar.f17634c)) {
                    return null;
                }
                fileE.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return q(objT);
    }

    @Override // G0.b0
    public Typeface d(Context context, CancellationSignal cancellationSignal, @NonNull l.c[] cVarArr, int i10) {
        Typeface typefaceF;
        if (cVarArr.length >= 1) {
            l.c cVarM = m(cVarArr, i10);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(cVarM.d(), CampaignEx.JSON_KEY_AD_R, cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        File fileR = r(parcelFileDescriptorOpenFileDescriptor);
                        if (fileR == null || !fileR.canRead()) {
                            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                            try {
                                typefaceF = super.f(context, fileInputStream);
                                fileInputStream.close();
                            } finally {
                            }
                        } else {
                            typefaceF = Typeface.createFromFile(fileR);
                        }
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceF;
                    } finally {
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused) {
            }
        }
        return null;
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

    public final File r(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
