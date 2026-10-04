package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzctc implements zzinw {
    private final zziof zza;

    private zzctc(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzctc zza(zziof zziofVar) {
        return new zzctc(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzctb(((zzcok) this.zza).zza());
    }
}
