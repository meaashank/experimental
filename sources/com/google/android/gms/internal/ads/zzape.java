package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzape implements zzanz {
    private final zzeu zza = new zzeu();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzape(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzfm.zzk(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i10 = bArr[25] * Ascii.DC4;
        this.zzg = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.zzb = z10;
        if (z10) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            int i16 = i10 & 1;
            int i17 = i10 & 2;
            boolean z10 = true;
            if (i16 != 0) {
                if (i17 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                    z10 = false;
                }
            } else if (i17 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            } else {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            } else {
                if (i16 != 0 || z10) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(byte[] bArr, int i10, int i11, zzany zzanyVar, zzdu zzduVar) {
        String strZzK;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        SpannableStringBuilder spannableStringBuilder;
        int i17;
        int i18;
        int i19;
        int i20;
        zzeu zzeuVar = this.zza;
        zzeuVar.zzb(bArr, i10 + i11);
        zzeuVar.zzh(i10);
        int i21 = 1;
        int i22 = 0;
        int i23 = 2;
        zzguk.zza(zzeuVar.zzd() >= 2);
        int iZzt = zzeuVar.zzt();
        if (iZzt == 0) {
            strZzK = "";
        } else {
            int iZzg = zzeuVar.zzg();
            Charset charsetZzR = zzeuVar.zzR();
            int iZzg2 = zzeuVar.zzg() - iZzg;
            if (charsetZzR == null) {
                charsetZzR = StandardCharsets.UTF_8;
            }
            strZzK = zzeuVar.zzK(iZzt - iZzg2, charsetZzR);
        }
        if (strZzK.isEmpty()) {
            zzduVar.zza(new zzanr(zzgxm.zzi(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strZzK);
        int i24 = this.zzc;
        zzb(spannableStringBuilder2, i24, 0, 0, spannableStringBuilder2.length(), androidx.recyclerview.widget.m.f116809W);
        int i25 = i24;
        int i26 = this.zzd;
        zzc(spannableStringBuilder2, i26, -1, 0, spannableStringBuilder2.length(), androidx.recyclerview.widget.m.f116809W);
        int i27 = i26;
        String str = this.zze;
        int length = spannableStringBuilder2.length();
        if (str != "sans-serif") {
            spannableStringBuilder2.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.zzf;
        while (zzeuVar.zzd() >= 8) {
            int iZzg3 = zzeuVar.zzg();
            int iZzB = zzeuVar.zzB();
            int iZzB2 = zzeuVar.zzB();
            if (iZzB2 == 1937013100) {
                zzguk.zza(zzeuVar.zzd() >= i23 ? i21 : i22);
                int iZzt2 = zzeuVar.zzt();
                int i28 = i22;
                while (i28 < iZzt2) {
                    zzguk.zza(zzeuVar.zzd() >= 12 ? i21 : i22);
                    int iZzt3 = zzeuVar.zzt();
                    int iZzt4 = zzeuVar.zzt();
                    zzeuVar.zzk(i23);
                    int i29 = iZzt2;
                    int iZzs = zzeuVar.zzs();
                    zzeuVar.zzk(i21);
                    int iZzB3 = zzeuVar.zzB();
                    if (iZzt4 > spannableStringBuilder2.length()) {
                        int length2 = spannableStringBuilder2.length();
                        i15 = i25;
                        i16 = i27;
                        spannableStringBuilder = spannableStringBuilder2;
                        StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.component.utils.a.a(String.valueOf(length2), String.valueOf(iZzt4).length() + 44, 2));
                        sb2.append("Truncating styl end (");
                        sb2.append(iZzt4);
                        sb2.append(") to cueText.length() (");
                        sb2.append(length2);
                        sb2.append(").");
                        zzeh.zzc("Tx3gParser", sb2.toString());
                        iZzt4 = spannableStringBuilder.length();
                    } else {
                        i15 = i25;
                        i16 = i27;
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                    if (iZzt3 >= iZzt4) {
                        StringBuilder sb3 = new StringBuilder(com.bytedance.sdk.component.utils.a.a(String.valueOf(iZzt4), String.valueOf(iZzt3).length() + 36, 2));
                        sb3.append("Ignoring styl with start (");
                        sb3.append(iZzt3);
                        sb3.append(") >= end (");
                        sb3.append(iZzt4);
                        sb3.append(").");
                        zzeh.zzc("Tx3gParser", sb3.toString());
                        i19 = i15;
                        i18 = i28;
                        i17 = i29;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i20 = i16;
                    } else {
                        i17 = i29;
                        i18 = i28;
                        spannableStringBuilder2 = spannableStringBuilder;
                        int i30 = i15;
                        zzb(spannableStringBuilder2, iZzs, i30, iZzt3, iZzt4, 0);
                        i19 = i30;
                        i20 = i16;
                        zzc(spannableStringBuilder2, iZzB3, i20, iZzt3, iZzt4, 0);
                    }
                    iZzt2 = i17;
                    i25 = i19;
                    i27 = i20;
                    i21 = 1;
                    i23 = 2;
                    i28 = i18 + 1;
                    i22 = 0;
                }
                i12 = i25;
                i13 = i27;
                i14 = i23;
            } else {
                i12 = i25;
                i13 = i27;
                if (iZzB2 == 1952608120 && this.zzb) {
                    i14 = 2;
                    zzguk.zza(zzeuVar.zzd() >= 2);
                    float fZzt = zzeuVar.zzt();
                    int i31 = this.zzg;
                    String str2 = zzfm.zza;
                    fMax = Math.max(0.0f, Math.min(fZzt / i31, 0.95f));
                } else {
                    i14 = 2;
                }
            }
            zzeuVar.zzh(iZzg3 + iZzB);
            i25 = i12;
            i23 = i14;
            i27 = i13;
            i21 = 1;
            i22 = 0;
        }
        zzcx zzcxVar = new zzcx();
        zzcxVar.zza(spannableStringBuilder2);
        zzcxVar.zzf(fMax, 0);
        zzcxVar.zzg(0);
        zzduVar.zza(new zzanr(zzgxm.zzj(zzcxVar.zzr()), -9223372036854775807L, -9223372036854775807L));
    }
}
