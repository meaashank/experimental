package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhem implements zzhff {
    private final InputStream zza;

    private zzhem(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzhff zza(byte[] bArr) {
        return new zzhem(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.ads.zzhff
    public final zzhuc zzb() throws IOException {
        try {
            return zzhuc.zzg(this.zza, zziew.zzb());
        } finally {
            this.zza.close();
        }
    }
}
