package M7;

import android.text.TextUtils;
import c7.InterfaceC2951c;
import c7.m;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.client.natives.NativeMirror;
import com.prism.gaia.genum.AutoLogSetting;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v8.C5707q;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC2951c(AutoLogSetting.OFF)
public class b {

    public static class a extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f58868d = "asdf-".concat(a.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "android_getaddrinfo";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: M7.b$b, reason: collision with other inner class name */
    public static class C0078b extends m {
        @Override // c7.m
        public String A() {
            return "getifaddrs";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Object objInvoke = method.invoke(obj, objArr);
            if (objInvoke != null && objInvoke.getClass().isArray()) {
                int length = Array.getLength(objInvoke);
                for (int i10 = 0; i10 < length; i10++) {
                    C5707q.c().b(Array.get(objInvoke, i10));
                }
            }
            return objInvoke;
        }
    }

    public static class c extends m {
        @Override // c7.m
        public String A() {
            return "getsockoptUcred";
        }

        @Override // c7.m
        public Object a(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    public static class d extends g {
        @Override // M7.b.g, c7.m
        public String A() {
            return "lstat";
        }
    }

    public static class e extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f58869d = "asdf-".concat(e.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "open";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Object obj2 = objArr[0];
            if (obj2 instanceof String) {
                objArr[0] = NativeMirror.tempRedirectPath((String) obj2);
            }
            return method.invoke(obj, objArr);
        }
    }

    public static class f extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f58870d = "asdf-".concat(f.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "setsockoptTimeval";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    public static class g extends m {
        @Override // c7.m
        public String A() {
            return "stat";
        }

        @Override // c7.m
        public Object a(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
            String str;
            if (obj2 != null) {
                try {
                    str = (String) objArr[0];
                } catch (Exception unused) {
                    str = null;
                }
                if (str != null && str.startsWith("/proc")) {
                    String strU0 = u0(str);
                    if (TextUtils.isEmpty(strU0) || strU0.equals(String.valueOf(GaiaContext.j().I()))) {
                    }
                }
                return obj2;
            }
            return null;
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }

        public final String u0(String str) {
            Matcher matcher = Pattern.compile("\\d+").matcher(str);
            return matcher.find() ? matcher.group(0) : "";
        }
    }

    public static class h extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f58871d = "asdf-".concat(h.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "statvfs";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }
}
