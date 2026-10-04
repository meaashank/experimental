package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgrn extends zzbev implements zzgro {
    public zzgrn() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Bundle bundle = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
            zzbew.zzh(parcel);
            zza(bundle);
        } else {
            if (i10 != 2) {
                return false;
            }
            zzbew.zza(parcel);
            zzbew.zza(parcel);
            zzbew.zzh(parcel);
        }
        return true;
    }
}
