package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzcd;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzld;
import com.google.android.gms.internal.play_billing.zzlg;
import com.google.android.gms.internal.play_billing.zzlk;

/* JADX INFO: loaded from: classes2.dex */
public interface O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f136465a = 0;

    static {
        zzcd.zzc("com.android.vending.billing.PURCHASES_UPDATED", zzjz.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", zzjz.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", zzjz.ALTERNATIVE_BILLING_ACTION);
    }

    void a(zzlg zzlgVar);

    void b(zzjp zzjpVar, long j10, boolean z10);

    void c(@Nullable zzlk zzlkVar);

    void d(@Nullable zzjp zzjpVar);

    void e(zzjl zzjlVar, int i10, long j10);

    void f(long j10);

    void g(@Nullable zzjl zzjlVar, int i10);

    void h(zzjl zzjlVar, long j10, boolean z10);

    void i(zzjx zzjxVar);

    void j(@Nullable BillingResult billingResult, long j10);

    void k(zzjl zzjlVar, int i10, long j10, boolean z10);

    void l(@Nullable zzjp zzjpVar, int i10);

    void m(zzld zzldVar);

    void n(zzjl zzjlVar);
}
