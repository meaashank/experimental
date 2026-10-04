package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import e.InterfaceC4326A;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfrj implements Runnable {

    @InterfaceC4326A("enabledLock")
    @e.f0
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdxx zzj;
    private final List zzk;
    private final zzcny zzl;
    private final zzccd zzn;

    @e.f0
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();

    @InterfaceC4326A("protoLock")
    private final zzfrn zzg = zzfrq.zzb();
    private String zzh = "";

    @InterfaceC4326A("initLock")
    private boolean zzm = false;

    public zzfrj(Context context, VersionInfoParcel versionInfoParcel, zzdxx zzdxxVar, zzejl zzejlVar, zzccd zzccdVar, zzcny zzcnyVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdxxVar;
        this.zzn = zzccdVar;
        this.zzl = zzcnyVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkk)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzj();
        } else {
            this.zzk = zzgxm.zzi();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbla.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbla.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                zBooleanValue = zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaN;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzfrn zzfrnVar = this.zzg;
                            bArrZzaN = ((zzfrq) zzfrnVar.zzbu()).zzaN();
                            zzfrnVar.zzc();
                        }
                        new zzejk(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid(), null).zza(new zzeji((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzke), 60000, new HashMap(), bArrZzaN, "application/x-protobuf", false));
                    } catch (Exception e10) {
                        if ((e10 instanceof zzefb) && ((zzefb) e10).zza() == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzt.zzh().zzi(e10, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzb(@Nullable final zzfqz zzfqzVar) {
        zzcgj.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfri
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(zzfqzVar);
            }
        });
    }

    public final /* synthetic */ void zzc(zzfqz zzfqzVar) {
        synchronized (zzd) {
            try {
                if (!this.zzm) {
                    this.zzm = true;
                    if (zza()) {
                        try {
                            com.google.android.gms.ads.internal.zzt.zzc();
                            this.zzh = com.google.android.gms.ads.internal.util.zzs.zzr(this.zze);
                        } catch (RemoteException | RuntimeException e10) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkf)).intValue();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznB)).booleanValue()) {
                            long j10 = iIntValue;
                            zzcgj.zzd.scheduleWithFixedDelay(this, j10, j10, TimeUnit.MILLISECONDS);
                        } else {
                            long j11 = iIntValue;
                            zzcgj.zzd.scheduleAtFixedRate(this, j11, j11, TimeUnit.MILLISECONDS);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkl)).booleanValue()) {
                            this.zzl.zza();
                        }
                    }
                }
            } finally {
            }
        }
        if (zza() && zzfqzVar != null) {
            synchronized (zzc) {
                try {
                    zzfrn zzfrnVar = this.zzg;
                    if (zzfrnVar.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkg)).intValue()) {
                        return;
                    }
                    zzfrk zzfrkVarZza = zzfrm.zza();
                    zzfrkVarZza.zzv(zzfqzVar.zzm());
                    zzfrkVarZza.zza(zzfqzVar.zzb());
                    zzfrkVarZza.zzb(zzfqzVar.zza());
                    zzfrkVarZza.zzw(3);
                    zzfrkVarZza.zzd(this.zzf.afmaVersion);
                    zzfrkVarZza.zze(this.zzh);
                    zzfrkVarZza.zzf(Build.VERSION.RELEASE);
                    zzfrkVarZza.zzg(Build.VERSION.SDK_INT);
                    zzfrkVarZza.zzx(zzfqzVar.zzo());
                    zzfrkVarZza.zzi(zzfqzVar.zzc());
                    zzfrkVarZza.zzj(this.zzi);
                    zzfrkVarZza.zzy(zzfqzVar.zzn());
                    zzfrkVarZza.zzk(zzfqzVar.zzd());
                    zzfrkVarZza.zzl(zzfqzVar.zze());
                    zzfrkVarZza.zzm(zzfqzVar.zzf());
                    zzfrkVarZza.zzn(this.zzj.zzd(zzfqzVar.zzf()));
                    zzfrkVarZza.zzo(zzfqzVar.zzg());
                    zzfrkVarZza.zzs(zzfqzVar.zzh());
                    zzfrkVarZza.zzr(zzfqzVar.zzk());
                    zzfrkVarZza.zzp(zzfqzVar.zzi());
                    zzfrkVarZza.zzq(zzfqzVar.zzj());
                    zzfrkVarZza.zzc(zzfqzVar.zzl());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkk)).booleanValue()) {
                        zzfrkVarZza.zzh(this.zzk);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkl)).booleanValue()) {
                        zzcny zzcnyVar = this.zzl;
                        zzija zzijaVarZzd = zzcnyVar.zzd();
                        String strZzc = zzcnyVar.zzc();
                        if (zzijaVarZzd != null) {
                            zzfrkVarZza.zzt(zzijaVarZzd);
                        }
                        if (strZzc != null) {
                            zzfrkVarZza.zzu(strZzc);
                        }
                    }
                    zzfro zzfroVarZza = zzfrp.zza();
                    zzfroVarZza.zza(zzfrkVarZza);
                    zzfrnVar.zzb(zzfroVarZza);
                } finally {
                }
            }
        }
    }
}
