package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class zzwn implements zzvq {
    private final MediaCodec zza;

    public zzwn(MediaCodec mediaCodec) {
        this.zza = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzb(int i10, int i11, int i12, long j10, int i13) {
        this.zza.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzc(int i10, int i11, zziv zzivVar, long j10, int i12) {
        this.zza.queueSecureInputBuffer(i10, 0, zzivVar.zzb(), j10, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzd(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzg() {
    }
}
