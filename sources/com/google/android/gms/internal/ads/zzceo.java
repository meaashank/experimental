package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class zzceo implements zzbfg {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzceo(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final void zza(boolean z10) {
        zzcer zzcerVarZzD = com.google.android.gms.ads.internal.zzt.zzD();
        Context context = this.zza;
        if (zzcerVarZzD.zzb(context)) {
            synchronized (this.zzb) {
                try {
                    if (this.zzd == z10) {
                        return;
                    }
                    this.zzd = z10;
                    String str = this.zzc;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.zzd) {
                        com.google.android.gms.ads.internal.zzt.zzD().zze(context, str);
                    } else {
                        com.google.android.gms.ads.internal.zzt.zzD().zzf(context, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzdj(zzbff zzbffVar) {
        zza(zzbffVar.zzj);
    }
}
