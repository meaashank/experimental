package com.google.android.gms.internal.consent_sdk;

import U6.j;
import androidx.compose.foundation.text.C1758e;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
class zzpk extends zzpj {
    protected final byte[] zza;

    public zzpk(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final int zze(int i10, int i11, int i12) {
        return zzqs.zzb(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final zzpm zzf(int i10, int i11) {
        zzpm.zzi(0, 47, zzd());
        return new zzph(this.zza, 0, 47);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final void zzg(zzpe zzpeVar) throws IOException {
        zzpeVar.zza(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final boolean zzh(zzpm zzpmVar) {
        if (!(zzpmVar instanceof zzpk)) {
            return zzpmVar.zzh(this);
        }
        int iZzd = zzd();
        if (iZzd > zzpmVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzpmVar.zzd()) {
            throw new IllegalArgumentException(C1758e.a("Ran off end of other: 0, ", iZzd, j.f68738d, zzpmVar.zzd()));
        }
        zzpk zzpkVar = (zzpk) zzpmVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzpkVar.zza;
        zzpkVar.zzc();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iZzd) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }
}
