package g7;

import android.os.IBinder;
import android.os.IInterface;
import c7.C2953e;
import c7.m;
import c7.y;
import g7.d;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f202285a = "asdf-".concat(d.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f202286b = "android.adservices.ADID_SERVICE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f202287c = "android.adservices.adid.IAdIdService";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f202288d = "android.adservices.adid.IAdIdService$Stub";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f202289e = "android.adservices.adid.IGetAdIdCallback";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f202290f = "mAppPackageName";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile boolean f202291g;

    public static class a extends m {
        public a() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static /* synthetic */ Object u0(IBinder iBinder, Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            name.getClass();
            byte b10 = -1;
            switch (name.hashCode()) {
                case -1776922004:
                    if (name.equals("toString")) {
                        b10 = 0;
                    }
                    break;
                case -1772511108:
                    if (name.equals("asBinder")) {
                        b10 = 1;
                    }
                    break;
                case -1295482945:
                    if (name.equals("equals")) {
                        b10 = 2;
                    }
                    break;
                case 147696667:
                    if (name.equals("hashCode")) {
                        b10 = 3;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    return "gaia-adid-rotating-callback";
                case 1:
                    return iBinder;
                case 2:
                    return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
                case 3:
                    return Integer.valueOf(System.identityHashCode(obj));
                default:
                    return null;
            }
        }

        public static Object v0(IBinder iBinder) {
            try {
                Class<?> cls = Class.forName("android.adservices.adid.IGetAdIdCallback");
                final BinderC4457a binderC4457a = new BinderC4457a(iBinder);
                return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: g7.c
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr) {
                        return d.a.u0(binderC4457a, obj, method, objArr);
                    }
                });
            } catch (Throwable unused) {
                String unused2 = d.f202285a;
                return null;
            }
        }

        @Override // c7.m
        public String A() {
            return "getAdId";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            IBinder iBinderAsBinder;
            Object objV0;
            if (objArr != null && objArr.length >= 3) {
                Object obj2 = objArr[2];
                if ((obj2 instanceof IInterface) && (iBinderAsBinder = ((IInterface) obj2).asBinder()) != null && (objV0 = v0(iBinderAsBinder)) != null) {
                    objArr[2] = objV0;
                }
            }
            return method.invoke(obj, objArr);
        }

        public a(e eVar) {
        }
    }

    public static boolean b(String str) {
        return f202286b.equals(str);
    }

    public static void c() {
        if (f202291g) {
            return;
        }
        f202291g = true;
        C4458b.b();
    }

    public static IBinder d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        c();
        try {
            Class<?> cls = Class.forName(f202287c);
            IInterface iInterface = (IInterface) Class.forName(f202288d).getMethod("asInterface", IBinder.class).invoke(null, iBinder);
            if (iInterface == null) {
                return iBinder;
            }
            C2953e c2953e = new C2953e(null, iInterface, cls);
            c2953e.g(new y(f202290f));
            c2953e.f(new a());
            return new E8.d(iBinder, (IInterface) c2953e.f131257f);
        } catch (Throwable unused) {
            return iBinder;
        }
    }
}
