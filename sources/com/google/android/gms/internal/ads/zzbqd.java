package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzbqd implements zzbqh {
    static final /* synthetic */ zzbqd zza = new zzbqd();

    private /* synthetic */ zzbqd() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcnf zzcnfVar = (zzcnf) obj;
        zzbqh zzbqhVar = zzbqg.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i10 = Integer.parseInt(str);
            int i11 = Integer.parseInt(str2);
            int i12 = Integer.parseInt(str3);
            zzbbd zzbbdVarZzS = zzcnfVar.zzS();
            if (zzbbdVarZzS != null) {
                zzbbdVarZzS.zzb().zze(i10, i11, i12);
            }
        } catch (NumberFormatException unused) {
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse touch parameters from gmsg.");
        }
    }
}
