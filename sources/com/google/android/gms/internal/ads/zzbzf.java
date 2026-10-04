package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbzf extends zzbny {
    final /* synthetic */ zzbzg zza;

    public /* synthetic */ zzbzf(zzbzg zzbzgVar, byte[] bArr) {
        Objects.requireNonNull(zzbzgVar);
        this.zza = zzbzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zze(zzbnm zzbnmVar) {
        zzbzg zzbzgVar = this.zza;
        zzbzgVar.zzd().onCustomFormatAdLoaded(zzbzgVar.zzc(zzbnmVar));
    }
}
