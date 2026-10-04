package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzhae extends zzhag {
    private zzhae(zzhac zzhacVar, Character ch) {
        super(zzhacVar, ch);
        zzguk.zza(zzhacVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzhag, com.google.android.gms.internal.ads.zzhah
    public final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzguk.zzo(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & 255;
            int i15 = bArr[i12 + 1] & 255;
            int i16 = bArr[i12 + 2] & 255;
            zzhac zzhacVar = this.zzb;
            int i17 = (i15 << 8) | (i14 << 16) | i16;
            appendable.append(zzhacVar.zza(i17 >>> 18));
            appendable.append(zzhacVar.zza((i17 >>> 12) & 63));
            appendable.append(zzhacVar.zza((i17 >>> 6) & 63));
            appendable.append(zzhacVar.zza(i17 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            zze(appendable, bArr, i12, i11 - i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhag, com.google.android.gms.internal.ads.zzhah
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzhaf {
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzhac zzhacVar = this.zzb;
        if (!zzhacVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            throw new zzhaf(androidx.multidex.d.a(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceZzg.length()) {
            int i12 = i11 + 1;
            int iZzc = (zzhacVar.zzc(charSequenceZzg.charAt(i10 + 1)) << 12) | (zzhacVar.zzc(charSequenceZzg.charAt(i10)) << 18);
            bArr[i11] = (byte) (iZzc >>> 16);
            int i13 = i10 + 2;
            if (i13 < charSequenceZzg.length()) {
                int i14 = i10 + 3;
                int iZzc2 = iZzc | (zzhacVar.zzc(charSequenceZzg.charAt(i13)) << 6);
                int i15 = i11 + 2;
                bArr[i12] = (byte) ((iZzc2 >>> 8) & 255);
                if (i14 < charSequenceZzg.length()) {
                    i10 += 4;
                    i11 += 3;
                    bArr[i15] = (byte) ((iZzc2 | zzhacVar.zzc(charSequenceZzg.charAt(i14))) & 255);
                } else {
                    i11 = i15;
                    i10 = i14;
                }
            } else {
                i10 = i13;
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public final zzhah zzc(zzhac zzhacVar, Character ch) {
        return new zzhae(zzhacVar, ch);
    }

    public zzhae(String str, String str2, Character ch) {
        this(new zzhac(str, str2.toCharArray()), ch);
    }
}
