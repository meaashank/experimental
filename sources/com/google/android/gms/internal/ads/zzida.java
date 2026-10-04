package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzida extends zzidc {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzida(zzidb zzidbVar) {
        super(zzidbVar.zza);
        Objects.requireNonNull(zzidbVar);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza().zzf;
    }
}
