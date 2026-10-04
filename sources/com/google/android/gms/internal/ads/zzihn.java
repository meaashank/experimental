package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import org.objectweb.asm.Opcodes;
import s0.x;

/* JADX INFO: loaded from: classes4.dex */
final class zzihn extends zziei {
    static final int[] zzb = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, Opcodes.D2F, 233, 377, x.e.f238355z, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zziei zzd;
    private final zziei zze;
    private final int zzf;
    private final int zzg;

    public /* synthetic */ zzihn(zziei zzieiVar, zziei zzieiVar2, byte[] bArr) {
        this(zzieiVar, zzieiVar2);
    }

    private static zziei zzG(zziei zzieiVar, zziei zzieiVar2) {
        int iZzb = zzieiVar.zzb();
        int iZzb2 = zzieiVar2.zzb();
        byte[] bArr = new byte[iZzb + iZzb2];
        zzieiVar.zzz(bArr, 0, 0, iZzb);
        zzieiVar2.zzz(bArr, 0, iZzb, iZzb2);
        return zziei.zzv(bArr);
    }

    public static zziei zzk(zziei zzieiVar, zziei zzieiVar2) {
        if (zzieiVar2.zzb() == 0) {
            return zzieiVar;
        }
        if (zzieiVar.zzb() == 0) {
            return zzieiVar2;
        }
        int iZzb = zzieiVar2.zzb() + zzieiVar.zzb();
        if (iZzb < 128) {
            return zzG(zzieiVar, zzieiVar2);
        }
        if (zzieiVar instanceof zzihn) {
            zzihn zzihnVar = (zzihn) zzieiVar;
            zziei zzieiVar3 = zzihnVar.zze;
            if (zzieiVar2.zzb() + zzieiVar3.zzb() < 128) {
                return new zzihn(zzihnVar.zzd, zzG(zzieiVar3, zzieiVar2));
            }
            zziei zzieiVar4 = zzihnVar.zzd;
            if (zzieiVar4.zzp() > zzieiVar3.zzp() && zzihnVar.zzg > zzieiVar2.zzp()) {
                return new zzihn(zzieiVar4, new zzihn(zzieiVar3, zzieiVar2));
            }
        }
        return iZzb >= zzn(Math.max(zzieiVar.zzp(), zzieiVar2.zzp()) + 1) ? new zzihn(zzieiVar, zzieiVar2) : zzihl.zza(zzieiVar, zzieiVar2, new ArrayDeque());
    }

    public static int zzn(int i10) {
        int[] iArr = zzb;
        int length = iArr.length;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zziei, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzihk(this);
    }

    public final /* synthetic */ zziei zzF() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final byte zza(int i10) {
        int i11 = this.zzf;
        return i10 < i11 ? this.zzd.zza(i10) : this.zze.zza(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei zzc(int i10, int i11) {
        return zzd(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei zzd(int i10, int i11) {
        int i12 = this.zzc;
        int iZzD = zziei.zzD(i10, i11, i12);
        if (iZzD == 0) {
            return zziei.zza;
        }
        if (iZzD == i12) {
            return this;
        }
        int i13 = this.zzf;
        if (i11 <= i13) {
            return this.zzd.zzc(i10, i11);
        }
        int i14 = i11 - i13;
        if (i10 >= i13) {
            return this.zze.zzc(i10 - i13, i14);
        }
        zziei zzieiVar = this.zzd;
        return new zzihn(zzieiVar.zzc(i10, zzieiVar.zzb()), this.zze.zzc(0, i14));
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.zze.zze(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.zzd.zze(bArr, i10, i11, i15);
            this.zze.zze(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final ByteBuffer zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final void zzg(zzidz zzidzVar) throws IOException {
        this.zzd.zzg(zzidzVar);
        this.zze.zzg(zzidzVar);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final String zzh(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final boolean zzi() {
        zzihm zzihmVar = new zzihm(this, null);
        while (zzihmVar.hasNext()) {
            if (!zzihmVar.next().zzi()) {
                return zziim.zza(zzA());
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final boolean zzj(zziei zzieiVar) {
        byte[] bArr = null;
        zzihm zzihmVar = new zzihm(this, bArr);
        zzief zziefVarZza = zzihmVar.next();
        zzihm zzihmVar2 = new zzihm(zzieiVar, bArr);
        zzief zziefVarZza2 = zzihmVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iZzb = zziefVarZza.zzb() - i10;
            int iZzb2 = zziefVarZza2.zzb() - i11;
            int iMin = Math.min(iZzb, iZzb2);
            if (!(i10 == 0 ? zziefVarZza.zzk(zziefVarZza2, i11, iMin) : zziefVarZza2.zzk(zziefVarZza, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.zzc;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzb) {
                i10 = 0;
                zziefVarZza = zzihmVar.next();
            } else {
                i10 += iMin;
                zziefVarZza = zziefVarZza;
            }
            if (iMin == iZzb2) {
                zziefVarZza2 = zzihmVar2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int zzl(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzl(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzl(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzl(this.zzd.zzl(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziem zzm() {
        ArrayList arrayList = new ArrayList();
        zzihm zzihmVar = new zzihm(this, null);
        while (zzihmVar.hasNext()) {
            arrayList.add(zzihmVar.next().zzf());
        }
        return zziem.zzH(new zzigf(arrayList), 4096);
    }

    public final /* synthetic */ zziei zzo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int zzp() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final boolean zzq() {
        return this.zzc >= zzn(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    /* JADX INFO: renamed from: zzr */
    public final zzied iterator() {
        return new zzihk(this);
    }

    private zzihn(zziei zzieiVar, zziei zzieiVar2) {
        this.zzd = zzieiVar;
        this.zze = zzieiVar2;
        int iZzb = zzieiVar.zzb();
        this.zzf = iZzb;
        this.zzc = zzieiVar2.zzb() + iZzb;
        this.zzg = Math.max(zzieiVar.zzp(), zzieiVar2.zzp()) + 1;
    }
}
