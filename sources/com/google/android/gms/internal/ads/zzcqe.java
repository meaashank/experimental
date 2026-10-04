package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcqe implements zzeca {
    private final zzcpp zza;
    private Context zzb;
    private zzbri zzc;

    public /* synthetic */ zzcqe(zzcpp zzcppVar, byte[] bArr) {
        this.zza = zzcppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeca
    public final zzecb zza() {
        zzioe.zzc(this.zzb, Context.class);
        zzioe.zzc(this.zzc, zzbri.class);
        return new zzcqf(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzeca
    public final /* bridge */ /* synthetic */ zzeca zzb(zzbri zzbriVar) {
        zzbriVar.getClass();
        this.zzc = zzbriVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeca
    public final /* bridge */ /* synthetic */ zzeca zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
