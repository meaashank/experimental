package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzcda;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface zzch extends IInterface {
    void zze(List list, zzcb zzcbVar) throws RemoteException;

    boolean zzf(String str) throws RemoteException;

    @Nullable
    zzcda zzg(String str) throws RemoteException;

    boolean zzh(String str) throws RemoteException;

    @Nullable
    zzbgz zzi(String str) throws RemoteException;

    boolean zzj(String str) throws RemoteException;

    @Nullable
    zzbu zzk(String str) throws RemoteException;

    void zzl(zzbvu zzbvuVar) throws RemoteException;

    boolean zzm(String str, zzfp zzfpVar, @Nullable zzce zzceVar) throws RemoteException;

    boolean zzn(int i10, String str) throws RemoteException;

    @Nullable
    zzbu zzo(String str) throws RemoteException;

    @Nullable
    zzbgz zzp(String str) throws RemoteException;

    @Nullable
    zzcda zzq(String str) throws RemoteException;

    @Nullable
    zzfp zzr(int i10, String str) throws RemoteException;

    Bundle zzs(int i10) throws RemoteException;

    int zzt(int i10, String str) throws RemoteException;

    boolean zzu(int i10, String str) throws RemoteException;

    void zzv(int i10) throws RemoteException;
}
