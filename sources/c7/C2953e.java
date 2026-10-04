package c7;

import com.prism.gaia.genum.AutoLogSetting;
import com.prism.gaia.naked.metadata.java.lang.ClassCAG;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import v8.C5705o;

/* JADX INFO: renamed from: c7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C2953e<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f131251g = "asdf-".concat(C2953e.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AutoLogSetting f131252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f131253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f131254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<InterfaceC2957i> f131255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f131256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public T f131257f;

    /* JADX INFO: renamed from: c7.e$a */
    public class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            List<InterfaceC2957i> listV0;
            AutoLogSetting autoLogSettingZ;
            AutoLogSetting autoLogSetting = C2953e.this.f131252a;
            m mVarM = C2953e.this.m(method.getName());
            boolean z10 = mVarM != null && mVarM.P();
            if (z10 && (autoLogSettingZ = mVarM.z()) != null) {
                autoLogSetting = autoLogSettingZ;
            }
            boolean zShouldLog = autoLogSetting.shouldLog(mVarM);
            List<Runnable> listO = null;
            try {
                List<InterfaceC2957i> list = C2953e.this.f131255d;
                if (list != null && objArr != null) {
                    listO = C2953e.o(list, objArr, null);
                }
                if (z10 && objArr != null && (mVarM instanceof AbstractC2952d) && (listV0 = ((AbstractC2952d) mVarM).v0()) != null) {
                    listO = C2953e.o(listV0, objArr, listO);
                }
                Object objA = (z10 && mVarM.b(C2953e.this.f131256e, method, objArr)) ? mVarM.a(C2953e.this.f131256e, method, objArr, mVarM.c(C2953e.this.f131256e, method, objArr)) : method.invoke(C2953e.this.f131256e, objArr);
                if (listO != null) {
                    Iterator<Runnable> it = listO.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().run();
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (zShouldLog) {
                    if (z10) {
                        List<InterfaceC2957i> list2 = C2953e.this.f131255d;
                    } else {
                        List<InterfaceC2957i> list3 = C2953e.this.f131255d;
                    }
                    String str = C2953e.f131251g;
                    method.getDeclaringClass().getClass();
                    method.getName();
                }
                return objA;
            } catch (Throwable th) {
                try {
                    if (!(th instanceof InvocationTargetException)) {
                        throw th;
                    }
                    if (th.getTargetException() != null) {
                        throw th.getTargetException();
                    }
                    throw th;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        Iterator<Runnable> it2 = listO.iterator();
                        while (it2.hasNext()) {
                            try {
                                it2.next().run();
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                    if (zShouldLog) {
                        if (z10) {
                            List<InterfaceC2957i> list4 = C2953e.this.f131255d;
                        } else {
                            List<InterfaceC2957i> list5 = C2953e.this.f131255d;
                        }
                        if (th != null) {
                            String str2 = C2953e.f131251g;
                            method.getDeclaringClass().getClass();
                            method.getName();
                            Arrays.toString(method.getParameterTypes());
                        } else {
                            String str3 = C2953e.f131251g;
                            method.getDeclaringClass().getClass();
                            method.getName();
                        }
                    }
                    throw th2;
                }
            }
        }

        public a() {
        }
    }

    public C2953e(T t10) {
        this(null, t10, null);
    }

    public static String j(Method method) {
        return Arrays.toString(method.getParameterTypes());
    }

    public static List<Runnable> o(List<InterfaceC2957i> list, Object[] objArr, List<Runnable> list2) {
        Iterator<InterfaceC2957i> it = list.iterator();
        while (it.hasNext()) {
            Runnable runnableA = it.next().a(objArr);
            if (runnableA != null) {
                if (list2 == null) {
                    list2 = new ArrayList<>(2);
                }
                list2.add(runnableA);
            }
        }
        return list2;
    }

    public m f(m mVar) {
        if (this.f131254c == null) {
            this.f131254c = new l();
        }
        return this.f131254c.a(mVar);
    }

    public InterfaceC2957i g(InterfaceC2957i interfaceC2957i) {
        if (interfaceC2957i == null) {
            return null;
        }
        if (this.f131255d == null) {
            this.f131255d = new LinkedList();
        }
        this.f131255d.add(interfaceC2957i);
        return interfaceC2957i;
    }

    public Object h(String str, Class<?>[] clsArr, Object... objArr) throws Throwable {
        try {
            Method declaredMethod = this.f131256e.getClass().getDeclaredMethod(str, clsArr);
            try {
                Object objInvoke = declaredMethod.invoke(this.f131256e, objArr);
                declaredMethod.getDeclaringClass().getSimpleName();
                declaredMethod.getName();
                return objInvoke;
            } catch (Throwable th) {
                try {
                    if (!(th instanceof InvocationTargetException)) {
                        throw th;
                    }
                    if (th.getTargetException() != null) {
                        throw th.getTargetException();
                    }
                    throw th;
                } catch (Throwable th2) {
                    if (th != null) {
                        declaredMethod.getDeclaringClass().getSimpleName();
                        declaredMethod.getName();
                    } else {
                        declaredMethod.getDeclaringClass().getSimpleName();
                        declaredMethod.getName();
                    }
                    throw th2;
                }
            }
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public void i(C2953e c2953e) {
        if (this.f131254c == null) {
            this.f131254c = new l();
        }
        this.f131254c.c(c2953e.k());
    }

    public Map<String, m> k() {
        HashMap map = new HashMap();
        l lVar = this.f131253b;
        if (lVar != null) {
            map.putAll(lVar.e());
        }
        l lVar2 = this.f131254c;
        if (lVar2 != null) {
            map.putAll(lVar2.e());
        }
        return map;
    }

    public T l() {
        return this.f131256e;
    }

    public <H extends m> H m(String str) {
        l lVar;
        l lVar2 = this.f131254c;
        H h10 = lVar2 != null ? (H) lVar2.f(str) : null;
        return (h10 == null && (lVar = this.f131253b) != null) ? (H) lVar.f(str) : h10;
    }

    public T n() {
        return this.f131257f;
    }

    public void p(AutoLogSetting autoLogSetting) {
        this.f131252a = autoLogSetting;
    }

    public C2953e(T t10, Class<?>... clsArr) {
        this(null, t10, clsArr);
    }

    public C2953e(l lVar, T t10) {
        this(lVar, t10, null);
    }

    public C2953e(l lVar, T t10, Class<?>... clsArr) {
        this.f131252a = AutoLogSetting.OFF;
        InterfaceC2951c interfaceC2951c = (InterfaceC2951c) getClass().getAnnotation(InterfaceC2951c.class);
        if (interfaceC2951c != null) {
            this.f131252a = interfaceC2951c.value();
        }
        this.f131253b = lVar;
        this.f131254c = null;
        this.f131256e = t10;
        if (t10 != null) {
            T t11 = (T) Proxy.newProxyInstance(t10.getClass().getClassLoader(), clsArr == null ? t8.b.b(t10.getClass()) : clsArr, new a());
            this.f131257f = t11;
            try {
                ClassCAG.f166012G.name().set(t11.getClass(), "$GaiaProxy");
            } catch (Throwable th) {
                C5705o.c().a(th, "PROXY_CHANGE_NAME", null);
            }
        }
    }
}
