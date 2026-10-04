package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.text.C5017i;

/* JADX INFO: loaded from: classes4.dex */
final class zzhad extends zzhag {
    final char[] zza;

    private zzhad(zzhac zzhacVar) {
        super(zzhacVar, null);
        this.zza = new char[512];
        zzguk.zza(zzhacVar.zzf().length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = zzhacVar.zza(i10 >>> 4);
            this.zza[i10 | 256] = zzhacVar.zza(i10 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhag, com.google.android.gms.internal.ads.zzhah
    public final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzguk.zzo(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            char[] cArr = this.zza;
            appendable.append(cArr[i13]);
            appendable.append(cArr[i13 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhag, com.google.android.gms.internal.ads.zzhah
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzhaf {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new zzhaf(androidx.multidex.d.a(new StringBuilder(String.valueOf(length).length() + 21), "Invalid input length ", length));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            zzhac zzhacVar = this.zzb;
            bArr[i11] = (byte) (zzhacVar.zzc(charSequence.charAt(i10 + 1)) | (zzhacVar.zzc(charSequence.charAt(i10)) << 4));
            i10 += 2;
            i11++;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public final zzhah zzc(zzhac zzhacVar, Character ch) {
        return new zzhad(zzhacVar);
    }

    public zzhad(String str, String str2) {
        this(new zzhac("base16()", C5017i.f218346b.toCharArray()));
    }
}
