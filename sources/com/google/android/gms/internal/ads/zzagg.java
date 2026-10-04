package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.view.C2500w;
import com.google.android.material.internal.ViewUtils;
import com.prism.gaia.helper.utils.l;
import h3.C4488b;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class zzagg {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, M6.b.f58838e, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, C4488b.f202390b, l.b.f165171e, 512, 640, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, C2500w.f111959a, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, com.prism.gaia.server.accounts.r.f166614b, 128000, 22050, 44100, 88200, 176400, 352800, M6.b.f58838e, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static boolean zza(@Nullable String str) {
        return Objects.equals(str, "audio/vnd.dts") || Objects.equals(str, "audio/vnd.dts.hd");
    }

    public static int zzb(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    public static zzv zzc(byte[] bArr, @Nullable String str, @Nullable String str2, int i10, String str3, @Nullable zzq zzqVar) {
        zzet zzetVarZzl = zzl(bArr);
        zzetVarZzl.zzh(60);
        int i11 = zzb[zzetVarZzl.zzj(6)];
        int i12 = zzc[zzetVarZzl.zzj(4)];
        int iZzj = zzetVarZzl.zzj(5);
        int i13 = iZzj >= 29 ? -1 : (zzd[iZzj] * 1000) / 2;
        zzetVarZzl.zzh(10);
        int i14 = i11 + (zzetVarZzl.zzj(2) > 0 ? 1 : 0);
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzn("video/mp2t");
        zztVar.zzo("audio/vnd.dts");
        zztVar.zzi(i13);
        zztVar.zzH(i14);
        zztVar.zzJ(i12);
        zztVar.zzs(null);
        zztVar.zze(str2);
        zztVar.zzg(i10);
        return zztVar.zzQ();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzd(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4e
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r3]
        L1f:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r1 = r1 | r2
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5c
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 8
            r7 = r7[r2]
        L35:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r0 = r0 | r1
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5c
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 9
            r7 = r7[r2]
            goto L35
        L4e:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r4]
            goto L1f
        L5c:
            if (r0 == 0) goto L62
            int r7 = r7 * 16
            int r7 = r7 / 14
        L62:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagg.zzd(byte[]):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    public static zzagf zze(byte[] bArr) throws zzat {
        int i10;
        boolean zZzi;
        int i11;
        int iZzj;
        int[] iArr;
        int i12;
        String str;
        int i13;
        long jZzw;
        int i14;
        int i15;
        int i16;
        int i17;
        ?? r19;
        ?? r11;
        int i18;
        int i19;
        int iZzj2;
        zzet zzetVarZzl = zzl(bArr);
        zzetVarZzl.zzh(40);
        int iZzj3 = zzetVarZzl.zzj(2);
        boolean zZzi2 = zzetVarZzl.zzi();
        int i20 = true != zZzi2 ? 16 : 20;
        zzetVarZzl.zzh(true != zZzi2 ? 8 : 12);
        int iZzj4 = zzetVarZzl.zzj(i20) + 1;
        boolean zZzi3 = zzetVarZzl.zzi();
        if (zZzi3) {
            iZzj = zzetVarZzl.zzj(2);
            int iZzj5 = zzetVarZzl.zzj(3) + 1;
            if (zzetVarZzl.zzi()) {
                zzetVarZzl.zzh(36);
            }
            int iZzj6 = zzetVarZzl.zzj(3) + 1;
            int iZzj7 = zzetVarZzl.zzj(3) + 1;
            if (iZzj6 != 1 || iZzj7 != 1) {
                throw zzat.zzc("Multiple audio presentations or assets not supported");
            }
            int i21 = iZzj3 + 1;
            int iZzj8 = zzetVarZzl.zzj(i21);
            for (int i22 = 0; i22 < i21; i22++) {
                if (((iZzj8 >> i22) & 1) == 1) {
                    zzetVarZzl.zzh(8);
                }
            }
            i10 = 0;
            zZzi = zzetVarZzl.zzi();
            if (zZzi) {
                zzetVarZzl.zzh(2);
                int iZzj9 = (zzetVarZzl.zzj(2) + 1) << 2;
                int iZzj10 = zzetVarZzl.zzj(2) + 1;
                iArr = new int[iZzj10];
                for (int i23 = 0; i23 < iZzj10; i23++) {
                    iArr[i23] = zzj(zzetVarZzl.zzj(iZzj9));
                }
            } else {
                iArr = null;
            }
            i11 = iZzj5 * 512;
        } else {
            i10 = 0;
            zZzi = false;
            i11 = 0;
            iZzj = -1;
            iArr = null;
        }
        zzetVarZzl.zzh(i20);
        zzetVarZzl.zzh(12);
        if (zZzi3) {
            if (zzetVarZzl.zzi()) {
                zzetVarZzl.zzh(4);
            }
            if (zzetVarZzl.zzi()) {
                zzetVarZzl.zzh(24);
            }
            if (zzetVarZzl.zzi()) {
                zzetVarZzl.zzo(zzetVarZzl.zzj(10) + 1);
            }
            int i24 = 5;
            zzetVarZzl.zzh(5);
            i12 = zze[zzetVarZzl.zzj(4)];
            int iZzj11 = zzetVarZzl.zzj(8) + 1;
            if (zzetVarZzl.zzi()) {
                ?? Zzi = iZzj11 > 2 ? zzetVarZzl.zzi() : i10;
                ?? Zzi2 = iZzj11 > 6 ? zzetVarZzl.zzi() : i10;
                if (zzetVarZzl.zzi()) {
                    i15 = 1;
                    iZzj2 = (zzetVarZzl.zzj(2) + 1) << 2;
                    zzetVarZzl.zzh(iZzj2);
                } else {
                    i15 = 1;
                    iZzj2 = i10;
                }
                i17 = 6;
                int iZzj12 = zzetVarZzl.zzj(3);
                int[] iArr2 = new int[iZzj12];
                for (int i25 = i10; i25 < iZzj12; i25++) {
                    iArr2[i25] = zzetVarZzl.zzj(iZzj2);
                }
                int i26 = i10;
                while (i26 < iZzj12) {
                    int iZzj13 = zzj(iArr2[i26]);
                    int i27 = i24;
                    int iZzj14 = zzetVarZzl.zzj(i24) + 1;
                    int i28 = i10;
                    while (i28 < iZzj13) {
                        zzetVarZzl.zzh(Integer.bitCount(zzetVarZzl.zzj(iZzj14)) * 5);
                        i28++;
                        iArr2 = iArr2;
                    }
                    i26++;
                    i24 = i27;
                }
                i16 = i24;
                r11 = Zzi;
                r19 = Zzi2;
            } else {
                i15 = 1;
                i16 = 5;
                i17 = 6;
                zzetVarZzl.zzh(3);
                int i29 = i10;
                r19 = i29 == true ? 1 : 0;
                r11 = i29;
            }
            boolean zZzi4 = zzetVarZzl.zzi();
            if (zZzi4) {
                zzetVarZzl.zzh(8);
            }
            if (zzetVarZzl.zzi()) {
                zzetVarZzl.zzh(i16);
            }
            if (zZzi4 && r11 != 0) {
                zzetVarZzl.zzh(8);
            }
            if (zZzi && zzetVarZzl.zzi()) {
                iArr.getClass();
                zzetVarZzl.zzh(7);
                if (zzetVarZzl.zzj(2) < 3) {
                    zzetVarZzl.zzh(3);
                } else {
                    zzetVarZzl.zzh(8);
                }
                boolean zZzi5 = zzetVarZzl.zzi();
                int length = iArr.length;
                int i30 = i10;
                while (i30 < length) {
                    int i31 = iArr[i30];
                    if (zZzi5) {
                        zzetVarZzl.zzh(i31 * 6);
                        i19 = i17;
                    } else {
                        i19 = i17;
                        zzetVarZzl.zzh(i19);
                    }
                    i30++;
                    i17 = i19;
                }
                int i32 = i17;
                int[] iArr3 = new int[3];
                iArr3[i10] = iZzj11;
                if (r19 != 0) {
                    iArr3[i15] = i32;
                    i18 = 2;
                } else {
                    i18 = i15;
                }
                if (r11 != 0) {
                    iArr3[i18] = 2;
                    i18++;
                }
                int length2 = iArr.length;
                for (int i33 = i10; i33 < length2; i33++) {
                    int i34 = iArr[i33];
                    for (int i35 = i10; i35 < i18; i35++) {
                        int i36 = iArr3[i35];
                        int i37 = i10;
                        while (i37 < i36) {
                            zzetVarZzl.zzh(Integer.bitCount(zzetVarZzl.zzj(i34)) * 6);
                            i37++;
                            iArr3 = iArr3;
                        }
                    }
                }
            }
            int iZzj15 = zzetVarZzl.zzj(2);
            String str2 = "audio/vnd.dts.hd";
            if (iZzj15 != 0) {
                if (iZzj15 != i15) {
                    if (iZzj15 != 2) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj15).length() + 42);
                        sb2.append("Unsupported coding mode in DTS HD header: ");
                        sb2.append(iZzj15);
                        throw zzat.zzb(sb2.toString(), null);
                    }
                    str2 = "audio/vnd.dts.hd;profile=lbr";
                }
                i13 = iZzj11;
                str = str2;
            } else {
                if ((zzetVarZzl.zzj(12) & 256) != 0) {
                    str2 = "audio/vnd.dts.hd;profile=lbr";
                }
                i13 = iZzj11;
                str = str2;
            }
        } else {
            i12 = -2147483647;
            str = null;
            i13 = -1;
        }
        int i38 = i12;
        if (zZzi3) {
            if (iZzj == 0) {
                i14 = 32000;
            } else if (iZzj == 1) {
                i14 = 44100;
            } else {
                if (iZzj != 2) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj).length() + 51);
                    sb3.append("Unsupported reference clock code in DTS HD header: ");
                    sb3.append(iZzj);
                    throw zzat.zzb(sb3.toString(), null);
                }
                i14 = 48000;
            }
            jZzw = zzfm.zzw(i11, 1000000L, i14, RoundingMode.DOWN);
        } else {
            jZzw = -9223372036854775807L;
        }
        return new zzagf(str, i13, i38, iZzj4, jZzw, 0, null);
    }

    public static int zzf(byte[] bArr) {
        zzet zzetVarZzl = zzl(bArr);
        zzetVarZzl.zzh(42);
        return zzetVarZzl.zzj(true != zzetVarZzl.zzi() ? 8 : 12) + 1;
    }

    public static zzagf zzg(byte[] bArr, AtomicInteger atomicInteger) throws zzat {
        long jZzw;
        int iZzj;
        AtomicInteger atomicInteger2;
        int i10;
        int i11;
        zzet zzetVarZzl = zzl(bArr);
        int iZzj2 = zzetVarZzl.zzj(32);
        int iZzk = zzk(zzetVarZzl, zzf, true);
        int i12 = iZzk + 1;
        char c10 = iZzj2 == 1078008818 ? (char) 1 : (char) 0;
        if (c10 == 0) {
            jZzw = -9223372036854775807L;
            iZzj = -2147483647;
        } else {
            if (!zzetVarZzl.zzi()) {
                throw zzat.zzc("Only supports full channel mask-based audio presentation");
            }
            int i13 = iZzk - 1;
            if (((bArr[iZzk] & 255) | ((char) (bArr[i13] << 8))) != zzfm.zzM(bArr, 0, i13, 65535)) {
                throw zzat.zzb("CRC check failed", null);
            }
            int iZzj3 = zzetVarZzl.zzj(2);
            if (iZzj3 == 0) {
                i10 = 512;
            } else if (iZzj3 == 1) {
                i10 = 480;
            } else {
                if (iZzj3 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj3).length() + 51);
                    sb2.append("Unsupported base duration index in DTS UHD header: ");
                    sb2.append(iZzj3);
                    throw zzat.zzb(sb2.toString(), null);
                }
                i10 = C4488b.f202390b;
            }
            int iZzj4 = zzetVarZzl.zzj(3) + 1;
            int iZzj5 = zzetVarZzl.zzj(2);
            if (iZzj5 == 0) {
                i11 = 32000;
            } else if (iZzj5 == 1) {
                i11 = 44100;
            } else {
                if (iZzj5 != 2) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj5).length() + 48);
                    sb3.append("Unsupported clock rate index in DTS UHD header: ");
                    sb3.append(iZzj5);
                    throw zzat.zzb(sb3.toString(), null);
                }
                i11 = 48000;
            }
            if (zzetVarZzl.zzi()) {
                zzetVarZzl.zzh(36);
            }
            iZzj = (1 << zzetVarZzl.zzj(2)) * i11;
            jZzw = zzfm.zzw(i10 * iZzj4, 1000000L, i11, RoundingMode.DOWN);
        }
        int i14 = iZzj;
        long j10 = jZzw;
        int iZzk2 = 0;
        for (char c11 = 0; c11 < c10; c11 = 1) {
            iZzk2 += zzk(zzetVarZzl, zzg, true);
        }
        for (int i15 = 0; i15 <= 0; i15++) {
            if (c10 != 0) {
                atomicInteger2 = atomicInteger;
                atomicInteger2.set(zzk(zzetVarZzl, zzh, true));
            } else {
                atomicInteger2 = atomicInteger;
            }
            iZzk2 += atomicInteger2.get() != 0 ? zzk(zzetVarZzl, zzi, true) : 0;
        }
        return new zzagf("audio/vnd.dts.uhd;profile=p2", 2, i14, i12 + iZzk2, j10, 0, null);
    }

    public static int zzh(byte[] bArr) {
        zzet zzetVarZzl = zzl(bArr);
        zzetVarZzl.zzh(32);
        return zzk(zzetVarZzl, zzj, true) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzv zzi(com.google.android.gms.internal.ads.zzagi r4, int r5, com.google.android.gms.internal.ads.zzv r6) throws java.io.IOException {
        /*
            com.google.android.gms.internal.ads.zzeu r0 = new com.google.android.gms.internal.ads.zzeu
            r0.<init>(r5)
            byte[] r1 = r0.zzi()
            r2 = 0
            r3 = 1
            boolean r5 = r4.zzh(r1, r2, r5, r3)
            if (r5 != 0) goto L13
            goto L89
        L13:
            r4.zzl()
            int r4 = r0.zzr()
            int r5 = zzb(r4)
            if (r5 != r3) goto L40
            int r4 = r0.zzd()
            r5 = 10
            if (r4 < r5) goto L89
            byte[] r4 = new byte[r5]
            r0.zzm(r4, r2, r5)
            int r4 = zzd(r4)
            int r5 = r0.zze()
            int r1 = r4 + 4
            if (r5 < r1) goto L89
            r0.zzh(r4)
            int r4 = r0.zzr()
        L40:
            int r4 = zzb(r4)
            r5 = 2
            if (r4 != r5) goto L89
            int r4 = r0.zzd()
            r5 = 7
            if (r4 < r5) goto L89
            int r4 = r0.zzg()
            byte[] r1 = new byte[r5]
            r0.zzm(r1, r2, r5)
            r0.zzh(r4)
            int r4 = zzf(r1)
            if (r4 <= 0) goto L89
            int r5 = r0.zzd()
            if (r5 < r4) goto L89
            byte[] r5 = new byte[r4]
            r0.zzm(r5, r2, r4)
            com.google.android.gms.internal.ads.zzagf r4 = zze(r5)
            java.lang.String r4 = r4.zza
            java.lang.String r5 = r6.zzp
            if (r4 != 0) goto L77
            java.lang.String r4 = "audio/vnd.dts.hd"
        L77:
            boolean r5 = java.util.Objects.equals(r5, r4)
            if (r5 != 0) goto L89
            com.google.android.gms.internal.ads.zzt r5 = r6.zza()
            r5.zzo(r4)
            com.google.android.gms.internal.ads.zzv r4 = r5.zzQ()
            return r4
        L89:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagg.zzi(com.google.android.gms.internal.ads.zzagi, int, com.google.android.gms.internal.ads.zzv):com.google.android.gms.internal.ads.zzv");
    }

    private static int zzj(int i10) {
        int i11 = i10 & 1;
        if ((i10 & 2) != 0) {
            i11 += 2;
        }
        if ((i10 & 4) != 0) {
            i11 += 2;
        }
        if ((i10 & 8) != 0) {
            i11++;
        }
        if ((i10 & 16) != 0) {
            i11++;
        }
        if ((i10 & 32) != 0) {
            i11 += 2;
        }
        if ((i10 & 64) != 0) {
            i11 += 2;
        }
        if ((i10 & 128) != 0) {
            i11++;
        }
        if ((i10 & 256) != 0) {
            i11++;
        }
        if ((i10 & 512) != 0) {
            i11 += 2;
        }
        if ((i10 & 1024) != 0) {
            i11 += 2;
        }
        if ((i10 & 2048) != 0) {
            i11 += 2;
        }
        if ((i10 & 4096) != 0) {
            i11++;
        }
        if ((i10 & 8192) != 0) {
            i11 += 2;
        }
        if ((i10 & 16384) != 0) {
            i11++;
        }
        return (i10 & 32768) != 0 ? i11 + 2 : i11;
    }

    private static int zzk(zzet zzetVar, int[] iArr, boolean z10) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && zzetVar.zzi(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return zzetVar.zzj(iArr[i10]) + i12;
    }

    private static zzet zzl(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new zzet(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = bArrCopyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b12 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b12;
            }
        }
        int length = bArrCopyOf.length;
        zzet zzetVar = new zzet(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzet zzetVar2 = new zzet(bArrCopyOf, length);
            while (zzetVar2.zzc() >= 16) {
                zzetVar2.zzh(2);
                zzetVar.zzp(zzetVar2.zzj(14), 14);
            }
        }
        zzetVar.zzb(bArrCopyOf, bArrCopyOf.length);
        return zzetVar;
    }
}
