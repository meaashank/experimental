package com.google.android.gms.internal.ads;

import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes4.dex */
final class zzaqx {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zza(com.google.android.gms.internal.ads.zzet r18, com.google.android.gms.internal.ads.zzaqv r19) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqx.zza(com.google.android.gms.internal.ads.zzet, com.google.android.gms.internal.ads.zzaqv):boolean");
    }

    public static zzaqw zzb(zzet zzetVar) throws zzat {
        int iZzj;
        int i10;
        char c10;
        int i11;
        int i12;
        int iZzj2;
        char c11;
        int iZzj3 = zzetVar.zzj(8);
        int i13 = 5;
        int iZzj4 = zzetVar.zzj(5);
        if (iZzj4 != 31) {
            switch (iZzj4) {
                case 0:
                    iZzj = 96000;
                    break;
                case 1:
                    iZzj = 88200;
                    break;
                case 2:
                    iZzj = com.prism.gaia.server.accounts.r.f166614b;
                    break;
                case 3:
                    iZzj = 48000;
                    break;
                case 4:
                    iZzj = 44100;
                    break;
                case 5:
                    iZzj = 32000;
                    break;
                case 6:
                    iZzj = 24000;
                    break;
                case 7:
                    iZzj = 22050;
                    break;
                case 8:
                    iZzj = 16000;
                    break;
                case 9:
                    iZzj = M6.b.f58838e;
                    break;
                case 10:
                    iZzj = 11025;
                    break;
                case 11:
                    iZzj = 8000;
                    break;
                case 12:
                    iZzj = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj4).length() + 32);
                    sb2.append("Unsupported sampling rate index ");
                    sb2.append(iZzj4);
                    throw zzat.zzc(sb2.toString());
                case 15:
                    iZzj = 57600;
                    break;
                case 16:
                    iZzj = 51200;
                    break;
                case 17:
                    iZzj = 40000;
                    break;
                case 18:
                    iZzj = 38400;
                    break;
                case 19:
                    iZzj = 34150;
                    break;
                case 20:
                    iZzj = 28800;
                    break;
                case 21:
                    iZzj = 25600;
                    break;
                case 22:
                    iZzj = 20000;
                    break;
                case 23:
                    iZzj = 19200;
                    break;
                case 24:
                    iZzj = 17075;
                    break;
                case 25:
                    iZzj = 14400;
                    break;
                case 26:
                    iZzj = 12800;
                    break;
                case 27:
                    iZzj = 9600;
                    break;
            }
        } else {
            iZzj = zzetVar.zzj(24);
        }
        int iZzj5 = zzetVar.zzj(3);
        int i14 = 1;
        if (iZzj5 == 0) {
            i10 = ViewUtils.EDGE_TO_EDGE_FLAGS;
        } else if (iZzj5 == 1) {
            i10 = 1024;
        } else if (iZzj5 == 2 || iZzj5 == 3) {
            i10 = 2048;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb3 = new StringBuilder(com.google.android.gms.ads.internal.client.b.a(iZzj5, 36));
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(iZzj5);
                throw zzat.zzc(sb3.toString());
            }
            i10 = 4096;
        }
        if (iZzj5 == 0 || iZzj5 == 1) {
            c10 = 0;
        } else if (iZzj5 == 2) {
            c10 = 2;
        } else if (iZzj5 == 3) {
            c10 = 3;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb4 = new StringBuilder(com.google.android.gms.ads.internal.client.b.a(iZzj5, 36));
                sb4.append("Unsupported coreSbrFrameLengthIndex ");
                sb4.append(iZzj5);
                throw zzat.zzc(sb4.toString());
            }
            c10 = 1;
        }
        zzetVar.zzh(2);
        zzc(zzetVar);
        int iZzj6 = zzetVar.zzj(5);
        int i15 = 0;
        int iZzf = 0;
        while (true) {
            int i16 = 16;
            if (i15 < iZzj6 + 1) {
                int iZzj7 = zzetVar.zzj(3);
                iZzf += zzf(zzetVar, 5, 8, 16) + 1;
                if ((iZzj7 == 0 || iZzj7 == 2) && zzetVar.zzi()) {
                    zzc(zzetVar);
                }
                i15++;
            } else {
                int iZzf2 = zzf(zzetVar, 4, 8, 16) + 1;
                zzetVar.zzg();
                int i17 = 0;
                while (true) {
                    double d10 = 2.0d;
                    if (i17 >= iZzf2) {
                        int i18 = iZzj3;
                        byte[] bArr = null;
                        if (zzetVar.zzi()) {
                            int iZzf3 = zzf(zzetVar, 2, 4, 8) + 1;
                            for (int i19 = 0; i19 < iZzf3; i19++) {
                                int iZzf4 = zzf(zzetVar, 4, 8, 16);
                                int iZzf5 = zzf(zzetVar, 4, 8, 16);
                                if (iZzf4 == 7) {
                                    int iZzj8 = zzetVar.zzj(4) + 1;
                                    zzetVar.zzh(4);
                                    byte[] bArr2 = new byte[iZzj8];
                                    for (int i20 = 0; i20 < iZzj8; i20++) {
                                        bArr2[i20] = (byte) zzetVar.zzj(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzetVar.zzh(iZzf5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iZzj) {
                            case 14700:
                            case 16000:
                                d10 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case com.prism.gaia.server.accounts.r.f166614b /* 64000 */:
                                d10 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d10 = 1.0d;
                                break;
                            default:
                                StringBuilder sb5 = new StringBuilder(String.valueOf(iZzj).length() + 26);
                                sb5.append("Unsupported sampling rate ");
                                sb5.append(iZzj);
                                throw zzat.zzc(sb5.toString());
                        }
                        return new zzaqw(i18, (int) (((double) iZzj) * d10), (int) (((double) i10) * d10), bArr3, null);
                    }
                    int iZzj9 = zzetVar.zzj(2);
                    if (iZzj9 == 0) {
                        i11 = iZzj3;
                        i12 = i14;
                        zzd(zzetVar);
                        if (c10 > 0) {
                            zze(zzetVar);
                        }
                    } else if (iZzj9 == i14) {
                        i12 = i14;
                        if (zzd(zzetVar)) {
                            zzetVar.zzg();
                        }
                        if (c10 > 0) {
                            zze(zzetVar);
                            iZzj2 = zzetVar.zzj(2);
                            c11 = c10;
                        } else {
                            iZzj2 = 0;
                            c11 = 0;
                        }
                        if (iZzj2 > 0) {
                            zzetVar.zzh(6);
                            int iZzj10 = zzetVar.zzj(2);
                            zzetVar.zzh(4);
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(i13);
                            }
                            if (iZzj2 == 2 || iZzj2 == 3) {
                                zzetVar.zzh(6);
                            }
                            if (iZzj10 == 2) {
                                zzetVar.zzg();
                            }
                        }
                        i11 = iZzj3;
                        int iFloor = ((int) Math.floor(Math.log(iZzf - 1) / Math.log(2.0d))) + 1;
                        int iZzj11 = zzetVar.zzj(2);
                        if (iZzj11 > 0 && zzetVar.zzi()) {
                            zzetVar.zzh(iFloor);
                        }
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(iFloor);
                        }
                        if (c11 == 0 && iZzj11 == 0) {
                            zzetVar.zzg();
                        }
                    } else if (iZzj9 != 3) {
                        i11 = iZzj3;
                        i12 = i14;
                    } else {
                        zzf(zzetVar, 4, 8, i16);
                        int iZzf6 = zzf(zzetVar, 4, 8, i16);
                        i12 = i14;
                        if (zzetVar.zzi()) {
                            zzf(zzetVar, 8, i16, 0);
                        }
                        zzetVar.zzg();
                        if (iZzf6 > 0) {
                            zzetVar.zzh(iZzf6 * 8);
                        }
                        i11 = iZzj3;
                    }
                    i17++;
                    iZzj3 = i11;
                    i14 = i12;
                    i13 = 5;
                    i16 = 16;
                }
            }
        }
    }

    private static void zzc(zzet zzetVar) {
        int iZzj;
        int iZzj2 = zzetVar.zzj(2);
        if (iZzj2 == 0) {
            zzetVar.zzh(6);
            return;
        }
        int iZzf = zzf(zzetVar, 5, 8, 16) + 1;
        if (iZzj2 == 1) {
            zzetVar.zzh(iZzf * 7);
            return;
        }
        if (iZzj2 == 2) {
            boolean zZzi = zzetVar.zzi();
            int i10 = true != zZzi ? 5 : 1;
            int i11 = true == zZzi ? 7 : 5;
            int i12 = true == zZzi ? 8 : 6;
            int i13 = 0;
            while (i13 < iZzf) {
                if (zzetVar.zzi()) {
                    zzetVar.zzh(7);
                    iZzj = 0;
                } else {
                    if (zzetVar.zzj(2) == 3 && zzetVar.zzj(i11) * i10 != 0) {
                        zzetVar.zzg();
                    }
                    iZzj = zzetVar.zzj(i12) * i10;
                    if (iZzj != 0 && iZzj != 180) {
                        zzetVar.zzg();
                    }
                    zzetVar.zzg();
                }
                if (iZzj != 0 && iZzj != 180 && zzetVar.zzi()) {
                    i13++;
                }
                i13++;
            }
        }
    }

    private static boolean zzd(zzet zzetVar) {
        zzetVar.zzh(3);
        boolean zZzi = zzetVar.zzi();
        if (zZzi) {
            zzetVar.zzh(13);
        }
        return zZzi;
    }

    private static void zze(zzet zzetVar) {
        zzetVar.zzh(3);
        zzetVar.zzh(8);
        boolean zZzi = zzetVar.zzi();
        boolean zZzi2 = zzetVar.zzi();
        if (zZzi) {
            zzetVar.zzh(5);
        }
        if (zZzi2) {
            zzetVar.zzh(6);
        }
    }

    private static int zzf(zzet zzetVar, int i10, int i11, int i12) {
        zzguk.zza(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        H.a(H.a(i13, i14), 1 << i12);
        if (zzetVar.zzc() < i10) {
            return -1;
        }
        int iZzj = zzetVar.zzj(i10);
        if (iZzj == i13) {
            if (zzetVar.zzc() < i11) {
                return -1;
            }
            int iZzj2 = zzetVar.zzj(i11);
            iZzj += iZzj2;
            if (iZzj2 == i14) {
                if (zzetVar.zzc() < i12) {
                    return -1;
                }
                return zzetVar.zzj(i12) + iZzj;
            }
        }
        return iZzj;
    }
}
