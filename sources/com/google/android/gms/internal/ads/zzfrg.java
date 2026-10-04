package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfrg implements Runnable {
    private final zzfrj zzb;
    private String zzc;
    private String zze;
    private zzfln zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfrl zzd = zzfrl.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzfrg(zzfrj zzfrjVar) {
        this.zzb = zzfrjVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfrg zza(zzfqw zzfqwVar) {
        try {
            if (((Boolean) zzbla.zzc.zze()).booleanValue()) {
                List list = this.zza;
                zzfqwVar.zzc();
                list.add(zzfqwVar);
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzh = zzcgj.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkh)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfrg zzb(ArrayList arrayList) {
        try {
            if (((Boolean) zzbla.zzc.zze()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                    this.zzi = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    this.zzi = 4;
                } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                    this.zzi = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                    this.zzi = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.zzi = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.zzi = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfrg zzc(String str) {
        if (((Boolean) zzbla.zzc.zze()).booleanValue() && zzfrf.zza(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfrg zzd(Bundle bundle) {
        if (((Boolean) zzbla.zzc.zze()).booleanValue()) {
            this.zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(bundle);
        }
        return this;
    }

    public final synchronized zzfrg zze(zzfln zzflnVar) {
        if (((Boolean) zzbla.zzc.zze()).booleanValue()) {
            this.zzf = zzflnVar;
        }
        return this;
    }

    public final synchronized zzfrg zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbla.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized zzfrg zzg(String str) {
        if (((Boolean) zzbla.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized void zzh() {
        try {
            if (((Boolean) zzbla.zzc.zze()).booleanValue()) {
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                List<zzfqw> list = this.zza;
                for (zzfqw zzfqwVar : list) {
                    int i10 = this.zzi;
                    if (i10 != 2) {
                        zzfqwVar.zzp(i10);
                    }
                    if (!TextUtils.isEmpty(this.zzc)) {
                        zzfqwVar.zze(this.zzc);
                    }
                    if (!TextUtils.isEmpty(this.zze) && !zzfqwVar.zzl()) {
                        zzfqwVar.zzi(this.zze);
                    }
                    zzfln zzflnVar = this.zzf;
                    if (zzflnVar != null) {
                        zzfqwVar.zzg(zzflnVar);
                    } else {
                        com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                        if (zzeVar != null) {
                            zzfqwVar.zzh(zzeVar);
                        }
                    }
                    zzfqwVar.zzf(this.zzd);
                    this.zzb.zzb(zzfqwVar.zzm());
                }
                list.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzfrg zzi(int i10) {
        if (((Boolean) zzbla.zzc.zze()).booleanValue()) {
            this.zzi = i10;
        }
        return this;
    }
}
