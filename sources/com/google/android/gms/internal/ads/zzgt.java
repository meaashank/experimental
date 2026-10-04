package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgt {
    public final int zza;
    public final ByteBuffer zzb;

    private zzgt(int i10, ByteBuffer byteBuffer) {
        this.zza = i10;
        this.zzb = byteBuffer;
    }

    public static zzgt zza(zzgv zzgvVar) {
        zzguk.zza(zzgvVar.zza == 5);
        ByteBuffer byteBufferAsReadOnlyBuffer = zzgvVar.zzb.asReadOnlyBuffer();
        return new zzgt(zzgx.zzd(byteBufferAsReadOnlyBuffer), byteBufferAsReadOnlyBuffer);
    }
}
