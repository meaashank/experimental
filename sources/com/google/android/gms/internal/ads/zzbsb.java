package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbsb extends zzbry {
    final /* synthetic */ zzcgo zza;

    public zzbsb(zzbsc zzbscVar, zzcgo zzcgoVar) {
        this.zza = zzcgoVar;
        Objects.requireNonNull(zzbscVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrz
    public final void zza(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(parcelFileDescriptor);
    }
}
