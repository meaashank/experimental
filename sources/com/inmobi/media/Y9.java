package com.inmobi.media;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.C2983c0;
import com.android.billingclient.api.InterfaceC2995f0;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.inmobi.media.Y9;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class Y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ed.l f152627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BillingClient f152628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f152629c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R9 f152630d = new R9();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f152631e = 2;

    public static final void a(BillingResult billingResult, List list) {
        kotlin.jvm.internal.G.p(billingResult, "<anonymous parameter 0>");
    }

    public static final void b(final Y9 this$0, final ed.l onComplete, BillingResult billingResult, List purchasesResult) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(onComplete, "$onComplete");
        kotlin.jvm.internal.G.p(billingResult, "<anonymous parameter 0>");
        kotlin.jvm.internal.G.p(purchasesResult, "purchasesResult");
        R9 r92 = this$0.f152630d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            C2983c0 c2983c0 = (C2983c0) obj;
            if (c2983c0.h() == 1 && c2983c0.n()) {
                arrayList.add(obj);
            }
        }
        r92.f152413b = arrayList.size();
        C3657nb.a(new Runnable() { // from class: F5.J0
            @Override // java.lang.Runnable
            public final void run() {
                Y9.b(onComplete, this$0);
            }
        });
    }

    public final void a(Context context, N9 onComplete) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(onComplete, "onComplete");
        try {
            this.f152627a = onComplete;
            this.f152628b = a(context);
            X9 x92 = new X9(this);
            BillingClient billingClient = this.f152628b;
            if (billingClient != null) {
                billingClient.x(new V9(this, x92));
            }
        } catch (Exception e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            a((R9) null);
        }
    }

    public static final void b(ed.l onComplete, Y9 this$0) {
        kotlin.jvm.internal.G.p(onComplete, "$onComplete");
        kotlin.jvm.internal.G.p(this$0, "this$0");
        onComplete.invoke(this$0.f152630d);
    }

    public final void a(R9 r92) {
        ed.l lVar = this.f152627a;
        if (lVar != null) {
            lVar.invoke(r92);
        }
    }

    public static BillingClient a(Context context) {
        kotlin.jvm.internal.G.p(context, "context");
        BillingClient billingClientBuild = BillingClient.q(context).setListener(new F5.F0()).enablePendingPurchases(PendingPurchasesParams.c().enableOneTimeProducts().build()).build();
        kotlin.jvm.internal.G.o(billingClientBuild, "build(...)");
        return billingClientBuild;
    }

    public final void a(final W9 onComplete) {
        kotlin.jvm.internal.G.p(onComplete, "onComplete");
        QueryPurchasesParams.Builder builderB = QueryPurchasesParams.b();
        builderB.setProductType(BillingClient.f.f136320w0);
        QueryPurchasesParams.Builder builderB2 = QueryPurchasesParams.b();
        builderB2.setProductType(BillingClient.f.f136321x0);
        BillingClient billingClient = this.f152628b;
        if (billingClient != null) {
            billingClient.s(builderB.build(), new InterfaceC2995f0() { // from class: F5.G0
                @Override // com.android.billingclient.api.InterfaceC2995f0
                public final void a(BillingResult billingResult, List list) {
                    Y9.a(this.f34311a, onComplete, billingResult, list);
                }
            });
        }
        BillingClient billingClient2 = this.f152628b;
        if (billingClient2 != null) {
            billingClient2.s(builderB2.build(), new InterfaceC2995f0() { // from class: F5.H0
                @Override // com.android.billingclient.api.InterfaceC2995f0
                public final void a(BillingResult billingResult, List list) {
                    Y9.b(this.f34320a, onComplete, billingResult, list);
                }
            });
        }
    }

    public static final void a(final Y9 this$0, final ed.l onComplete, BillingResult billingResult, List purchasesResult) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(onComplete, "$onComplete");
        kotlin.jvm.internal.G.p(billingResult, "<anonymous parameter 0>");
        kotlin.jvm.internal.G.p(purchasesResult, "purchasesResult");
        R9 r92 = this$0.f152630d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            C2983c0 c2983c0 = (C2983c0) obj;
            if (c2983c0.h() == 1 && c2983c0.n()) {
                arrayList.add(obj);
            }
        }
        r92.f152412a = arrayList.size();
        C3657nb.a(new Runnable() { // from class: F5.I0
            @Override // java.lang.Runnable
            public final void run() {
                Y9.a(onComplete, this$0);
            }
        });
    }

    public static final void a(ed.l onComplete, Y9 this$0) {
        kotlin.jvm.internal.G.p(onComplete, "$onComplete");
        kotlin.jvm.internal.G.p(this$0, "this$0");
        onComplete.invoke(this$0.f152630d);
    }
}
