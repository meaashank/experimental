package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes4.dex */
public final class zzi {
    public static final zzi zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;

    @Nullable
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzh zzhVar = new zzh();
        zzhVar.zza(1);
        zzhVar.zzb(2);
        zzhVar.zzc(3);
        zza = zzhVar.zzg();
        zzh zzhVar2 = new zzh();
        zzhVar2.zza(1);
        zzhVar2.zzb(1);
        zzhVar2.zzc(2);
        zzhVar2.zzg();
        String str = zzfm.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzi(int i10, int i11, int i12, byte[] bArr, int i13, int i14, byte[] bArr2) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = bArr;
        this.zzf = i13;
        this.zzg = i14;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean zza(@Nullable zzi zziVar) {
        if (zziVar == null) {
            return true;
        }
        int i10 = zziVar.zzb;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = zziVar.zzc;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = zziVar.zzd;
        if ((i12 != -1 && i12 != 3) || zziVar.zze != null) {
            return false;
        }
        int i13 = zziVar.zzg;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = zziVar.zzf;
        return i14 == -1 || i14 == 8;
    }

    @Pure
    public static int zzb(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int zzc(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String zzh(int i10) {
        return i10 != -1 ? i10 != 6 ? i10 != 1 ? i10 != 2 ? androidx.multidex.d.a(new StringBuilder(String.valueOf(i10).length() + 22), "Undefined color space ", i10) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String zzi(int i10) {
        return i10 != -1 ? i10 != 10 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 6 ? i10 != 7 ? androidx.multidex.d.a(new StringBuilder(String.valueOf(i10).length() + 25), "Undefined color transfer ", i10) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    private static String zzj(int i10) {
        return i10 != -1 ? i10 != 1 ? i10 != 2 ? androidx.multidex.d.a(new StringBuilder(String.valueOf(i10).length() + 22), "Undefined color range ", i10) : "Limited range" : "Full range" : "Unset color range";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzi.class == obj.getClass()) {
            zzi zziVar = (zzi) obj;
            if (this.zzb == zziVar.zzb && this.zzc == zziVar.zzc && this.zzd == zziVar.zzd && Arrays.equals(this.zze, zziVar.zze) && this.zzf == zziVar.zzf && this.zzg == zziVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzh;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        int i10 = this.zzf;
        int i11 = this.zzd;
        int i12 = this.zzc;
        String strZzh = zzh(this.zzb);
        String strZzj = zzj(i12);
        String strZzi = zzi(i11);
        String strA = i10 != -1 ? android.support.v4.media.d.a(new StringBuilder(String.valueOf(i10).length() + 8), i10, "bit Luma") : "NA";
        int i13 = this.zzg;
        String strA2 = i13 != -1 ? android.support.v4.media.d.a(new StringBuilder(String.valueOf(i13).length() + 10), i13, "bit Chroma") : "NA";
        boolean z10 = this.zze != null;
        StringBuilder sbA = com.google.android.gms.auth.a.a(com.bytedance.sdk.component.utils.a.a(strA2, com.bytedance.sdk.component.utils.a.a(strA, com.bytedance.sdk.component.utils.a.a(String.valueOf(z10), com.bytedance.sdk.component.utils.a.a(strZzj, strZzh.length() + 12, 2) + strZzi.length() + 2, 2), 2), 1), "ColorInfo(", strZzh, U6.j.f68738d, strZzj);
        sbA.append(U6.j.f68738d);
        sbA.append(strZzi);
        sbA.append(U6.j.f68738d);
        sbA.append(z10);
        androidx.room.F.a(sbA, U6.j.f68738d, strA, U6.j.f68738d, strA2);
        sbA.append(")");
        return sbA.toString();
    }

    public final zzh zzd() {
        return new zzh(this, null);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }

    public final String zzg() {
        String str;
        String string;
        if (zzf()) {
            Object[] objArr = {zzh(this.zzb), zzj(this.zzc), zzi(this.zzd)};
            String str2 = zzfm.zza;
            str = String.format(Locale.US, "%s/%s/%s", objArr);
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            int i10 = this.zzf;
            int i11 = this.zzg;
            StringBuilder sb2 = new StringBuilder(com.google.android.gms.ads.internal.client.b.a(i10, 1) + String.valueOf(i11).length());
            sb2.append(i10);
            sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb2.append(i11);
            string = sb2.toString();
        } else {
            string = "NA/NA";
        }
        return androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + str.length() + 1), str, RemoteSettings.FORWARD_SLASH_STRING, string);
    }
}
