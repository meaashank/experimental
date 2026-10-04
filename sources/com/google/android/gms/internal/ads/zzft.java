package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzft {
    public static boolean zza(int i10, int i11) {
        if ((i10 >> 18) == 0) {
            return i10 == 0 || Integer.bitCount(i10) == i11;
        }
        return false;
    }

    public static int zzb(int i10) {
        if (i10 == 0) {
            return -1;
        }
        return i10 << 2;
    }
}
