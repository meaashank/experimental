package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhnx {
    public static final zzich zza = zzich.zza(new byte[0]);

    public static final zzich zza(int i10) {
        return zzich.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final zzich zzb(int i10) {
        return zzich.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
