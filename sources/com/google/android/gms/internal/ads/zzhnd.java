package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzhnd extends zzhfj {
    private final String zza;
    private final zzhfm zzb;

    public /* synthetic */ zzhnd(String str, zzhfm zzhfmVar, byte[] bArr) {
        this.zza = str;
        this.zzb = zzhfmVar;
    }

    public final String toString() {
        return String.format("(typeUrl=%s, outputPrefixType=%s)", this.zza, this.zzb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzb != zzhfm.zzd;
    }
}
