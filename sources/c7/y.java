package c7;

import com.prism.gaia.client.GaiaContext;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class y implements InterfaceC2957i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f131279b = "asdf-".concat(y.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f131280a;

    public y(String... strArr) {
        this.f131280a = strArr;
    }

    public static Field c(Class<?> cls, String str) {
        while (cls != null && cls != Object.class) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    @Override // c7.InterfaceC2957i
    public Runnable a(Object[] objArr) {
        b(objArr);
        return null;
    }

    @Override // c7.InterfaceC2957i
    public void b(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        String strR = GaiaContext.j().r();
        String strV = GaiaContext.f164212y.v();
        if (strR == null || strV == null || strR.equals(strV)) {
            return;
        }
        for (Object obj : objArr) {
            if (obj != null && !(obj instanceof String) && !d(obj, this.f131280a, 0, strR, strV)) {
                String[] strArr = this.f131280a;
                if (strArr.length > 1) {
                    d(obj, new String[]{strArr[strArr.length - 1]}, 0, strR, strV);
                }
            }
        }
    }

    public final boolean d(Object obj, String[] strArr, int i10, String str, String str2) {
        Field fieldC;
        if (obj == null || (fieldC = c(obj.getClass(), strArr[i10])) == null) {
            return false;
        }
        try {
            fieldC.setAccessible(true);
            try {
                if (i10 < strArr.length - 1) {
                    return d(fieldC.get(obj), strArr, i10 + 1, str, str2);
                }
                if (!str.equals(fieldC.get(obj))) {
                    return false;
                }
                fieldC.set(obj, str2);
                String str3 = strArr[i10];
                return true;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
        String str4 = strArr[i10];
        return false;
    }
}
