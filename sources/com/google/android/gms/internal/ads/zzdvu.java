package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdvu implements zzbqh {
    final /* synthetic */ zzdvv zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbqh zzd;

    public /* synthetic */ zzdvu(zzdvv zzdvvVar, WeakReference weakReference, String str, zzbqh zzbqhVar, byte[] bArr) {
        Objects.requireNonNull(zzdvvVar);
        this.zza = zzdvvVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zze(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
