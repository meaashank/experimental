package com.google.android.gms.internal.play_billing;

import U6.j;
import androidx.compose.foundation.text.C1758e;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzfj extends zzfm {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    public zzfj(byte[] bArr, int i10, int i11) {
        super(null);
        zzfp.zzj(i10, i10 + i11, bArr.length);
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final byte zza(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final int zzc(int i10, int i11, int i12) {
        return zzgv.zzb(i10, this.zzb, this.zzc, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final zzfp zze(int i10, int i11) {
        int iZzj = zzfp.zzj(i10, i11, this.zzd);
        return iZzj == 0 ? zzfp.zza : new zzfj(this.zzb, this.zzc + i10, iZzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final void zzf(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, this.zzc, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final void zzg(zzfg zzfgVar) throws IOException {
        ((zzfu) zzfgVar).zzc(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final boolean zzh(zzfp zzfpVar) {
        boolean z10 = zzfpVar instanceof zzfn;
        if (!z10 && !(zzfpVar instanceof zzfj)) {
            return zzfpVar.zzh(this);
        }
        int i10 = this.zzd;
        if (i10 > zzfpVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i10 + i10);
        }
        if (i10 > zzfpVar.zzd()) {
            throw new IllegalArgumentException(C1758e.a("Ran off end of other: 0, ", i10, j.f68738d, zzfpVar.zzd()));
        }
        if (z10) {
            return zzfp.zzl(this.zzb, this.zzc, ((zzfn) zzfpVar).zzb, 0, i10);
        }
        if (zzfpVar instanceof zzfj) {
            zzfj zzfjVar = (zzfj) zzfpVar;
            return zzfp.zzl(this.zzb, this.zzc, zzfjVar.zzb, zzfjVar.zzc, i10);
        }
        zzfp zzfpVarZze = zzfpVar.zze(0, i10);
        int i11 = this.zzc;
        return zzfpVarZze.equals(zze(i11, i10 + i11));
    }
}
