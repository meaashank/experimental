package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzavb extends zzinh implements Closeable {
    static {
        zzino.zzb(zzavb.class);
    }

    public zzavb(zzini zziniVar, zzava zzavaVar) throws IOException {
        zzd(zziniVar, zziniVar.zzb(), zzavaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzinh
    public final String toString() {
        String string = this.zzc.toString();
        return com.google.android.gms.auth.b.a(com.google.android.gms.ads.internal.util.e.a(string, 7), "model(", string, ")");
    }
}
