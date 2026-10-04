package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzicj {
    private final zzich zza;

    private zzicj(zzich zzichVar) {
        this.zza = zzichVar;
    }

    public static zzicj zza(byte[] bArr, zzhfr zzhfrVar) {
        return new zzicj(zzich.zza(bArr));
    }

    public static zzicj zzb(int i10) {
        return new zzicj(zzich.zza(zzhov.zza(i10)));
    }

    public final byte[] zzc(zzhfr zzhfrVar) {
        return this.zza.zzc();
    }

    public final int zzd() {
        return this.zza.zzd();
    }
}
