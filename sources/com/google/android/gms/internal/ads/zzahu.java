package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahu {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(zzagi zzagiVar) throws IOException {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzagiVar.zzi(bArr, 0, 10);
        zzagiVar.zzl();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    public final void zzc(zzaht zzahtVar, long j10, int i10, int i11, int i12, @Nullable zzahs zzahsVar) {
        zzguk.zzj(this.zzg <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i13 = this.zzc;
            int i14 = i13 + 1;
            this.zzc = i14;
            if (i13 == 0) {
                this.zzd = j10;
                this.zze = i10;
                this.zzf = 0;
            }
            this.zzf += i11;
            this.zzg = i12;
            if (i14 >= 16) {
                zzd(zzahtVar, zzahsVar);
            }
        }
    }

    public final void zzd(zzaht zzahtVar, @Nullable zzahs zzahsVar) {
        if (this.zzc > 0) {
            zzahtVar.zze(this.zzd, this.zze, this.zzf, this.zzg, zzahsVar);
            this.zzc = 0;
        }
    }
}
