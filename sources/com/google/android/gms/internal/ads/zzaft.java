package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class zzaft {
    protected final zzafn zza;
    protected final zzafs zzb;

    @Nullable
    protected zzafp zzc;
    private final int zzd;

    public zzaft(zzafq zzafqVar, zzafs zzafsVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.zzb = zzafsVar;
        this.zzd = i10;
        this.zza = new zzafn(zzafqVar, j10, 0L, j12, j13, j14, j15);
    }

    public static final int zzf(zzagi zzagiVar, long j10, zzahh zzahhVar) {
        if (j10 == zzagiVar.zzn()) {
            return 0;
        }
        zzahhVar.zza = j10;
        return 1;
    }

    public static final boolean zzg(zzagi zzagiVar, long j10) throws IOException {
        long jZzn = j10 - zzagiVar.zzn();
        if (jZzn < 0 || jZzn > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        zzagiVar.zzf((int) jZzn);
        return true;
    }

    public final zzahk zza() {
        return this.zza;
    }

    public final void zzb(long j10) {
        zzafp zzafpVar = this.zzc;
        if (zzafpVar == null || zzafpVar.zze() != j10) {
            zzafn zzafnVar = this.zza;
            this.zzc = new zzafp(j10, zzafnVar.zzd(j10), 0L, zzafnVar.zze(), zzafnVar.zzf(), zzafnVar.zzg(), zzafnVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        while (true) {
            zzafp zzafpVar = this.zzc;
            zzafpVar.getClass();
            long jZzb = zzafpVar.zzb();
            long jZzc = zzafpVar.zzc();
            long jZzh = zzafpVar.zzh();
            if (jZzc - jZzb <= this.zzd) {
                zze(false, jZzb);
                return zzf(zzagiVar, jZzb, zzahhVar);
            }
            if (!zzg(zzagiVar, jZzh)) {
                return zzf(zzagiVar, jZzh, zzahhVar);
            }
            zzagiVar.zzl();
            zzafr zzafrVarZza = this.zzb.zza(zzagiVar, zzafpVar.zzd());
            int iZzd = zzafrVarZza.zzd();
            if (iZzd == -3) {
                zze(false, jZzh);
                return zzf(zzagiVar, jZzh, zzahhVar);
            }
            if (iZzd == -2) {
                zzafpVar.zzf(zzafrVarZza.zze(), zzafrVarZza.zzf());
            } else {
                if (iZzd != -1) {
                    zzg(zzagiVar, zzafrVarZza.zzf());
                    zze(true, zzafrVarZza.zzf());
                    return zzf(zzagiVar, zzafrVarZza.zzf(), zzahhVar);
                }
                zzafpVar.zzg(zzafrVarZza.zze(), zzafrVarZza.zzf());
            }
        }
    }

    public final void zze(boolean z10, long j10) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
