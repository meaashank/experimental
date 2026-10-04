package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzdpj implements zzbqh {
    private final WeakReference zza;
    private final WeakReference zzb;

    public /* synthetic */ zzdpj(zzdpl zzdplVar, View view, byte[] bArr) {
        this.zza = new WeakReference(zzdplVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoK)).booleanValue()) {
            this.zzb = new WeakReference(view);
        } else {
            this.zzb = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zza(Object obj, Map map) {
        zzdpl zzdplVar = (zzdpl) this.zza.get();
        if (zzdplVar == null) {
            return;
        }
        zzdplVar.zzC().zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoK)).booleanValue()) {
            zzdplVar.zzB((View) this.zzb.get());
        }
    }
}
