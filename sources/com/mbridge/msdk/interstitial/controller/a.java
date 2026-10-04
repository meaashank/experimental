package com.mbridge.msdk.interstitial.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.InterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.k;
import com.mbridge.msdk.setting.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f156954o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Map<String, Integer> f156955p = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Map<String, Integer> f156956q = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Map<String, d> f156957r = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f156959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f156960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f156961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f156962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBridgeIds f156963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f156964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m f156965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterstitialListener f156966i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f156958a = "InterstitialController";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f156967j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f156968k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f156969l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f156970m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f156971n = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.controller.a$a, reason: collision with other inner class name */
    public class HandlerC0579a extends Handler {
        public HandlerC0579a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                if (a.this.f156966i != null) {
                    a.this.f156966i.onInterstitialLoadSuccess(a.this.f156963f);
                    return;
                }
                return;
            }
            String str = "";
            if (i10 == 2) {
                if (a.this.f156966i != null) {
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof String)) {
                        str = (String) obj;
                    }
                    a.this.f156966i.onInterstitialLoadFail(a.this.f156963f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 3) {
                a aVar = a.this;
                aVar.f156967j = true;
                if (aVar.f156966i != null) {
                    a.this.f156966i.onInterstitialShowSuccess(a.this.f156963f);
                    return;
                }
                return;
            }
            if (i10 == 4) {
                if (a.this.f156966i != null) {
                    Object obj2 = message.obj;
                    if (obj2 != null && (obj2 instanceof String)) {
                        str = (String) obj2;
                    }
                    a.this.f156966i.onInterstitialShowFail(a.this.f156963f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 6) {
                if (a.this.f156966i != null) {
                    a.this.f156966i.onInterstitialAdClick(a.this.f156963f);
                }
            } else {
                if (i10 != 7) {
                    return;
                }
                a aVar2 = a.this;
                aVar2.f156967j = false;
                if (aVar2.f156966i != null) {
                    a.this.f156966i.onInterstitialClosed(a.this.f156963f);
                }
            }
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f156973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f156974b;

        public b(com.mbridge.msdk.interstitial.adapter.a aVar, c cVar) {
            this.f156973a = aVar;
            this.f156974b = cVar;
        }

        public void a(boolean z10, String str) {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f156973a;
                if (aVar != null) {
                    aVar.a((b) null);
                    this.f156973a = null;
                }
                if (this.f156974b != null) {
                    if (a.this.f156964g != null) {
                        a.this.f156964g.removeCallbacks(this.f156974b);
                    }
                    if (z10) {
                        if (a.this.f156966i != null) {
                            a.this.c(str);
                        }
                    } else if (a.this.f156966i != null) {
                        a.this.b(str);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void b(boolean z10, String str) {
            try {
                a.this.f156968k = str;
                try {
                    ArrayList arrayList = new ArrayList();
                    com.mbridge.msdk.interstitial.adapter.a aVar = this.f156973a;
                    if (aVar != null && aVar.d() != null) {
                        arrayList.add(this.f156973a.d());
                    }
                    a.this.f156969l = com.mbridge.msdk.foundation.same.c.b(arrayList);
                } catch (Exception e10) {
                    q0.b(a.this.f156958a, e10.getMessage());
                }
                if (this.f156974b != null) {
                    if (a.this.f156964g != null) {
                        a.this.f156964g.removeCallbacks(this.f156974b);
                    }
                    if (z10) {
                        a.this.b(false);
                    } else if (a.this.f156966i != null) {
                        a.this.h();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f156976a;

        public c(com.mbridge.msdk.interstitial.adapter.a aVar) {
            this.f156976a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f156976a;
                if (aVar != null) {
                    if (aVar.f()) {
                        a.this.c("load timeout");
                    } else if (a.this.f156966i != null) {
                        a.this.b("load timeout");
                    }
                    this.f156976a.a((b) null);
                    this.f156976a = null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public a() {
        try {
            c();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Handler handler = this.f156964g;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Handler handler = this.f156964g;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    public void g() {
        try {
            new k().a(this.f156959b, (String) null, (String) null, this.f156960c);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void j() {
        try {
            if (this.f156959b == null) {
                c("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f156960c)) {
                c("unitid is null");
            } else if (!this.f156971n) {
                c("init error");
            } else {
                e();
                b(true);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            c("can't show because unknow error");
        }
    }

    public class d {
        public d() {
        }

        public void a(String str) {
            try {
                a.this.c(str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void b() {
            try {
                if (a.this.f156964g != null) {
                    a.this.f156964g.sendEmptyMessage(7);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void c() {
            try {
                a.this.i();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void a() {
            try {
                if (a.this.f156964g != null) {
                    a.this.f156964g.sendEmptyMessage(6);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void e() {
        try {
            g();
            m mVarE = i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f156960c);
            this.f156965h = mVarE;
            if (mVarE == null) {
                this.f156965h = m.h(this.f156960c);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void f() {
        try {
            if (this.f156959b == null) {
                b("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f156960c)) {
                b("unitid is null");
            } else {
                if (!this.f156971n) {
                    b("init error");
                    return;
                }
                e();
                d();
                a(false);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            b("can't show because unknow error");
        }
    }

    private void c() {
        try {
            this.f156964g = new HandlerC0579a(Looper.getMainLooper());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        try {
            m mVar = this.f156965h;
            if (mVar != null) {
                int iE = mVar.e();
                int iY = this.f156965h.y();
                if (iE <= 0) {
                    iE = 1;
                }
                if (iY <= 0) {
                    iY = 1;
                }
                int i10 = iY * iE;
                if (f156956q == null || TextUtils.isEmpty(this.f156960c)) {
                    return;
                }
                f156956q.put(this.f156960c, Integer.valueOf(i10));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String b() {
        if (this.f156967j) {
            return this.f156970m;
        }
        return this.f156968k;
    }

    public static void a(String str, int i10) {
        try {
            if (f156955p == null || TextUtils.isEmpty(str)) {
                return;
            }
            f156955p.put(str, Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        try {
            if (this.f156964g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 4;
                this.f156964g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) {
        try {
            CampaignEx campaignExD = new com.mbridge.msdk.interstitial.adapter.a(this.f156959b, this.f156960c, this.f156961d, this.f156962e, true).d();
            if (campaignExD != null) {
                a(campaignExD);
            } else if (z10) {
                a(true);
            } else {
                c("no ads available can show");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            if (this.f156966i != null) {
                c("can't show because unknow error");
            }
        }
    }

    public static int a(String str) {
        Map<String, Integer> map;
        Integer num;
        try {
            if (TextUtils.isEmpty(str) || (map = f156955p) == null || !map.containsKey(str) || (num = f156955p.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public void a(InterstitialListener interstitialListener) {
        this.f156966i = interstitialListener;
    }

    public boolean a(Context context, Map<String, Object> map) {
        try {
            this.f156971n = false;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f156971n = false;
        }
        if (map != null && context != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID) && (map.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String)) {
            if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) && (map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) instanceof String)) {
                this.f156962e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
            }
            this.f156960c = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            this.f156959b = context;
            if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                this.f156961d = (String) map.get(MBridgeConstans.PLACEMENT_ID);
            }
            this.f156963f = new MBridgeIds(this.f156961d, this.f156960c);
            this.f156971n = true;
            return this.f156971n;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            if (this.f156964g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 2;
                this.f156964g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String a() {
        return this.f156969l;
    }

    public void a(boolean z10) {
        boolean z11;
        try {
            z11 = z10;
        } catch (Exception e10) {
            e = e10;
            z11 = z10;
        }
        try {
            com.mbridge.msdk.interstitial.adapter.a aVar = new com.mbridge.msdk.interstitial.adapter.a(this.f156959b, this.f156960c, this.f156961d, this.f156962e, z11);
            c cVar = new c(aVar);
            aVar.a(new b(aVar, cVar));
            Handler handler = this.f156964g;
            if (handler != null) {
                handler.postDelayed(cVar, 30000L);
            }
            aVar.j();
        } catch (Exception e11) {
            e = e11;
            e.printStackTrace();
            if (z11) {
                return;
            }
            b("can't show because unknow error");
        }
    }

    private void a(CampaignEx campaignEx) {
        d dVar = new d();
        if (f156957r != null && !TextUtils.isEmpty(this.f156960c)) {
            f156957r.put(this.f156960c, dVar);
        }
        Intent intent = new Intent(this.f156959b, (Class<?>) MBInterstitialActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(this.f156960c)) {
            intent.putExtra("unitId", this.f156960c);
        }
        if (campaignEx != null) {
            this.f156970m = campaignEx.getRequestId();
            intent.putExtra("campaign", campaignEx);
        }
        Context context = this.f156959b;
        if (context != null) {
            context.startActivity(intent);
        }
    }
}
