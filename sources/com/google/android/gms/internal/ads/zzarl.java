package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes4.dex */
final class zzarl implements zzafs {
    private final zzfj zza;
    private final zzeu zzb = new zzeu();
    private final int zzc;

    public zzarl(int i10, zzfj zzfjVar, int i11) {
        this.zzc = i10;
        this.zza = zzfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final zzafr zza(zzagi zzagiVar, long j10) throws IOException {
        int iZza;
        int iZza2;
        long jZzn = zzagiVar.zzn();
        int iMin = (int) Math.min(112800L, zzagiVar.zzo() - jZzn);
        zzeu zzeuVar = this.zzb;
        zzeuVar.zza(iMin);
        zzagiVar.zzi(zzeuVar.zzi(), 0, iMin);
        int iZze = zzeuVar.zze();
        long j11 = -1;
        long j12 = -9223372036854775807L;
        long j13 = -1;
        while (zzeuVar.zzd() >= 188 && (iZza2 = (iZza = zzarx.zza(zzeuVar.zzi(), zzeuVar.zzg(), iZze)) + Opcodes.NEWARRAY) <= iZze) {
            long jZzb = zzarx.zzb(zzeuVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZze = this.zza.zze(jZzb);
                if (jZze > j10) {
                    return j12 == -9223372036854775807L ? zzafr.zza(jZze, jZzn) : zzafr.zzc(jZzn + j13);
                }
                j13 = iZza;
                if (100000 + jZze > j10) {
                    return zzafr.zzc(jZzn + j13);
                }
                j12 = jZze;
            }
            zzeuVar.zzh(iZza2);
            j11 = iZza2;
        }
        return j12 != -9223372036854775807L ? zzafr.zzb(j12, jZzn + j11) : zzafr.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final void zzb() {
        byte[] bArr = zzfm.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
