package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjb {
    private final Map zza;

    public zzjb() {
        this.zza = new HashMap();
    }

    public final zzjb zza(String str, int i10) {
        this.zza.put(str, Integer.valueOf(i10));
        return this;
    }

    public final zzjb zzb(String str, long j10) {
        this.zza.put(str, Long.valueOf(j10));
        return this;
    }

    public final zzjb zzc(String str, float f10) {
        this.zza.put(str, Float.valueOf(f10));
        return this;
    }

    public final zzjb zzd(String str, @Nullable String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzjb zze(String str, @Nullable ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            this.zza.put(str, null);
            return this;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer.duplicate());
        byteBufferAllocate.flip();
        this.zza.put(str, byteBufferAllocate);
        return this;
    }

    public final zzjb zzf(String str) {
        this.zza.remove(str);
        return this;
    }

    public final zzjc zzg() {
        return new zzjc(this.zza, null);
    }
}
