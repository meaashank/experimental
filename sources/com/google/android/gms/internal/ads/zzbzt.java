package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public interface zzbzt extends IInterface {
    void zzG(int i10, String[] strArr, int[] iArr) throws RemoteException;

    void zzd() throws RemoteException;

    void zze() throws RemoteException;

    boolean zzf() throws RemoteException;

    void zzg(@Nullable Bundle bundle) throws RemoteException;

    void zzh() throws RemoteException;

    void zzi() throws RemoteException;

    void zzj() throws RemoteException;

    void zzk() throws RemoteException;

    void zzl(int i10, int i11, Intent intent) throws RemoteException;

    void zzm(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzn(Bundle bundle) throws RemoteException;

    void zzo() throws RemoteException;

    void zzp() throws RemoteException;

    void zzr() throws RemoteException;
}
