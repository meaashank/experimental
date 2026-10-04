package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public interface zzcda extends IInterface {
    void zza(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdh zzcdhVar) throws RemoteException;

    void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdh zzcdhVar) throws RemoteException;

    void zzd(zzcdd zzcddVar) throws RemoteException;

    void zze(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException;

    Bundle zzf() throws RemoteException;

    void zzg(zzcdo zzcdoVar) throws RemoteException;

    boolean zzh() throws RemoteException;

    String zzi() throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException;

    zzccx zzk() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzdx zzl() throws RemoteException;

    @Nullable
    String zzm() throws RemoteException;

    void zzn(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException;

    void zzo(boolean z10) throws RemoteException;

    long zzp() throws RemoteException;

    void zzq(long j10) throws RemoteException;

    void zzr(zzcdi zzcdiVar) throws RemoteException;
}
