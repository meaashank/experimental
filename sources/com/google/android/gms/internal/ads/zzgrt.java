package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgrt extends zzgsu {
    private int zza;
    private String zzb;
    private int zzc;
    private Boolean zzd;
    private byte zze;

    @Override // com.google.android.gms.internal.ads.zzgsu
    public final zzgsu zza(int i10) {
        this.zza = i10;
        this.zze = (byte) (this.zze | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsu
    public final zzgsu zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsu
    public final zzgsu zzc(int i10) {
        this.zzc = i10;
        this.zze = (byte) (this.zze | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsu
    public final zzgsu zzd(Boolean bool) {
        this.zzd = bool;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsu
    public final zzgsv zze() {
        if (this.zze == 3) {
            return new zzgru(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zze & 1) == 0) {
            sb2.append(" statusCode");
        }
        if ((this.zze & 2) == 0) {
            sb2.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
