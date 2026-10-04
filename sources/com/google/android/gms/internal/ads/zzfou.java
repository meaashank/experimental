package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfou implements zzinw {
    public static zzfou zza() {
        return zzfot.zza;
    }

    public static zzhdi zzc() {
        zzhdi zzhdiVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgQ)).booleanValue()) {
            zzhdiVar = zzcgj.zzc;
        } else {
            zzhdiVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgP)).booleanValue() ? zzcgj.zza : zzcgj.zzf;
        }
        zzioe.zzb(zzhdiVar);
        return zzhdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
