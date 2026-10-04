package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzay extends zzau implements zzba {
    public zzay(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public final void zza(String str, String str2, zzbc zzbcVar) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        zzaw.zzc(parcelZzu, zzbcVar);
        zzx(1, parcelZzu);
    }
}
