package com.inmobi.media;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.InterfaceC3065x;
import com.inmobi.media.V9;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class V9 implements InterfaceC3065x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y9 f152525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed.l f152526b;

    public V9(Y9 y92, X9 x92) {
        this.f152525a = y92;
        this.f152526b = x92;
    }

    public static final void a(ed.l onComplete, U9 result) {
        kotlin.jvm.internal.G.p(onComplete, "$onComplete");
        kotlin.jvm.internal.G.p(result, "$result");
        onComplete.invoke(result);
    }

    @Override // com.android.billingclient.api.InterfaceC3065x
    public final void onBillingServiceDisconnected() {
        this.f152525a.getClass();
        final ed.l lVar = this.f152526b;
        final Y9 y92 = this.f152525a;
        C3657nb.a(new Runnable() { // from class: F5.D0
            @Override // java.lang.Runnable
            public final void run() {
                V9.a(lVar, y92);
            }
        });
    }

    @Override // com.android.billingclient.api.InterfaceC3065x
    public final void onBillingSetupFinished(BillingResult billingResult) {
        final U9 s92;
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        this.f152525a.getClass();
        Objects.toString(billingResult);
        int i10 = billingResult.f136358a;
        if (i10 == 0) {
            s92 = T9.f152459a;
        } else {
            String str = billingResult.f136360c;
            kotlin.jvm.internal.G.o(str, "getDebugMessage(...)");
            s92 = new S9(str, i10);
        }
        final ed.l lVar = this.f152526b;
        C3657nb.a(new Runnable() { // from class: F5.E0
            @Override // java.lang.Runnable
            public final void run() {
                V9.a(lVar, s92);
            }
        });
    }

    public static final void a(ed.l onComplete, Y9 this$0) {
        kotlin.jvm.internal.G.p(onComplete, "$onComplete");
        kotlin.jvm.internal.G.p(this$0, "this$0");
        onComplete.invoke(new S9("Billing Service Disconnected", -1));
    }
}
