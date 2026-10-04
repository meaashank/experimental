package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgui implements Serializable {
    public static zzgui zzc() {
        return zzgtq.zza;
    }

    public static zzgui zzd(Object obj) {
        return obj == null ? zzgtq.zza : new zzgup(obj);
    }

    public abstract Object zza(Object obj);

    public abstract zzgui zzb(zzgub zzgubVar);
}
