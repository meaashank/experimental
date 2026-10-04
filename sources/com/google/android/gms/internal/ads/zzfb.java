package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfb {
    final /* synthetic */ zzfd zza;
    private final int zzb;

    @Nullable
    private Object zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;

    public zzfb(zzfd zzfdVar, int i10) {
        Objects.requireNonNull(zzfdVar);
        this.zza = zzfdVar;
        this.zzb = i10;
    }

    public final void zza() {
        long jZzt;
        zzfd zzfdVar = this.zza;
        zzbf zzbfVarZzq = zzfdVar.zzd().zzq();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(zzfdVar.zzd().zzr());
        zzbb zzbbVarZzd = zzfdVar.zzd();
        zzbb zzbbVarZzd2 = zzfdVar.zzd();
        zzbb zzbbVarZzd3 = zzfdVar.zzd();
        int iZzy = zzbbVarZzd.zzy();
        int iZzz = zzbbVarZzd2.zzz();
        long jZzu = zzbbVarZzd3.zzu();
        if (objZzf == null || iZzy != -1) {
            jZzt = iZzy != -1 ? zzfdVar.zzd().zzt() : -9223372036854775807L;
        } else {
            zzbfVarZzq.zzo(objZzf, zzfdVar.zzf());
            jZzu -= zzfm.zzs(0L);
            jZzt = zzfm.zzs(zzfdVar.zzf().zzd);
            iZzy = -1;
        }
        boolean zZza = zzfdVar.zzd().zza();
        if (!zZza || jZzt == -9223372036854775807L || jZzu < jZzt) {
            zzfdVar.zzg().zzk(3);
            if (zZza && jZzt != -9223372036854775807L) {
                zzfdVar.zzg().zzi(3, (int) Math.ceil((jZzt - jZzu) / zzfdVar.zzd().zzn().zzb));
            }
            this.zzf = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzf && Objects.equals(objZzf, this.zzc) && iZzy == this.zzd && iZzz == this.zze) {
            long j10 = jElapsedRealtime - this.zzg;
            int i10 = this.zzb;
            if (j10 >= i10) {
                zzfdVar.zze().zza(new zzfe(3, i10));
                return;
            }
            return;
        }
        this.zzf = true;
        this.zzg = jElapsedRealtime;
        this.zzc = objZzf;
        this.zzd = iZzy;
        this.zze = iZzz;
        zzfdVar.zzg().zzk(3);
        zzfdVar.zzg().zzi(3, this.zzb);
    }
}
