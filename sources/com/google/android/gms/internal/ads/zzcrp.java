package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcrp implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzcrp(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzcrp zza(zziof zziofVar, zziof zziofVar2) {
        return new zzcrp(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.util.client.zzu(((zzcok) this.zza).zza(), (String) this.zzb.zzb());
    }
}
