package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcyp implements zzinw {
    private final zziof zza;

    private zzcyp(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcyp zza(zziof zziofVar) {
        return new zzcyp(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcyn(((zzioa) this.zza).zzb());
    }
}
