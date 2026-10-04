package J6;

import android.content.Context;
import android.view.ViewGroup;
import com.prism.fusionadsdk.LjAdRequest;
import com.prism.fusionadsdk.internal.config.AdPlaceConfig;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f53185b = 3000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f53186c = "a";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f53187d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, C0061a> f53188a = new HashMap<>();

    /* JADX INFO: renamed from: J6.a$a, reason: collision with other inner class name */
    public static class C0061a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f53189a = System.currentTimeMillis() + a.f53185b;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f53190b;

        public C0061a(Object obj) {
            this.f53190b = obj;
        }
    }

    public static void a(LjAdRequest ljAdRequest, boolean z10) {
        AdPlaceConfig adPlaceConfig;
        if (ljAdRequest == null || !z10 || (adPlaceConfig = ljAdRequest.f162251a) == null || adPlaceConfig.sitesName == null || !f().d(ljAdRequest.f162251a.sitesName)) {
            return;
        }
        f().g(ljAdRequest.f162251a.sitesName);
    }

    public static void c(LjAdRequest ljAdRequest, boolean z10, Object obj) {
        AdPlaceConfig adPlaceConfig;
        if (ljAdRequest == null || !z10 || (adPlaceConfig = ljAdRequest.f162251a) == null || adPlaceConfig.sitesName == null) {
            return;
        }
        f().b(ljAdRequest.f162251a.sitesName, obj);
    }

    public static a f() {
        if (f53187d == null) {
            synchronized (a.class) {
                try {
                    if (f53187d == null) {
                        f53187d = new a();
                    }
                } finally {
                }
            }
        }
        return f53187d;
    }

    public void b(String str, Object obj) {
        this.f53188a.put(str, new C0061a(obj));
    }

    public boolean d(String str) {
        return this.f53188a.containsKey(str) && this.f53188a.get(str).f53189a > System.currentTimeMillis();
    }

    public Object e(String str) {
        C0061a c0061a = this.f53188a.get(str);
        if (c0061a == null || System.currentTimeMillis() >= c0061a.f53189a) {
            return null;
        }
        return c0061a.f53190b;
    }

    public void g(String str) {
        this.f53188a.remove(str);
    }

    public void h(String str, Context context, ViewGroup viewGroup) {
        Object objE = f().e(str);
        if (f.j(str) && objE != null) {
            ((c) objE).c(context, viewGroup);
        }
    }

    public void i(String str, Context context, ViewGroup viewGroup, T6.a aVar) {
        if (!f.j(str)) {
            if (aVar != null) {
                aVar.c(com.prism.fusionadsdkbase.a.f162371h);
                return;
            }
            return;
        }
        Object objE = f().e(str);
        if (objE != null) {
            c cVar = (c) objE;
            cVar.e(aVar);
            cVar.c(context, viewGroup);
        } else if (aVar != null) {
            aVar.c(com.prism.fusionadsdkbase.a.f162369f);
        }
    }
}
