package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbbk extends Exception {
    public zzbbk(zzbbl zzbblVar) {
        Objects.requireNonNull(zzbblVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbbk(zzbbl zzbblVar, Throwable th) {
        super(th);
        Objects.requireNonNull(zzbblVar);
    }
}
