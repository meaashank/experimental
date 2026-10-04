package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@e.f0
public final class c3 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f136673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f136674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d3 f136675c;

    public c3(d3 d3Var, boolean z10) {
        Objects.requireNonNull(d3Var);
        this.f136675c = d3Var;
        this.f136674b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f136673a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f136674b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f136673a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        c3 c3Var;
        try {
            try {
                if (this.f136673a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    c3Var = this;
                    context.registerReceiver(c3Var, intentFilter, ProxyBillingActivity.f136481s, null, true != this.f136674b ? 4 : 2);
                } else {
                    c3Var = this;
                    context.registerReceiver(this, intentFilter, ProxyBillingActivity.f136481s, null);
                }
                c3Var.f136673a = true;
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }

    public final synchronized void c(Context context) {
        if (!this.f136673a) {
            zzc.zzn("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f136673a = false;
        }
    }

    public final void d(Bundle bundle, BillingResult billingResult, int i10, zzjz zzjzVar, long j10, boolean z10) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.f136675c.f136686e.h(zzjl.zzc(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j10, z10);
            } else {
                this.f136675c.f136686e.h(N1.b(zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i10, billingResult, null, zzjzVar), j10, z10);
            }
        } catch (Throwable unused) {
            zzc.zzn("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r14, android.content.Intent r15) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.c3.onReceive(android.content.Context, android.content.Intent):void");
    }
}
