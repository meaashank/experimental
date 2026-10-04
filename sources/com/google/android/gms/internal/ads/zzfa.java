package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfa {
    final /* synthetic */ zzfd zza;
    private final int zzb;

    @Nullable
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private boolean zzg;
    private long zzh;

    public zzfa(zzfd zzfdVar, int i10) {
        Objects.requireNonNull(zzfdVar);
        this.zza = zzfdVar;
        this.zzb = i10;
    }

    public final void zza() {
        zzfd zzfdVar = this.zza;
        if (!zzfdVar.zzd().zza()) {
            if (this.zzg) {
                zzfdVar.zzg().zzk(2);
            }
            this.zzg = false;
            return;
        }
        zzbf zzbfVarZzq = zzfdVar.zzd().zzq();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(zzfdVar.zzd().zzr());
        zzbb zzbbVarZzd = zzfdVar.zzd();
        zzbb zzbbVarZzd2 = zzfdVar.zzd();
        zzbb zzbbVarZzd3 = zzfdVar.zzd();
        int iZzy = zzbbVarZzd.zzy();
        int iZzz = zzbbVarZzd2.zzz();
        long jZzu = zzbbVarZzd3.zzu();
        if (objZzf != null && iZzy == -1) {
            zzbfVarZzq.zzo(objZzf, zzfdVar.zzf());
            jZzu -= zzfm.zzs(0L);
            iZzy = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzg && Objects.equals(objZzf, this.zzc) && iZzy == this.zzd && iZzz == this.zze && jZzu == this.zzf) {
            long j10 = jElapsedRealtime - this.zzh;
            int i10 = this.zzb;
            if (j10 >= i10) {
                zzfdVar.zze().zza(new zzfe(2, i10));
                return;
            }
            return;
        }
        this.zzg = true;
        this.zzh = jElapsedRealtime;
        this.zzc = objZzf;
        this.zzd = iZzy;
        this.zze = iZzz;
        this.zzf = jZzu;
        zzfdVar.zzg().zzk(2);
        zzfdVar.zzg().zzi(2, this.zzb);
    }
}
