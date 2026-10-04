package J6;

import V5.c;
import android.app.Activity;
import android.content.Context;
import com.google.gson.Gson;
import com.prism.commons.utils.C3857v;
import com.prism.fusionadsdk.LjAdRequest;
import com.prism.fusionadsdk.internal.config.AdConfigManager;
import com.prism.fusionadsdk.internal.config.AdNetworkInitializerConfig;
import com.prism.fusionadsdkbase.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HashMap<String, Class> f53201a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HashMap<String, Class> f53202b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HashMap<String, Class> f53203c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HashMap<String, Class> f53204d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HashMap<String, Class> f53205e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static HashMap<String, Class> f53206f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static d f53207g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static ArrayList<com.prism.fusionadsdkbase.f> f53208h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f53209i = com.prism.fusionadsdkbase.a.f162373j.concat(f.class.getSimpleName());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static List<com.prism.fusionadsdkbase.f> f53210j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f53211k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile boolean f53212l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile boolean f53213m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile boolean f53214n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Executor f53215o = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static c.a f53216p;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f53217a;

        public a(Context context) {
            this.f53217a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.k();
                AdConfigManager.instance().init(this.f53217a);
                M6.b.T(this.f53217a);
                final AdNetworkInitializerConfig[] adnetworkInitializer = AdConfigManager.instance().getAdnetworkInitializer();
                if (adnetworkInitializer == null) {
                    String str = f.f53209i;
                    synchronized (f.f53211k) {
                        f.f53213m = false;
                    }
                    return;
                }
                String str2 = f.f53209i;
                C3857v.a(new C3857v.b() { // from class: J6.e
                    @Override // com.prism.commons.utils.C3857v.b
                    public final Object a() {
                        return new Gson().toJson(adnetworkInitializer);
                    }
                });
                for (AdNetworkInitializerConfig adNetworkInitializerConfig : adnetworkInitializer) {
                    try {
                        Class<?> cls = Class.forName(adNetworkInitializerConfig.initializer);
                        com.prism.fusionadsdkbase.f fVar = (com.prism.fusionadsdkbase.f) cls.getConstructor(null).newInstance(null);
                        fVar.init(this.f53217a, adNetworkInitializerConfig.params);
                        f.f53208h.add(fVar);
                        f.h(cls);
                    } catch (Throwable th) {
                        String str3 = f.f53209i;
                        th.getMessage();
                    }
                }
                f.f53210j = Collections.unmodifiableList(new ArrayList(f.f53208h));
                Object obj = f.f53211k;
                synchronized (obj) {
                    f.f53212l = true;
                }
                synchronized (obj) {
                    f.f53213m = false;
                }
            } catch (Throwable th2) {
                synchronized (f.f53211k) {
                    f.f53213m = false;
                    throw th2;
                }
            }
        }
    }

    public static void h(Class cls) {
        S6.a aVar = (S6.a) cls.getAnnotation(S6.a.class);
        if (aVar != null) {
            String strName = aVar.name();
            for (Class<?> cls2 : aVar.interstitials()) {
                f53201a.put(strName, cls2);
                StringBuilder sb2 = new StringBuilder("");
                sb2.append(strName);
                sb2.append(", add initializer:");
                sb2.append(cls2.toString());
            }
            for (Class<?> cls3 : aVar.natives()) {
                f53202b.put(strName, cls3);
            }
            for (Class<?> cls4 : aVar.banners()) {
                f53203c.put(strName, cls4);
            }
            for (Class<?> cls5 : aVar.nativeFakeInterstitials()) {
                f53204d.put(strName, cls5);
            }
            for (Class<?> cls6 : aVar.nativeIntersititials()) {
                f53205e.put(strName, cls6);
            }
            for (Class<?> cls7 : aVar.rewardedIntersititials()) {
                f53206f.put(strName, cls7);
            }
        }
    }

    public static boolean i(LjAdRequest ljAdRequest) {
        d dVar = f53207g;
        if (dVar != null) {
            return dVar.b(ljAdRequest);
        }
        return true;
    }

    public static boolean j(String str) {
        d dVar = f53207g;
        if (dVar != null) {
            return dVar.a(str);
        }
        return true;
    }

    public static void k() {
        f53208h.clear();
        f53201a.clear();
        f53202b.clear();
        f53203c.clear();
        f53204d.clear();
        f53205e.clear();
        f53206f.clear();
        f53210j = null;
        f53214n = false;
    }

    public static void l(Activity activity, h hVar) {
        List<com.prism.fusionadsdkbase.f> list;
        if (!f53214n && (list = f53210j) != null) {
            Iterator<com.prism.fusionadsdkbase.f> it = list.iterator();
            while (it.hasNext()) {
                it.next().gatherConsent(activity, new b());
            }
            f53214n = true;
        }
        if (hVar != null) {
            hVar.a(0, "ok");
        }
    }

    public static d m() {
        return f53207g;
    }

    public static c.a n() {
        return f53216p;
    }

    public static Class o(String str) {
        return f53201a.get(str);
    }

    public static Class p(String str) {
        return f53204d.get(str);
    }

    public static Class q(String str) {
        return f53205e.get(str);
    }

    public static Class r(String str) {
        return f53202b.get(str);
    }

    public static Class s(String str) {
        return f53206f.get(str);
    }

    public static boolean t(Context context) {
        synchronized (f53211k) {
            if (!f53212l && !f53213m) {
                f53213m = true;
                f53215o.execute(new a(context));
                return true;
            }
            StringBuilder sb2 = new StringBuilder("skip init, initialed=");
            sb2.append(f53212l);
            sb2.append(", initializing=");
            sb2.append(f53213m);
            return true;
        }
    }

    public static boolean u() {
        return f53212l;
    }

    public static void v(Activity activity) {
        ArrayList<com.prism.fusionadsdkbase.f> arrayList = f53208h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            com.prism.fusionadsdkbase.f fVar = arrayList.get(i10);
            i10++;
            fVar.requestPermissionIfNecessary(activity);
        }
    }

    public static void w(d dVar) {
        f53207g = dVar;
    }

    public static void x(c.a aVar) {
        f53216p = aVar;
    }

    public class b implements h {
        @Override // com.prism.fusionadsdkbase.h
        public void a(int i10, String str) {
        }
    }
}
