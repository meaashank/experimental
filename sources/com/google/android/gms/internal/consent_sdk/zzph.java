package com.google.android.gms.internal.consent_sdk;

import android.support.v4.media.c;
import androidx.collection.N0;

/* JADX INFO: loaded from: classes4.dex */
final class zzph extends zzpk {
    public zzph(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzpm.zzi(0, 47, bArr.length);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    public final byte zza(int i10) {
        if (((47 - (i10 + 1)) | i10) >= 0) {
            return ((zzpk) this).zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(c.a("Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException(N0.a("Index > length: ", i10, ", 47"));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    public final byte zzb(int i10) {
        return ((zzpk) this).zza[i10];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    public final int zzd() {
        return 47;
    }
}
