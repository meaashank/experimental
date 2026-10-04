package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public interface zzbxt extends IInterface {
    void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbxw zzbxwVar) throws RemoteException;

    zzbyi zzf() throws RemoteException;

    zzbyi zzg() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzea zzh() throws RemoteException;

    void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxh zzbxhVar, zzbwa zzbwaVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException;

    void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxk zzbxkVar, zzbwa zzbwaVar) throws RemoteException;

    boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxq zzbxqVar, zzbwa zzbwaVar) throws RemoteException;

    boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxn zzbxnVar, zzbwa zzbwaVar) throws RemoteException;

    void zzo(String str) throws RemoteException;

    void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxq zzbxqVar, zzbwa zzbwaVar) throws RemoteException;

    void zzq(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxh zzbxhVar, zzbwa zzbwaVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException;

    void zzr(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxn zzbxnVar, zzbwa zzbwaVar, zzbmk zzbmkVar) throws RemoteException;

    void zzs(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxe zzbxeVar, zzbwa zzbwaVar) throws RemoteException;

    boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException;
}
