package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes4.dex */
@e.T(24)
final class zziu {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = com.google.android.exoplayer2.decoder.c.a(0, 0);

    public /* synthetic */ zziu(MediaCodec.CryptoInfo cryptoInfo, byte[] bArr) {
        this.zza = cryptoInfo;
    }

    public final /* synthetic */ void zza(int i10, int i11) {
        MediaCodec.CryptoInfo.Pattern pattern = this.zzb;
        pattern.set(i10, i11);
        this.zza.setPattern(pattern);
    }
}
