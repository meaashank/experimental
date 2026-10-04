package w7;

import android.os.IInterface;
import android.util.Log;
import c7.AbstractC2950b;
import c7.m;
import java.lang.reflect.Method;
import w.y;

/* JADX INFO: renamed from: w7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5766d extends AbstractC2950b<IInterface> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f240121i = "GAIA-Cred";

    /* JADX INFO: renamed from: w7.d$a */
    public static class a extends m {
        public a() {
        }

        @Override // c7.m
        public String A() {
            return "clearCredentialState";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            final Object obj2 = (objArr == null || objArr.length <= 0) ? null : objArr[0];
            final Object objW = C5766d.w(objArr, "android.credentials.IClearCredentialStateCallback");
            final String strQ = m.q();
            final int iL = m.L();
            if (obj2 == null || objW == null) {
                return method.invoke(obj, objArr);
            }
            C5766d.x("clear", new Runnable() { // from class: w7.c
                @Override // java.lang.Runnable
                public final void run() {
                    i.h(obj2, objW, strQ, iL);
                }
            });
            return C5766d.y();
        }

        public a(h hVar) {
        }
    }

    /* JADX INFO: renamed from: w7.d$b */
    public static class b extends m {
        public b() {
        }

        @Override // c7.m
        public String A() {
            return "executeCreateCredential";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            final Object obj2 = (objArr == null || objArr.length <= 0) ? null : objArr[0];
            final Object objW = C5766d.w(objArr, "android.credentials.ICreateCredentialCallback");
            final String strQ = m.q();
            final int iL = m.L();
            if (obj2 == null || objW == null) {
                return method.invoke(obj, objArr);
            }
            C5766d.x(i.f240159x, new Runnable() { // from class: w7.e
                @Override // java.lang.Runnable
                public final void run() {
                    i.i(obj2, objW, strQ, iL);
                }
            });
            return C5766d.y();
        }

        public b(h hVar) {
        }
    }

    /* JADX INFO: renamed from: w7.d$c */
    public static class c extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f240122d;

        @Override // c7.m
        public String A() {
            return this.f240122d;
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            m.q();
            return 0;
        }

        public c(String str) {
            this.f240122d = str;
        }
    }

    /* JADX INFO: renamed from: w7.d$d, reason: collision with other inner class name */
    public static class C0901d extends m {
        public C0901d() {
        }

        @Override // c7.m
        public String A() {
            return "executeGetCredential";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            final Object obj2 = (objArr == null || objArr.length <= 0) ? null : objArr[0];
            final Object objW = C5766d.w(objArr, "android.credentials.IGetCredentialCallback");
            final String strQ = m.q();
            final int iL = m.L();
            if (obj2 == null || objW == null) {
                return method.invoke(obj, objArr);
            }
            C5766d.x(i.f240158w, new Runnable() { // from class: w7.f
                @Override // java.lang.Runnable
                public final void run() {
                    i.j(obj2, objW, strQ, iL);
                }
            });
            return C5766d.y();
        }

        public C0901d(h hVar) {
        }
    }

    /* JADX INFO: renamed from: w7.d$e */
    public static class e extends m {
        public e() {
        }

        @Override // c7.m
        public String A() {
            return "isEnabledCredentialProviderService";
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
        @Override // c7.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object c(java.lang.Object r1, java.lang.reflect.Method r2, java.lang.Object... r3) throws java.lang.Throwable {
            /*
                r0 = this;
                r1 = 0
                if (r3 == 0) goto Lf
                int r2 = r3.length
                if (r2 <= 0) goto Lf
                r2 = r3[r1]
                boolean r3 = r2 instanceof android.content.ComponentName
                if (r3 == 0) goto Lf
                android.content.ComponentName r2 = (android.content.ComponentName) r2
                goto L10
            Lf:
                r2 = 0
            L10:
                if (r2 == 0) goto L19
                boolean r2 = w7.i.p(r2)
                if (r2 == 0) goto L19
                r1 = 1
            L19:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: w7.C5766d.e.c(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }

        public e(h hVar) {
        }
    }

    /* JADX INFO: renamed from: w7.d$f */
    public static class f extends m {
        public f() {
        }

        @Override // c7.m
        public String A() {
            return "executePrepareGetCredential";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            final Object obj2 = (objArr == null || objArr.length <= 0) ? null : objArr[0];
            final Object objW = C5766d.w(objArr, "android.credentials.IPrepareGetCredentialCallback");
            final Object objW2 = C5766d.w(objArr, "android.credentials.IGetCredentialCallback");
            final String strQ = m.q();
            final int iL = m.L();
            if (obj2 == null || objW == null || objW2 == null) {
                return method.invoke(obj, objArr);
            }
            C5766d.x("prepareGet", new Runnable() { // from class: w7.g
                @Override // java.lang.Runnable
                public final void run() {
                    i.k(obj2, objW, objW2, strQ, iL);
                }
            });
            return C5766d.y();
        }

        public f(h hVar) {
        }
    }

    public C5766d(IInterface iInterface) {
        super(iInterface);
    }

    public static /* synthetic */ void s(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable th) {
            Log.getStackTraceString(th);
        }
    }

    public static Object w(Object[] objArr, String str) {
        Class<?> cls;
        if (objArr == null) {
            return null;
        }
        try {
            cls = Class.forName(str);
        } catch (Throwable unused) {
            cls = null;
        }
        String strSubstring = str.substring(str.lastIndexOf(46) + 1);
        for (Object obj : objArr) {
            if (obj != null && ((cls != null && cls.isInstance(obj)) || obj.getClass().getName().contains(strSubstring))) {
                return obj;
            }
        }
        return null;
    }

    public static void x(final String str, final Runnable runnable) {
        new Thread(new Runnable() { // from class: w7.b
            @Override // java.lang.Runnable
            public final void run() {
                C5766d.s(runnable, str);
            }
        }, y.a("gaia-cred-", str)).start();
    }

    public static Object y() {
        try {
            return Class.forName("android.os.CancellationSignal").getMethod("createTransport", null).invoke(null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new C0901d());
        f(new f());
        f(new b());
        f(new a());
        f(new e());
        f(new c("registerCredentialDescription"));
        f(new c("unregisterCredentialDescription"));
    }
}
