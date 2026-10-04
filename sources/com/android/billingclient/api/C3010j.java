package com.android.billingclient.api;

import com.android.billingclient.api.BillingResult;

/* JADX INFO: renamed from: com.android.billingclient.api.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3010j {
    public static BillingResult a(int i10, String str) {
        BillingResult.Builder builderD = BillingResult.d();
        builderD.setResponseCode(i10);
        builderD.setDebugMessage(str);
        return builderD.build();
    }
}
