package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdcl implements zzinw {
    private final zziof zza;

    private zzdcl(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdcl zza(zziof zziofVar) {
        return new zzdcl(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdck(((zzczf) this.zza).zza());
    }
}
