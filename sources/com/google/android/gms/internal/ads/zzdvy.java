package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdvy extends zzdvj implements zzdlw {
    private zzdlw zza;

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final synchronized void zzdT() {
        zzdlw zzdlwVar = this.zza;
        if (zzdlwVar != null) {
            zzdlwVar.zzdT();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final synchronized void zzdu() {
        zzdlw zzdlwVar = this.zza;
        if (zzdlwVar != null) {
            zzdlwVar.zzdu();
        }
    }

    public final synchronized void zzn(com.google.android.gms.ads.internal.client.zza zzaVar, zzbox zzboxVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzboz zzbozVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, zzdlw zzdlwVar) throws Throwable {
        try {
            try {
                zzm(zzaVar, zzboxVar, zzrVar, zzbozVar, zzadVar);
                this.zza = zzdlwVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
