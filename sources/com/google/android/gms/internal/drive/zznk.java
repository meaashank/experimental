package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes4.dex */
final class zznk extends zznh {
    private static int zza(byte[] bArr, int i10, long j10, int i11) {
        if (i11 == 0) {
            return zznf.zzay(i10);
        }
        if (i11 == 1) {
            return zznf.zzr(i10, zznd.zza(bArr, j10));
        }
        if (i11 == 2) {
            return zznf.zzc(i10, zznd.zza(bArr, j10), zznd.zza(bArr, j10 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.drive.zznh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(int r20, byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zznk.zzb(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.drive.zznh
    public final String zzg(byte[] bArr, int i10, int i11) throws zzkq {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte bZza = zznd.zza(bArr, i10);
            if (!zzng.zzd(bZza)) {
                break;
            }
            i10++;
            zzng.zza(bZza, cArr, i13);
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte bZza2 = zznd.zza(bArr, i10);
            if (zzng.zzd(bZza2)) {
                int i16 = i14 + 1;
                zzng.zza(bZza2, cArr, i14);
                while (i15 < i12) {
                    byte bZza3 = zznd.zza(bArr, i15);
                    if (!zzng.zzd(bZza3)) {
                        break;
                    }
                    i15++;
                    zzng.zza(bZza3, cArr, i16);
                    i16++;
                }
                i14 = i16;
                i10 = i15;
            } else if (zzng.zze(bZza2)) {
                if (i15 >= i12) {
                    throw zzkq.zzdn();
                }
                i10 += 2;
                zzng.zza(bZza2, zznd.zza(bArr, i15), cArr, i14);
                i14++;
            } else if (zzng.zzf(bZza2)) {
                if (i15 >= i12 - 1) {
                    throw zzkq.zzdn();
                }
                int i17 = i10 + 2;
                i10 += 3;
                zzng.zza(bZza2, zznd.zza(bArr, i15), zznd.zza(bArr, i17), cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw zzkq.zzdn();
                }
                byte bZza4 = zznd.zza(bArr, i15);
                int i18 = i10 + 3;
                byte bZza5 = zznd.zza(bArr, i10 + 2);
                i10 += 4;
                zzng.zza(bZza2, bZza4, bZza5, zznd.zza(bArr, i18), cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }

    @Override // com.google.android.gms.internal.drive.zznh
    public final int zzb(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        long j10;
        long j11;
        long j12;
        int i12;
        char cCharAt;
        long j13 = i10;
        long j14 = ((long) i11) + j13;
        int length = charSequence.length();
        if (length > i11 || bArr.length - i11 < i10) {
            char cCharAt2 = charSequence.charAt(length - 1);
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Failed writing ");
            sb2.append(cCharAt2);
            sb2.append(" at index ");
            sb2.append(i10 + i11);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        int i13 = 0;
        while (true) {
            j10 = 1;
            if (i13 >= length || (cCharAt = charSequence.charAt(i13)) >= 128) {
                break;
            }
            zznd.zza(bArr, j13, (byte) cCharAt);
            i13++;
            j13 = 1 + j13;
        }
        if (i13 == length) {
            return (int) j13;
        }
        while (i13 < length) {
            char cCharAt3 = charSequence.charAt(i13);
            if (cCharAt3 < 128 && j13 < j14) {
                zznd.zza(bArr, j13, (byte) cCharAt3);
                j12 = j14;
                j11 = j10;
                j13 += j10;
            } else if (cCharAt3 >= 2048 || j13 > j14 - 2) {
                j11 = j10;
                if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j13 > j14 - 3) {
                    j12 = j14;
                    if (j13 <= j12 - 4) {
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char cCharAt4 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                zznd.zza(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                zznd.zza(bArr, j13 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j15 = j13 + 3;
                                zznd.zza(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j13 += 4;
                                zznd.zza(bArr, j15, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new zznj(i13 - 1, length);
                    }
                    if (55296 > cCharAt3 || cCharAt3 > 57343 || ((i12 = i13 + 1) != length && Character.isSurrogatePair(cCharAt3, charSequence.charAt(i12)))) {
                        StringBuilder sb3 = new StringBuilder(46);
                        sb3.append("Failed writing ");
                        sb3.append(cCharAt3);
                        sb3.append(" at index ");
                        sb3.append(j13);
                        throw new ArrayIndexOutOfBoundsException(sb3.toString());
                    }
                    throw new zznj(i13, length);
                }
                zznd.zza(bArr, j13, (byte) ((cCharAt3 >>> '\f') | 480));
                j12 = j14;
                long j16 = j13 + 2;
                zznd.zza(bArr, j13 + j11, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                j13 += 3;
                zznd.zza(bArr, j16, (byte) ((cCharAt3 & '?') | 128));
            } else {
                j11 = j10;
                long j17 = j13 + j11;
                zznd.zza(bArr, j13, (byte) ((cCharAt3 >>> 6) | 960));
                j13 += 2;
                zznd.zza(bArr, j17, (byte) ((cCharAt3 & '?') | 128));
                j12 = j14;
            }
            i13++;
            j10 = j11;
            j14 = j12;
        }
        return (int) j13;
    }
}
