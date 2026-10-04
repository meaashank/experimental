package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzek {
    public static void zza(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(androidx.multidex.d.a(new StringBuilder(String.valueOf(i10).length() + 4), "csd-", i10), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static void zzb(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }
}
