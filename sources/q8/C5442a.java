package q8;

import android.os.IInterface;
import c7.m;
import java.lang.reflect.Method;
import r8.C5541b;

/* JADX INFO: renamed from: q8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5442a {

    /* JADX INFO: renamed from: q8.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0865a extends m {
        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Object objInvoke = method.invoke(obj, objArr);
            return objInvoke instanceof IInterface ? u0((IInterface) objInvoke) : objInvoke;
        }

        public final Object u0(IInterface iInterface) {
            return new C5541b(iInterface).f131257f;
        }
    }

    /* JADX INFO: renamed from: q8.a$b */
    public static class b extends AbstractC0865a {
        @Override // c7.m
        public String A() {
            return "openSession";
        }
    }

    /* JADX INFO: renamed from: q8.a$c */
    public static class c extends AbstractC0865a {
        @Override // c7.m
        public String A() {
            return "overridePendingAppTransition";
        }

        @Override // q8.C5442a.AbstractC0865a, c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            if (objArr[0] instanceof String) {
                objArr[0] = m.w();
            }
            return super.c(obj, method, objArr);
        }
    }

    /* JADX INFO: renamed from: q8.a$d */
    public static class d extends m {
        @Override // c7.m
        public String A() {
            return "overridePendingAppTransitionInPlace";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            if (objArr[0] instanceof String) {
                objArr[0] = m.w();
            }
            return method.invoke(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: q8.a$e */
    public static class e extends AbstractC0865a {
        @Override // c7.m
        public String A() {
            return "setAppStartingWindow";
        }
    }
}
