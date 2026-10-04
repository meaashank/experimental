package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgfy implements zzggd {
    private final byte[] zza;

    public zzgfy(byte[] bArr) {
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzggd
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        outputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzggd
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return zzham.zza(inputStream);
        } catch (IOException e10) {
            throw new zzgfz("Cannot read bytes.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggd
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
