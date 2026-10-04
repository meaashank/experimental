package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcny {

    @Nullable
    private String zza;

    @Nullable
    private zzija zzb;

    @Nullable
    private zzims zzc;
    private final ScheduledExecutorService zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    public zzcny(zzcnl zzcnlVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzd = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        try {
            String strN = I2.H0.d("GET_VARIATIONS_HEADER") ? H2.t.n() : null;
            if (strN != null && !strN.isEmpty()) {
                this.zza = strN;
                byte[] bArrDecode = Base64.decode(strN, 10);
                this.zzb = zzija.zzc(bArrDecode, zziew.zzc());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzko)).booleanValue()) {
                    this.zzc = zzims.zzc(bArrDecode, zziew.zzc());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkm)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkl)).booleanValue()) {
                        this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnx
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zze();
                            }
                        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkn)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (zzige e10) {
            e = e10;
            com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "ChromeVariations");
        } catch (IllegalArgumentException e11) {
            e = e11;
            com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "ChromeVariations");
        }
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkl)).booleanValue() && !this.zze.getAndSet(true)) {
            zze();
        }
    }

    @Nullable
    public final String zzb() {
        zzims zzimsVar = this.zzc;
        if (zzimsVar != null) {
            return Base64.encodeToString(zzimsVar.zzaN(), 10);
        }
        return null;
    }

    @Nullable
    public final String zzc() {
        return this.zza;
    }

    @Nullable
    public final zzija zzd() {
        return this.zzb;
    }
}
