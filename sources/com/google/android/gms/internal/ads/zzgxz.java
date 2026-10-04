package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public class zzgxz<K, V> extends zzgxu<K, V> implements zzgyu<K, V> {
    private final transient zzgxw<V> emptySet;
    private transient zzgxw zza;

    public zzgxz(zzgxp zzgxpVar, int i10, Comparator comparator) {
        super(zzgxpVar, i10);
        this.emptySet = zzgzn.zza;
    }

    public final zzgxw zza() {
        zzgxw zzgxwVar = this.zza;
        if (zzgxwVar != null) {
            return zzgxwVar;
        }
        zzgxy zzgxyVar = new zzgxy(this);
        this.zza = zzgxyVar;
        return zzgxyVar;
    }
}
