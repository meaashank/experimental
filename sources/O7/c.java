package O7;

import c7.C;
import c7.G;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.metadata.android.location.LocationRequestCAG;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    public static class a extends G {
        public a() {
            super("addGnssBatchingCallback");
        }
    }

    public static class b extends G {
        public b() {
            super("addGnssMeasurementsListener");
        }
    }

    /* JADX INFO: renamed from: O7.c$c, reason: collision with other inner class name */
    public static class C0086c extends G {
        public C0086c() {
            super("addGnssNavigationMessageListener");
        }
    }

    public static class d extends G {
        public d() {
            super("addGpsMeasurementsListener");
        }
    }

    public static class e extends G {
        public e() {
            super("addGpsNavigationMessageListener");
        }
    }

    public static class f extends G {
        public f() {
            super("addGpsStatusListener");
        }
    }

    public static class g extends G {
        public g() {
            super("flushGnssBatch");
        }
    }

    public static class h extends c7.m {
        @Override // c7.m
        public String A() {
            return "getBestProvider";
        }
    }

    public static class i extends G {
        public i() {
            super("getGnssBatchSize");
        }
    }

    public static class j extends G {
        public j() {
            super("getGnssCapabilities");
        }
    }

    public static class k extends l {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f65213f = "asdf-".concat(k.class.getSimpleName());

        @Override // c7.n, c7.m
        public String A() {
            return "getLastKnownLocation";
        }

        @Override // O7.c.l, c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return super.c(obj, method, objArr);
        }
    }

    public static class l extends G {
        public l() {
            super("getLastLocation");
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Object obj2 = objArr[0];
            if (!(obj2 instanceof String)) {
                c.b(obj2);
            }
            return method.invoke(obj, objArr);
        }
    }

    public static class m extends c7.m {
        @Override // c7.m
        public String A() {
            return "getProviderProperties";
        }
    }

    public static class n extends G {
        public n() {
            super("injectGnssMeasurementCorrections");
        }
    }

    public static class o extends C {
        public o() {
            super("registerGnssStatusCallback");
        }
    }

    public static class p extends c7.m {
        @Override // c7.m
        public String A() {
            return "registerLocationListener";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            if (C3841e.z()) {
                t8.b.g(objArr, 2);
            }
            return method.invoke(obj, objArr);
        }
    }

    public static class q extends G {
        public q() {
            super("removeUpdates");
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    public static class r extends c7.m {
        @Override // c7.m
        public String A() {
            return "requestLocationUpdates";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c.b(objArr[0]);
            if (C3841e.x()) {
                t8.b.e(objArr);
            } else {
                t8.b.f(objArr);
            }
            return method.invoke(obj, objArr);
        }
    }

    public static class s extends G {
        public s() {
            super("startGnssBatch");
        }
    }

    public static class t extends c7.m {
        @Override // c7.m
        public String A() {
            return "getAllProviders";
        }
    }

    public static class u extends c7.m {
        @Override // c7.m
        public String A() {
            return "getProviders";
        }
    }

    public static class v extends c7.m {
        @Override // c7.m
        public String A() {
            return "locationCallbackFinished";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    public static class w extends c7.m {
        @Override // c7.m
        public String A() {
            return "sendExtraCommand";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    public static void b(Object obj) {
        if (obj != null) {
            if (LocationRequestCAG.f165825C.mHideFromAppOps() != null) {
                LocationRequestCAG.f165825C.mHideFromAppOps().set(obj, false);
            }
            if (LocationRequestCAG.f165825C.mWorkSource() != null) {
                LocationRequestCAG.f165825C.mWorkSource().set(obj, null);
            }
        }
    }
}
