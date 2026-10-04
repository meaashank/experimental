package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface zzak extends IInterface {
    void zzb(int i10, String[] strArr) throws RemoteException;

    void zzc(int i10, String[] strArr) throws RemoteException;

    void zzd(int i10, PendingIntent pendingIntent) throws RemoteException;
}
