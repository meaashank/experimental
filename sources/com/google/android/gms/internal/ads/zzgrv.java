package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgrv extends zzgsx {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzgsx
    public final zzgsx zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsx
    public final zzgsx zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsx
    public final zzgsy zzc() {
        return new zzgrw(this.zza, this.zzb, null);
    }
}
