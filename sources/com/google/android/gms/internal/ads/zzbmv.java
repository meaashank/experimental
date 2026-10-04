package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface zzbmv extends IInterface {
    IObjectWrapper zza() throws RemoteException;

    Uri zzb() throws RemoteException;

    double zzc() throws RemoteException;

    int zzd() throws RemoteException;

    int zze() throws RemoteException;

    @Nullable
    Map zzf() throws RemoteException;
}
