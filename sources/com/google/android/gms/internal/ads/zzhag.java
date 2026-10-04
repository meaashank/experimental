package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes4.dex */
class zzhag extends zzhah {
    private volatile zzhah zza;
    final zzhac zzb;
    final Character zzc;

    public zzhag(zzhac zzhacVar, Character ch) {
        this.zzb = zzhacVar;
        boolean z10 = true;
        if (ch != null && zzhacVar.zze(SignatureVisitor.INSTANCEOF)) {
            z10 = false;
        }
        zzguk.zzf(z10, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhag) {
            zzhag zzhagVar = (zzhag) obj;
            if (this.zzb.equals(zzhagVar.zzb) && Objects.equals(this.zzc, zzhagVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        zzhac zzhacVar = this.zzb;
        sb2.append(zzhacVar);
        if (8 % zzhacVar.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzguk.zzo(0, i11, bArr.length);
        while (i12 < i11) {
            int i13 = this.zzb.zzd;
            zze(appendable, bArr, i12, Math.min(i13, i11 - i12));
            i12 += i13;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public int zzb(byte[] bArr, CharSequence charSequence) throws zzhaf {
        int i10;
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzhac zzhacVar = this.zzb;
        if (!zzhacVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            throw new zzhaf(androidx.multidex.d.a(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequenceZzg.length()) {
            long jZzc = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = zzhacVar.zzc;
                if (i13 >= i10) {
                    break;
                }
                jZzc <<= zzhacVar.zzb;
                if (i11 + i13 < charSequenceZzg.length()) {
                    jZzc |= (long) zzhacVar.zzc(charSequenceZzg.charAt(i14 + i11));
                    i14++;
                }
                i13++;
            }
            int i15 = zzhacVar.zzd;
            int i16 = i14 * zzhacVar.zzb;
            int i17 = (i15 - 1) * 8;
            while (i17 >= (i15 * 8) - i16) {
                bArr[i12] = (byte) ((jZzc >>> i17) & 255);
                i17 -= 8;
                i12++;
            }
            i11 += i10;
        }
        return i12;
    }

    public zzhah zzc(zzhac zzhacVar, Character ch) {
        return new zzhag(zzhacVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final int zzd(int i10) {
        zzhac zzhacVar = this.zzb;
        return zzhacVar.zzc * zzhaz.zzb(i10, zzhacVar.zzd, RoundingMode.CEILING);
    }

    public final void zze(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzguk.zzo(i10, i10 + i11, bArr.length);
        zzhac zzhacVar = this.zzb;
        int i12 = zzhacVar.zzd;
        int i13 = 0;
        zzguk.zza(i11 <= i12);
        long j10 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            j10 = (j10 | ((long) (bArr[i10 + i14] & 255))) << 8;
        }
        int i15 = (i11 + 1) * 8;
        int i16 = zzhacVar.zzb;
        while (i13 < i11 * 8) {
            appendable.append(zzhacVar.zza(zzhacVar.zza & ((int) (j10 >>> ((i15 - i16) - i13)))));
            i13 += i16;
        }
        if (this.zzc != null) {
            while (i13 < i12 * 8) {
                appendable.append(SignatureVisitor.INSTANCEOF);
                i13 += i16;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final int zzf(int i10) {
        return (int) (((((long) this.zzb.zzb) * ((long) i10)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final zzhah zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final zzhah zzi() {
        zzhah zzhahVarZzc = this.zza;
        if (zzhahVarZzc == null) {
            zzhac zzhacVar = this.zzb;
            zzhac zzhacVarZzd = zzhacVar.zzd();
            zzhahVarZzc = zzhacVarZzd == zzhacVar ? this : zzc(zzhacVarZzd, this.zzc);
            this.zza = zzhahVarZzc;
        }
        return zzhahVarZzc;
    }

    public zzhag(String str, String str2, Character ch) {
        this(new zzhac(str, str2.toCharArray()), ch);
    }
}
