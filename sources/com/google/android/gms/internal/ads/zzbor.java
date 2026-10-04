package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbor extends zzbny {
    final /* synthetic */ zzbos zza;

    public /* synthetic */ zzbor(zzbos zzbosVar, byte[] bArr) {
        Objects.requireNonNull(zzbosVar);
        this.zza = zzbosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zze(zzbnm zzbnmVar) {
        zzbos zzbosVar = this.zza;
        zzbosVar.zzc().zzb(zzbosVar.zze(zzbnmVar));
    }
}
