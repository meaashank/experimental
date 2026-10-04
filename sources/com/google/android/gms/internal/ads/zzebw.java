package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;

/* JADX INFO: loaded from: classes4.dex */
public final class zzebw {
    private final zzbri zza;

    public zzebw(zzbri zzbriVar) {
        this.zza = zzbriVar;
    }

    private final void zzs(zzebv zzebvVar) throws RemoteException {
        String strZza = zzebvVar.zza();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
        this.zza.zza(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzebv(MobileAdsBridgeBase.initializeMethodName, null));
    }

    public final void zzb(long j10) throws RemoteException {
        zzebv zzebvVar = new zzebv("creation", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("nativeObjectCreated");
        zzs(zzebvVar);
    }

    public final void zzc(long j10) throws RemoteException {
        zzebv zzebvVar = new zzebv("creation", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("nativeObjectNotCreated");
        zzs(zzebvVar);
    }

    public final void zzd(long j10) throws RemoteException {
        zzebv zzebvVar = new zzebv("interstitial", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzebvVar);
    }

    public final void zze(long j10) throws RemoteException {
        zzebv zzebvVar = new zzebv("interstitial", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("onAdLoaded");
        zzs(zzebvVar);
    }

    public final void zzf(long j10, int i10) throws RemoteException {
        zzebv zzebvVar = new zzebv("interstitial", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("onAdFailedToLoad");
        zzebvVar.zzd(Integer.valueOf(i10));
        zzs(zzebvVar);
    }

    public final void zzg(long j10) throws RemoteException {
        zzebv zzebvVar = new zzebv("interstitial", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("onAdOpened");
        zzs(zzebvVar);
    }

    public final void zzh(long j10) throws RemoteException {
        zzebv zzebvVar = new zzebv("interstitial", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("onAdClicked");
        this.zza.zza(zzebvVar.zza());
    }

    public final void zzi(long j10) throws RemoteException {
        zzebv zzebvVar = new zzebv("interstitial", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("onAdClosed");
        zzs(zzebvVar);
    }

    public final void zzj(long j10) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzebvVar);
    }

    public final void zzk(long j10) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("onRewardedAdLoaded");
        zzs(zzebvVar);
    }

    public final void zzl(long j10, int i10) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("onRewardedAdFailedToLoad");
        zzebvVar.zzd(Integer.valueOf(i10));
        zzs(zzebvVar);
    }

    public final void zzm(long j10) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("onRewardedAdOpened");
        zzs(zzebvVar);
    }

    public final void zzn(long j10, int i10) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("onRewardedAdFailedToShow");
        zzebvVar.zzd(Integer.valueOf(i10));
        zzs(zzebvVar);
    }

    public final void zzo(long j10) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("onRewardedAdClosed");
        zzs(zzebvVar);
    }

    public final void zzp(long j10, zzccx zzccxVar) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("onUserEarnedReward");
        zzebvVar.zze(zzccxVar.zze());
        zzebvVar.zzf(Integer.valueOf(zzccxVar.zzf()));
        zzs(zzebvVar);
    }

    public final void zzq(long j10) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("onAdImpression");
        zzs(zzebvVar);
    }

    public final void zzr(long j10) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j10));
        zzebvVar.zzc("onAdClicked");
        zzs(zzebvVar);
    }
}
