package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzhmh {
    final zzhmg zza;
    final long[] zzb;

    public zzhmh(zzhmg zzhmgVar, long[] jArr) {
        this.zza = zzhmgVar;
        this.zzb = jArr;
    }

    public static /* synthetic */ zzhmh zza(zzhmh zzhmhVar, zzhmf zzhmfVar) {
        zzb(zzhmhVar, zzhmfVar);
        return zzhmhVar;
    }

    private static zzhmh zzb(zzhmh zzhmhVar, zzhmf zzhmfVar) {
        zzhmg zzhmgVar = zzhmfVar.zza;
        zzhmg zzhmgVar2 = zzhmhVar.zza;
        long[] jArr = zzhmgVar2.zza;
        long[] jArr2 = zzhmgVar.zza;
        long[] jArr3 = zzhmfVar.zzb;
        zzhmp.zze(jArr, jArr2, jArr3);
        long[] jArr4 = zzhmgVar2.zzb;
        long[] jArr5 = zzhmgVar.zzb;
        long[] jArr6 = zzhmgVar.zzc;
        zzhmp.zze(jArr4, jArr5, jArr6);
        zzhmp.zze(zzhmgVar2.zzc, jArr6, jArr3);
        zzhmp.zze(zzhmhVar.zzb, jArr2, jArr5);
        return zzhmhVar;
    }

    public zzhmh() {
        this(new zzhmg(), new long[10]);
    }

    public zzhmh(zzhmf zzhmfVar) {
        this();
        zzb(this, zzhmfVar);
    }
}
