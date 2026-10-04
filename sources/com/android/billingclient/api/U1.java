package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;

/* JADX INFO: loaded from: classes2.dex */
public final class U1 {
    public static void a(zzjs zzjsVar, BillingResult billingResult, O1 o12, int i10, int i11) {
        int i12 = N1.f136462a;
        o12.g(N1.b(zzjsVar, i10, billingResult, null, zzjz.BROADCAST_ACTION_UNSPECIFIED), i11);
    }

    public static void b(zzjs zzjsVar, BillingResult billingResult, O1 o12, int i10, int i11, @Nullable String str) {
        int i12 = N1.f136462a;
        o12.g(N1.b(zzjsVar, i10, billingResult, str, zzjz.BROADCAST_ACTION_UNSPECIFIED), i11);
    }
}
