package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzedq implements zzinw {
    private final zziof zza;

    private zzedq(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzedq zza(zziof zziofVar) {
        return new zzedq(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzedb(((zzcok) this.zza).zza());
    }
}
