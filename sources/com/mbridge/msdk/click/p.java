package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.u0;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes5.dex */
public class p extends f implements a.InterfaceC0573a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f154082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JumpLoaderResult f154083c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f154085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f154086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f154087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f154088h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f154084d = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f154089i = new Handler(Looper.getMainLooper());

    public class a implements k {
        public a() {
        }

        @Override // com.mbridge.msdk.click.k
        public void a(JumpLoaderResult jumpLoaderResult) {
            p.this.f154083c = jumpLoaderResult;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (p.this.f154082b != null) {
                if (p.this.f154083c.isSuccess()) {
                    p.this.f154082b.a(p.this.f154083c);
                } else {
                    p.this.f154082b.a(p.this.f154083c, p.this.f154083c.getMsg());
                }
            }
        }
    }

    public class c extends com.mbridge.msdk.foundation.same.task.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f154093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f154094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f154095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f154096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f154097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f154098g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f154099h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f154100i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Semaphore f154092a = new Semaphore(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private o.f f154101j = new a();

        public c(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z10, boolean z11, int i10) {
            this.f154093b = context;
            this.f154094c = str;
            this.f154095d = str2;
            this.f154096e = str3;
            this.f154097f = campaignEx;
            this.f154098g = z10;
            this.f154099h = z11;
            this.f154100i = i10;
        }

        private boolean a(int i10) {
            return i10 == 200;
        }

        private boolean b(int i10) {
            return i10 == 301 || i10 == 302 || i10 == 307;
        }

        private boolean c(String str) {
            return str.startsWith(RemoteSettings.FORWARD_SLASH_STRING);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d(String str) {
            return q.a(str, this.f154097f, p.this.f154083c);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            if (p.this.f154082b != null) {
                p.this.f154082b.b(null);
            }
            p.this.f154083c = new JumpLoaderResult();
            p.this.f154083c.setUrl(this.f154094c);
            p.this.f154083c = a(this.f154094c, this.f154098g, this.f154099h, this.f154097f, this.f154100i);
            if (!TextUtils.isEmpty(p.this.f154083c.getExceptionMsg())) {
                p.this.f154083c.setSuccess(true);
            }
            if (p.this.f154084d && p.this.f154083c.isSuccess()) {
                if (p.this.f154088h != null) {
                    p.this.f154083c.setStatusCode(p.this.f154088h.f154010f);
                }
                q.a(this.f154097f, p.this.f154083c, p.this.f154088h, this.f154095d, this.f154096e, this.f154093b, this.f154101j, this.f154092a);
            }
        }

        public class a implements o.f {
            public a() {
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean a(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean b(String str) {
                return false;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean c(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(String str, boolean z10, String str2) {
                c.this.d(str);
                p.this.f154083c.setContent(str2);
                a();
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(int i10, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    p.this.f154083c.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    p.this.f154083c.setContent(str3);
                }
                c.this.d(str);
                a();
            }

            private void a() {
                synchronized (p.this) {
                    p.this.f154083c.setSuccess(true);
                    c.this.a();
                }
            }
        }

        private boolean b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.f154092a.release();
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x0130, code lost:
        
            r2.setjumpDone(true);
            r2.setUrl(r6);
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01d4 A[EDGE_INSN: B:82:0x01d4->B:75:0x01d4 BREAK  A[LOOP:0: B:23:0x0054->B:68:0x0182], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r14, boolean r15, boolean r16, com.mbridge.msdk.foundation.entity.CampaignEx r17, int r18) {
            /*
                Method dump skipped, instruction units count: 469
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.p.c.a(java.lang.String, boolean, boolean, com.mbridge.msdk.foundation.entity.CampaignEx, int):com.mbridge.msdk.click.entity.JumpLoaderResult");
        }

        private boolean a(String str) {
            return u0.a.b(str);
        }
    }

    public p(Context context) {
        this.f154086f = context;
        this.f154087g = new com.mbridge.msdk.foundation.same.task.b(context, 2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a(String str, g gVar, boolean z10, String str2, String str3, CampaignEx campaignEx, boolean z11, boolean z12, int i10) {
        com.mbridge.msdk.foundation.same.task.a cVar;
        this.f154082b = gVar;
        this.f154085e = z10;
        com.mbridge.msdk.click.entity.b bVar = new com.mbridge.msdk.click.entity.b();
        bVar.a(this.f154086f);
        bVar.c(str);
        bVar.b(z10);
        bVar.a(str2);
        bVar.b(str3);
        bVar.a(campaignEx);
        bVar.a(z11);
        bVar.c(z12);
        bVar.a(i10);
        if (str.startsWith("tcp")) {
            l lVar = new l(bVar);
            lVar.a(this.f154082b);
            lVar.a(new a());
            cVar = lVar;
        } else {
            cVar = new c(this.f154086f, str, str2, str3, campaignEx, z11, z12, i10);
        }
        this.f154087g.b(cVar, this);
    }

    @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0573a
    public void a(a.b bVar) {
        if (bVar == a.b.FINISH && this.f154084d) {
            this.f154089i.post(new b());
        }
    }
}
