package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzc;
import java.util.Objects;

/* JADX INFO: renamed from: com.android.billingclient.api.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3056u2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public BillingResult f136837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f136838b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final O1 f136839c;

    public C3056u2(@Nullable O1 o12) {
        this.f136839c = o12;
    }

    @Nullable
    public final BillingResult a() {
        return this.f136837a;
    }

    public final void b() {
        this.f136837a = null;
    }

    public final boolean c() {
        return this.f136838b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, @Nullable Intent intent) {
        if (intent == null) {
            zzc.zzn("ProxyBillingReceiver", "Null intent!");
            return;
        }
        zzc.zzm("ProxyBillingReceiver", "Received intent action: ".concat(String.valueOf(intent.getAction())));
        if (!Objects.equals(intent.getAction(), "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION")) {
            if (!Objects.equals(intent.getAction(), "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION")) {
                zzc.zzn("ProxyBillingReceiver", "Unexpected broadcast action: ".concat(String.valueOf(intent.getAction())));
                return;
            }
            this.f136838b = true;
            O1 o12 = this.f136839c;
            if (o12 != null) {
                o12.f(intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        if (!intent.hasExtra("RESPONSE_CODE")) {
            zzc.zzn("ProxyBillingReceiver", "Missing RESPONSE_CODE in intent.");
            O1 o13 = this.f136839c;
            if (o13 != null) {
                o13.j(null, intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        BillingResult.Builder builderD = BillingResult.d();
        builderD.setResponseCode(intent.getIntExtra("RESPONSE_CODE", 0));
        builderD.setDebugMessage(zzbo.zzc(intent.getStringExtra("DEBUG_MESSAGE")));
        BillingResult billingResultBuild = builderD.build();
        this.f136837a = billingResultBuild;
        O1 o14 = this.f136839c;
        if (o14 != null) {
            o14.j(billingResultBuild, intent.getLongExtra("billingClientTransactionId", 0L));
        }
    }
}
