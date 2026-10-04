package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcpi implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzcpi(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzcpi zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzcpi(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcbo zzb() {
        Context contextZza = ((zzcok) this.zza).zza();
        zzfrj zzfrjVar = (zzfrj) this.zzb.zzb();
        zzhdi zzhdiVarZzc = zzfoy.zzc();
        zzbva zzbvaVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(contextZza, VersionInfoParcel.forPackage(), zzfrjVar);
        zzbuu zzbuuVar = zzbux.zza;
        zzbvaVarZza.zza("google.afma.request.getAdDictionary", zzbuuVar, zzbuuVar);
        return new zzcbr(contextZza, com.google.android.gms.ads.internal.zzt.zzr().zza(contextZza, VersionInfoParcel.forPackage(), zzfrjVar).zza("google.afma.sdkConstants.getSdkConstants", zzbuuVar, zzbuuVar), VersionInfoParcel.forPackage(), zzhdiVarZzc);
    }
}
