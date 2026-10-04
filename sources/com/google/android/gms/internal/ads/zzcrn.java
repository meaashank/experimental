package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcrn implements zzinw {
    private final zziof zza;

    private zzcrn(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcrn zza(zziof zziofVar) {
        return new zzcrn(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfys(((zzcok) this.zza).zza(), com.google.android.gms.ads.internal.zzt.zzs().zza());
    }
}
