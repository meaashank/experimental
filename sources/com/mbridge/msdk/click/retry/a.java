package com.mbridge.msdk.click.retry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f154104e = "mtg_retry_report=1";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f154105f = 10000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f154106g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f154107h = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f154108i = 600000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f154109j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f154110k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f154111l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f154112m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f154113n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f154114o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f154115p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f154116q = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.click.retry.b> f154117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.click.retry.c f154118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f154119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f154120d;

    /* JADX INFO: renamed from: com.mbridge.msdk.click.retry.a$a, reason: collision with other inner class name */
    public class C0545a extends BroadcastReceiver {
        public C0545a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (q4.c.f226807e.equals(intent.getAction())) {
                a.this.f154120d.sendEmptyMessage(2);
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f154122a = new a(null);
    }

    public static class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                a.b().c();
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.b().a((String) obj, com.mbridge.msdk.click.retry.b.f154123k);
                }
            }
        }
    }

    public /* synthetic */ a(C0545a c0545a) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.mbridge.msdk.click.retry.c cVar = this.f154118b;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                a(it.next(), com.mbridge.msdk.click.retry.b.f154124l);
            }
        }
    }

    private a() {
        this.f154117a = new ConcurrentHashMap<>();
        this.f154118b = new com.mbridge.msdk.click.retry.c(f154107h);
        this.f154120d = new c(Looper.getMainLooper());
        g gVarD = i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        f154106g = gVarD.j0();
        f154105f = gVarD.l0() * 1000;
        f154108i = gVarD.m0() * 1000;
        f154109j = gVarD.i0();
        f154110k = gVarD.k0();
        a();
    }

    public static a b() {
        return b.f154122a;
    }

    private boolean b(int i10) {
        return i10 == f154112m || i10 == f154113n;
    }

    public void a(String str, String str2, CampaignEx campaignEx, String str3, boolean z10, boolean z11, int i10) {
        if (!c(i10) || TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.replace("?" + f154104e, "").replace("&" + f154104e, "");
        if (this.f154117a == null) {
            this.f154117a = new ConcurrentHashMap<>();
        }
        com.mbridge.msdk.click.retry.b bVarRemove = this.f154117a.remove(strReplace);
        if (bVarRemove == null) {
            bVarRemove = new com.mbridge.msdk.click.retry.b(str, str2);
            bVarRemove.b(i10);
            bVarRemove.a(z10);
            bVarRemove.b(z11);
            bVarRemove.a(campaignEx);
            bVarRemove.b(str3);
        } else if (bVarRemove.d() != com.mbridge.msdk.click.retry.b.f154124l) {
            bVarRemove.a(str2);
        }
        if ((!a(i10) || f154109j == 0) && ((!b(i10) || f154110k == 0) && i10 != f154116q)) {
            a(bVarRemove);
            return;
        }
        if (System.currentTimeMillis() < bVarRemove.c() + ((long) f154108i)) {
            a(strReplace, bVarRemove);
            if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f154123k) {
                if (bVarRemove.e() <= f154106g) {
                    a(strReplace);
                    return;
                } else {
                    a(bVarRemove);
                    return;
                }
            }
            return;
        }
        if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f154123k) {
            a(bVarRemove);
        }
    }

    private boolean c(int i10) {
        return a(i10) || b(i10) || i10 == f154116q;
    }

    private void a(com.mbridge.msdk.click.retry.b bVar) {
        String str;
        String requestIdNotice;
        try {
            CampaignEx campaignExA = bVar.a();
            if (campaignExA != null) {
                String requestId = campaignExA.getRequestId();
                requestIdNotice = campaignExA.getRequestIdNotice();
                str = requestId;
            } else {
                str = "";
                requestIdNotice = str;
            }
            a(com.mbridge.msdk.foundation.controller.c.n().d(), bVar.b().toString(), bVar.g(), str, requestIdNotice, bVar.h());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void a(Context context, String str, String str2, String str3, String str4, int i10) {
        f.a().a(context, str, str2, str3, str4, i10);
    }

    private void a(String str, com.mbridge.msdk.click.retry.b bVar) {
        if (this.f154118b == null) {
            this.f154118b = new com.mbridge.msdk.click.retry.c(f154107h);
        }
        this.f154118b.a(str, bVar);
    }

    private void a(String str) {
        Message messageObtainMessage = this.f154120d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = str;
        this.f154120d.sendMessageDelayed(messageObtainMessage, f154105f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        String string;
        com.mbridge.msdk.click.retry.c cVar = this.f154118b;
        if (cVar != null) {
            com.mbridge.msdk.click.retry.b bVarA = cVar.a(str);
            this.f154118b.b(str);
            if (bVarA == null) {
                com.mbridge.msdk.click.retry.b bVar = this.f154117a.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.c() + ((long) f154108i) || bVar.e() >= f154106g || i10 == com.mbridge.msdk.click.retry.b.f154124l) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= bVarA.c() + ((long) f154108i)) {
                bVarA.a(i10);
                this.f154117a.put(str, bVarA);
                if (c1.c(str) == 0) {
                    StringBuilder sbA = android.support.v4.media.f.a(str, "?");
                    sbA.append(f154104e);
                    string = sbA.toString();
                } else {
                    StringBuilder sbA2 = android.support.v4.media.f.a(str, "&");
                    sbA2.append(f154104e);
                    string = sbA2.toString();
                }
                String str2 = string;
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), bVarA.a(), bVarA.f(), str2, bVarA.i(), bVarA.j(), bVarA.h());
                return;
            }
            if (i10 != com.mbridge.msdk.click.retry.b.f154124l) {
                a(bVarA);
            }
        }
    }

    private void a() {
        try {
            if (this.f154119c == null) {
                this.f154119c = new C0545a();
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    contextD.registerReceiver(this.f154119c, new IntentFilter(q4.c.f226807e));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private boolean a(int i10) {
        return i10 == f154115p || i10 == f154114o;
    }
}
