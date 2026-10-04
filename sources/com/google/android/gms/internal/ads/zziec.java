package com.google.android.gms.internal.ads;

import androidx.compose.foundation.layout.C1711w0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
final class zziec extends zzief {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    public zziec(byte[] bArr, int i10, int i11) {
        super(null);
        zziei.zzD(i10, i10 + i11, bArr.length);
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final byte zza(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei zzc(int i10, int i11) {
        int iZzD = zziei.zzD(i10, i11, this.zzd);
        return iZzD == 0 ? zziei.zza : new zziec(this.zzb, this.zzc + i10, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei zzd(int i10, int i11) {
        int iZzD = zziei.zzD(i10, i11, this.zzd);
        return iZzD == 0 ? zziei.zza : new zziec(this.zzb, this.zzc + i10, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, this.zzc + i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb, this.zzc, this.zzd).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final void zzg(zzidz zzidzVar) throws IOException {
        zzidzVar.zza(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final String zzh(Charset charset) {
        return new String(this.zzb, this.zzc, this.zzd, charset);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final boolean zzi() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        return zziim.zzb(bArr, i10, this.zzd + i10);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final boolean zzj(zziei zzieiVar) {
        return ((zzieiVar instanceof zzieg) || (zzieiVar instanceof zziec)) ? zzk(zzieiVar, 0, this.zzd) : zzieiVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzief
    public final boolean zzk(zziei zzieiVar, int i10, int i11) {
        if (i11 > zzieiVar.zzb()) {
            int i12 = this.zzd;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 18 + String.valueOf(i12).length());
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(i12);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i13 = i10 + i11;
        if (i13 > zzieiVar.zzb()) {
            int iZzb = zzieiVar.zzb();
            int length = String.valueOf(i10).length();
            StringBuilder sb3 = new StringBuilder(length + 24 + String.valueOf(i11).length() + 2 + String.valueOf(iZzb).length());
            C1711w0.a(sb3, "Ran off end of other: ", i10, U6.j.f68738d, i11);
            throw new IllegalArgumentException(androidx.multidex.d.a(sb3, U6.j.f68738d, iZzb));
        }
        if (zzieiVar instanceof zzieg) {
            return zziei.zzE(this.zzb, this.zzc, ((zzieg) zzieiVar).zzn(), i10, i11);
        }
        if (zzieiVar instanceof zziec) {
            zziec zziecVar = (zziec) zzieiVar;
            return zziei.zzE(this.zzb, this.zzc, zziecVar.zzb, zziecVar.zzc + i10, i11);
        }
        zziei zzieiVarZzd = zzieiVar.zzd(i10, i13);
        int i14 = this.zzc;
        return zzieiVarZzd.equals(zzd(i14, i11 + i14));
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int zzl(int i10, int i11, int i12) {
        return zzifz.zzc(i10, this.zzb, this.zzc + i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziem zzm() {
        return zziem.zzI(this.zzb, this.zzc, this.zzd, true);
    }

    public final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }

    public final /* synthetic */ int zzo() {
        return this.zzc;
    }
}
