package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeny extends zzbxg {
    final /* synthetic */ zzenz zza;
    private final zzemt zzb;

    public /* synthetic */ zzeny(zzenz zzenzVar, zzemt zzemtVar, byte[] bArr) {
        Objects.requireNonNull(zzenzVar);
        this.zza = zzenzVar;
        this.zzb = zzemtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzd((View) ObjectWrapper.unwrap(iObjectWrapper));
        ((zzeof) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zzf(String str) throws RemoteException {
        ((zzeof) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeof) this.zzb.zzc).zzx(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zzh(zzbwd zzbwdVar) throws RemoteException {
        this.zza.zze(zzbwdVar);
        ((zzeof) this.zzb.zzc).zzj();
    }
}
