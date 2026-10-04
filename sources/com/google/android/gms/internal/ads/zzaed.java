package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.Nullable;
import e.InterfaceC4348w;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaed {
    private final zzaec zzb;
    private final zzaek zzc;
    private boolean zzd;
    private long zzg;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zze = 0;
    private long zzf = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzdp zzk = zzdp.zza;
    private long zza = 50000;

    public zzaed(Context context, zzaec zzaecVar, long j10) {
        this.zzb = zzaecVar;
        this.zzc = new zzaek(context);
    }

    private final void zzp(int i10) {
        this.zze = Math.min(this.zze, i10);
    }

    public final void zza(long j10) {
        this.zza = 50000L;
    }

    public final void zzb(int i10) {
        if (i10 == 0) {
            this.zze = 1;
        } else if (i10 != 1) {
            zzp(2);
        } else {
            this.zze = 0;
        }
        this.zzc.zzd();
    }

    public final void zzc() {
        this.zzd = true;
        this.zzg = zzfm.zzt(this.zzk.zzb());
        this.zzc.zzb();
    }

    public final void zzd() {
        this.zzd = false;
        this.zzh = -9223372036854775807L;
        this.zzc.zzg();
    }

    public final void zze(@Nullable Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzc.zzc(surface);
        zzp(1);
    }

    public final void zzf(float f10) {
        this.zzc.zzf(f10);
    }

    public final boolean zzg() {
        int i10 = this.zze;
        this.zze = 3;
        this.zzg = zzfm.zzt(this.zzk.zzb());
        return i10 != 3;
    }

    public final void zzh(zzdp zzdpVar) {
        this.zzk = zzdpVar;
    }

    public final void zzi() {
        if (this.zze == 0) {
            this.zze = 1;
        }
    }

    public final boolean zzj(boolean z10) {
        if (z10 && (this.zze == 3 || (this.zzm && !this.zzl))) {
            this.zzh = -9223372036854775807L;
            return true;
        }
        if (this.zzh == -9223372036854775807L) {
            return false;
        }
        if (this.zzk.zzb() < this.zzh) {
            return true;
        }
        this.zzh = -9223372036854775807L;
        return false;
    }

    public final void zzk(boolean z10) {
        this.zzi = z10;
        this.zzh = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (r8 > 100000) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        if (r31 >= r35) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bf, code lost:
    
        if (r28.zzd != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzl(long r29, long r31, long r33, long r35, boolean r37, boolean r38, long r39, long r41, com.google.android.gms.internal.ads.zzaeb r43) throws com.google.android.gms.internal.ads.zzjn {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaed.zzl(long, long, long, long, boolean, boolean, long, long, com.google.android.gms.internal.ads.zzaeb):int");
    }

    public final void zzm() {
        this.zzc.zzd();
        this.zzf = -9223372036854775807L;
        zzp(1);
        this.zzh = -9223372036854775807L;
        this.zzm = false;
    }

    public final void zzn(int i10) {
        this.zzc.zza(i10);
    }

    public final void zzo(@InterfaceC4348w(from = 0.0d, fromInclusive = false) float f10) {
        zzguk.zza(f10 > 0.0f);
        if (f10 == this.zzj) {
            return;
        }
        this.zzj = f10;
        this.zzc.zze(f10);
    }
}
