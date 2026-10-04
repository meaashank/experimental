package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbou extends zzboc {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbou(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    public final /* synthetic */ OnAdManagerAdViewLoadedListener zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final void zze(com.google.android.gms.ads.internal.client.zzbu zzbuVar, IObjectWrapper iObjectWrapper) {
        if (zzbuVar == null || iObjectWrapper == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzbuVar.zzv() instanceof com.google.android.gms.ads.internal.client.zzg) {
                com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbuVar.zzv();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzj() : null);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
        try {
            if (zzbuVar.zzu() instanceof zzbfv) {
                zzbfv zzbfvVar = (zzbfv) zzbuVar.zzu();
                adManagerAdView.setAppEventListener(zzbfvVar != null ? zzbfvVar.zzb() : null);
            }
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
        }
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzbot(this, adManagerAdView, zzbuVar));
    }
}
