package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdfg implements zzinw {
    private final zziof zza;

    private zzdfg(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdfg zzc(zziof zziofVar) {
        return new zzdfg(zziofVar);
    }

    public static zzdff zzd(Set set) {
        return new zzdff(set);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdff zzb() {
        return new zzdff(((zzioi) this.zza).zzb());
    }
}
