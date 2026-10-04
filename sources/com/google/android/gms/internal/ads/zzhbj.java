package com.google.android.gms.internal.ads;

import androidx.collection.LruCacheKt;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.internal.C5091z;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhbj extends zzhbk {
    public static int zza(long j10) {
        int i10 = (int) j10;
        zzguk.zze(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int zzb(long j10) {
        if (j10 > LruCacheKt.f86729a) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int zzc(int i10, int i11, int i12) {
        zzguk.zzg(true, "min (%s) must be less than or equal to max (%s)", i11, C5091z.f220373j);
        return Math.min(Math.max(i10, i11), C5091z.f220373j);
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        zzguk.zzg(length >= 4, "array too small: %s < %s", length, 4);
        return zze(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int zze(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << Ascii.CAN) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int[] zzf(Collection collection) {
        if (collection instanceof zzhbi) {
            zzhbi zzhbiVar = (zzhbi) collection;
            return Arrays.copyOfRange(zzhbiVar.zza, zzhbiVar.zzb, zzhbiVar.zzc);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List zzg(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new zzhbi(iArr, 0, length);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer zzh(java.lang.String r11, int r12) {
        /*
            r11.getClass()
            boolean r12 = r11.isEmpty()
            r0 = 0
            if (r12 == 0) goto Ld
        La:
            r11 = r0
            goto L6f
        Ld:
            r12 = 0
            char r1 = r11.charAt(r12)
            r2 = 45
            if (r1 != r2) goto L17
            r12 = 1
        L17:
            int r3 = r11.length()
            if (r12 != r3) goto L1e
            goto La
        L1e:
            int r3 = r12 + 1
            char r12 = r11.charAt(r12)
            int r12 = com.google.android.gms.internal.ads.zzhbl.zza(r12)
            if (r12 < 0) goto La
            r4 = 10
            if (r12 < r4) goto L2f
            goto La
        L2f:
            int r12 = -r12
            long r5 = (long) r12
        L31:
            int r12 = r11.length()
            r7 = -9223372036854775808
            if (r3 >= r12) goto L5e
            int r12 = r3 + 1
            char r3 = r11.charAt(r3)
            int r3 = com.google.android.gms.internal.ads.zzhbl.zza(r3)
            if (r3 < 0) goto La
            if (r3 >= r4) goto La
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 >= 0) goto L51
            goto La
        L51:
            r9 = 10
            long r5 = r5 * r9
            long r9 = (long) r3
            long r7 = r7 + r9
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L5b
            goto La
        L5b:
            long r5 = r5 - r9
            r3 = r12
            goto L31
        L5e:
            if (r1 != r2) goto L65
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            goto L6f
        L65:
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L6a
            goto La
        L6a:
            long r11 = -r5
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
        L6f:
            if (r11 == 0) goto L88
            long r1 = r11.longValue()
            int r12 = r11.intValue()
            long r3 = (long) r12
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 == 0) goto L7f
            goto L88
        L7f:
            int r11 = r11.intValue()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            return r11
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbj.zzh(java.lang.String, int):java.lang.Integer");
    }

    public static /* synthetic */ int zzi(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }
}
