package com.google.android.gms.internal.measurement;

import U6.j;
import android.support.v4.media.c;
import androidx.compose.foundation.text.C1758e;

/* JADX INFO: loaded from: classes4.dex */
final class zzio extends zziv {
    private final int zzc;
    private final int zzd;

    public zzio(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzik.zza(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    public final byte zza(int i10) {
        int iZzb = zzb();
        if (((iZzb - (i10 + 1)) | i10) >= 0) {
            return this.zzb[this.zzc + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(c.a("Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException(C1758e.a("Index > length: ", i10, j.f68738d, iZzb));
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    public final byte zzb(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    public final int zzb() {
        return this.zzd;
    }
}
