package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzdot implements zzcyo {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zziol zzd;
    private final zzdrb zze;

    public zzdot(Map map, Map map2, Map map3, zziol zziolVar, zzdrb zzdrbVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zziolVar;
        this.zze = zzdrbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    @Nullable
    public final zzemq zza(int i10, String str) {
        zzemq zzemqVarZza;
        zzemq zzemqVar = (zzemq) this.zza.get(str);
        if (zzemqVar != null) {
            return zzemqVar;
        }
        if (i10 != 1) {
            if (i10 != 4) {
                return null;
            }
            zzeow zzeowVar = (zzeow) this.zzc.get(str);
            if (zzeowVar != null) {
                return zzcyt.zza(zzeowVar);
            }
            zzemqVarZza = (zzemq) this.zzb.get(str);
            if (zzemqVarZza == null) {
                return null;
            }
        } else if (this.zze.zzd() == null || (zzemqVarZza = ((zzcyo) this.zzd.zzb()).zza(i10, str)) == null) {
            return null;
        }
        return zzcyt.zzb(zzemqVarZza);
    }
}
