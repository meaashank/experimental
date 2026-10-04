package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzql {
    public static final zzql zza;

    @e.f0
    static final zzgxp zzb;
    private static final zzgxm zzc;
    private static final zzgxm zzd;

    @SuppressLint({"InlinedApi"})
    private static final zzgxm zze;
    private final SparseArray zzf = new SparseArray();
    private final int zzg;
    private final zzgxm zzh;
    private final zzgxm zzi;

    static {
        zzgxm zzgxmVarZzj = zzgxm.zzj(12);
        zzc = zzgxmVarZzj;
        zzgxm zzgxmVarZzi = zzgxm.zzi();
        zzd = zzgxmVarZzi;
        zza = new zzql(zzgxm.zzj(zzqk.zza), zzgxmVarZzj, zzgxmVarZzi);
        zze = zzgxm.zzl(2, 5, 6);
        zzgxo zzgxoVar = new zzgxo();
        zzgxoVar.zza(5, 6);
        zzgxoVar.zza(17, 6);
        zzgxoVar.zza(7, 6);
        zzgxoVar.zza(30, 10);
        zzgxoVar.zza(18, 6);
        zzgxoVar.zza(6, 8);
        zzgxoVar.zza(8, 8);
        zzgxoVar.zza(14, 8);
        zzb = zzgxoVar.zzc();
    }

    private zzql(List list, List list2, List list3) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzqk zzqkVar = (zzqk) list.get(i10);
            this.zzf.put(zzqkVar.zzb, zzqkVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.zzf.size(); i11++) {
            iMax = Math.max(iMax, ((zzqk) this.zzf.valueAt(i11)).zzc);
        }
        this.zzg = iMax;
        this.zzh = zzgxm.zzq(list2);
        this.zzi = zzgxm.zzq(list3);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static zzql zza(Context context, zzd zzdVar, @Nullable AudioDeviceInfo audioDeviceInfo, List list) {
        return zzb(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzdVar, audioDeviceInfo, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @android.annotation.SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzql zzb(android.content.Context r9, @androidx.annotation.Nullable android.content.Intent r10, com.google.android.gms.internal.ads.zzd r11, @androidx.annotation.Nullable android.media.AudioDeviceInfo r12, java.util.List r13) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzql.zzb(android.content.Context, android.content.Intent, com.google.android.gms.internal.ads.zzd, android.media.AudioDeviceInfo, java.util.List):com.google.android.gms.internal.ads.zzql");
    }

    @Nullable
    public static Uri zzc() {
        if (zzg()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean zzg() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    private static zzgxm zzh(@Nullable int[] iArr, int i10) {
        int i11 = zzgxm.zzd;
        zzgxj zzgxjVar = new zzgxj();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i12 : iArr) {
            zzgxjVar.zzf(new zzqk(i12, i10));
        }
        return zzgxjVar.zzi();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzql)) {
            return false;
        }
        zzql zzqlVar = (zzql) obj;
        SparseArray sparseArray = this.zzf;
        SparseArray sparseArray2 = zzqlVar.zzf;
        String str = zzfm.zza;
        if (Build.VERSION.SDK_INT < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i10 = 0; i10 < size; i10++) {
                    if (!Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                        break;
                    }
                }
                if (this.zzg != zzqlVar.zzg) {
                }
            }
        } else if (sparseArray.contentEquals(sparseArray2)) {
            if (this.zzg != zzqlVar.zzg && Objects.equals(this.zzh, zzqlVar.zzh) && Objects.equals(this.zzi, zzqlVar.zzi)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = zzfm.zza;
        int i10 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzf;
        if (i10 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i11)) + ((sparseArray.keyAt(i11) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return Objects.hashCode(this.zzi) + ((Objects.hashCode(this.zzh) + (((this.zzg * 31) + iContentHashCode) * 31)) * 31);
    }

    public final String toString() {
        zzgxm zzgxmVar = this.zzi;
        zzgxm zzgxmVar2 = this.zzh;
        String string = this.zzf.toString();
        String strValueOf = String.valueOf(zzgxmVar2);
        String strValueOf2 = String.valueOf(zzgxmVar);
        int i10 = this.zzg;
        int length = String.valueOf(i10).length();
        int length2 = string.length();
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 28 + strValueOf.length() + 26 + strValueOf2.length() + 1);
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i10);
        sb2.append(", audioProfiles=");
        sb2.append(string);
        androidx.room.F.a(sb2, ", speakerLayoutChannelMasks=", strValueOf, ", spatializerChannelMasks=", strValueOf2);
        sb2.append("]");
        return sb2.toString();
    }

    public final zzgxm zzd() {
        return this.zzh;
    }

    public final zzgxm zze() {
        return this.zzi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r1
      0x003a: PHI (r1v3 int) = (r1v2 int), (r1v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair zzf(com.google.android.gms.internal.ads.zzv r10, com.google.android.gms.internal.ads.zzd r11) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzql.zzf(com.google.android.gms.internal.ads.zzv, com.google.android.gms.internal.ads.zzd):android.util.Pair");
    }
}
