package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public class zzbkq {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbkq(String str, Object obj, int i10) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i10;
    }

    public static zzbkq zza(String str, boolean z10) {
        return new zzbkq(str, Boolean.valueOf(z10), 1);
    }

    public static zzbkq zzb(String str, long j10) {
        return new zzbkq(str, Long.valueOf(j10), 2);
    }

    public static zzbkq zzc(String str, double d10) {
        return new zzbkq(str, Double.valueOf(d10), 3);
    }

    public static zzbkq zzd(String str, String str2) {
        return new zzbkq("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object zze() {
        zzblx zzblxVarZza = zzblz.zza();
        if (zzblxVarZza != null) {
            int i10 = this.zzc - 1;
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? zzblxVarZza.zzd(this.zza, (String) this.zzb) : zzblxVarZza.zzc(this.zza, ((Double) this.zzb).doubleValue()) : zzblxVarZza.zzb(this.zza, ((Long) this.zzb).longValue()) : zzblxVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzblz.zzb() != null) {
            zzblz.zzb().zza();
        }
        return this.zzb;
    }
}
