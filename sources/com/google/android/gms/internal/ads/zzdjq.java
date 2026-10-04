package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdjq implements zzinw {
    private final zzdjp zza;
    private final zziof zzb;

    private zzdjq(zzdjp zzdjpVar, zziof zziofVar) {
        this.zza = zzdjpVar;
        this.zzb = zziofVar;
    }

    public static zzdjq zza(zzdjp zzdjpVar, zziof zziofVar) {
        return new zzdjq(zzdjpVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzddr zzddrVarZzp = this.zza.zzp(((zzioi) this.zzb).zzb());
        zzioe.zzb(zzddrVarZzp);
        return zzddrVarZzp;
    }
}
