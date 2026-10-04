package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbog;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbtc;

/* JADX INFO: loaded from: classes3.dex */
public interface zzbq extends IInterface {
    zzbn zze() throws RemoteException;

    void zzf(zzbh zzbhVar) throws RemoteException;

    void zzg(zzbnq zzbnqVar) throws RemoteException;

    void zzh(zzbnt zzbntVar) throws RemoteException;

    void zzi(String str, zzbnz zzbnzVar, @Nullable zzbnw zzbnwVar) throws RemoteException;

    void zzj(zzbmk zzbmkVar) throws RemoteException;

    void zzk(zzbod zzbodVar, zzr zzrVar) throws RemoteException;

    void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzm(zzbog zzbogVar) throws RemoteException;

    void zzn(zzbst zzbstVar) throws RemoteException;

    void zzo(zzbtc zzbtcVar) throws RemoteException;

    void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzq(zzcp zzcpVar) throws RemoteException;
}
