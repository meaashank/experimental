package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f157196c = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f157197a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f157198b;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.util.a$a, reason: collision with other inner class name */
    public class RunnableC0585a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f157199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f157200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignUnit f157201c;

        public RunnableC0585a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, CampaignUnit campaignUnit) {
            this.f157199a = bVar;
            this.f157200b = str;
            this.f157201c = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f157199a;
            if (bVar != null) {
                bVar.a(this.f157200b, this.f157201c, a.this.f157198b);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f157203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.error.b f157204b;

        public b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f157203a = bVar;
            this.f157204b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f157203a != null) {
                this.f157204b.a(a.this.f157198b);
                this.f157203a.a(this.f157204b);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f157206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f157207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f157208c;

        public c(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
            this.f157206a = bVar;
            this.f157207b = str;
            this.f157208c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f157206a;
            if (bVar != null) {
                bVar.a(this.f157207b, this.f157208c, a.this.f157198b);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f157210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.error.b f157211b;

        public d(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f157210a = bVar;
            this.f157211b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f157210a != null) {
                this.f157211b.a(a.this.f157198b);
                this.f157210a.b(this.f157211b);
            }
        }
    }

    public void b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        q0.b(f157196c, "postResourceFail unitId=" + bVar2);
        this.f157197a.post(new d(bVar, bVar2));
    }

    public void a(boolean z10) {
        this.f157198b = z10;
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, CampaignUnit campaignUnit, String str) {
        com.mbridge.msdk.activity.a.a("postCampaignSuccess unitId=", str, f157196c);
        this.f157197a.post(new RunnableC0585a(bVar, str, campaignUnit));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        this.f157197a.post(new b(bVar, bVar2));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
        com.mbridge.msdk.activity.a.a("postResourceSuccess unitId=", str, f157196c);
        this.f157197a.post(new c(bVar, str, i10));
    }
}
