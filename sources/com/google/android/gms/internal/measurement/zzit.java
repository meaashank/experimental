package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class zzit {
    private final zzjc zza;
    private final byte[] zzb;

    public final zzik zza() {
        this.zza.zzb();
        return new zziv(this.zzb);
    }

    public final zzjc zzb() {
        return this.zza;
    }

    private zzit(int i10) {
        byte[] bArr = new byte[i10];
        this.zzb = bArr;
        this.zza = zzjc.zzb(bArr);
    }
}
