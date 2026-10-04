package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdrs {
    private final zzeaj zza;

    public zzdrs(zzeaj zzeajVar) {
        this.zza = zzeajVar;
    }

    public final void zza(@Nullable View view, zzfld zzfldVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoK)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(view) ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1";
        zzeai zzeaiVarZza = this.zza.zza();
        zzeaiVarZza.zzc("action", "hcp");
        zzeaiVarZza.zzc("hcp", str);
        zzeaiVarZza.zzb(zzfldVar);
        zzeaiVarZza.zzd();
    }
}
