package W7;

import c7.m;
import java.lang.reflect.Method;
import v8.C5707q;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: W7.a$a, reason: collision with other inner class name */
    public static class C0135a extends m {
        @Override // c7.m
        public String A() {
            return "getDeviceId";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5707q.c().f();
        }
    }

    public static class b extends C0135a {
        @Override // W7.a.C0135a, c7.m
        public String A() {
            return "getDeviceIdForPhone";
        }
    }

    public static class c extends m {
        @Override // c7.m
        public String A() {
            return "getDeviceIdForSubscriber";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5707q.c().f();
        }
    }

    public static class d extends C0135a {
        @Override // W7.a.C0135a, c7.m
        public String A() {
            return "getDeviceIdWithFeature";
        }
    }

    public static class e extends m {
        @Override // c7.m
        public String A() {
            return "getIccSerialNumber";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5707q.c().g();
        }
    }

    public static class f extends m {
        @Override // c7.m
        public String A() {
            return "getIccSerialNumberForSubscriber";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5707q.c().g();
        }
    }

    public static class g extends e {
        @Override // W7.a.e, c7.m
        public String A() {
            return "getIccSerialNumberWithFeature";
        }
    }

    public static class h extends m {
        @Override // c7.m
        public String A() {
            return "getImeiForSubscriber";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5707q.c().h();
        }
    }

    public static class i extends m {
        @Override // c7.m
        public String A() {
            return "getSubscriberId";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5707q.c().i();
        }
    }

    public static class j extends m {
        @Override // c7.m
        public String A() {
            return "getSubscriberIdForSubscriber";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5707q.c().i();
        }
    }

    public static class k extends i {
        @Override // W7.a.i, c7.m
        public String A() {
            return "getSubscriberIdWithFeature";
        }
    }
}
