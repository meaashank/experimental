package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeaj {
    private final zzeao zza;
    private final Executor zzb;
    private final Map zzc;

    public zzeaj(zzeao zzeaoVar, Executor executor) {
        this.zza = zzeaoVar;
        this.zzc = zzeaoVar.zza();
        this.zzb = executor;
    }

    public final zzeai zza() {
        zzeai zzeaiVar = new zzeai(this);
        zzeaiVar.zzj();
        return zzeaiVar;
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznn)).booleanValue()) {
            zzeai zzeaiVarZza = zza();
            zzeaiVarZza.zzc("action", "pecr");
            zzeaiVarZza.zzd();
        }
    }

    public final /* synthetic */ zzeao zzc() {
        return this.zza;
    }

    public final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    public final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
