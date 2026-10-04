package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcut {
    private final String zza;
    private final zzbvj zzb;
    private final Executor zzc;
    private zzcuy zzd;
    private final zzbqh zze = new zzcuq(this);
    private final zzbqh zzf = new zzcus(this);

    public zzcut(String str, zzbvj zzbvjVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbvjVar;
        this.zzc = executor;
    }

    public final void zza(zzcuy zzcuyVar) {
        zzbvj zzbvjVar = this.zzb;
        zzbvjVar.zzb("/updateActiveView", this.zze);
        zzbvjVar.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcuyVar;
    }

    public final void zzb(zzclm zzclmVar) {
        zzclmVar.zzab("/updateActiveView", this.zze);
        zzclmVar.zzab("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzc(zzclm zzclmVar) {
        zzclmVar.zzac("/updateActiveView", this.zze);
        zzclmVar.zzac("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzd() {
        zzbvj zzbvjVar = this.zzb;
        zzbvjVar.zzc("/updateActiveView", this.zze);
        zzbvjVar.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final /* synthetic */ boolean zze(Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.zza);
    }

    public final /* synthetic */ Executor zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzcuy zzg() {
        return this.zzd;
    }
}
