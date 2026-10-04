package com.prism.fusionadsdk;

import J6.f;
import K6.g;
import O6.d;
import R6.e;
import V5.c;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.prism.fusionadsdk.internal.config.AdPlaceConfig;
import com.prism.fusionadsdk.internal.config.AdPlaceItems;
import com.prism.fusionadsdkbase.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import w.y;

/* JADX INFO: loaded from: classes6.dex */
public class LjAdLoader {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f162230h = "CUSTOM_FILL_";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f162231i = "ad_network";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f162232j = "pkg";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f162233k = "placement_name";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f162234l = "scene_id";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f162235m = "variant_id";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T6.a f162238a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f162240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LjAdRequest f162241d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f162243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f162229g = com.prism.fusionadsdkbase.a.f162373j.concat(LjAdLoader.class.getSimpleName());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f162236n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ConcurrentHashMap<String, LjAdLoader> f162237o = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f162239b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f162242e = false;

    public static class Builder {
        private boolean cache = false;
        private T6.a listener;
        private String reportPrefix;

        public LjAdLoader build() {
            LjAdLoader ljAdLoader = new LjAdLoader();
            ljAdLoader.f162238a = this.listener;
            ljAdLoader.f162239b = this.cache;
            ljAdLoader.f162240c = this.reportPrefix;
            return ljAdLoader;
        }

        public Builder withAdListener(T6.a aVar) {
            this.listener = aVar;
            return this;
        }

        public Builder withCache(boolean z10) {
            this.cache = z10;
            return this;
        }

        public Builder withReportPrefix(String str) {
            this.reportPrefix = str;
            return this;
        }
    }

    public class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f162244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LjAdRequest f162245b;

        public a(Context context, LjAdRequest ljAdRequest) {
            this.f162244a = context;
            this.f162245b = ljAdRequest;
        }

