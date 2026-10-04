package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzibu implements zzhrh {
    public static zzhrh zzb(zzhrf zzhrfVar) throws GeneralSecurityException {
        zzhrh zzhrhVarZzb = zzhrl.zzb(zzhrfVar);
        try {
            return new zzibt(zzhrhVarZzb, zzhrm.zzb(zzhrfVar), null);
        } catch (GeneralSecurityException unused) {
            return zzhrhVarZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhrh
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        throw null;
    }
}
