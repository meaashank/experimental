package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbva {

    @e.f0
    static final com.google.android.gms.ads.internal.util.zzbc zza = new zzbuy();

    @e.f0
    static final com.google.android.gms.ads.internal.util.zzbc zzb = new zzbuz();
    private final zzbum zzc;

    public zzbva(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable zzfrj zzfrjVar) {
        this.zzc = new zzbum(context, versionInfoParcel, str, zza, zzb, zzfrjVar);
    }

    public final zzbuq zza(String str, zzbut zzbutVar, zzbus zzbusVar) {
        return new zzbve(this.zzc, str, zzbutVar, zzbusVar);
    }

    public final zzbvj zzb() {
        return new zzbvj(this.zzc);
    }

    public final void zzc() {
        this.zzc.zzc();
    }
}
