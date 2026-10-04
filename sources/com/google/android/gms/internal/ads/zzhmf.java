package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzhmf {
    final zzhmg zza;
    final long[] zzb;

    public zzhmf(zzhmg zzhmgVar, long[] jArr) {
        this.zza = zzhmgVar;
        this.zzb = jArr;
    }

    public zzhmf() {
        this(new zzhmg(), new long[10]);
    }

    public zzhmf(zzhmf zzhmfVar) {
        this.zza = new zzhmg(zzhmfVar.zza);
        this.zzb = Arrays.copyOf(zzhmfVar.zzb, 10);
    }
}
