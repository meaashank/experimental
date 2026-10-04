package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zziev {
    private final Object zza;
    private final int zzb;

    public zziev(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zziev)) {
            return false;
        }
        zziev zzievVar = (zziev) obj;
        return this.zza == zzievVar.zza && this.zzb == zzievVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
