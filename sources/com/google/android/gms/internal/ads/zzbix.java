package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbix {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public /* synthetic */ zzbix(int i10, String str, Object obj, Object obj2, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzba.zzb().zza(this);
    }

    public static zzbix zzh(int i10, String str, int i11, int i12) {
        return new zzbit(1, str, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static zzbix zzi(int i10, String str, long j10, long j11) {
        return new zzbiu(1, str, Long.valueOf(j10), Long.valueOf(j11));
    }

    public static zzbix zzj(int i10, String str, float f10, float f11) {
        return new zzbiv(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static zzbix zzk(int i10, String str) {
        zzbiw zzbiwVar = new zzbiw(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzba.zzb().zzb(zzbiwVar);
        return zzbiwVar;
    }

    public static zzbix zzl(int i10, String str) {
        zzbiw zzbiwVar = new zzbiw(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzba.zzb().zzc(zzbiwVar);
        return zzbiwVar;
    }

    public abstract Object zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, Object obj);

    public abstract Object zzc(JSONObject jSONObject);

    public abstract Object zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final Object zzf() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzb() ? this.zzd : this.zzc;
    }

    public final Object zzg() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzd(this);
    }

    public final int zzm() {
        return this.zza;
    }
}
