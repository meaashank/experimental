package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzffb implements zzinw {
    private final zziof zza;

    private zzffb(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzffb zza(zziof zziofVar) {
        return new zzffb(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzffa(((zzcok) this.zza).zza());
    }
}
