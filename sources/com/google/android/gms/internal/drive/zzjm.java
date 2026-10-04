package com.google.android.gms.internal.drive;

import U6.j;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
class zzjm extends zzjl {
    protected final byte[] zzny;

    public zzjm(byte[] bArr) {
        bArr.getClass();
        this.zzny = bArr;
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjc) || size() != ((zzjc) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzjm)) {
            return obj.equals(this);
        }
        zzjm zzjmVar = (zzjm) obj;
        int iZzbv = zzbv();
        int iZzbv2 = zzjmVar.zzbv();
        if (iZzbv == 0 || iZzbv2 == 0 || iZzbv == iZzbv2) {
            return zza(zzjmVar, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public int size() {
        return this.zzny.length;
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final zzjc zza(int i10, int i11) {
        int iZzb = zzjc.zzb(0, i11, size());
        return iZzb == 0 ? zzjc.zznq : new zzjh(this.zzny, zzbw(), iZzb);
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final boolean zzbu() {
        int iZzbw = zzbw();
        return zznf.zze(this.zzny, iZzbw, size() + iZzbw);
    }

    public int zzbw() {
        return 0;
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public byte zzs(int i10) {
        return this.zzny[i10];
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public byte zzt(int i10) {
        return this.zzny[i10];
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final void zza(zzjb zzjbVar) throws IOException {
        zzjbVar.zza(this.zzny, zzbw(), size());
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final String zza(Charset charset) {
        return new String(this.zzny, zzbw(), size(), charset);
    }

    @Override // com.google.android.gms.internal.drive.zzjl
    public final boolean zza(zzjc zzjcVar, int i10, int i11) {
        if (i11 <= zzjcVar.size()) {
            if (i11 <= zzjcVar.size()) {
                if (zzjcVar instanceof zzjm) {
                    zzjm zzjmVar = (zzjm) zzjcVar;
                    byte[] bArr = this.zzny;
                    byte[] bArr2 = zzjmVar.zzny;
                    int iZzbw = zzbw() + i11;
                    int iZzbw2 = zzbw();
                    int iZzbw3 = zzjmVar.zzbw();
                    while (iZzbw2 < iZzbw) {
                        if (bArr[iZzbw2] != bArr2[iZzbw3]) {
                            return false;
                        }
                        iZzbw2++;
                        iZzbw3++;
                    }
                    return true;
                }
                return zzjcVar.zza(0, i11).equals(zza(0, i11));
            }
            int size = zzjcVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i11);
            sb2.append(j.f68738d);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        int size2 = size();
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Length too large: ");
        sb3.append(i11);
        sb3.append(size2);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final int zza(int i10, int i11, int i12) {
        return zzkm.zza(i10, this.zzny, zzbw(), i12);
    }
}
