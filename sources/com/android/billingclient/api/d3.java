package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzcf;

/* JADX INFO: loaded from: classes2.dex */
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f136682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3003h0 f136683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3015k0 f136684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M f136685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O1 f136686e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f136689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public zzcf f136690i = zzcf.zzk();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c3 f136687f = new c3(this, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c3 f136688g = new c3(this, false);

    public d3(Context context, InterfaceC3003h0 interfaceC3003h0, InterfaceC2993e2 interfaceC2993e2, InterfaceC3015k0 interfaceC3015k0, M m10, O1 o12) {
        this.f136682a = context;
        this.f136683b = interfaceC3003h0;
        this.f136684c = interfaceC3015k0;
        this.f136685d = m10;
        this.f136686e = o12;
    }

    @Nullable
    public final M c() {
        return this.f136685d;
    }

    @Nullable
    public final InterfaceC3003h0 e() {
        return this.f136683b;
    }

    public final void h() {
        c3 c3Var = this.f136687f;
        Context context = this.f136682a;
        c3Var.c(context);
        this.f136688g.c(context);
    }

    public final void i(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f136689h = z10;
        c3 c3Var = this.f136688g;
        Context context = this.f136682a;
        c3Var.a(context, intentFilter2);
        if (this.f136689h) {
            this.f136687f.b(context, intentFilter, ProxyBillingActivity.f136481s);
        } else {
            this.f136687f.a(context, intentFilter);
        }
    }

    public final void j(zzcf zzcfVar) {
        this.f136690i = zzcfVar;
    }
}
