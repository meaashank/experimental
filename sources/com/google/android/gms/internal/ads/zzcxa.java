package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcxa implements zzinw {
    private final zziof zza;

    private zzcxa(zzcwk zzcwkVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcxa zza(zzcwk zzcwkVar, zziof zziofVar) {
        return new zzcxa(zzcwkVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzdgq zzdgqVarZza = ((zzcyg) this.zza).zza();
        return new zzdlo(new zzdim() { // from class: com.google.android.gms.internal.ads.zzcwi
            @Override // com.google.android.gms.internal.ads.zzdim
            public final /* synthetic */ void zza() {
                zzdgqVarZza.zzc();
            }
        }, zzcgj.zzh);
    }
}
