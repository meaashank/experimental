package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final class zzibt implements zzhrh {
    final zzhrh zza;
    final zzhrh zzb;

    public /* synthetic */ zzibt(zzhrh zzhrhVar, zzhrh zzhrhVar2, byte[] bArr) {
        this.zza = zzhrhVar;
        this.zzb = zzhrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhrh
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        return bArr.length <= 64 ? this.zza.zza(bArr, i10) : this.zzb.zza(bArr, i10);
    }
}
