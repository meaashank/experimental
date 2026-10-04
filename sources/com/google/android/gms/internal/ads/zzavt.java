package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzavt implements zzavs {
    @Override // com.google.android.gms.internal.ads.zzavs
    public final byte zza(zzawe zzaweVar, int i10) {
        return zzaweVar.zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzavs
    public final zzawe zzb(zzawe zzaweVar, int i10, int i11) {
        byte[] bArr;
        int length;
        if (i10 < 0 || i10 > i11 || i11 > (length = (bArr = zzaweVar.zza).length) || i10 > i11 || i11 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new zzawe(zzawe.zzh(bArr, i10, i11 - i10));
    }

    @Override // com.google.android.gms.internal.ads.zzavs
    public final zzavs zzc() {
        return new zzavt();
    }
}
