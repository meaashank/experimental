package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzcqp implements zzfkw {
    private final zzcpp zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcqp(zzcpp zzcppVar, byte[] bArr) {
        this.zza = zzcppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final zzfkx zza() {
        zzioe.zzc(this.zzb, Context.class);
        return new zzcqq(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final /* synthetic */ zzfkw zzb(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final /* bridge */ /* synthetic */ zzfkw zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
