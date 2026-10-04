package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.annotation.Nullable;
import androidx.fragment.app.C2564b;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvs {
    public final String zza;
    public final String zzb;
    public final String zzc;

    @Nullable
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    @e.f0
    public zzvs(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z10;
        this.zze = z13;
        this.zzf = z15;
        this.zzh = z16;
        this.zzi = zzas.zzb(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzvs zza(java.lang.String r12, java.lang.String r13, java.lang.String r14, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            com.google.android.gms.internal.ads.zzvs r0 = new com.google.android.gms.internal.ads.zzvs
            r1 = 1
            r2 = 0
            if (r15 == 0) goto L10
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L10
            r8 = r1
            goto L11
        L10:
            r8 = r2
        L11:
            if (r15 == 0) goto L1d
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L1d
            r9 = r1
            goto L1e
        L1d:
            r9 = r2
        L1e:
            if (r20 != 0) goto L2a
            if (r15 == 0) goto L2c
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L2c
        L2a:
            r10 = r1
            goto L2d
        L2c:
            r10 = r2
        L2d:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 35
            if (r3 < r4) goto L6f
            if (r15 == 0) goto L6f
            java.lang.String r3 = "detached-surface"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L6f
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Xiaomi"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L6f
            java.lang.String r4 = "OPPO"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L6f
            java.lang.String r4 = "realme"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L6f
            java.lang.String r4 = "motorola"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L6f
            java.lang.String r4 = "LENOVO"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L6f
            java.lang.String r4 = "Fairphone"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L7b
        L6f:
            r1 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r2
            r2 = r13
            goto L86
        L7b:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r1
            r1 = r12
        L86:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvs.zza(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzvs");
    }

    private final boolean zzj(zzv zzvVar) {
        String str = this.zzb;
        return str.equals(zzvVar.zzp) || str.equals(zzwl.zzg(zzvVar));
    }

    private final boolean zzk(Context context, zzv zzvVar, boolean z10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        zzdq zzdqVarZzf = zzdr.zzf(zzvVar);
        String str = zzvVar.zzp;
        byte b10 = -1;
        if (str != null && str.equals("video/mv-hevc")) {
            String strZzh = zzas.zzh(this.zzc);
            if (strZzh.equals("video/mv-hevc")) {
                return true;
            }
            if (strZzh.equals("video/hevc")) {
                int i10 = zzwl.zza;
                String strZzk = zzgr.zzk(zzvVar.zzs);
                if (strZzk == null) {
                    zzdqVarZzf = null;
                } else {
                    String strTrim = strZzk.trim();
                    String str2 = zzfm.zza;
                    zzdqVarZzf = zzdr.zzg(strZzk, strTrim.split("\\.", -1), zzvVar.zzG);
                }
            }
        }
        if (zzdqVarZzf == null) {
            return true;
        }
        if (!zzdqVarZzf.zzc()) {
            return false;
        }
        int iZza = zzdqVarZzf.zza();
        int iZzb = zzdqVarZzf.zzb();
        int i11 = 8;
        if ("video/dolby-vision".equals(str)) {
            String str3 = this.zzb;
            int iHashCode = str3.hashCode();
            if (iHashCode != -1662735862) {
                if (iHashCode != -1662541442) {
                    if (iHashCode == 1331836730 && str3.equals("video/avc")) {
                        b10 = 0;
                    }
                } else if (str3.equals("video/hevc")) {
                    b10 = 1;
                }
            } else if (str3.equals("video/av01")) {
                b10 = 2;
            }
            if (b10 == 0) {
                iZzb = 0;
                iZza = 8;
            } else if (b10 == 1 || b10 == 2) {
                iZzb = 0;
                iZza = 2;
            }
        }
        if (!this.zzi && !this.zzb.equals("audio/ac4") && iZza != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb = zzb();
        String str4 = this.zzb;
        if (str4.equals("audio/ac4") && codecProfileLevelArrZzb.length == 0) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            int i12 = (codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null || audioCapabilities.getMaxInputChannelCount() <= 18) ? 8 : 16;
            codecProfileLevelArrZzb = zzfm.zzS(context) ? new MediaCodecInfo.CodecProfileLevel[]{zzwl.zzf(1026, i12)} : new MediaCodecInfo.CodecProfileLevel[]{zzwl.zzf(257, i12), zzwl.zzf(513, i12), zzwl.zzf(com.prism.gaia.helper.utils.apk.b.f165087g, i12), zzwl.zzf(1026, i12), zzwl.zzf(1028, i12)};
        }
        if (Build.VERSION.SDK_INT == 23 && "video/x-vnd.on2.vp9".equals(str4) && codecProfileLevelArrZzb.length == 0) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            int iIntValue = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue >= 180000000) {
                i11 = 1024;
            } else if (iIntValue >= 120000000) {
                i11 = 512;
            } else if (iIntValue >= 60000000) {
                i11 = 256;
            } else if (iIntValue >= 30000000) {
                i11 = 128;
            } else if (iIntValue >= 18000000) {
                i11 = 64;
            } else if (iIntValue >= 12000000) {
                i11 = 32;
            } else if (iIntValue >= 7200000) {
                i11 = 16;
            } else if (iIntValue < 3600000) {
                i11 = iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
            }
            codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzwl.zzf(1, i11)};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrZzb) {
            if (codecProfileLevel.profile == iZza && (codecProfileLevel.level >= iZzb || !z10)) {
                if ("video/hevc".equals(str4) && iZza == 2) {
                    String str5 = Build.DEVICE;
                    if ("sailfish".equals(str5) || "marlin".equals(str5)) {
                    }
                }
                return true;
            }
        }
        String str6 = zzvVar.zzk;
        String str7 = this.zzc;
        zzm(C2564b.a(new StringBuilder(str7.length() + String.valueOf(str6).length() + 22), "codec.profileLevel, ", str6, U6.j.f68738d, str7));
        return false;
    }

    private final boolean zzl(zzv zzvVar) {
        return (Objects.equals(zzvVar.zzp, "audio/flac") && zzvVar.zzL == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void zzm(String str) {
        String str2 = zzfm.zza;
        String str3 = this.zzb;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.zza;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 14 + 2 + length + 3 + length2 + 1);
        androidx.room.F.a(sb2, "NoSupport [", str, "] [", str4);
        androidx.room.F.a(sb2, U6.j.f68738d, str3, "] [", str2);
        sb2.append("]");
        zzeh.zza("MediaCodecInfo", sb2.toString());
    }

    private static boolean zzn(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Range<Double> achievableFrameRatesFor;
        Point pointZzo = zzo(videoCapabilities, i10, i11);
        int i12 = pointZzo.x;
        int i13 = pointZzo.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        double dFloor = Math.floor(d10);
        if (videoCapabilities.areSizeAndRateSupported(i12, i13, dFloor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
        }
        return false;
    }

    private static Point zzo(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzfm.zza;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean zzc(Context context, zzv zzvVar) {
        int i10;
        if (!zzj(zzvVar) || !zzk(context, zzvVar, true) || !zzl(zzvVar)) {
            return false;
        }
        if (this.zzi) {
            int i11 = zzvVar.zzw;
            if (i11 <= 0 || (i10 = zzvVar.zzx) <= 0) {
                return true;
            }
            return zzg(i11, i10, zzvVar.zzA);
        }
        int i12 = zzvVar.zzK;
        if (i12 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzm("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzm("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i12)) {
                zzm(androidx.multidex.d.a(new StringBuilder(String.valueOf(i12).length() + 20), "sampleRate.support, ", i12));
                return false;
            }
        }
        int i13 = zzvVar.zzI;
        if (i13 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzm("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzm("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                int i14 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.component.utils.a.a(String.valueOf(i14), String.valueOf(maxInputChannelCount).length() + str.length() + 32 + 4, 1));
                sb2.append("AssumedMaxChannelAdjustment: ");
                sb2.append(str);
                sb2.append(", [");
                sb2.append(maxInputChannelCount);
                sb2.append(" to ");
                sb2.append(i14);
                sb2.append("]");
                zzeh.zzc("MediaCodecInfo", sb2.toString());
                maxInputChannelCount = i14;
            }
            if (maxInputChannelCount < i13) {
                zzm(androidx.multidex.d.a(new StringBuilder(String.valueOf(i13).length() + 22), "channelCount.support, ", i13));
                return false;
            }
        }
        return true;
    }

    public final boolean zzd(Context context, zzv zzvVar) {
        return zzj(zzvVar) && zzk(context, zzvVar, false) && zzl(zzvVar);
    }

    public final boolean zze(zzv zzvVar) {
        if (this.zzi) {
            return this.zze;
        }
        zzdq zzdqVarZzf = zzdr.zzf(zzvVar);
        return zzdqVarZzf != null && zzdqVarZzf.zzc() && zzdqVarZzf.zza() == 42;
    }

    public final zzjf zzf(zzv zzvVar, zzv zzvVar2) {
        zzv zzvVar3;
        zzv zzvVar4;
        int i10;
        String str = zzvVar.zzp;
        String str2 = zzvVar2.zzp;
        int i11 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.zzi) {
            if (zzvVar.zzB != zzvVar2.zzB) {
                i11 |= 1024;
            }
            boolean z10 = (zzvVar.zzw == zzvVar2.zzw && zzvVar.zzx == zzvVar2.zzx) ? false : true;
            if (!this.zze && z10) {
                i11 |= 512;
            }
            zzi zziVar = zzvVar.zzG;
            if ((!zzi.zza(zziVar) || !zzi.zza(zzvVar2.zzG)) && !Objects.equals(zziVar, zzvVar2.zzG)) {
                i11 |= 2048;
            }
            String str3 = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !zzvVar.zzd(zzvVar2)) {
                i11 |= 2;
            }
            int i12 = zzvVar.zzy;
            if (i12 != -1 && (i10 = zzvVar.zzz) != -1 && i12 == zzvVar2.zzy && i10 == zzvVar2.zzz && z10) {
                i11 |= 2;
            }
            if (i11 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairZze = zzdr.zze(zzvVar);
                Pair pairZze2 = zzdr.zze(zzvVar2);
                if (pairZze == null || pairZze2 == null || !((Integer) pairZze.first).equals(pairZze2.first)) {
                    i11 = 2;
                }
            }
            if (i11 == 0) {
                return new zzjf(str3, zzvVar, zzvVar2, true == zzvVar.zzd(zzvVar2) ? 3 : 2, 0);
            }
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
        } else {
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
            if (zzvVar3.zzI != zzvVar4.zzI) {
                i11 |= 4096;
            }
            if (zzvVar3.zzK != zzvVar4.zzK) {
                i11 |= 8192;
            }
            if (zzvVar3.zzL != zzvVar4.zzL) {
                i11 |= 16384;
            }
            if (i11 == 0) {
                String str4 = this.zzb;
                if (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4")) {
                    Pair pairZze3 = zzdr.zze(zzvVar3);
                    Pair pairZze4 = zzdr.zze(zzvVar4);
                    if (pairZze3 != null && pairZze4 != null) {
                        int iIntValue = ((Integer) pairZze3.first).intValue();
                        int iIntValue2 = ((Integer) pairZze4.first).intValue();
                        if (iIntValue == 42 && iIntValue2 == 42) {
                            return new zzjf(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                        if (str4.equals("audio/ac4") && pairZze3.equals(pairZze4)) {
                            return new zzjf(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                    }
                }
            }
            if (i11 == 0) {
                String str5 = this.zzb;
                if (str5.equals("audio/eac3-joc") || str5.equals("audio/eac3")) {
                    return new zzjf(this.zza, zzvVar3, zzvVar4, 3, 0);
                }
            }
            if (!zzvVar3.zzd(zzvVar4)) {
                i11 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new zzjf(this.zza, zzvVar3, zzvVar4, 1, 0);
            }
        }
        return new zzjf(this.zza, zzvVar3, zzvVar4, 0, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzg(int r11, int r12, double r13) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvs.zzg(int, int, double):boolean");
    }

    public final float zzh(int i10, int i11) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f10 = this.zzl;
        if (f10 != -3.4028235E38f && this.zzj == i10 && this.zzk == i11) {
            return f10;
        }
        float f11 = 1024.0f;
        if (!zzg(i10, i11, 1024.0d)) {
            float f12 = 0.0f;
            while (true) {
                float f13 = f11 - f12;
                if (Math.abs(f13) <= 5.0f) {
                    break;
                }
                float f14 = (f13 / 2.0f) + f12;
                boolean zZzg = zzg(i10, i11, f14);
                if (true == zZzg) {
                    f12 = f14;
                }
                if (true != zZzg) {
                    f11 = f14;
                }
            }
            f11 = f12;
        }
        this.zzl = f11;
        this.zzj = i10;
        this.zzk = i11;
        return f11;
    }

    @Nullable
    public final Point zzi(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzo(videoCapabilities, i10, i11);
    }
}
