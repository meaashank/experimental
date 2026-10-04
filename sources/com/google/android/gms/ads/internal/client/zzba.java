package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbje;

/* JADX INFO: loaded from: classes3.dex */
public final class zzba {
    private static final zzba zza = new zzba();
    private final zzbiy zzb;
    private final zzbiz zzc;
    private final zzbje zzd;
    private final zzbip zze;

    public zzba() {
        zzbiy zzbiyVar = new zzbiy();
        zzbiz zzbizVar = new zzbiz();
        zzbje zzbjeVar = new zzbje();
        zzbip zzbipVar = new zzbip();
        this.zzb = zzbiyVar;
        this.zzc = zzbizVar;
        this.zzd = zzbjeVar;
        this.zze = zzbipVar;
    }

    public static zzbiz zza() {
        return zza.zzc;
    }

    public static zzbiy zzb() {
        return zza.zzb;
    }

    public static zzbje zzc() {
        return zza.zzd;
    }

    public static zzbip zzd() {
        return zza.zze;
    }
}
