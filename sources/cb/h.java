package cb;

import C4.q;
import W0.j;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cb.C2966b;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import e.T;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
@T(30)
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f136248a = "h";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f136249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f136250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f136251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f136252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f136253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f136254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f136255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f136256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f136257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f136258k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f136259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f136260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f136261n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Method f136262o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Method f136263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Method f136264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Method f136265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ boolean f136266s = false;

    static {
        String simpleName = h.class.getSimpleName();
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            f136262o = declaredMethod;
            Class cls = (Class) declaredMethod.invoke(null, "sun.misc.Unsafe");
            Object objInvoke = cls.getDeclaredMethod("getUnsafe", null).invoke(null, null);
            f136249b = objInvoke;
            Method declaredMethod2 = cls.getDeclaredMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            Method declaredMethod3 = cls.getDeclaredMethod("getLong", Object.class, cls2);
            f136263p = declaredMethod3;
            f136264q = cls.getDeclaredMethod("getInt", cls2);
            f136265r = cls.getDeclaredMethod("putLong", Object.class, cls2, cls2);
            f136250c = ((Long) declaredMethod2.invoke(objInvoke, C2966b.c.class.getDeclaredField("e"))).longValue();
            f136251d = ((Long) declaredMethod2.invoke(objInvoke, C2966b.c.class.getDeclaredField(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B))).longValue();
            long jLongValue = ((Long) declaredMethod2.invoke(objInvoke, C2966b.f.class.getDeclaredField("e"))).longValue();
            f136252e = jLongValue;
            f136253f = ((Long) declaredMethod2.invoke(objInvoke, C2966b.g.class.getDeclaredField("f"))).longValue();
            long jLongValue2 = ((Long) declaredMethod2.invoke(objInvoke, C2966b.C0353b.class.getDeclaredField(j.f76474a))).longValue();
            f136254g = jLongValue2;
            long jLongValue3 = ((Long) declaredMethod2.invoke(objInvoke, C2966b.C0353b.class.getDeclaredField("i"))).longValue();
            f136255h = jLongValue3;
            f136256i = ((Long) declaredMethod2.invoke(objInvoke, C2966b.C0353b.class.getDeclaredField("k"))).longValue();
            f136257j = ((Long) declaredMethod2.invoke(objInvoke, C2966b.d.class.getDeclaredField("a"))).longValue();
            Method declaredMethod4 = C2966b.h.class.getDeclaredMethod("a", null);
            Method declaredMethod5 = C2966b.h.class.getDeclaredMethod(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, null);
            declaredMethod4.setAccessible(true);
            declaredMethod5.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod4);
            MethodHandle methodHandleUnreflect2 = MethodHandles.lookup().unreflect(declaredMethod5);
            long jLongValue4 = ((Long) declaredMethod3.invoke(objInvoke, methodHandleUnreflect, Long.valueOf(jLongValue))).longValue();
            long jLongValue5 = ((Long) declaredMethod3.invoke(objInvoke, methodHandleUnreflect2, Long.valueOf(jLongValue))).longValue();
            long jLongValue6 = ((Long) declaredMethod3.invoke(objInvoke, C2966b.h.class, Long.valueOf(jLongValue2))).longValue();
            long j10 = jLongValue5 - jLongValue4;
            f136258k = j10;
            Log.v(simpleName, "artMethodSize: " + j10 + q.f17581a + Long.toString(jLongValue4, 16) + U6.j.f68738d + Long.toString(jLongValue5, 16) + U6.j.f68738d + Long.toString(jLongValue6, 16));
            f136259l = (jLongValue4 - jLongValue6) - j10;
            Field declaredField = C2966b.h.class.getDeclaredField("a");
            Field declaredField2 = C2966b.h.class.getDeclaredField(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            long jLongValue7 = ((Long) declaredMethod3.invoke(objInvoke, methodHandleUnreflectGetter, Long.valueOf(jLongValue))).longValue();
            long jLongValue8 = ((Long) declaredMethod3.invoke(objInvoke, methodHandleUnreflectGetter2, Long.valueOf(jLongValue))).longValue();
            long jLongValue9 = ((Long) declaredMethod3.invoke(objInvoke, C2966b.h.class, Long.valueOf(jLongValue3))).longValue();
            long j11 = jLongValue8 - jLongValue7;
            f136260m = j11;
            Log.v(simpleName, "artFieldSize: " + j11 + q.f17581a + Long.toString(jLongValue7, 16) + U6.j.f68738d + Long.toString(jLongValue8, 16) + U6.j.f68738d + Long.toString(jLongValue9, 16));
            f136261n = jLongValue7 - jLongValue9;
        } catch (ReflectiveOperationException e10) {
            Log.e(f136248a, "Initialize error", e10);
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static boolean a(Class<?>[] clsArr, Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (clsArr[i10].isPrimitive()) {
                Class<?> cls = clsArr[i10];
                if (cls == Integer.TYPE && !(objArr[i10] instanceof Integer)) {
                    return false;
                }
                if (cls == Byte.TYPE && !(objArr[i10] instanceof Byte)) {
                    return false;
                }
                if (cls == Character.TYPE && !(objArr[i10] instanceof Character)) {
                    return false;
                }
                if (cls == Boolean.TYPE && !(objArr[i10] instanceof Boolean)) {
                    return false;
                }
                if (cls == Double.TYPE && !(objArr[i10] instanceof Double)) {
                    return false;
                }
                if (cls == Float.TYPE && !(objArr[i10] instanceof Float)) {
                    return false;
                }
                if (cls == Long.TYPE && !(objArr[i10] instanceof Long)) {
                    return false;
                }
                if (cls == Short.TYPE && !(objArr[i10] instanceof Short)) {
                    return false;
                }
            } else {
                Object obj = objArr[i10];
                if (obj != null && !clsArr[i10].isInstance(obj)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Object b(@NonNull Class<?> cls, @Nullable Object obj, @NonNull String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (obj != null && !cls.isInstance(obj)) {
            throw new IllegalArgumentException("this object is not an instance of the given class");
        }
        Method declaredMethod = C2966b.e.class.getDeclaredMethod("a", Object[].class);
        declaredMethod.setAccessible(true);
        Method method = f136263p;
        Object obj2 = f136249b;
        Long l10 = (Long) method.invoke(obj2, cls, Long.valueOf(f136254g));
        long jLongValue = l10.longValue();
        if (jLongValue == 0) {
            throw new NoSuchMethodException("Cannot find matching method");
        }
        int iIntValue = ((Integer) f136264q.invoke(obj2, l10)).intValue();
        for (int i10 = 0; i10 < iIntValue; i10++) {
            f136265r.invoke(f136249b, declaredMethod, Long.valueOf(f136250c), Long.valueOf((((long) i10) * f136258k) + jLongValue + f136259l));
            if (str.equals(declaredMethod.getName()) && a(declaredMethod.getParameterTypes(), objArr)) {
                return declaredMethod.invoke(obj, objArr);
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    public static boolean c(@NonNull String... strArr) {
        try {
            Class cls = (Class) f136262o.invoke(null, "dalvik.system.VMRuntime");
            b(cls, b(cls, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
            return true;
        } catch (Throwable th) {
            Log.w(f136248a, "setHiddenApiExemptions", th);
            return false;
        }
    }

    public static boolean d(Context context) {
        return c("L");
    }
}
