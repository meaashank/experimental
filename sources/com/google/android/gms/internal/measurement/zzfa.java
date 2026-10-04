package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;

/* JADX INFO: loaded from: classes4.dex */
final class zzfa extends zzdy.zza {
    private final /* synthetic */ zzdk zzc;
    private final /* synthetic */ int zzd;
    private final /* synthetic */ zzdy zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfa(zzdy zzdyVar, zzdk zzdkVar, int i10) {
        super(zzdyVar);
        this.zzc = zzdkVar;
        this.zzd = i10;
        this.zze = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        ((zzdj) Preconditions.checkNotNull(this.zze.zzj)).getTestFlag(this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
