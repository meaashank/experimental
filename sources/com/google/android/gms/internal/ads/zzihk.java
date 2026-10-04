package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzihk extends zzieb {
    final zzihm zza;
    zzied zzb;
    final /* synthetic */ zzihn zzc;

    public zzihk(zzihn zzihnVar) {
        Objects.requireNonNull(zzihnVar);
        this.zzc = zzihnVar;
        this.zza = new zzihm(zzihnVar, null);
        this.zzb = zzb();
    }

    private final zzied zzb() {
        zzihm zzihmVar = this.zza;
        if (zzihmVar.hasNext()) {
            return zzihmVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzied
    public final byte zza() {
        zzied zziedVar = this.zzb;
        if (zziedVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zziedVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
