package com.mbridge.msdk.timer;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f159858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f159859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<i> f159860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LinkedList<i> f159861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f159862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f159863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f159864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.a f159865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l f159866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f159867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Handler f159868k;

    /* JADX INFO: renamed from: com.mbridge.msdk.timer.a$a, reason: collision with other inner class name */
    public class HandlerC0634a extends Handler {
        public HandlerC0634a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (a.this) {
                try {
                    int i10 = message.what;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            a.this.c();
                        }
                    } else {
                        if (a.this.f159859b) {
                            return;
                        }
                        a aVar = a.this;
                        aVar.a(aVar.f159858a);
                        sendMessageDelayed(obtainMessage(1), a.this.f159858a);
                    }
                } finally {
                }
            }
        }
    }

    public class b implements com.mbridge.msdk.reward.adapter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f159870a;

        public b(com.mbridge.msdk.reward.adapter.c cVar) {
            this.f159870a = cVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f159868k.sendMessage(a.this.f159868k.obtainMessage(2));
            this.f159870a.a((com.mbridge.msdk.reward.adapter.a) null);
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f159868k.sendMessage(a.this.f159868k.obtainMessage(2));
            this.f159870a.a((com.mbridge.msdk.reward.adapter.a) null);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static a f159872a = new a(null);
    }

    public /* synthetic */ a(HandlerC0634a handlerC0634a) {
        this();
    }

    private a() {
        this.f159859b = false;
        this.f159860c = new LinkedList<>();
        this.f159861d = new LinkedList<>();
        this.f159862e = 0;
        this.f159863f = 0;
        this.f159868k = new HandlerC0634a();
    }

    private void b() {
        if (this.f159867j == null) {
            this.f159867j = g.a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        if (this.f159866i == null) {
            this.f159866i = l.a(this.f159867j);
        }
        List<i> listA = this.f159866i.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        if (listA != null) {
            this.f159861d.addAll(listA);
            for (i iVar : listA) {
                a(iVar.d(), iVar.g());
            }
        }
        List<i> listA2 = this.f159866i.a(94);
        if (listA2 != null) {
            this.f159860c.addAll(listA2);
            for (i iVar2 : listA2) {
                b(iVar2.d(), iVar2.g());
            }
        }
        if (this.f159864g == null) {
            this.f159864g = e.a(this.f159867j);
        }
        if (this.f159865h == null) {
            this.f159865h = com.mbridge.msdk.videocommon.setting.b.b().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            LinkedList<i> linkedList = this.f159860c;
            if (linkedList != null && linkedList.size() > 0 && this.f159862e < this.f159860c.size()) {
                i iVar = this.f159860c.get(this.f159862e);
                this.f159862e++;
                if (a(iVar)) {
                    a(iVar.d(), iVar.g(), false);
                    return;
                }
                return;
            }
            LinkedList<i> linkedList2 = this.f159861d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f159863f >= this.f159861d.size()) {
                return;
            }
            i iVar2 = this.f159861d.get(this.f159863f);
            this.f159863f++;
            if (a(iVar2)) {
                c(iVar2.d(), iVar2.g());
            }
        } catch (Throwable th) {
            q0.b("LoopTimer", th.getMessage(), th);
        }
    }

    public static a a() {
        return c.f159872a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        LinkedList<i> linkedList = this.f159860c;
        if (linkedList == null || linkedList.size() <= 0 || this.f159862e == 0 || this.f159860c.size() <= this.f159862e) {
            LinkedList<i> linkedList2 = this.f159861d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f159863f == 0 || this.f159861d.size() == this.f159863f) {
                this.f159863f = 0;
                this.f159862e = 0;
                Handler handler = this.f159868k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    private boolean a(i iVar) {
        boolean z10 = false;
        if (iVar != null && !TextUtils.isEmpty(iVar.g())) {
            String strG = iVar.g();
            try {
                if (this.f159864g == null) {
                    return true;
                }
                com.mbridge.msdk.videocommon.setting.a aVar = this.f159865h;
                int iA = this.f159864g.a(strG, aVar != null ? aVar.e() : 0L);
                if (iA == -1) {
                    a(strG);
                } else if (iA == 1) {
                    return true;
                }
                try {
                    Handler handler = this.f159868k;
                    handler.sendMessage(handler.obtainMessage(2));
                    return false;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
            }
            q0.b("LoopTimer", th.getMessage(), th);
        }
        return z10;
    }

    private void c(String str, String str2) {
        a(str, str2, true);
    }

    private void a(String str, String str2, boolean z10) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(contextD, str, str2);
            cVar.d(z10);
            cVar.a(new b(cVar));
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar2.i(SameMD5.getMD5(v0.d()));
            cVar2.n(str2);
            if (z10) {
                cVar2.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
            } else {
                cVar2.a(94);
            }
            cVar2.h(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            cVar2.f("1");
            cVar.a(1, 8000, false, cVar2);
        } catch (Exception e10) {
            q0.b("LoopTimer", e10.getMessage(), e10);
        }
    }

    public void b(long j10) {
        b();
        this.f159858a = j10;
        this.f159859b = false;
        Handler handler = this.f159868k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f159858a);
    }

    public void b(String str, String str2) {
        if (this.f159860c.contains(str2)) {
            return;
        }
        this.f159860c.add(new i(str, str2, 94));
        l lVar = this.f159866i;
        if (lVar != null) {
            lVar.a(str, str2, 94);
        }
    }

    private void b(String str) {
        l lVar = this.f159866i;
        if (lVar != null) {
            lVar.a(str);
        }
    }

    public void a(String str, String str2) {
        if (this.f159861d.contains(str2)) {
            return;
        }
        this.f159861d.add(new i(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO));
        l lVar = this.f159866i;
        if (lVar != null) {
            lVar.a(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LinkedList<i> linkedList = this.f159860c;
        if (linkedList != null && linkedList.contains(str)) {
            this.f159860c.remove(str);
        } else {
            LinkedList<i> linkedList2 = this.f159861d;
            if (linkedList2 != null && linkedList2.contains(str)) {
                this.f159861d.remove(str);
            }
        }
        b(str);
    }
}
