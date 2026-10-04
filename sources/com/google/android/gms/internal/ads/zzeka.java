package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeka implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzeka(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzeka zza(zziof zziofVar, zziof zziofVar2) {
        return new zzeka(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzejz(((zzekl) this.zza).zzb(), ((zzcoe) this.zzb).zzb());
    }
}
