package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.foundation.tools.c;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile a f154425h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f154426a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f154427b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f154428c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f154429d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f154430e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f154431f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicBoolean f154432g = new AtomicBoolean(false);

    private a() {
    }

    public static a b() {
        if (f154425h == null) {
            synchronized (a.class) {
                try {
                    if (f154425h == null) {
                        f154425h = new a();
                    }
                } finally {
                }
            }
        }
        return f154425h;
    }

    private void c() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f154427b = com.mbridge.msdk.config.component.common.util.b.a(contextD).a("adId", "");
        this.f154429d = com.mbridge.msdk.config.component.common.util.b.a(contextD).a("isLimitAdId", -1);
    }

    public Map<String, Object> a() {
        HashMap map = new HashMap();
        String str = TextUtils.isEmpty(this.f154426a) ? TextUtils.isEmpty(this.f154427b) ? "" : this.f154427b : this.f154426a;
        int i10 = this.f154428c;
        if (i10 == -1 && (i10 = this.f154429d) == -1) {
            i10 = 0;
        }
        map.put("adId", str);
        map.put("adIdB64", TextUtils.isEmpty(str) ? "" : k0.b(str));
        map.put("adIdLimit", String.valueOf(i10));
        map.put("amazonIdInfo", this.f154430e);
        map.put("amazonIdInfoB64", this.f154431f);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        try {
            Map<String, Object> mapA = a(com.mbridge.msdk.foundation.controller.c.n().d());
            a(this.f154426a, this.f154428c);
            if (aVar != null) {
                aVar.a(mapA);
            }
        } catch (Throwable th) {
            q0.b("ADIDProvider", th.getMessage());
        }
    }

    public void a(final com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f154447a.b(aVar);
            }
        });
    }

    public Map<String, Object> a(Context context) {
        if (context == null) {
            return new HashMap();
        }
        try {
            c();
            try {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                    this.f154426a = advertisingIdInfo.getId();
                    this.f154428c = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                } catch (Exception unused) {
                    q0.d("ADIDProvider", "GET ADID FROM GOOGLE PLAY APP ERROR");
                }
            } catch (Exception unused2) {
                c.b bVarA = new com.mbridge.msdk.foundation.tools.c().a(context);
                this.f154426a = bVarA.a();
                this.f154428c = bVarA.b() ? 1 : 0;
            } catch (Throwable th) {
                q0.b("ADIDProvider", th.getMessage());
            }
            if (!b(context)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                    int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                    String string = Settings.Secure.getString(contentResolver, "advertising_id");
                    jSONObject.put("status", i10);
                    jSONObject.put("amazonId", string);
                    String string2 = jSONObject.toString();
                    if (!TextUtils.isEmpty(string2)) {
                        this.f154430e = string2;
                        this.f154431f = k0.b(string2);
                    }
                } catch (Throwable th2) {
                    q0.b("ADIDProvider", th2.getMessage());
                }
            }
        } catch (Throwable th3) {
            q0.b("ADIDProvider", th3.getMessage());
        }
        this.f154426a = TextUtils.isEmpty(this.f154426a) ? TextUtils.isEmpty(this.f154427b) ? "" : this.f154427b : this.f154426a;
        int i11 = this.f154428c;
        if (i11 == -1 && (i11 = this.f154429d) == -1) {
            i11 = 0;
        }
        this.f154428c = i11;
        this.f154432g.set(true);
        HashMap map = new HashMap();
        map.put("adId", this.f154426a);
        map.put("adIdB64", k0.b(this.f154426a));
        map.put("isLimitAdId", Integer.valueOf(this.f154428c));
        map.put("amazonIdInfo", this.f154430e);
        map.put("amazonIdInfoB64", this.f154431f);
        return map;
    }

    private boolean b(Context context) {
        return "amazon".equalsIgnoreCase(Build.MANUFACTURER) || (context != null ? context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv") : false);
    }

    private void a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (str.equals(this.f154427b) && i10 == this.f154429d) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(contextD).b("adId", str);
        com.mbridge.msdk.config.component.common.util.b.a(contextD).b("isLimitAdId", i10);
    }
}
