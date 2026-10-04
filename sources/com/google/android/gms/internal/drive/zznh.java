package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes4.dex */
abstract class zznh {
    public abstract int zzb(int i10, byte[] bArr, int i11, int i12);

    public abstract int zzb(CharSequence charSequence, byte[] bArr, int i10, int i11);

    public final boolean zze(byte[] bArr, int i10, int i11) {
        return zzb(0, bArr, i10, i11) == 0;
    }

    public abstract String zzg(byte[] bArr, int i10, int i11) throws zzkq;
}
