package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcvl {
    private final zzeaj zza;
    private final zzflo zzb;

    public zzcvl(zzeaj zzeajVar, zzflo zzfloVar) {
        this.zza = zzeajVar;
        this.zzb = zzfloVar;
    }

    public final void zza(long j10, int i10) {
        zzeai zzeaiVarZza = this.zza.zza();
        zzeaiVarZza.zza(this.zzb.zzb.zzb);
        zzeaiVarZza.zzc("action", "ad_closed");
        zzeaiVarZza.zzc("show_time", String.valueOf(j10));
        zzeaiVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        int i11 = i10 - 1;
        zzeaiVarZza.zzc("acr", i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "u" : CampaignEx.KEY_ACTIVITY_PATH_AND_NAME : "cb" : P0.c.f65538f : "bb" : K9.h.f58477a);
        zzeaiVarZza.zzd();
    }
}
