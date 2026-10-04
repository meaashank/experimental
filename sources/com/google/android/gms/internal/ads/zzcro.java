package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcro implements zzinw {
    private final zziof zza;

    private zzcro(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcro zza(zziof zziofVar) {
        return new zzcro(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.util.zzbl(((zzcok) this.zza).zza());
    }
}
