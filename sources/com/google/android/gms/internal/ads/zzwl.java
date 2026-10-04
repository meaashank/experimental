package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import e.InterfaceC4326A;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"InlinedApi"})
public final class zzwl {
    public static final /* synthetic */ int zza = 0;

    @InterfaceC4326A("MediaCodecUtil.class")
    private static final HashMap zzb = new HashMap();

    @Nullable
    public static zzvs zza() throws zzwd {
        List listZzb = zzb("audio/raw", false, false);
        if (listZzb.isEmpty()) {
            return null;
        }
        return (zzvs) listZzb.get(0);
    }

    public static synchronized List zzb(String str, boolean z10, boolean z11) throws zzwd {
        try {
            zzwc zzwcVar = new zzwc(str, z10, z11);
            HashMap map = zzb;
            List list = (List) map.get(zzwcVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListZzh = zzh(zzwcVar, new zzwg(z10, z11, str.equals("video/mv-hevc")));
            if (z10 && arrayListZzh.isEmpty() && Build.VERSION.SDK_INT == 23) {
                arrayListZzh = zzh(zzwcVar, new zzwf(null));
                if (!arrayListZzh.isEmpty()) {
                    String str2 = ((zzvs) arrayListZzh.get(0)).zza;
                    StringBuilder sb2 = new StringBuilder(str.length() + 63 + str2.length());
                    sb2.append("MediaCodecList API didn't list secure decoder for: ");
                    sb2.append(str);
                    sb2.append(". Assuming: ");
                    sb2.append(str2);
                    zzeh.zzc("MediaCodecUtil", sb2.toString());
                }
            }
            if ("audio/raw".equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListZzh.size() == 1 && ((zzvs) arrayListZzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListZzh.add(zzvs.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzj(arrayListZzh, zzwh.zza);
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzvs) arrayListZzh.get(0)).zza)) {
                arrayListZzh.add((zzvs) arrayListZzh.remove(0));
            }
            zzgxm zzgxmVarZzq = zzgxm.zzq(arrayListZzh);
            map.put(zzwcVar, zzgxmVarZzq);
            return zzgxmVarZzq;
        } catch (Throwable th) {
            throw th;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzc(zzwb zzwbVar, zzv zzvVar, boolean z10, boolean z11) throws zzwd {
        List listZza = zzwbVar.zza(zzvVar.zzp, z10, z11);
        List listZzd = zzd(zzwbVar, zzvVar, z10, z11);
        int i10 = zzgxm.zzd;
        zzgxj zzgxjVar = new zzgxj();
        zzgxjVar.zzh(listZza);
        zzgxjVar.zzh(listZzd);
        return zzgxjVar.zzi();
    }

    public static List zzd(zzwb zzwbVar, zzv zzvVar, boolean z10, boolean z11) throws zzwd {
        String strZzg = zzg(zzvVar);
        return strZzg == null ? zzgxm.zzi() : zzwbVar.zza(strZzg, z10, z11);
    }

    @CheckResult
    public static List zze(final Context context, List list, final zzv zzvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zzwk() { // from class: com.google.android.gms.internal.ads.zzwj
            @Override // com.google.android.gms.internal.ads.zzwk
            public final /* synthetic */ int zza(Object obj) {
                int i10 = zzwl.zza;
                return ((zzvs) obj).zzd(context, zzvVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i10, int i11) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i10;
        codecProfileLevel.level = i11;
        return codecProfileLevel;
    }

    @Nullable
    public static String zzg(zzv zzvVar) {
        zzdq zzdqVarZzf;
        String str = zzvVar.zzp;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("audio/vnd.dts.hd".equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return "audio/vnd.dts";
        }
        if ("video/dolby-vision".equals(str) && (zzdqVarZzf = zzdr.zzf(zzvVar)) != null && zzdqVarZzf.zzc()) {
            int iZza = zzdqVarZzf.zza();
            if (iZza == 16 || iZza == 256) {
                return "video/hevc";
            }
            if (iZza == 512) {
                return "video/avc";
            }
            if (iZza == 1024) {
                zzi zziVar = zzvVar.zzG;
                if (zziVar != null && zziVar.zzd == 6 && zziVar.zzc == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ca A[Catch: Exception -> 0x01c2, TryCatch #4 {Exception -> 0x01c2, blocks: (B:116:0x01bb, B:124:0x01d6, B:126:0x01e0, B:127:0x01e5, B:129:0x01f5, B:131:0x01fd, B:120:0x01ca), top: B:176:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e0 A[Catch: Exception -> 0x01c2, TryCatch #4 {Exception -> 0x01c2, blocks: (B:116:0x01bb, B:124:0x01d6, B:126:0x01e0, B:127:0x01e5, B:129:0x01f5, B:131:0x01fd, B:120:0x01ca), top: B:176:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e5 A[Catch: Exception -> 0x01c2, TryCatch #4 {Exception -> 0x01c2, blocks: (B:116:0x01bb, B:124:0x01d6, B:126:0x01e0, B:127:0x01e5, B:129:0x01f5, B:131:0x01fd, B:120:0x01ca), top: B:176:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0277 A[Catch: Exception -> 0x0041, TRY_ENTER, TryCatch #5 {Exception -> 0x0041, blocks: (B:3:0x0012, B:5:0x0027, B:7:0x0031, B:13:0x0044, B:17:0x0052, B:23:0x0067, B:25:0x0071, B:53:0x00dd, B:55:0x00e5, B:57:0x00ed, B:59:0x00f6, B:156:0x026f, B:159:0x0277, B:161:0x027d, B:162:0x029e, B:163:0x02cc, B:62:0x0103, B:63:0x0106, B:65:0x010e, B:68:0x0119, B:70:0x0121, B:75:0x012f, B:77:0x0137, B:79:0x013f, B:82:0x014a, B:84:0x0152, B:87:0x015d, B:89:0x0165, B:92:0x0170, B:94:0x0178, B:29:0x007d, B:31:0x0089, B:33:0x0093, B:35:0x009b, B:37:0x00a3, B:39:0x00ab, B:41:0x00b3, B:43:0x00bb, B:45:0x00c3), top: B:178:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x029e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc A[PHI: r18
      0x00cc: PHI (r18v0 int) = 
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v5 int)
      (r18v5 int)
      (r18v5 int)
      (r18v5 int)
      (r18v5 int)
      (r18v5 int)
      (r18v5 int)
      (r18v5 int)
     binds: [B:98:0x0184, B:106:0x019d, B:111:0x01af, B:109:0x01ab, B:103:0x0198, B:56:0x00eb, B:32:0x0091, B:34:0x0099, B:36:0x00a1, B:38:0x00a9, B:40:0x00b1, B:42:0x00b9, B:44:0x00c1, B:46:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzwc r27, com.google.android.gms.internal.ads.zzwe r28) throws com.google.android.gms.internal.ads.zzwd {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwl.zzh(com.google.android.gms.internal.ads.zzwc, com.google.android.gms.internal.ads.zzwe):java.util.ArrayList");
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.zza(str)) {
            return true;
        }
        String strZza = zzgts.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.") || ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google."))) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zzwk zzwkVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwi
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i10 = zzwl.zza;
                zzwk zzwkVar2 = zzwkVar;
                return zzwkVar2.zza(obj2) - zzwkVar2.zza(obj);
            }
        });
    }
}
