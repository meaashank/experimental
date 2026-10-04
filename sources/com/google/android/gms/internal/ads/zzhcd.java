package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzhcd extends zzhcb {
    private zzhcd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhcb
    public final void zza(zzhce zzhceVar, Set set, Set set2) {
        synchronized (zzhceVar) {
            try {
                if (zzhceVar.seenExceptionsField == null) {
                    zzhceVar.seenExceptionsField = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcb
    public final int zzb(zzhce zzhceVar) {
        int i10;
        synchronized (zzhceVar) {
            i10 = zzhceVar.remainingField - 1;
            zzhceVar.remainingField = i10;
        }
        return i10;
    }

    public /* synthetic */ zzhcd(byte[] bArr) {
        super(null);
    }
}
