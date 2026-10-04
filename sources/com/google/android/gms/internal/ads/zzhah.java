package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.text.C5017i;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhah {
    private static final zzhah zza;
    private static final zzhah zzb;
    private static final zzhah zzc;

    static {
        Character chValueOf = Character.valueOf(SignatureVisitor.INSTANCEOF);
        zza = new zzhae("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", chValueOf);
        zzb = new zzhae("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", chValueOf);
        new zzhag("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", chValueOf);
        new zzhag("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", chValueOf);
        zzc = new zzhad("base16()", C5017i.f218346b);
    }

    public static zzhah zzl() {
        return zza;
    }

    public static zzhah zzm() {
        return zzb;
    }

    public static zzhah zzn() {
        return zzc;
    }

    public abstract void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzb(byte[] bArr, CharSequence charSequence) throws zzhaf;

    public abstract int zzd(int i10);

    public abstract int zzf(int i10);

    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public abstract zzhah zzh();

    public abstract zzhah zzi();

    public final String zzj(byte[] bArr, int i10, int i11) {
        zzguk.zzo(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzd(i11));
        try {
            zza(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzg = zzg(charSequence);
            int iZzf = zzf(charSequenceZzg.length());
            byte[] bArr = new byte[iZzf];
            int iZzb = zzb(bArr, charSequenceZzg);
            if (iZzb == iZzf) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZzb];
            System.arraycopy(bArr, 0, bArr2, 0, iZzb);
            return bArr2;
        } catch (zzhaf e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
