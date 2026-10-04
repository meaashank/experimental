package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdqp implements zzinw {
    private final zziof zza;

    private zzdqp(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdqp zza(zziof zziofVar) {
        return new zzdqp(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdqo(((zzdqa) this.zza).zzb());
    }
}
