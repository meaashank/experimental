package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgv {
    public static final byte[] zza;

    static {
        byte[] bArr = new byte[0];
        zza = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zzfr(bArr, 0, 0, false, null).zza(0);
        } catch (zzhb e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int zzb(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
