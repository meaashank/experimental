package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhmi {
    private static final zzhmd zzb = new zzhmd(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final zzhmf zzc = new zzhmf(new zzhmg(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] zza = {-19, -45, -11, 92, Ascii.SUB, 99, Ascii.DC2, 88, -42, -100, -9, -94, -34, -7, -34, Ascii.DC4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static byte[] zza(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[64];
        int i11 = 0;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = i11 + i11;
            bArr2[i12] = (byte) (bArr[i11] & Ascii.SI);
            bArr2[i12 + 1] = (byte) ((bArr[i11] & 255) >> 4);
            i11++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < 63) {
            byte b10 = (byte) (bArr2[i13] + i14);
            bArr2[i13] = b10;
            int i15 = (b10 + 8) >> 4;
            bArr2[i13] = (byte) (b10 - (i15 << 4));
            i13++;
            i14 = i15;
        }
        bArr2[63] = (byte) (bArr2[63] + i14);
        zzhmf zzhmfVar = new zzhmf(zzc);
        zzhmh zzhmhVar = new zzhmh();
        for (i10 = 1; i10 < 64; i10 += 2) {
            zzhmd zzhmdVar = new zzhmd(zzb);
            zzk(zzhmdVar, i10 / 2, bArr2[i10]);
            zzhmh.zza(zzhmhVar, zzhmfVar);
            zzg(zzhmfVar, zzhmhVar, zzhmdVar);
        }
        zzhmg zzhmgVar = new zzhmg();
        zzhmg.zza(zzhmgVar, zzhmfVar);
        zzi(zzhmfVar, zzhmgVar);
        zzhmg.zza(zzhmgVar, zzhmfVar);
        zzi(zzhmfVar, zzhmgVar);
        zzhmg.zza(zzhmgVar, zzhmfVar);
        zzi(zzhmfVar, zzhmgVar);
        zzhmg.zza(zzhmgVar, zzhmfVar);
        zzi(zzhmfVar, zzhmgVar);
        for (int i16 = 0; i16 < 64; i16 += 2) {
            zzhmd zzhmdVar2 = new zzhmd(zzb);
            zzk(zzhmdVar2, i16 / 2, bArr2[i16]);
            zzhmh.zza(zzhmhVar, zzhmfVar);
            zzg(zzhmfVar, zzhmhVar, zzhmdVar2);
        }
        zzhmg zzhmgVar2 = new zzhmg(zzhmfVar);
        long[] jArr = new long[10];
        zzhmp.zzf(jArr, zzhmgVar2.zza);
        long[] jArr2 = new long[10];
        zzhmp.zzf(jArr2, zzhmgVar2.zzb);
        long[] jArr3 = new long[10];
        zzhmp.zzf(jArr3, zzhmgVar2.zzc);
        long[] jArr4 = new long[10];
        zzhmp.zzf(jArr4, jArr3);
        long[] jArr5 = new long[10];
        zzhmp.zzb(jArr5, jArr2, jArr);
        zzhmp.zze(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        zzhmp.zze(jArr6, jArr, jArr2);
        zzhmp.zze(jArr6, jArr6, zzhmk.zza);
        zzhmp.zza(jArr6, jArr6, jArr4);
        zzhmp.zzc(jArr6, jArr6);
        if (MessageDigest.isEqual(zzhmp.zzh(jArr5), zzhmp.zzh(jArr6))) {
            return zzhmgVar2.zzb();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        MessageDigest messageDigest = (MessageDigest) zzibh.zzd.zzb("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i10 = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i10;
        bArrDigest[31] = (byte) (i10 | 64);
        return bArrDigest;
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte b10;
        byte[] bArr4 = bArr2;
        byte[] bArr5 = bArr3;
        if (bArr4.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, 32, 64);
        int i10 = 31;
        while (true) {
            if (i10 < 0) {
                break;
            }
            int i11 = bArrCopyOfRange[i10] & 255;
            int i12 = zza[i10] & 255;
            if (i11 == i12) {
                i10--;
                bArr4 = bArr2;
                bArr5 = bArr3;
            } else if (i11 < i12) {
                MessageDigest messageDigest = (MessageDigest) zzibh.zzd.zzb("SHA-512");
                messageDigest.update(bArr4, 0, 32);
                messageDigest.update(bArr5);
                messageDigest.update(bArr);
                byte[] bArrDigest = messageDigest.digest();
                long jZzn = zzn(bArrDigest, 0) & 2097151;
                long jZzo = zzo(bArrDigest, 2) >> 5;
                long jZzn2 = zzn(bArrDigest, 5) >> 2;
                long jZzo2 = zzo(bArrDigest, 7) >> 7;
                long jZzo3 = zzo(bArrDigest, 10) >> 4;
                long jZzn3 = zzn(bArrDigest, 13) >> 1;
                long jZzo4 = zzo(bArrDigest, 15) >> 6;
                long jZzn4 = zzn(bArrDigest, 18) >> 3;
                long jZzn5 = zzn(bArrDigest, 21) & 2097151;
                long jZzo5 = zzo(bArrDigest, 23) >> 5;
                long jZzn6 = zzn(bArrDigest, 26) >> 2;
                long jZzo6 = zzo(bArrDigest, 28) >> 7;
                long jZzo7 = zzo(bArrDigest, 31) >> 4;
                long jZzn7 = zzn(bArrDigest, 34) >> 1;
                long jZzo8 = zzo(bArrDigest, 36) >> 6;
                long jZzn8 = zzn(bArrDigest, 39) >> 3;
                long jZzn9 = zzn(bArrDigest, 42) & 2097151;
                long jZzo9 = zzo(bArrDigest, 44) >> 5;
                long jZzn10 = (zzn(bArrDigest, 47) >> 2) & 2097151;
                long jZzo10 = (zzo(bArrDigest, 49) >> 7) & 2097151;
                long jZzo11 = (zzo(bArrDigest, 52) >> 4) & 2097151;
                long jZzn11 = (zzn(bArrDigest, 55) >> 1) & 2097151;
                long jZzo12 = (zzo(bArrDigest, 57) >> 6) & 2097151;
                long jZzo13 = zzo(bArrDigest, 60) >> 3;
                long j10 = (jZzo11 * 666643) + jZzn5;
                long j11 = (jZzo10 * 666643) + jZzn4;
                long j12 = (jZzn10 * 666643) + (jZzo4 & 2097151);
                long j13 = (j12 + 1048576) >> 21;
                long j14 = j13 << 21;
                long j15 = (jZzn10 * 654183) + (jZzo10 * 470296) + j10;
                long j16 = (j15 + 1048576) >> 21;
                long j17 = j16 << 21;
                long j18 = (jZzn10 * 136657) + (((jZzo11 * 654183) + ((jZzn11 * 470296) + ((jZzo12 * 666643) + (jZzn6 & 2097151)))) - (jZzo10 * 997805));
                long j19 = (j18 + 1048576) >> 21;
                long j20 = j19 << 21;
                long j21 = ((jZzo11 * 136657) + (((jZzo12 * 654183) + ((jZzo13 * 470296) + (jZzo7 & 2097151))) - (jZzn11 * 997805))) - (jZzo10 * 683901);
                long j22 = (j21 + 1048576) >> 21;
                long j23 = ((jZzo12 * 136657) + ((jZzo8 & 2097151) - (jZzo13 * 997805))) - (jZzn11 * 683901);
                long j24 = (j23 + 1048576) >> 21;
                long j25 = j24 << 21;
                long j26 = jZzn9 - (jZzo13 * 683901);
                long j27 = (j26 + 1048576) >> 21;
                long j28 = (jZzn10 * 470296) + j11 + j13;
                long j29 = (j28 + 1048576) >> 21;
                long j30 = j29 << 21;
                long j31 = (((jZzo10 * 654183) + ((jZzo11 * 470296) + ((jZzn11 * 666643) + (jZzo5 & 2097151)))) - (jZzn10 * 997805)) + j16;
                long j32 = (j31 + 1048576) >> 21;
                long j33 = j32 << 21;
                long j34 = (((jZzo10 * 136657) + (((jZzn11 * 654183) + ((jZzo12 * 470296) + ((jZzo13 * 666643) + (jZzo6 & 2097151)))) - (jZzo11 * 997805))) - (jZzn10 * 683901)) + j19;
                long j35 = (j34 + 1048576) >> 21;
                long j36 = j35 << 21;
                long j37 = (((jZzn11 * 136657) + (((jZzo13 * 654183) + (jZzn7 & 2097151)) - (jZzo12 * 997805))) - (jZzo11 * 683901)) + j22;
                long j38 = (j37 + 1048576) >> 21;
                long j39 = (((jZzo13 * 136657) + jZzn8) - (jZzo12 * 683901)) + j24;
                long j40 = (j39 + 1048576) >> 21;
                long j41 = (j21 - (j22 << 21)) + j35;
                long j42 = (j41 * 666643) + jZzn;
                long j43 = (j42 + 1048576) >> 21;
                long j44 = j43 << 21;
                long j45 = (j23 - j25) + j38;
                long j46 = j37 - (j38 << 21);
                long j47 = (j41 * 654183) + (j46 * 470296) + (j45 * 666643) + (jZzn2 & 2097151);
                long j48 = (j47 + 1048576) >> 21;
                long j49 = j48 << 21;
                long j50 = (j26 - (j27 << 21)) + j40;
                long j51 = j39 - (j40 << 21);
                long j52 = (j41 * 136657) + (((j45 * 654183) + ((j51 * 470296) + ((j50 * 666643) + (jZzo3 & 2097151)))) - (j46 * 997805));
                long j53 = (j52 + 1048576) >> 21;
                long j54 = j53 << 21;
                long j55 = (jZzo9 & 2097151) + j27;
                long j56 = ((j45 * 136657) + (((j50 * 654183) + ((j55 * 470296) + (j12 - j14))) - (j51 * 997805))) - (j46 * 683901);
                long j57 = (j56 + 1048576) >> 21;
                long j58 = j57 << 21;
                long j59 = ((j50 * 136657) + (((j15 - j17) + j29) - (j55 * 997805))) - (j51 * 683901);
                long j60 = (j59 + 1048576) >> 21;
                long j61 = j60 << 21;
                long j62 = ((j18 - j20) + j32) - (j55 * 683901);
                long j63 = (j62 + 1048576) >> 21;
                long j64 = j63 << 21;
                long j65 = (j41 * 470296) + (j46 * 666643) + (jZzo & 2097151) + j43;
                long j66 = (j65 + 1048576) >> 21;
                long j67 = (((j46 * 654183) + ((j45 * 470296) + ((j51 * 666643) + (jZzo2 & 2097151)))) - (j41 * 997805)) + j48;
                long j68 = (j67 + 1048576) >> 21;
                long j69 = (((j46 * 136657) + (((j51 * 654183) + ((j50 * 470296) + ((j55 * 666643) + (jZzn3 & 2097151)))) - (j45 * 997805))) - (j41 * 683901)) + j53;
                long j70 = (j69 + 1048576) >> 21;
                long j71 = (((j51 * 136657) + (((j55 * 654183) + (j28 - j30)) - (j50 * 997805))) - (j45 * 683901)) + j57;
                long j72 = (j71 + 1048576) >> 21;
                long j73 = (((j55 * 136657) + (j31 - j33)) - (j50 * 683901)) + j60;
                long j74 = (j73 + 1048576) >> 21;
                long j75 = (j34 - j36) + j63;
                long j76 = (j75 + 1048576) >> 21;
                long j77 = j76 << 21;
                long j78 = (j76 * 666643) + (j42 - j44);
                long j79 = j78 >> 21;
                long j80 = j79 << 21;
                long j81 = (j76 * 470296) + (j65 - (j66 << 21)) + j79;
                long j82 = j81 >> 21;
                long j83 = j82 << 21;
                long j84 = (j76 * 654183) + (j47 - j49) + j66 + j82;
                long j85 = j84 >> 21;
                long j86 = j85 << 21;
                long j87 = ((j67 - (j68 << 21)) - (j76 * 997805)) + j85;
                long j88 = j87 >> 21;
                long j89 = j88 << 21;
                long j90 = (j76 * 136657) + (j52 - j54) + j68 + j88;
                long j91 = j90 >> 21;
                long j92 = j91 << 21;
                long j93 = ((j69 - (j70 << 21)) - (j76 * 683901)) + j91;
                long j94 = j93 >> 21;
                long j95 = j94 << 21;
                long j96 = (j56 - j58) + j70 + j94;
                long j97 = j96 >> 21;
                long j98 = j97 << 21;
                long j99 = (j71 - (j72 << 21)) + j97;
                long j100 = j99 >> 21;
                long j101 = j100 << 21;
                long j102 = (j59 - j61) + j72 + j100;
                long j103 = j102 >> 21;
                long j104 = j103 << 21;
                long j105 = (j73 - (j74 << 21)) + j103;
                long j106 = j105 >> 21;
                long j107 = j106 << 21;
                long j108 = (j62 - j64) + j74 + j106;
                long j109 = j108 >> 21;
                long j110 = j109 << 21;
                long j111 = (j75 - j77) + j109;
                long j112 = j111 >> 21;
                long j113 = j112 << 21;
                long j114 = (666643 * j112) + (j78 - j80);
                long j115 = j114 >> 21;
                long j116 = j115 << 21;
                long j117 = (470296 * j112) + (j81 - j83) + j115;
                long j118 = j117 >> 21;
                long j119 = j118 << 21;
                long j120 = (654183 * j112) + (j84 - j86) + j118;
                long j121 = j120 >> 21;
                long j122 = j121 << 21;
                long j123 = ((j87 - j89) - (997805 * j112)) + j121;
                long j124 = j123 >> 21;
                long j125 = j124 << 21;
                long j126 = (136657 * j112) + (j90 - j92) + j124;
                long j127 = j126 >> 21;
                long j128 = j127 << 21;
                long j129 = ((j93 - j95) - (j112 * 683901)) + j127;
                long j130 = j129 >> 21;
                long j131 = j130 << 21;
                long j132 = (j96 - j98) + j130;
                long j133 = j132 >> 21;
                long j134 = j133 << 21;
                long j135 = (j99 - j101) + j133;
                long j136 = j135 >> 21;
                long j137 = j136 << 21;
                long j138 = (j102 - j104) + j136;
                long j139 = j138 >> 21;
                long j140 = j139 << 21;
                long j141 = (j105 - j107) + j139;
                long j142 = j141 >> 21;
                long j143 = j142 << 21;
                long j144 = (j108 - j110) + j142;
                long j145 = j144 >> 21;
                bArrDigest[0] = (byte) (j114 - j116);
                long j146 = j135 - j137;
                long j147 = j132 - j134;
                long j148 = j129 - j131;
                long j149 = j126 - j128;
                long j150 = j123 - j125;
                long j151 = j120 - j122;
                long j152 = j117 - j119;
                bArrDigest[1] = (byte) (r7 >> 8);
                bArrDigest[2] = (byte) ((r7 >> 16) | (j152 << 5));
                bArrDigest[3] = (byte) (j152 >> 3);
                bArrDigest[4] = (byte) (j152 >> 11);
                bArrDigest[5] = (byte) ((j152 >> 19) | (j151 << 2));
                bArrDigest[6] = (byte) (j151 >> 6);
                bArrDigest[7] = (byte) ((j151 >> 14) | (j150 << 7));
                bArrDigest[8] = (byte) (j150 >> 1);
                bArrDigest[9] = (byte) (j150 >> 9);
                bArrDigest[10] = (byte) ((j150 >> 17) | (j149 << 4));
                bArrDigest[11] = (byte) (j149 >> 4);
                bArrDigest[12] = (byte) (j149 >> 12);
                bArrDigest[13] = (byte) ((j149 >> 20) | (j148 + j148));
                bArrDigest[14] = (byte) (j148 >> 7);
                bArrDigest[15] = (byte) ((j148 >> 15) | (j147 << 6));
                bArrDigest[16] = (byte) (j147 >> 2);
                bArrDigest[17] = (byte) (j147 >> 10);
                bArrDigest[18] = (byte) ((j147 >> 18) | (j146 << 3));
                long j153 = j144 - (j145 << 21);
                long j154 = (j111 - j113) + j145;
                long j155 = j141 - j143;
                bArrDigest[19] = (byte) (j146 >> 5);
                bArrDigest[20] = (byte) (j146 >> 13);
                bArrDigest[21] = (byte) (j138 - j140);
                bArrDigest[22] = (byte) (r7 >> 8);
                bArrDigest[23] = (byte) ((r7 >> 16) | (j155 << 5));
                bArrDigest[24] = (byte) (j155 >> 3);
                bArrDigest[25] = (byte) (j155 >> 11);
                bArrDigest[26] = (byte) ((j155 >> 19) | (j153 << 2));
                bArrDigest[27] = (byte) (j153 >> 6);
                bArrDigest[28] = (byte) ((j153 >> 14) | (j154 << 7));
                bArrDigest[29] = (byte) (j154 >> 1);
                bArrDigest[30] = (byte) (j154 >> 9);
                bArrDigest[31] = (byte) (j154 >> 17);
                long[] jArr = new long[10];
                long[] jArrZzg = zzhmp.zzg(bArr5);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                zzhmp.zzf(jArr4, jArrZzg);
                zzhmp.zze(jArr5, jArr4, zzhmk.zza);
                zzhmp.zzb(jArr4, jArr4, jArr2);
                zzhmp.zza(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                zzhmp.zzf(jArr8, jArr5);
                zzhmp.zze(jArr8, jArr8, jArr5);
                zzhmp.zzf(jArr, jArr8);
                zzhmp.zze(jArr, jArr, jArr5);
                zzhmp.zze(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                zzhmp.zzf(jArr9, jArr);
                zzhmp.zzf(jArr10, jArr9);
                zzhmp.zzf(jArr10, jArr10);
                zzhmp.zze(jArr10, jArr, jArr10);
                zzhmp.zze(jArr9, jArr9, jArr10);
                zzhmp.zzf(jArr9, jArr9);
                zzhmp.zze(jArr9, jArr10, jArr9);
                zzhmp.zzf(jArr10, jArr9);
                for (int i13 = 1; i13 < 5; i13++) {
                    zzhmp.zzf(jArr10, jArr10);
                }
                zzhmp.zze(jArr9, jArr10, jArr9);
                zzhmp.zzf(jArr10, jArr9);
                for (int i14 = 1; i14 < 10; i14++) {
                    zzhmp.zzf(jArr10, jArr10);
                }
                zzhmp.zze(jArr10, jArr10, jArr9);
                zzhmp.zzf(jArr11, jArr10);
                for (int i15 = 1; i15 < 20; i15++) {
                    zzhmp.zzf(jArr11, jArr11);
                }
                zzhmp.zze(jArr10, jArr11, jArr10);
                zzhmp.zzf(jArr10, jArr10);
                for (int i16 = 1; i16 < 10; i16++) {
                    zzhmp.zzf(jArr10, jArr10);
                }
                zzhmp.zze(jArr9, jArr10, jArr9);
                zzhmp.zzf(jArr10, jArr9);
                for (int i17 = 1; i17 < 50; i17++) {
                    zzhmp.zzf(jArr10, jArr10);
                }
                zzhmp.zze(jArr10, jArr10, jArr9);
                zzhmp.zzf(jArr11, jArr10);
                for (int i18 = 1; i18 < 100; i18++) {
                    zzhmp.zzf(jArr11, jArr11);
                }
                zzhmp.zze(jArr10, jArr11, jArr10);
                zzhmp.zzf(jArr10, jArr10);
                for (int i19 = 1; i19 < 50; i19++) {
                    zzhmp.zzf(jArr10, jArr10);
                }
                zzhmp.zze(jArr9, jArr10, jArr9);
                zzhmp.zzf(jArr9, jArr9);
                zzhmp.zzf(jArr9, jArr9);
                zzhmp.zze(jArr, jArr9, jArr);
                zzhmp.zze(jArr, jArr, jArr8);
                zzhmp.zze(jArr, jArr, jArr4);
                zzhmp.zzf(jArr6, jArr);
                zzhmp.zze(jArr6, jArr6, jArr5);
                zzhmp.zzb(jArr7, jArr6, jArr4);
                if (zze(jArr7)) {
                    zzhmp.zza(jArr7, jArr6, jArr4);
                    if (zze(jArr7)) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                    zzhmp.zze(jArr, jArr, zzhmk.zzc);
                }
                if (zze(jArr)) {
                    b10 = 255;
                } else {
                    b10 = 255;
                    if (((bArr3[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                }
                if (zzf(jArr) == ((bArr3[31] & b10) >> 7)) {
                    zzm(jArr, jArr);
                }
                zzhmp.zze(jArr3, jArr, jArrZzg);
                zzhmh zzhmhVar = new zzhmh(new zzhmg(jArr, jArrZzg, jArr2), jArr3);
                zzhme[] zzhmeVarArr = new zzhme[8];
                zzhmeVarArr[0] = new zzhme(zzhmhVar);
                zzhmf zzhmfVar = new zzhmf(new zzhmg(), new long[10]);
                zzi(zzhmfVar, zzhmhVar.zza);
                zzhmh zzhmhVar2 = new zzhmh(zzhmfVar);
                for (int i20 = 1; i20 < 8; i20++) {
                    zzg(zzhmfVar, zzhmhVar2, zzhmeVarArr[i20 - 1]);
                    zzhmeVarArr[i20] = new zzhme(new zzhmh(zzhmfVar));
                }
                byte[] bArrZzl = zzl(bArrDigest);
                byte[] bArrZzl2 = zzl(bArrCopyOfRange);
                zzhmf zzhmfVar2 = new zzhmf(zzc);
                zzhmh zzhmhVar3 = new zzhmh();
                int i21 = b10;
                while (i21 >= 0 && bArrZzl[i21] == 0 && bArrZzl2[i21] == 0) {
                    i21--;
                }
                while (i21 >= 0) {
                    zzi(zzhmfVar2, new zzhmg(zzhmfVar2));
                    byte b11 = bArrZzl[i21];
                    if (b11 > 0) {
                        zzhmh.zza(zzhmhVar3, zzhmfVar2);
                        zzg(zzhmfVar2, zzhmhVar3, zzhmeVarArr[bArrZzl[i21] / 2]);
                    } else if (b11 < 0) {
                        zzhmh.zza(zzhmhVar3, zzhmfVar2);
                        zzh(zzhmfVar2, zzhmhVar3, zzhmeVarArr[(-bArrZzl[i21]) / 2]);
                    }
                    byte b12 = bArrZzl2[i21];
                    if (b12 > 0) {
                        zzhmh.zza(zzhmhVar3, zzhmfVar2);
                        zzg(zzhmfVar2, zzhmhVar3, zzhmk.zze[bArrZzl2[i21] / 2]);
                    } else if (b12 < 0) {
                        zzhmh.zza(zzhmhVar3, zzhmfVar2);
                        zzh(zzhmfVar2, zzhmhVar3, zzhmk.zze[(-bArrZzl2[i21]) / 2]);
                    }
                    i21--;
                }
                byte[] bArrZzb = new zzhmg(zzhmfVar2).zzb();
                for (int i22 = 0; i22 < 32; i22++) {
                    if (bArrZzb[i22] != bArr2[i22]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void zzd() {
        if (zzhmk.zza == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    public static /* synthetic */ boolean zze(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        zzhmp.zzd(jArr2);
        byte[] bArrZzh = zzhmp.zzh(jArr2);
        for (int i10 = 0; i10 < 32; i10++) {
            if (bArrZzh[i10] != 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ int zzf(long[] jArr) {
        return zzhmp.zzh(jArr)[0] & 1;
    }

    private static void zzg(zzhmf zzhmfVar, zzhmh zzhmhVar, zzhmd zzhmdVar) {
        zzhmg zzhmgVar = zzhmhVar.zza;
        zzhmg zzhmgVar2 = zzhmfVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhmgVar2.zza;
        long[] jArr3 = zzhmgVar.zzb;
        long[] jArr4 = zzhmgVar.zza;
        zzhmp.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhmgVar2.zzb;
        zzhmp.zzb(jArr5, jArr3, jArr4);
        zzhmp.zze(jArr5, jArr5, zzhmdVar.zzb);
        long[] jArr6 = zzhmdVar.zza;
        long[] jArr7 = zzhmgVar2.zzc;
        zzhmp.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhmfVar.zzb;
        zzhmp.zze(jArr8, zzhmhVar.zzb, zzhmdVar.zzc);
        zzhmdVar.zza(jArr2, zzhmgVar.zzc);
        zzhmp.zza(jArr, jArr2, jArr2);
        zzhmp.zzb(jArr2, jArr7, jArr5);
        zzhmp.zza(jArr5, jArr7, jArr5);
        zzhmp.zza(jArr7, jArr, jArr8);
        zzhmp.zzb(jArr8, jArr, jArr8);
    }

    private static void zzh(zzhmf zzhmfVar, zzhmh zzhmhVar, zzhmd zzhmdVar) {
        zzhmg zzhmgVar = zzhmhVar.zza;
        zzhmg zzhmgVar2 = zzhmfVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhmgVar2.zza;
        long[] jArr3 = zzhmgVar.zzb;
        long[] jArr4 = zzhmgVar.zza;
        zzhmp.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhmgVar2.zzb;
        zzhmp.zzb(jArr5, jArr3, jArr4);
        zzhmp.zze(jArr5, jArr5, zzhmdVar.zza);
        long[] jArr6 = zzhmdVar.zzb;
        long[] jArr7 = zzhmgVar2.zzc;
        zzhmp.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhmfVar.zzb;
        zzhmp.zze(jArr8, zzhmhVar.zzb, zzhmdVar.zzc);
        zzhmdVar.zza(jArr2, zzhmgVar.zzc);
        zzhmp.zza(jArr, jArr2, jArr2);
        zzhmp.zzb(jArr2, jArr7, jArr5);
        zzhmp.zza(jArr5, jArr7, jArr5);
        zzhmp.zzb(jArr7, jArr, jArr8);
        zzhmp.zza(jArr8, jArr, jArr8);
    }

    private static void zzi(zzhmf zzhmfVar, zzhmg zzhmgVar) {
        zzhmg zzhmgVar2 = zzhmfVar.zza;
        long[] jArr = zzhmgVar2.zza;
        long[] jArr2 = zzhmgVar.zza;
        long[] jArr3 = new long[10];
        zzhmp.zzf(jArr, jArr2);
        long[] jArr4 = zzhmgVar2.zzc;
        long[] jArr5 = zzhmgVar.zzb;
        zzhmp.zzf(jArr4, jArr5);
        long[] jArr6 = zzhmfVar.zzb;
        zzhmp.zzf(jArr6, zzhmgVar.zzc);
        zzhmp.zza(jArr6, jArr6, jArr6);
        long[] jArr7 = zzhmgVar2.zzb;
        zzhmp.zza(jArr7, jArr2, jArr5);
        zzhmp.zzf(jArr3, jArr7);
        zzhmp.zza(jArr7, jArr4, jArr);
        zzhmp.zzb(jArr4, jArr4, jArr);
        zzhmp.zzb(jArr, jArr3, jArr7);
        zzhmp.zzb(jArr6, jArr6, jArr4);
    }

    private static int zzj(int i10, int i11) {
        int i12 = (~(i10 ^ i11)) & 255;
        int i13 = i12 & (i12 << 4);
        int i14 = i13 & (i13 << 2);
        return (i14 & (i14 + i14)) >> 7;
    }

    private static void zzk(zzhmd zzhmdVar, int i10, byte b10) {
        zzhmd[][] zzhmdVarArr = zzhmk.zzd;
        int i11 = (b10 & 255) >> 7;
        int i12 = (-i11) & b10;
        int i13 = b10 - (i12 + i12);
        zzhmdVar.zzb(zzhmdVarArr[i10][0], zzj(i13, 1));
        zzhmdVar.zzb(zzhmdVarArr[i10][1], zzj(i13, 2));
        zzhmdVar.zzb(zzhmdVarArr[i10][2], zzj(i13, 3));
        zzhmdVar.zzb(zzhmdVarArr[i10][3], zzj(i13, 4));
        zzhmdVar.zzb(zzhmdVarArr[i10][4], zzj(i13, 5));
        zzhmdVar.zzb(zzhmdVarArr[i10][5], zzj(i13, 6));
        zzhmdVar.zzb(zzhmdVarArr[i10][6], zzj(i13, 7));
        zzhmdVar.zzb(zzhmdVarArr[i10][7], zzj(i13, 8));
        long[] jArr = zzhmdVar.zzc;
        long[] jArr2 = zzhmdVar.zza;
        long[] jArrCopyOf = Arrays.copyOf(zzhmdVar.zzb, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        zzm(jArrCopyOf3, jArrCopyOf3);
        zzhmdVar.zzb(new zzhmd(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i11);
    }

    private static byte[] zzl(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = (byte) (1 & ((bArr[i11 >> 3] & 255) >> (i11 & 7)));
        }
        for (int i12 = 0; i12 < 256; i12++) {
            if (bArr2[i12] != 0) {
                for (int i13 = 1; i13 <= 6 && (i10 = i12 + i13) < 256; i13++) {
                    byte b10 = bArr2[i10];
                    if (b10 != 0) {
                        byte b11 = bArr2[i12];
                        int i14 = b10 << i13;
                        int i15 = b11 + i14;
                        if (i15 <= 15) {
                            bArr2[i12] = (byte) i15;
                            bArr2[i10] = 0;
                        } else {
                            int i16 = b11 - i14;
                            if (i16 >= -15) {
                                bArr2[i12] = (byte) i16;
                                while (true) {
                                    if (i10 >= 256) {
                                        break;
                                    }
                                    if (bArr2[i10] == 0) {
                                        bArr2[i10] = 1;
                                        break;
                                    }
                                    bArr2[i10] = 0;
                                    i10++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void zzm(long[] jArr, long[] jArr2) {
        for (int i10 = 0; i10 < jArr2.length; i10++) {
            jArr[i10] = -jArr2[i10];
        }
    }

    private static long zzn(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 2] & 255)) << 16) | (bArr[i10] & 255) | (((long) (bArr[i10 + 1] & 255)) << 8);
    }

    private static long zzo(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 3] & 255)) << 24) | zzn(bArr, i10);
    }
}
