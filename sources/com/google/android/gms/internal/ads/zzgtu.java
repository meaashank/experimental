package com.google.android.gms.internal.ads;

import kotlin.text.C5017i;

/* JADX INFO: loaded from: classes4.dex */
final class zzgtu extends zzgtt {
    private final char zza;

    public zzgtu(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i10 = this.zza;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = C5017i.f218346b.charAt(i10 & 15);
            i10 >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return androidx.compose.animation.core.E0.a(new StringBuilder(String.valueOf(strCopyValueOf).length() + 18), "CharMatcher.is('", strCopyValueOf, "')");
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    public final boolean zzb(char c10) {
        return c10 == this.zza;
    }
}
