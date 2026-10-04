package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgvf {
    public static zzgvc zza(zzgvc zzgvcVar) {
        return ((zzgvcVar instanceof zzgve) || (zzgvcVar instanceof zzgvd)) ? zzgvcVar : zzgvcVar instanceof Serializable ? new zzgvd(zzgvcVar) : new zzgve(zzgvcVar);
    }
}
