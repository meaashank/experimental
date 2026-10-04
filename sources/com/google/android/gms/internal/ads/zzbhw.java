package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbhw extends PushbackInputStream {
    final /* synthetic */ zzbhz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbhw(zzbhz zzbhzVar, InputStream inputStream, int i10) {
        super(inputStream, 1);
        Objects.requireNonNull(zzbhzVar);
        this.zza = zzbhzVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.zza.zzc.zzb();
        super.close();
    }
}
