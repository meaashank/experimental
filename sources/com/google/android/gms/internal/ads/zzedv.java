package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzedv implements zzinw {
    private final zziof zza;

    private zzedv(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzedv zza(zziof zziofVar) {
        return new zzedv(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzees(((zzcok) this.zza).zza());
    }
}
