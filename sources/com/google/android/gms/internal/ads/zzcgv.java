package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class zzcgv {
    private final zzcgo zza;
    private final AtomicInteger zzb;

    public zzcgv() {
        zzcgo zzcgoVar = new zzcgo();
        this.zza = zzcgoVar;
        this.zzb = new AtomicInteger(0);
        zzhcy.zzr(zzcgoVar, new zzcgt(this), zzcgj.zzh);
    }

    @Deprecated
    public final void zze(zzcgs zzcgsVar, zzcgq zzcgqVar) {
        zzhcy.zzr(this.zza, new zzcgu(this, zzcgsVar, zzcgqVar), zzcgj.zzh);
    }

    @Deprecated
    public final void zzf(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziL)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th, str);
        }
    }

    @Deprecated
    public final int zzi() {
        return this.zzb.get();
    }

    public final /* synthetic */ AtomicInteger zzj() {
        return this.zzb;
    }
}
