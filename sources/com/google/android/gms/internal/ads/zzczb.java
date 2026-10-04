package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczb {
    private final zzflo zza;
    private final zzfld zzb;
    private final String zzc;

    public zzczb(zzflo zzfloVar, zzfld zzfldVar, @Nullable String str) {
        this.zza = zzfloVar;
        this.zzb = zzfldVar;
        this.zzc = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final zzflo zza() {
        return this.zza;
    }

    public final zzfld zzb() {
        return this.zzb;
    }

    public final zzflg zzc() {
        return this.zza.zzb.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }
}
