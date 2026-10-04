package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzecd implements zzebs {
    private final long zza;
    private final zzeui zzb;

    public zzecd(long j10, Context context, zzebw zzebwVar, zzcob zzcobVar, String str) {
        this.zza = j10;
        zzfji zzfjiVarZzn = zzcobVar.zzn();
        zzfjiVarZzn.zzd(context);
        zzfjiVarZzn.zzb(new com.google.android.gms.ads.internal.client.zzr());
        zzfjiVarZzn.zzc(str);
        zzeui zzeuiVarZza = zzfjiVarZzn.zza().zza();
        this.zzb = zzeuiVarZza;
        zzeuiVarZza.zzg(new zzecc(this, zzebwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzd(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    public final void zzb() {
        this.zzb.zzQ(ObjectWrapper.wrap(null));
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    public final void zzc() {
        this.zzb.zzb();
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }
}
