package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzcjf extends zzauz {
    static final zzcjf zzb = new zzcjf();

    @Override // com.google.android.gms.internal.ads.zzauz
    public final zzavd zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzavf() : "mvhd".equals(str) ? new zzavg() : new zzavh(str);
    }
}
