package com.google.android.gms.internal.drive;

import com.google.common.base.Ascii;
import okio.h0;

/* JADX INFO: loaded from: classes4.dex */
final class zzng {
    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b10, char[] cArr, int i10) {
        cArr[i10] = (char) b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzd(byte b10) {
        return b10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zze(byte b10) {
        return b10 < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzf(byte b10) {
        return b10 < -16;
    }

    private static boolean zzg(byte b10) {
        return b10 > -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b10, byte b11, char[] cArr, int i10) throws zzkq {
        if (b10 < -62 || zzg(b11)) {
            throw zzkq.zzdn();
        }
        cArr[i10] = (char) (((b10 & Ascii.US) << 6) | (b11 & h0.f225962a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b10, byte b11, byte b12, char[] cArr, int i10) throws zzkq {
        if (!zzg(b11) && ((b10 != -32 || b11 >= -96) && ((b10 != -19 || b11 < -96) && !zzg(b12)))) {
            cArr[i10] = (char) (((b10 & Ascii.SI) << 12) | ((b11 & h0.f225962a) << 6) | (b12 & h0.f225962a));
            return;
        }
        throw zzkq.zzdn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws zzkq {
        if (!zzg(b11)) {
            if ((((b11 + 112) + (b10 << Ascii.FS)) >> 30) == 0 && !zzg(b12) && !zzg(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & h0.f225962a) << 12) | ((b12 & h0.f225962a) << 6) | (b13 & h0.f225962a);
                cArr[i10] = (char) ((i11 >>> 10) + h0.f225965d);
                cArr[i10 + 1] = (char) ((i11 & 1023) + h0.f225966e);
                return;
            }
        }
        throw zzkq.zzdn();
    }
}
