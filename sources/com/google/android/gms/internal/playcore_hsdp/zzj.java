package com.google.android.gms.internal.playcore_hsdp;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzj {
    public static zzg zza(zzg zzgVar) {
        return ((zzgVar instanceof zzi) || (zzgVar instanceof zzh)) ? zzgVar : zzgVar instanceof Serializable ? new zzh(zzgVar) : new zzi(zzgVar);
    }
}
