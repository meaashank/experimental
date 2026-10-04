package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzaz;
import com.google.android.gms.internal.play_billing.zzc;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class I1 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L1 f136422a;

    public /* synthetic */ I1(L1 l12, J1 j12) {
        Objects.requireNonNull(l12);
        this.f136422a = l12;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzc.zzm("BillingClientTesting", "Billing Override Service connected.");
        L1 l12 = this.f136422a;
        l12.f136446Q = zzaz.zzb(iBinder);
        l12.f136445P = 2;
        l12.F2(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzc.zzn("BillingClientTesting", "Billing Override Service disconnected.");
        L1 l12 = this.f136422a;
        l12.f136446Q = null;
        l12.f136445P = 0;
    }
}
