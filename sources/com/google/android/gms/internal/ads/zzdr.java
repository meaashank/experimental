package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.regex.Pattern;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"InlinedApi"})
public final class zzdr {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static zzgxm zza(byte b10, byte b11, byte b12, byte b13) {
        return zzgxm.zzj(new byte[]{1, 1, b10, 2, 1, b11, 3, 1, b12, 4, 1, b13});
    }

    public static String zzb(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String zzc(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = {zzc[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(true != z10 ? androidx.compose.ui.graphics.vector.f.f101674f : androidx.compose.ui.graphics.vector.f.f101676h), Integer.valueOf(i13)};
        String str = zzfm.zza;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i14 = 6;
        while (i14 > 0) {
            int i15 = i14 - 1;
            if (iArr[i15] != 0) {
                break;
            }
            i14 = i15;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i16])));
        }
        return sb2.toString();
    }

    public static String zzd(byte[] bArr) {
        int length = bArr.length;
        zzguk.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b10 = bArr[0];
        zzguk.zzd(b10 == 1, "Invalid APV CSD version: %s", b10);
        Object[] objArr = {Integer.valueOf(bArr[5] & 255), Integer.valueOf(bArr[6] & 255), Integer.valueOf(bArr[7] & 255)};
        String str = zzfm.zza;
        return String.format(Locale.US, "apv1.apvf%d.apvl%d.apvb%d", objArr);
    }

    @Nullable
    public static Pair zze(zzv zzvVar) {
        zzdq zzdqVarZzf = zzf(zzvVar);
        if (zzdqVarZzf == null || !zzdqVarZzf.zzc()) {
            return null;
        }
        return new Pair(Integer.valueOf(zzdqVarZzf.zza()), Integer.valueOf(zzdqVarZzf.zzb()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x048a A[Catch: NumberFormatException -> 0x04a6, TryCatch #1 {NumberFormatException -> 0x04a6, blocks: (B:264:0x0431, B:266:0x0445, B:277:0x0463, B:292:0x048a, B:294:0x049e), top: B:680:0x0431 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x049e A[Catch: NumberFormatException -> 0x04a6, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x04a6, blocks: (B:264:0x0431, B:266:0x0445, B:277:0x0463, B:292:0x048a, B:294:0x049e), top: B:680:0x0431 }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0741  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzdq zzf(com.google.android.gms.internal.ads.zzv r28) {
        /*
            Method dump skipped, instruction units count: 3096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdr.zzf(com.google.android.gms.internal.ads.zzv):com.google.android.gms.internal.ads.zzdq");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0177  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzdq zzg(java.lang.String r10, java.lang.String[] r11, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzi r12) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdr.zzg(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.zzi):com.google.android.gms.internal.ads.zzdq");
    }

    public static byte[] zzh(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }

    private static int zzi(int i10, int i11) {
        switch (i10) {
            case 30:
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                F.a(com.google.android.gms.ads.internal.client.b.a(i11, 23), "Unrecognized APV band: ", i11, "CodecSpecificDataUtil");
                            }
                        }
                    }
                }
                break;
            case 33:
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                F.a(com.google.android.gms.ads.internal.client.b.a(i11, 23), "Unrecognized APV band: ", i11, "CodecSpecificDataUtil");
                            }
                        }
                    }
                }
                break;
            case 60:
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                F.a(com.google.android.gms.ads.internal.client.b.a(i11, 23), "Unrecognized APV band: ", i11, "CodecSpecificDataUtil");
                            }
                        }
                    }
                }
                break;
            case 63:
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                F.a(com.google.android.gms.ads.internal.client.b.a(i11, 23), "Unrecognized APV band: ", i11, "CodecSpecificDataUtil");
                            }
                        }
                    }
                }
                break;
            case 90:
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                F.a(com.google.android.gms.ads.internal.client.b.a(i11, 23), "Unrecognized APV band: ", i11, "CodecSpecificDataUtil");
                            }
                        }
                    }
                }
                break;
            case 93:
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                F.a(com.google.android.gms.ads.internal.client.b.a(i11, 23), "Unrecognized APV band: ", i11, "CodecSpecificDataUtil");
                            }
                        }
                    }
                }
                break;
            case 120:
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                F.a(com.google.android.gms.ads.internal.client.b.a(i11, 23), "Unrecognized APV band: ", i11, "CodecSpecificDataUtil");
                            }
                        }
                    }
                }
                break;
            case 123:
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                F.a(com.google.android.gms.ads.internal.client.b.a(i11, 23), "Unrecognized APV band: ", i11, "CodecSpecificDataUtil");
                            }
                        }
                    }
                }
                break;
            case 150:
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                F.a(com.google.android.gms.ads.internal.client.b.a(i11, 23), "Unrecognized APV band: ", i11, "CodecSpecificDataUtil");
                            }
                        }
                    }
                }
                break;
            case 153:
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                F.a(com.google.android.gms.ads.internal.client.b.a(i11, 23), "Unrecognized APV band: ", i11, "CodecSpecificDataUtil");
                            }
                        }
                    }
                }
                break;
            case Opcodes.GETFIELD /* 180 */:
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                F.a(com.google.android.gms.ads.internal.client.b.a(i11, 23), "Unrecognized APV band: ", i11, "CodecSpecificDataUtil");
                            }
                        }
                    }
                }
                break;
            case Opcodes.INVOKESPECIAL /* 183 */:
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                F.a(com.google.android.gms.ads.internal.client.b.a(i11, 23), "Unrecognized APV band: ", i11, "CodecSpecificDataUtil");
                            }
                        }
                    }
                }
                break;
            case 210:
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                F.a(com.google.android.gms.ads.internal.client.b.a(i11, 23), "Unrecognized APV band: ", i11, "CodecSpecificDataUtil");
                            }
                        }
                    }
                }
                break;
            case 213:
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                F.a(com.google.android.gms.ads.internal.client.b.a(i11, 23), "Unrecognized APV band: ", i11, "CodecSpecificDataUtil");
                            }
                        }
                    }
                }
                break;
            default:
                B.a(new StringBuilder(String.valueOf(i10).length() + 30), "Unrecognized APV level index: ", i10, "CodecSpecificDataUtil");
                break;
        }
        return -1;
    }
}