        @Override // com.prism.fusionadsdkbase.h
        public void a(int i10, String str) {
            LjAdLoader.this.v(this.f162244a, this.f162245b);
        }
    }

    public class b extends TypeToken<AdPlaceConfig> {
        public b() {
        }
    }

    public static void D(V5.c cVar, String str, String str2) {
        if (cVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        cVar.c(str, str2);
    }

    public static String p(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }

    public void A(String str) {
        T6.a aVar = this.f162238a;
        if (aVar != null) {
            aVar.e();
        }
        new StringBuilder("onAdLeftApplication, who=").append(str);
    }

    public void B(Context context, String str) {
        AdPlaceConfig adPlaceConfig;
        T6.a aVar = this.f162238a;
        if (aVar != null) {
            aVar.g();
        }
        LjAdRequest ljAdRequest = this.f162241d;
        if (ljAdRequest != null && (adPlaceConfig = ljAdRequest.f162251a) != null) {
            com.prism.fusionadsdk.internal.history.c.i(context, adPlaceConfig.sitesName, 1);
        }
        J6.a.a(this.f162241d, this.f162239b);
        F(context, "AD_OPENED", str);
        t();
        new StringBuilder("onAdOpened, who=").append(str);
    }

    public final synchronized void C(String str) {
        if (str != null) {
            f162237o.remove(str, this);
        }
    }

    public final synchronized void E(Context context) {
        LjAdRequest ljAdRequest;
        AdPlaceConfig adPlaceConfig;
        if (this.f162242e && (ljAdRequest = this.f162241d) != null && (adPlaceConfig = ljAdRequest.f162251a) != null) {
            N6.a.i(context, adPlaceConfig.sitesName);
            this.f162242e = false;
        }
    }

    public final void F(Context context, String str, String str2) {
        c.a aVarN = f.n();
        if (aVarN == null || context == null) {
            return;
        }
        String strA = !TextUtils.isEmpty(this.f162240c) ? String.format("ads_%s_%s", this.f162240c, str) : y.a("ads_", str);
        if (str2 == null) {
            aVarN.a(context, strA).b();
        } else {
            aVarN.a(context, strA).c(f162231i, str2).b();
        }
    }

    public void G(Context context, String str, g gVar) {
        H(context, str, gVar, null);
    }

    public void H(Context context, String str, g gVar, String str2) {
        AdPlaceConfig adPlaceConfig;
        c.a aVarN = f.n();
        if (aVarN == null || context == null || TextUtils.isEmpty(str)) {
            return;
        }
        V5.c cVarC = aVarN.a(context, l(str)).c(f162231i, g.f58419h);
        LjAdRequest ljAdRequest = this.f162241d;
        if (ljAdRequest != null && (adPlaceConfig = ljAdRequest.f162251a) != null && !TextUtils.isEmpty(adPlaceConfig.sitesName)) {
            cVarC.c(f162233k, this.f162241d.f162251a.sitesName);
        }
        if (gVar != null) {
            D(cVarC, "pkg", p(str2, gVar.h()));
        } else {
            D(cVarC, "pkg", str2);
        }
        cVarC.b();
    }

    public final synchronized boolean I(Context context, AdPlaceConfig adPlaceConfig) {
        this.f162242e = false;
        if (adPlaceConfig != null && N6.a.f(adPlaceConfig.fillControl)) {
            boolean zK = N6.a.k(context, adPlaceConfig.sitesName, adPlaceConfig.fillControl);
            if (zK) {
                this.f162242e = true;
            }
            return zK;
        }
        return true;
    }

    public final boolean J(Context context) {
        J6.c cVarI;
        AdPlaceConfig adPlaceConfig;
        LjAdRequest ljAdRequest = this.f162241d;
        if ((ljAdRequest != null && ljAdRequest.f162252b) || (cVarI = M6.a.i(context, this)) == null) {
            return false;
        }
        w(context);
        J6.a.c(this.f162241d, this.f162239b, cVarI);
        T6.a aVar = this.f162238a;
        if (aVar != null) {
            aVar.f(cVarI);
        }
        LjAdRequest ljAdRequest2 = this.f162241d;
        if (ljAdRequest2 != null && (adPlaceConfig = ljAdRequest2.f162251a) != null) {
            C(adPlaceConfig.sitesName);
        }
        F(context, "AD_LOADED", g.f58419h);
        G(context, "FILLED", (g) cVarI);
        return true;
    }

    public void K(T6.a aVar) {
        this.f162238a = aVar;
        c cVar = this.f162243f;
        if (cVar != null) {
            cVar.f162248a = aVar;
        }
    }

    public final String l(String str) {
        return !TextUtils.isEmpty(this.f162240c) ? String.format("ads_%s_%s", f162230h, str) : y.a("ads_CUSTOM_FILL_", str);
    }

    public final void m(String str) {
        T6.a aVar;
        LjAdLoader ljAdLoaderPut = f162237o.put(str, this);
        if (ljAdLoaderPut == null || ljAdLoaderPut == this || (aVar = ljAdLoaderPut.f162238a) == null) {
            return;
        }
        aVar.c(com.prism.fusionadsdkbase.a.f162370g);
    }

    public final boolean n(Context context) {
        if (!f.u()) {
            f.t(context);
        }
        return true;
    }

    public void o(AdPlaceConfig adPlaceConfig, Context context) {
        AdPlaceConfig adPlaceConfig2;
        new Gson().toJson(adPlaceConfig, new b().getType());
        Q6.c cVarD = P6.b.c().d(adPlaceConfig);
        if (!cVarD.a(context, f162236n)) {
            T6.a aVar = this.f162238a;
            if (aVar != null) {
                aVar.c(com.prism.fusionadsdkbase.a.f162365b);
            }
            C(adPlaceConfig.sitesName);
            return;
        }
        this.f162243f = new c(context, this.f162238a, this);
        com.prism.fusionadsdk.internal.history.c.h(context, this.f162241d.f162251a.sitesName, 1);
        if (I(context, adPlaceConfig)) {
            ArrayList<AdPlaceItems> arrayList = adPlaceConfig.adid == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(adPlaceConfig.adid));
            if (arrayList.isEmpty()) {
                this.f162243f.onAdFailedToLoad(this.f162241d.f162252b ? com.prism.fusionadsdkbase.a.f162364a : com.prism.fusionadsdkbase.a.f162366c);
                return;
            } else {
                r(cVarD, arrayList, context, this.f162243f).run();
                return;
            }
        }
        T6.a aVar2 = this.f162238a;
        if (aVar2 != null) {
            aVar2.c(com.prism.fusionadsdkbase.a.f162372i);
        }
        LjAdRequest ljAdRequest = this.f162241d;
        if (ljAdRequest == null || (adPlaceConfig2 = ljAdRequest.f162251a) == null) {
            return;
        }
        C(adPlaceConfig2.sitesName);
    }

    public T6.a q() {
        return this.f162238a;
    }

    public Runnable r(Q6.c cVar, ArrayList<AdPlaceItems> arrayList, Context context, O6.c cVar2) {
        LjAdRequest ljAdRequest;
        return (!(cVar instanceof e) || ((ljAdRequest = this.f162241d) != null && ljAdRequest.f162252b)) ? new O6.b(arrayList, context, cVar2) : new d(arrayList, context, cVar2);
    }

    public LjAdRequest s() {
        return this.f162241d;
    }

    public void t() {
        f162236n++;
    }

    public void u(Context context, LjAdRequest ljAdRequest) {
        f.l((Activity) context, new a(context, ljAdRequest));
    }

    public void v(Context context, LjAdRequest ljAdRequest) {
        T6.a aVar;
        try {
            if (f.m() != null && !f.f53207g.b(ljAdRequest)) {
                T6.a aVar2 = this.f162238a;
                if (aVar2 != null) {
                    aVar2.c(9);
                    return;
                }
                return;
            }
            if (ljAdRequest.f162251a == null) {
                T6.a aVar3 = this.f162238a;
                if (aVar3 != null) {
                    aVar3.c(com.prism.fusionadsdkbase.a.f162371h);
                    return;
                }
                return;
            }
            this.f162241d = ljAdRequest;
            n(context);
            m(ljAdRequest.f162251a.sitesName);
            if (!this.f162239b || !J6.a.f().d(ljAdRequest.f162251a.sitesName)) {
                o(ljAdRequest.f162251a, context);
                return;
            }
            J6.c cVar = (J6.c) J6.a.f().e(ljAdRequest.f162251a.sitesName);
            T6.a aVar4 = this.f162238a;
            if (aVar4 != null) {
                aVar4.f(cVar);
            }
            C(ljAdRequest.f162251a.sitesName);
            new StringBuilder("use cached Ad: ").append(ljAdRequest.toString());
        } catch (Exception e10) {
            e10.getMessage();
            if (ljAdRequest == null || (aVar = this.f162238a) == null) {
                return;
            }
            aVar.c(com.prism.fusionadsdkbase.a.f162367d);
        }
    }

    public final synchronized void w(Context context) {
        LjAdRequest ljAdRequest;
        AdPlaceConfig adPlaceConfig;
        if (this.f162242e && (ljAdRequest = this.f162241d) != null && (adPlaceConfig = ljAdRequest.f162251a) != null) {
            N6.a.g(context, adPlaceConfig.sitesName);
            this.f162242e = false;
        }
    }

    public void x(Context context, String str) {
        T6.a aVar = this.f162238a;
        if (aVar != null) {
            aVar.a();
        }
        F(context, "AD_CLICKED", str);
        new StringBuilder("onAdClicked, who=").append(str);
    }

    public void y(String str) {
        T6.a aVar = this.f162238a;
        if (aVar != null) {
            aVar.b();
        }
        new StringBuilder("onAdClosed, who=").append(str);
    }

    public void z(Context context, String str) {
        T6.a aVar = this.f162238a;
        if (aVar != null) {
            aVar.d();
        }
        J6.a.a(this.f162241d, this.f162239b);
        F(context, "AD_IMPRESSION", str);
        new StringBuilder("onAdImpression, who=").append(str);
    }

    public static class c implements O6.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T6.a f162248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LjAdLoader f162249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Context f162250c;

        public c(Context context, T6.a aVar, LjAdLoader ljAdLoader) {
            this.f162248a = aVar;
            this.f162249b = ljAdLoader;
            this.f162250c = context;
        }

        @Override // O6.c
        public void a(String str) {
            this.f162249b.B(this.f162250c, str);
        }

        @Override // O6.c
        public void b(String str) {
            this.f162249b.y(str);
        }

        @Override // O6.c
        public void c(String str) {
            this.f162249b.x(this.f162250c, str);
        }

        @Override // O6.c
        public void d(String str) {
            this.f162249b.z(this.f162250c, str);
        }

        @Override // O6.c
        public void e(String str, Object obj, AdPlaceItems adPlaceItems) {
            AdPlaceConfig adPlaceConfig;
            J6.c bVar = adPlaceItems.isBanner() ? new K6.a() : adPlaceItems.isNative() ? new K6.c() : adPlaceItems.isNativeFakeInterstitial() ? new K6.e() : (adPlaceItems.isOriginalInterstitialAd() || adPlaceItems.isNativeInterstitial()) ? new K6.b() : adPlaceItems.isRewardedInterstitial() ? new K6.d() : null;
            if (bVar == null) {
                ((com.prism.fusionadsdkbase.e) obj).destroy();
                onAdFailedToLoad(com.prism.fusionadsdkbase.a.f162364a);
                return;
            }
            LjAdLoader ljAdLoader = this.f162249b;
            bVar.f53199b = ljAdLoader;
            bVar.f53198a = (com.prism.fusionadsdkbase.e) obj;
            ljAdLoader.w(this.f162250c);
            LjAdLoader ljAdLoader2 = this.f162249b;
            J6.a.c(ljAdLoader2.f162241d, ljAdLoader2.f162239b, bVar);
            T6.a aVar = this.f162248a;
            if (aVar != null) {
                aVar.f(bVar);
            } else {
                LjAdRequest ljAdRequest = this.f162249b.f162241d;
                if (ljAdRequest != null && ljAdRequest.f162252b) {
                    bVar.a();
                }
            }
            LjAdLoader ljAdLoader3 = this.f162249b;
            LjAdRequest ljAdRequest2 = ljAdLoader3.f162241d;
            if (ljAdRequest2 != null && (adPlaceConfig = ljAdRequest2.f162251a) != null) {
                ljAdLoader3.C(adPlaceConfig.sitesName);
            }
            this.f162249b.F(this.f162250c, "AD_LOADED", str);
            String str2 = LjAdLoader.f162229g;
        }

        @Override // O6.c
        public void f(String str) {
            this.f162249b.A(str);
        }

        @Override // O6.c
        public void onAdFailedToLoad(int i10) {
            AdPlaceConfig adPlaceConfig;
            if (this.f162249b.J(this.f162250c)) {
                return;
            }
            this.f162249b.E(this.f162250c);
            T6.a aVar = this.f162248a;
            if (aVar != null) {
                aVar.c(i10);
            }
            LjAdLoader ljAdLoader = this.f162249b;
            LjAdRequest ljAdRequest = ljAdLoader.f162241d;
            if (ljAdRequest != null && (adPlaceConfig = ljAdRequest.f162251a) != null) {
                ljAdLoader.C(adPlaceConfig.sitesName);
            }
            String str = LjAdLoader.f162229g;
            new StringBuilder("onAdFailedToLoad, code=").append(i10);
        }

        public c() {
        }
    }
}
