package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzs extends com.google.android.gms.internal.p000authapi.zzc implements zzp {
    public zzs() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzc
    public final boolean zzc(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzp();
        } else {
            if (i10 != 2) {
                return false;
            }
            zzq();
        }
        return true;
    }
}
