package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjj;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjq;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjz;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class N1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f136462a = 0;

    static {
        int i10 = O1.f136465a;
    }

    @Nullable
    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + com.prism.gaia.server.accounts.b.f166434b0 + zzbo.zzc(exc.getMessage());
            int i10 = zzc.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    @Nullable
    public static zzjl b(@Nullable zzjs zzjsVar, int i10, BillingResult billingResult, @Nullable String str, zzjz zzjzVar) {
        try {
            zzjq zzjqVarZza = zzju.zza();
            zzjqVarZza.zzp(billingResult.f136358a);
            zzjqVarZza.zzb(billingResult.f136360c);
            int i11 = billingResult.f136359b;
            if (i11 != 0) {
                zzjqVarZza.zzd(i11);
            }
            if (zzjsVar != null) {
                zzjqVarZza.zze(zzjsVar);
            }
            if (str != null) {
                zzjqVarZza.zza(str);
            }
            zzjj zzjjVarZza = zzjl.zza();
            zzjjVarZza.zzb(zzjqVarZza);
            zzjjVarZza.zzp(i10);
            if (!zzjzVar.equals(zzjz.BROADCAST_ACTION_UNSPECIFIED)) {
                zzjjVarZza.zza(zzjzVar);
            }
            return (zzjl) zzjjVarZza.zzi();
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    @Nullable
    public static zzjp c(int i10, zzjz zzjzVar) {
        try {
            zzjn zzjnVarZza = zzjp.zza();
            zzjnVarZza.zze(i10);
            if (!zzjzVar.equals(zzjz.BROADCAST_ACTION_UNSPECIFIED)) {
                zzjnVarZza.zza(zzjzVar);
            }
            return (zzjp) zzjnVarZza.zzi();
        } catch (Exception e10) {
            zzc.zzo("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
