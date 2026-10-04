package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzkl implements zzkm {
    private static <E> zzkc<E> zzc(Object obj, long j10) {
        return (zzkc) zzml.zze(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final <L> List<L> zza(Object obj, long j10) {
        zzkc zzkcVarZzc = zzc(obj, j10);
        if (zzkcVarZzc.zzc()) {
            return zzkcVarZzc;
        }
        int size = zzkcVarZzc.size();
        zzkc zzkcVarZza = zzkcVarZzc.zza(size == 0 ? 10 : size << 1);
        zzml.zza(obj, j10, zzkcVarZza);
        return zzkcVarZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final void zzb(Object obj, long j10) {
        zzc(obj, j10).zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.gms.internal.measurement.zzkc, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.google.android.gms.internal.measurement.zzkm
    public final <E> void zza(Object obj, Object obj2, long j10) {
        zzkc zzkcVarZzc = zzc(obj, j10);
        ?? Zzc = zzc(obj2, j10);
        int size = zzkcVarZzc.size();
        int size2 = Zzc.size();
        ?? r02 = zzkcVarZzc;
        r02 = zzkcVarZzc;
        if (size > 0 && size2 > 0) {
            boolean zZzc = zzkcVarZzc.zzc();
            ?? Zza = zzkcVarZzc;
            if (!zZzc) {
                Zza = zzkcVarZzc.zza(size2 + size);
            }
            Zza.addAll(Zzc);
            r02 = Zza;
        }
        if (size > 0) {
            Zzc = r02;
        }
        zzml.zza(obj, j10, (Object) Zzc);
    }
}
