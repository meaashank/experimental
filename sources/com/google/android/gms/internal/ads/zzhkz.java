package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhkz extends zzhkx {
    public zzhkz(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhkx
    public final zzhkv zza(byte[] bArr, int i10) throws InvalidKeyException {
        return new zzhky(bArr, i10);
    }
}
