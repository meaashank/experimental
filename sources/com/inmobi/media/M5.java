package com.inmobi.media;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import com.inmobi.commons.core.configs.CrashConfig;
import com.inmobi.media.M5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class M5 implements InterfaceC3808y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CrashConfig f152223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public N3 f152224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3539f5 f152225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L5 f152226d;

    public M5(CrashConfig crashConfig) {
        kotlin.jvm.internal.G.p(crashConfig, "crashConfig");
        this.f152223a = crashConfig;
        this.f152225c = new C3539f5(crashConfig);
        this.f152226d = new L5(this);
        Cc.f151826a.execute(new Runnable() { // from class: F5.X
            @Override // java.lang.Runnable
            public final void run() {
                M5.a(this.f34414a);
            }
        });
    }

    public static final void a(M5 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.f152224b = new N3(AbstractC3531eb.c(), this$0, this$0.f152223a.getEventConfig(), null);
    }

    public static final void c(M5 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.b();
    }

    public final void b(C3525e5 incident) {
        kotlin.jvm.internal.G.p(incident, "incident");
        CrashConfig.ANRConfig aNRConfig = this.f152223a.getANRConfig();
        if (Cc.a(incident)) {
            if ((incident instanceof P0) && C3635m3.f153124a.E() && aNRConfig.getAppExitReason().getUseForReporting() && this.f152225c.f152913d.a()) {
                incident.f151967a = "ANREvent";
                a(incident);
            } else if ((incident instanceof ed) && aNRConfig.getWatchdog().getUseForReporting() && this.f152225c.f152912c.a()) {
                a(incident);
            } else {
                if (!(incident instanceof R2)) {
                    return;
                }
                if (this.f152223a.getCrashConfig().getEnabled() && this.f152225c.f152910a.a()) {
                    a(incident);
                }
            }
            Cc.f151826a.execute(new Runnable() { // from class: F5.W
                @Override // java.lang.Runnable
                public final void run() {
                    M5.c(this.f34409a);
                }
            });
        }
    }

    public final void c() {
        Cc.f151826a.execute(new Runnable() { // from class: F5.Y
            @Override // java.lang.Runnable
            public final void run() {
                M5.b(this.f34422a);
            }
        });
    }

    public final void a(C3525e5 c3525e5) {
        C3483b5 c3483b5C = AbstractC3531eb.c();
        long eventTTL = this.f152223a.getEventTTL();
        c3483b5C.getClass();
        c3483b5C.a("ts<?", new String[]{String.valueOf(System.currentTimeMillis() - (eventTTL * ((long) 1000)))});
        C3483b5 c3483b5C2 = AbstractC3531eb.c();
        c3483b5C2.getClass();
        int iA = (F1.a((F1) c3483b5C2) + 1) - this.f152223a.getMaxEventsToPersist();
        if (iA > 0) {
            AbstractC3531eb.c().a(iA);
        }
        AbstractC3531eb.c().a(c3525e5);
    }

    public final void a(final R1 incident) {
        kotlin.jvm.internal.G.p(incident, "incident");
        if (this.f152223a.getCatchConfig().getEnabled() && this.f152225c.f152911b.a()) {
            Cc.f151826a.execute(new Runnable() { // from class: F5.V
                @Override // java.lang.Runnable
                public final void run() {
                    M5.a(this.f34405a, incident);
                }
            });
        }
    }

    public static final void a(M5 this$0, R1 incident) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(incident, "$incident");
        this$0.a((C3525e5) incident);
        this$0.b();
    }

    @Override // com.inmobi.media.InterfaceC3808y9
    public final M3 a() {
        int iA;
        String string;
        int iP = C3635m3.f153124a.p();
        int i10 = 1;
        if (iP == 0 || iP != 1) {
            iA = this.f152223a.getMobileConfig().a();
        } else {
            iA = this.f152223a.getWifiConfig().a();
        }
        ArrayList arrayListB = AbstractC3531eb.c().b(iA);
        if (!arrayListB.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int size = arrayListB.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListB.get(i11);
                i11++;
                arrayList.add(Integer.valueOf(((C3525e5) obj).f151969c));
            }
            try {
                HashMap map = new HashMap(C3635m3.f153124a.a(false));
                map.put("im-accid", C3657nb.b());
                map.put("version", HsdpDeepLinkService.SDK_VERSION);
                map.put("component", AppMeasurement.CRASH_ORIGIN);
                map.put("mk-version", C3671ob.a());
                map.putAll(Q0.f152384e);
                JSONObject jSONObject = new JSONObject(map);
                JSONArray jSONArray = new JSONArray();
                int size2 = arrayListB.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayListB.get(i12);
                    i12++;
                    C3525e5 c3525e5 = (C3525e5) obj2;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("eventId", c3525e5.f152842e);
                    jSONObject2.put("eventType", c3525e5.f151967a);
                    String strA = c3525e5.a();
                    int length = strA.length() - i10;
                    int i13 = 0;
                    boolean z10 = false;
                    while (i13 <= length) {
                        boolean z11 = kotlin.jvm.internal.G.t(strA.charAt(!z10 ? i13 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i13++;
                        } else {
                            z10 = true;
                        }
                    }
                    if (strA.subSequence(i13, length + 1).toString().length() > 0) {
                        jSONObject2.put("crash_report", c3525e5.a());
                    }
                    jSONObject2.put(CampaignEx.JSON_KEY_ST_TS, c3525e5.f151968b);
                    jSONArray.put(jSONObject2);
                    i10 = 1;
                }
                jSONObject.put(AppMeasurement.CRASH_ORIGIN, jSONArray);
                string = jSONObject.toString();
            } catch (JSONException unused) {
                string = null;
            }
            if (string != null) {
                return new M3(arrayList, string);
            }
        }
        return null;
    }

    public static final void b(M5 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        C3483b5 c3483b5C = AbstractC3531eb.c();
        c3483b5C.getClass();
        if (F1.a((F1) c3483b5C) > 0) {
            this$0.b();
        }
    }

    public final void b() {
        kotlin.L0 l02;
        K3 eventConfig = this.f152223a.getEventConfig();
        eventConfig.f152163k = this.f152223a.getUrl();
        N3 n32 = this.f152224b;
        if (n32 != null) {
            n32.f152286i = eventConfig;
            l02 = kotlin.L0.f217464a;
        } else {
            l02 = null;
        }
        if (l02 == null) {
            this.f152224b = new N3(AbstractC3531eb.c(), this, eventConfig, null);
        }
        N3 n33 = this.f152224b;
        if (n33 != null) {
            K3 k32 = n33.f152286i;
            if (n33.f152283f.get() || k32 == null) {
                return;
            }
            n33.a(k32.f152155c, false);
        }
    }
}
