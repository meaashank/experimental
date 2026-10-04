package L7;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import c7.m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import w7.i;

/* JADX INFO: loaded from: classes6.dex */
public class c extends E {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f58685f = "android.security.keystore";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f58684e = "asdf-".concat(c.class.getSimpleName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object[][] f58686g = {new Object[]{i.f240158w, new int[]{0}}, new Object[]{"insert", new int[]{0}}, new Object[]{"del", new int[]{0}}, new Object[]{"exist", new int[]{0}}, new Object[]{"getmtime", new int[]{0}}, new Object[]{"grant", new int[]{0}}, new Object[]{"ungrant", new int[]{0}}, new Object[]{"generateKey", new int[]{1}}, new Object[]{"importKey", new int[]{1}}, new Object[]{"importWrappedKey", new int[]{1, 3}}, new Object[]{"getKeyCharacteristics", new int[]{1}}, new Object[]{"exportKey", new int[]{1}}, new Object[]{"attestKey", new int[]{1}}, new Object[]{"begin", new int[]{2}}};

    public static class a extends m {
        public a() {
        }

        @Override // c7.m
        public String A() {
            return "list";
        }

        @Override // c7.m
        public Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            if (!(obj2 instanceof String[])) {
                return obj2;
            }
            String[] strArr = (String[]) obj2;
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                String strU = c.u(str);
                if (strU != null) {
                    arrayList.add(strU);
                }
            }
            if (arrayList.size() == strArr.length) {
                return obj2;
            }
            String str2 = c.f58684e;
            arrayList.size();
            return arrayList.toArray(new String[0]);
        }

        public a(d dVar) {
        }
    }

    public static class b extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f58687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f58688e;

        public b(String str, int[] iArr) {
            this.f58687d = str;
            this.f58688e = iArr;
        }

        @Override // c7.m
        public String A() {
            return this.f58687d;
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            if (objArr != null) {
                for (int i10 : this.f58688e) {
                    if (i10 < objArr.length) {
                        Object obj2 = objArr[i10];
                        if (obj2 instanceof String) {
                            objArr[i10] = c.v((String) obj2);
                        }
                    }
                }
            }
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e10) {
                if (e10.getCause() != null) {
                    throw e10.getCause();
                }
                throw e10;
            }
        }
    }

    @Nullable
    public static String u(@Nullable String str) {
        String strP = L7.a.P();
        if (str != null && strP != null) {
            int iIndexOf = str.indexOf(95);
            if (iIndexOf < 0) {
                if (str.startsWith(strP)) {
                    return str.substring(strP.length());
                }
                return null;
            }
            int i10 = iIndexOf + 1;
            String strSubstring = str.substring(i10);
            if (strSubstring.startsWith(strP)) {
                return str.substring(0, i10) + strSubstring.substring(strP.length());
            }
        }
        return null;
    }

    @Nullable
    public static String v(@Nullable String str) {
        String strP = L7.a.P();
        if (str == null || strP == null) {
            return str;
        }
        int iIndexOf = str.indexOf(95);
        if (iIndexOf >= 0) {
            int i10 = iIndexOf + 1;
            String strSubstring = str.substring(i10);
            if (!strSubstring.startsWith(strP)) {
                return str.substring(0, i10) + strP + strSubstring;
            }
        } else if (!str.startsWith(strP)) {
            return strP.concat(str);
        }
        return str;
    }

    @Override // c7.E
    public void d(@NonNull C2953e<IInterface> c2953e) {
        for (Object[] objArr : f58686g) {
            c2953e.f(new b((String) objArr[0], (int[]) objArr[1]));
        }
        c2953e.f(new a());
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            return (IInterface) Class.forName("android.security.keystore.IKeystoreService$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // c7.E
    public String l() {
        return f58685f;
    }
}
