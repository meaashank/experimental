package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzihz extends RuntimeException {
    public zzihz(zzigw zzigwVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzige zza() {
        return new zzige(getMessage());
    }
}
