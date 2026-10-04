package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcpy implements zzfhs {
    private final zzcpp zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzr zzd;

    public /* synthetic */ zzcpy(zzcpp zzcppVar, byte[] bArr) {
        this.zza = zzcppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final zzfht zza() {
        zzioe.zzc(this.zzb, Context.class);
        zzioe.zzc(this.zzc, String.class);
        zzioe.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzr.class);
        return new zzcpz(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final /* bridge */ /* synthetic */ zzfhs zzb(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.zzd = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final /* bridge */ /* synthetic */ zzfhs zzc(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final /* bridge */ /* synthetic */ zzfhs zzd(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
