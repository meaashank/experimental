package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdpn {
    private final JSONObject zza;
    private final zzdvv zzb;

    @Nullable
    private final com.google.android.gms.ads.internal.zzb zzc;

    @Nullable
    private final zzcef zzd;

    public zzdpn(JSONObject jSONObject, zzdvv zzdvvVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzcef zzcefVar) {
        this.zza = jSONObject;
        this.zzb = zzdvvVar;
        this.zzc = zzbVar;
        this.zzd = zzcefVar;
    }

    @Nullable
    public final com.google.android.gms.ads.internal.zzb zza() {
        return this.zzc;
    }

    @Nullable
    public final zzcef zzb() {
        return this.zzd;
    }

    public final JSONObject zzc() {
        return this.zza;
    }

    public final zzdvv zzd() {
        return this.zzb;
    }
}
