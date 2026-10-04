package com.google.android.gms.internal.common;

import androidx.multidex.d;

/* JADX INFO: loaded from: classes4.dex */
public final class zzai {
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(d.a(new StringBuilder(String.valueOf(i11).length() + 9), "at index ", i11));
            }
        }
        return objArr;
    }
}
