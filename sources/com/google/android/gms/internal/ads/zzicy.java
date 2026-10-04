package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzicy extends zzidc {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzicy(zzicz zziczVar) {
        super(zziczVar.zza);
        Objects.requireNonNull(zziczVar);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return zza();
    }
}
