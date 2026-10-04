package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
final class zzhcc extends zzhcb {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzhce.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzhce.class, "remainingField");

    private zzhcc() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhcb
    public final void zza(zzhce zzhceVar, Set set, Set set2) {
        androidx.concurrent.futures.c.a(zza, zzhceVar, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.zzhcb
    public final int zzb(zzhce zzhceVar) {
        return zzb.decrementAndGet(zzhceVar);
    }

    public /* synthetic */ zzhcc(byte[] bArr) {
        super(null);
    }
}
