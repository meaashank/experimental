package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhx implements zzhr {
    private final Context zza;
    private final zzhr zzb;

    public zzhx(Context context) {
        zzhz zzhzVar = new zzhz();
        this.zza = context.getApplicationContext();
        this.zzb = zzhzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final /* bridge */ /* synthetic */ zzhs zza() {
        return new zzhy(this.zza, this.zzb.zza());
    }
}
