package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzech implements zzebs {
    private final long zza;
    private final zzebw zzb;
    private final zzfku zzc;

    public zzech(long j10, Context context, zzebw zzebwVar, zzcob zzcobVar, String str) {
        this.zza = j10;
        this.zzb = zzebwVar;
        zzfkw zzfkwVarZzq = zzcobVar.zzq();
        zzfkwVarZzq.zzc(context);
        zzfkwVarZzq.zzb(str);
        this.zzc = zzfkwVarZzq.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzb(zzmVar, new zzecf(this));
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    public final void zzb() {
        try {
            zzfku zzfkuVar = this.zzc;
            zzfkuVar.zzd(new zzecg(this));
            zzfkuVar.zza(ObjectWrapper.wrap(null));
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    public final void zzc() {
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }

    public final /* synthetic */ zzebw zze() {
        return this.zzb;
    }
}
