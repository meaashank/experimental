package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfnf implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzfnf(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzfnf zza(zziof zziofVar, zziof zziofVar2) {
        return new zzfnf(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfne(((zzcok) this.zza).zza(), ((zzcpd) this.zzb).zzb());
    }
}
