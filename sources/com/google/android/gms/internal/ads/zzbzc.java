package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbzc extends NativeAd.Image {
    private final zzbmv zzb;

    @Nullable
    private final Drawable zzc;

    @Nullable
    private final Uri zzd;
    private final double zze;
    private final int zzf;
    private final int zzg;

    public zzbzc(zzbmv zzbmvVar) {
        Uri uriZzb;
        double dZzc;
        int iZzd;
        IObjectWrapper iObjectWrapperZza;
        this.zzb = zzbmvVar;
        Map mapZzf = null;
        try {
            iObjectWrapperZza = zzbmvVar.zza();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
        Drawable drawable = iObjectWrapperZza != null ? (Drawable) ObjectWrapper.unwrap(iObjectWrapperZza) : null;
        this.zzc = drawable;
        try {
            uriZzb = this.zzb.zzb();
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
            uriZzb = null;
        }
        this.zzd = uriZzb;
        try {
            dZzc = this.zzb.zzc();
        } catch (RemoteException e12) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e12);
            dZzc = 1.0d;
        }
        this.zze = dZzc;
        int iZze = -1;
        try {
            iZzd = this.zzb.zzd();
        } catch (RemoteException e13) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e13);
            iZzd = -1;
        }
        this.zzf = iZzd;
        try {
            iZze = this.zzb.zze();
        } catch (RemoteException e14) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e14);
        }
        this.zzg = iZze;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeX)).booleanValue()) {
            try {
                mapZzf = this.zzb.zzf();
            } catch (RemoteException unused) {
            }
        }
        this.zza = mapZzf;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    @Nullable
    public final Drawable getDrawable() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    @Nullable
    public final Uri getUri() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zzb() {
        return this.zzg;
    }
}
