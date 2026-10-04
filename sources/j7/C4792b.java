package j7;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.m;
import i7.g;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: j7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4792b extends AbstractC2950b<IInterface> {

    /* JADX INFO: renamed from: j7.b$a */
    public static class a extends g.C4585q {
        public a() {
        }

        public a(j7.c cVar) {
        }
    }

    /* JADX INFO: renamed from: j7.b$b, reason: collision with other inner class name */
    public static class C0810b extends m {
        public C0810b() {
        }

        @Override // c7.m
        public String A() {
            return "getActivityCallerPackage";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }

        public C0810b(j7.c cVar) {
        }
    }

    /* JADX INFO: renamed from: j7.b$c */
    public static class c extends m {
        public c() {
        }

        @Override // c7.m
        public String A() {
            return "getActivityCallerUid";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }

        public c(j7.c cVar) {
        }
    }

    /* JADX INFO: renamed from: j7.b$d */
    public static class d extends g.C4590v {
        public d() {
        }

        public d(j7.c cVar) {
        }
    }

    /* JADX INFO: renamed from: j7.b$e */
    public static class e extends g.C4591w {
        public e() {
        }

        public e(j7.c cVar) {
        }
    }

    /* JADX INFO: renamed from: j7.b$f */
    public static class f extends e {
        public f() {
        }

        @Override // i7.g.C4591w, c7.m
        public String A() {
            return "getLaunchedFromPackage";
        }

        public f(j7.c cVar) {
        }
    }

    public C4792b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new e());
        f(new d());
        f(new f());
        f(new C0810b());
        f(new c());
        f(new a());
    }
}
