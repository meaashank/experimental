package i8;

import c7.C;
import c7.m;
import java.lang.reflect.Method;
import v8.C5707q;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    public static class a extends m {
        @Override // c7.m
        public String A() {
            return "getDeviceId";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5707q.c().f();
        }
    }

    public static class b extends a {
        @Override // i8.c.a, c7.m
        public String A() {
            return "getDeviceIdForSubscriber";
        }
    }

    /* JADX INFO: renamed from: i8.c$c, reason: collision with other inner class name */
    public static class C0755c extends m {
        @Override // c7.m
        public String A() {
            return "getImeiForSlot";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5707q.c().h();
        }
    }

    public static class d extends g {
        @Override // c7.m
        public String A() {
            return "getLine1AlphaTagForDisplay";
        }
    }

    public static class e extends g {
        @Override // c7.m
        public String A() {
            return "getLine1NumberForDisplay";
        }
    }

    public static class f extends m {
        @Override // c7.m
        public String A() {
            return "getMeidForSlot";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5707q.c().j();
        }
    }

    public static abstract class g extends m {
        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return null;
        }
    }

    public static class h extends C {
        public h() {
            super("getAllCellInfoUsingSubId");
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    public static class i extends m {
        @Override // c7.m
        public String A() {
            return "getDeviceIdWithFeature";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5707q.c().f();
        }
    }
}
