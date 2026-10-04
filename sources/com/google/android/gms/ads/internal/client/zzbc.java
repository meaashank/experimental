package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbc extends zzbeu implements zzbe {
    public zzbc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbe
    public final void zza() throws RemoteException {
        zzdb(1, zzcZ());
    }
}
