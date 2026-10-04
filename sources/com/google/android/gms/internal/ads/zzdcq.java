package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdcq implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzflo zzc;
    private final zzfld zzd;
    private final Clock zze;
    private final zzeaj zzf;
    private final ScheduledExecutorService zzg;
    private final Object zzb = new Object();

    @e.f0
    final zzfsc zza = zzfsd.zza();
    private boolean zzh = false;
    private boolean zzi = false;

    public zzdcq(zzflo zzfloVar, zzfld zzfldVar, Clock clock, zzeaj zzeajVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = zzfloVar;
        this.zzd = zzfldVar;
        this.zze = clock;
        this.zzf = zzeajVar;
        this.zzg = scheduledExecutorService;
    }

    private final void zzn() {
        synchronized (this.zzb) {
            try {
                zzeaj zzeajVar = this.zzf;
                String str = this.zzc.zzb.zzb.zzb;
                String strEncodeToString = Base64.encodeToString(((zzfsd) this.zza.zzbu()).zzaN(), 1);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoB)).booleanValue()) {
                    zzeai zzeaiVarZza = zzeajVar.zza();
                    zzeaiVarZza.zzc("action", "pclma");
                    zzeaiVarZza.zzc("pclmd", strEncodeToString);
                    zzeaiVarZza.zzc("gqi", str);
                    zzeaiVarZza.zzf();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzo(int i10) {
        synchronized (this.zzb) {
            try {
                if (!this.zzi && this.zzh) {
                    zzfsc zzfscVar = this.zza;
                    zzfqs zzfqsVarZza = zzfqt.zza();
                    zzfqsVarZza.zzb(i10);
                    zzfqsVarZza.zza(this.zze.currentTimeMillis());
                    zzfscVar.zza((zzfqt) zzfqsVarZza.zzbu());
                    if (i10 == 10) {
                        zzn();
                        this.zzi = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(int i10) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzo(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzo(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        zzo(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzo(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzo(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzo(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        zzo(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        zzo(10);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final void zzl() {
        synchronized (this.zzb) {
            int i10 = this.zzd.zzaE;
            if (i10 > 0 && !this.zzh) {
                this.zza.zzb(this.zze.currentTimeMillis());
                this.zzh = true;
                this.zzg.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdcp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzm();
                    }
                }, i10, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final /* synthetic */ void zzm() {
        synchronized (this.zzb) {
            try {
                if (this.zzi) {
                    return;
                }
                this.zzi = true;
                zzn();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
