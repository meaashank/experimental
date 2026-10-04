package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzbma implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ zzbma zza = new zzbma();

    private /* synthetic */ zzbma() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
        return iInterfaceQueryLocalInterface instanceof zzbmc ? (zzbmc) iInterfaceQueryLocalInterface : new zzbmc(iBinder);
    }
}
