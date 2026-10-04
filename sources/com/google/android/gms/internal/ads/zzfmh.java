package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfmh {
    public static zzbqh zza(final zzele zzeleVar, final zzfte zzfteVar, final zzcub zzcubVar, final zzdlw zzdlwVar) {
        return new zzbqh() { // from class: com.google.android.gms.internal.ads.zzfmg
            @Override // com.google.android.gms.internal.ads.zzbqh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzclm zzclmVar = (zzclm) obj;
                zzbqg.zzc(map, zzdlwVar);
                String str = (String) map.get("u");
                if (str == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                } else {
                    zzele zzeleVar2 = zzeleVar;
                    zzfte zzfteVar2 = zzfteVar;
                    zzhcy.zzr(zzbqg.zza(zzclmVar, str), new zzfme(zzclmVar, zzcubVar, zzfteVar2, zzeleVar2), zzcgj.zza);
                }
            }
        };
    }

    public static zzbqh zzb(final zzele zzeleVar, final zzfte zzfteVar) {
        return new zzbqh() { // from class: com.google.android.gms.internal.ads.zzfmf
            @Override // com.google.android.gms.internal.ads.zzbqh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcld zzcldVar = (zzcld) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                zzfld zzfldVarZzC = zzcldVar.zzC();
                if (zzfldVarZzC != null && !zzfldVarZzC.zzai) {
                    zzfteVar.zzb(str, zzfldVarZzC.zzax, null, null);
                    return;
                }
                zzflg zzflgVarZzaC = ((zzcmt) zzcldVar).zzaC();
                if (zzflgVarZzaC != null) {
                    zzeleVar.zze(new zzelg(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), zzflgVarZzaC.zzb, str, 2));
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                }
            }
        };
    }
}
