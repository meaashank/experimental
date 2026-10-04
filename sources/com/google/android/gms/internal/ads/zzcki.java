package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzcki implements zzhs {
    private final zzhs zza;
    private final long zzb;
    private final zzhs zzc;
    private long zzd;
    private Uri zze;

    public zzcki(zzhs zzhsVar, int i10, zzhs zzhsVar2) {
        this.zza = zzhsVar;
        this.zzb = i10;
        this.zzc = zzhsVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j10 = this.zzd;
        long j11 = this.zzb;
        if (j10 < j11) {
            int iZza = this.zza.zza(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.zzd + ((long) iZza);
            this.zzd = j12;
            i12 = iZza;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 < j11) {
            return i12;
        }
        int iZza2 = this.zzc.zza(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + iZza2;
        this.zzd += (long) iZza2;
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long zzb(zzhw zzhwVar) throws IOException {
        Uri uri;
        zzhw zzhwVar2;
        Uri uri2 = zzhwVar.zza;
        this.zze = uri2;
        long j10 = zzhwVar.zze;
        long j11 = this.zzb;
        zzhw zzhwVar3 = null;
        if (j10 >= j11) {
            uri = uri2;
            zzhwVar2 = null;
        } else {
            long j12 = zzhwVar.zzf;
            long jMin = j11 - j10;
            if (j12 != -1) {
                jMin = Math.min(j12, jMin);
            }
            uri = uri2;
            zzhwVar2 = new zzhw(uri, j10, jMin, null);
        }
        long j13 = zzhwVar.zzf;
        if (j13 == -1 || j10 + j13 > j11) {
            zzhwVar3 = new zzhw(uri, Math.max(j11, j10), j13 != -1 ? Math.min(j13, (j10 + j13) - j11) : -1L, null);
        }
        long jZzb = zzhwVar2 != null ? this.zza.zzb(zzhwVar2) : 0L;
        long jZzb2 = zzhwVar3 != null ? this.zzc.zzb(zzhwVar3) : 0L;
        this.zzd = j10;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zze(zziq zziqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Map zzj() {
        return zzgxp.zza();
    }
}
