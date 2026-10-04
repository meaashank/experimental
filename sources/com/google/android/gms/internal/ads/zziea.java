package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zziea extends zzieb {
    final /* synthetic */ zziei zza;
    private int zzb;
    private final int zzc;

    public zziea(zziei zzieiVar) {
        Objects.requireNonNull(zzieiVar);
        this.zza = zzieiVar;
        this.zzb = 0;
        this.zzc = zzieiVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzied
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zza(i10);
    }
}
