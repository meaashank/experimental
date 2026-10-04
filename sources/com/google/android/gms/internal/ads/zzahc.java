package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahc {
    private final zzeu zza = new zzeu(10);

    private final boolean zzb(zzagi zzagiVar, int i10) throws IOException {
        int i11;
        int i12 = 0;
        do {
            int i13 = i12 % 10;
            if (i13 == 0) {
                if (i12 != 0) {
                    zzeu zzeuVar = this.zza;
                    System.arraycopy(zzeuVar.zzi(), 10, zzeuVar.zzi(), 0, 9);
                }
                i11 = 0;
            } else {
                i11 = i13;
            }
            int i14 = i12 != 0 ? 1 : 10;
            try {
                zzeu zzeuVar2 = this.zza;
                int i15 = i13 + 10;
                zzagiVar.zzi(zzeuVar2.zzi(), i15 - i14, i14);
                zzeuVar2.zzh(i11);
                zzeuVar2.zzf(i15);
                if (zzeuVar2.zzq() == 4801587) {
                    return true;
                }
                if (zzahf.zza(zzeuVar2.zzr()) != -1) {
                    return false;
                }
                if (i12 == 0) {
                    zzeuVar2.zzc(20);
                }
                i12++;
            } catch (EOFException unused) {
            }
        } while (i12 <= i10);
        return false;
    }

    @Nullable
    public final zzap zza(zzagi zzagiVar, @Nullable zzajv zzajvVar, int i10) throws IOException {
        zzap zzapVarZza = null;
        int i11 = 0;
        while (zzb(zzagiVar, i10)) {
            zzeu zzeuVar = this.zza;
            int iZzg = zzeuVar.zzg();
            zzeuVar.zzk(6);
            int iZzG = zzeuVar.zzG();
            int i12 = iZzG + 10;
            if (zzapVarZza == null) {
                byte[] bArr = new byte[i12];
                System.arraycopy(zzeuVar.zzi(), iZzg, bArr, 0, 10);
                zzagiVar.zzi(bArr, 10, iZzG);
                zzapVarZza = zzajy.zza(bArr, i12, zzajvVar, new zzajj());
            } else {
                zzagiVar.zzk(iZzG);
            }
            i11 += i12;
        }
        zzagiVar.zzl();
        zzagiVar.zzk(i11);
        return zzapVarZza;
    }
}
