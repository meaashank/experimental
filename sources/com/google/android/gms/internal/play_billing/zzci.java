package com.google.android.gms.internal.play_billing;

import android.support.v4.media.c;

/* JADX INFO: loaded from: classes4.dex */
public final class zzci {
    public static Object zza(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(c.a("at index ", i10));
    }

    public static Object[] zzb(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            zza(objArr[i11], i11);
        }
        return objArr;
    }
}
