package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfca implements zzinw {
    private final zziof zza;

    private zzfca(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzfca zza(zziof zziofVar) {
        return new zzfca(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfby(((zzddc) this.zza).zza());
    }
}
