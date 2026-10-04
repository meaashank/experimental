package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaex {

    @Nullable
    private final Handler zza;

    @Nullable
    private final zzaey zzb;

    public zzaex(@Nullable Handler handler, @Nullable zzaey zzaeyVar) {
        if (zzaeyVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzaeyVar;
    }

    public final void zza(final zzje zzjeVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaew
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzl(zzjeVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaem
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(str, j10, j11);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, @Nullable final zzjf zzjfVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaen
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzn(zzvVar, zzjfVar);
                }
            });
        }
    }

    public final void zzd(final int i10, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(i10, j10);
                }
            });
        }
    }

    public final void zze(final long j10, final int i10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaep
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(j10, i10);
                }
            });
        }
    }

    public final void zzf(final zzbv zzbvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(zzbvVar);
                }
            });
        }
    }

    public final void zzg(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaer
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzh(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaes
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(str);
                }
            });
        }
    }

    public final void zzi(final zzje zzjeVar) {
        zzjeVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaet
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(zzjeVar);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(exc);
                }
            });
        }
    }

    public final void zzk(final zzjc zzjcVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaev
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(zzjcVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzl(zzje zzjeVar) {
        String str = zzfm.zza;
        this.zzb.zzb(zzjeVar);
    }

    public final /* synthetic */ void zzm(String str, long j10, long j11) {
        String str2 = zzfm.zza;
        this.zzb.zzc(str, j10, j11);
    }

    public final /* synthetic */ void zzn(zzv zzvVar, zzjf zzjfVar) {
        String str = zzfm.zza;
        this.zzb.zzd(zzvVar, zzjfVar);
    }

    public final /* synthetic */ void zzo(int i10, long j10) {
        String str = zzfm.zza;
        this.zzb.zze(i10, j10);
    }

    public final /* synthetic */ void zzp(long j10, int i10) {
        String str = zzfm.zza;
        this.zzb.zzj(j10, i10);
    }

    public final /* synthetic */ void zzq(zzbv zzbvVar) {
        String str = zzfm.zza;
        this.zzb.zzf(zzbvVar);
    }

    public final /* synthetic */ void zzr(Object obj, long j10) {
        String str = zzfm.zza;
        this.zzb.zzg(obj, j10);
    }

    public final /* synthetic */ void zzs(String str) {
        String str2 = zzfm.zza;
        this.zzb.zzh(str);
    }

    public final /* synthetic */ void zzt(zzje zzjeVar) {
        zzjeVar.zza();
        String str = zzfm.zza;
        this.zzb.zzi(zzjeVar);
    }

    public final /* synthetic */ void zzu(Exception exc) {
        String str = zzfm.zza;
        this.zzb.zzk(exc);
    }

    public final /* synthetic */ void zzv(zzjc zzjcVar) {
        String str = zzfm.zza;
        this.zzb.zzz(zzjcVar);
    }
}
