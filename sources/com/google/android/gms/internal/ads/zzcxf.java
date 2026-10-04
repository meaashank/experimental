package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcxf implements zzdej {

    @Nullable
    private final zzclm zza;
    private final zzeaj zzb;
    private final zzfld zzc;

    public zzcxf(@Nullable zzclm zzclmVar, zzeaj zzeajVar, zzfld zzfldVar) {
        this.zza = zzclmVar;
        this.zzb = zzeajVar;
        this.zzc = zzfldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zzdr() {
        zzclm zzclmVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoK)).booleanValue() || (zzclmVar = this.zza) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(zzclmVar.zzE()) ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1";
        zzeai zzeaiVarZza = this.zzb.zza();
        zzeaiVarZza.zzc("action", "hcp");
        zzeaiVarZza.zzc("hcp", str);
        zzeaiVarZza.zzb(this.zzc);
        zzeaiVarZza.zzd();
    }
}
