package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcpb implements zzinw {
    private final zzcod zza;

    private zzcpb(zzcod zzcodVar) {
        this.zza = zzcodVar;
    }

    public static zzcpb zza(zzcod zzcodVar) {
        return new zzcpb(zzcodVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Long.valueOf(this.zza.zzi());
    }
}
