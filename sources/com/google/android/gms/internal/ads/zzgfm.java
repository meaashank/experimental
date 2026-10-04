package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzgfm implements zzgfg {
    private final int zza;
    private final byte[] zzb;

    public zzgfm(int i10, byte[] bArr) {
        this.zza = i10;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgfg
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfg
    public final String zzb() throws IOException {
        return new String(this.zzb);
    }
}
