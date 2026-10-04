package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzdpk implements zzbqh {
    private final WeakReference zza;
    private final zzfte zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private final zzfrg zzd;

    public /* synthetic */ zzdpk(zzdpl zzdplVar, zzfte zzfteVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfrg zzfrgVar, byte[] bArr) {
        this.zza = new WeakReference(zzdplVar);
        this.zzb = zzfteVar;
        this.zzc = zzvVar;
        this.zzd = zzfrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zza(Object obj, Map map) {
        zzdpl zzdplVar = (zzdpl) this.zza.get();
        String str = (String) map.get("u");
        if (zzdplVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.zzb(str, this.zzc, this.zzd, zzdplVar.zzF());
    }
}
