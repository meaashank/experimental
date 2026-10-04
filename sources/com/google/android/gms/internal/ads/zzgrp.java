package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgrp extends zzgrx {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final zzgrx zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final zzgrx zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final zzgry zzc() {
        return new zzgrq(this.zza, this.zzb, null);
    }
}
