package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbmw extends NativeAd.Image {
    private final zzbmv zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbmw(zzbmv zzbmvVar) {
        double dZzc;
        int iZzd;
        IObjectWrapper iObjectWrapperZza;
        this.zza = zzbmvVar;
        Uri uriZzb = null;
        try {
            iObjectWrapperZza = zzbmvVar.zza();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
        Drawable drawable = iObjectWrapperZza != null ? (Drawable) ObjectWrapper.unwrap(iObjectWrapperZza) : null;
        this.zzb = drawable;
        try {
            uriZzb = this.zza.zzb();
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
        }
        this.zzc = uriZzb;
        try {
            dZzc = this.zza.zzc();
        } catch (RemoteException e12) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e12);
            dZzc = 1.0d;
        }
        this.zzd = dZzc;
        int iZze = -1;
        try {
            iZzd = this.zza.zzd();
        } catch (RemoteException e13) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e13);
            iZzd = -1;
        }
        this.zze = iZzd;
        try {
            iZze = this.zza.zze();
        } catch (RemoteException e14) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e14);
        }
        this.zzf = iZze;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.zzf;
    }
}
