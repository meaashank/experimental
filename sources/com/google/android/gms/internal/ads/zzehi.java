package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
final class zzehi implements zzdgv {
    private final Context zza;
    private final zzcer zzb;

    public zzehi(Context context, zzcer zzcerVar) {
        this.zza = context;
        this.zzb = zzcerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdP(zzcbv zzcbvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdQ(zzflo zzfloVar) {
        String str = zzfloVar.zzb.zzb.zze;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzcer zzcerVar = this.zzb;
        Context context = this.zza;
        zzcerVar.zzd(context, zzfloVar.zza.zza.zzd);
        zzcerVar.zzn(context, str);
    }
}
