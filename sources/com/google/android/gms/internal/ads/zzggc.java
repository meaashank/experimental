package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class zzggc implements zzggd {
    private final zzigw zza;

    public zzggc(zzigw zzigwVar) {
        this.zza = zzigwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggd
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        ((zzigw) obj).zzaO(outputStream);
    }

    @Override // com.google.android.gms.internal.ads.zzggd
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return (zzigw) this.zza.zzbd().zza(inputStream, zziew.zzb());
        } catch (zzige e10) {
            throw new zzgfz("Cannot read proto.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggd
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
