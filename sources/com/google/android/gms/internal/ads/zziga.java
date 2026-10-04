package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zziga implements Map.Entry {
    private final Map.Entry zza;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzigc zzigcVar = (zzigc) this.zza.getValue();
        if (zzigcVar == null) {
            return null;
        }
        return zzigcVar.zza();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzigw)) {
            throw new IllegalArgumentException("Lazy field only supports MessageLite values.");
        }
        Map.Entry entry = this.zza;
        zzigw zzigwVar = ((zzigc) entry.getValue()).zza;
        entry.setValue(new zzigc((zzigw) obj));
        return zzigwVar;
    }

    public final zzigc zza() {
        return (zzigc) this.zza.getValue();
    }
}
