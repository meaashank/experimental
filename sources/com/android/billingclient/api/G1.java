package com.android.billingclient.api;

import androidx.core.util.InterfaceC2427d;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzdd;
import com.google.android.gms.internal.play_billing.zzjs;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class G1 implements zzdd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2427d f136395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f136396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L1 f136397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f136398d;

    public G1(L1 l12, int i10, InterfaceC2427d interfaceC2427d, Runnable runnable) {
        this.f136398d = i10;
        this.f136395a = interfaceC2427d;
        this.f136396b = runnable;
        Objects.requireNonNull(l12);
        this.f136397c = l12;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdd
    public final void zza(Throwable th) {
        if (th instanceof TimeoutException) {
            this.f136397c.E2(zzjs.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, S1.f136523F);
            zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            this.f136397c.E2(zzjs.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, S1.f136523F);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.f136396b.run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdd
    public final void zzb(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        L1 l12 = this.f136397c;
        if (iIntValue <= 0) {
            this.f136396b.run();
        } else {
            this.f136395a.accept(l12.C2(this.f136398d, num.intValue()));
        }
    }
}
