package com.google.android.gms.internal.ads;

import androidx.compose.foundation.layout.C1711w0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzieg extends zzief {
    private final byte[] zzb;

    public zzieg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei zzc(int i10, int i11) {
        byte[] bArr = this.zzb;
        int iZzD = zziei.zzD(i10, i11, bArr.length);
        return iZzD == 0 ? zziei.zza : new zziec(bArr, i10, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei zzd(int i10, int i11) {
        byte[] bArr = this.zzb;
        int iZzD = zziei.zzD(i10, i11, bArr.length);
        return iZzD == 0 ? zziei.zza : new zziec(bArr, i10, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final void zzg(zzidz zzidzVar) throws IOException {
        byte[] bArr = this.zzb;
        zzidzVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final String zzh(Charset charset) {
        return new String(this.zzb, charset);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final boolean zzi() {
        return zziim.zza(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final boolean zzj(zziei zzieiVar) {
        return zzieiVar instanceof zzieg ? Arrays.equals(this.zzb, ((zzieg) zzieiVar).zzb) : zzieiVar instanceof zziec ? zzk(zzieiVar, 0, this.zzb.length) : zzieiVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzief
    public final boolean zzk(zziei zzieiVar, int i10, int i11) {
        if (i11 > zzieiVar.zzb()) {
            byte[] bArr = this.zzb;
            int length = String.valueOf(i11).length();
            int length2 = bArr.length;
            StringBuilder sb2 = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= zzieiVar.zzb()) {
            if (zzieiVar instanceof zzieg) {
                return zziei.zzE(this.zzb, 0, ((zzieg) zzieiVar).zzb, i10, i11);
            }
            if (!(zzieiVar instanceof zziec)) {
                return zzieiVar.zzd(i10, i12).equals(zzd(0, i11));
            }
            zziec zziecVar = (zziec) zzieiVar;
            return zziei.zzE(this.zzb, 0, zziecVar.zzn(), zziecVar.zzo() + i10, i11);
        }
        int iZzb = zzieiVar.zzb();
        int length3 = String.valueOf(i10).length();
        StringBuilder sb3 = new StringBuilder(length3 + 24 + String.valueOf(i11).length() + 2 + String.valueOf(iZzb).length());
        C1711w0.a(sb3, "Ran off end of other: ", i10, U6.j.f68738d, i11);
        throw new IllegalArgumentException(androidx.multidex.d.a(sb3, U6.j.f68738d, iZzb));
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int zzl(int i10, int i11, int i12) {
        return zzifz.zzc(i10, this.zzb, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziem zzm() {
        byte[] bArr = this.zzb;
        return zziem.zzI(bArr, 0, bArr.length, true);
    }

    public final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }
}
