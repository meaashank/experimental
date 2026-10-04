package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import e.InterfaceC4326A;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbos {
    private final com.google.android.gms.ads.formats.zze zza;

    @Nullable
    private final com.google.android.gms.ads.formats.zzd zzb;

    @Nullable
    @InterfaceC4326A("this")
    private zzbnn zzc;

    public zzbos(com.google.android.gms.ads.formats.zze zzeVar, @Nullable com.google.android.gms.ads.formats.zzd zzdVar) {
        this.zza = zzeVar;
        this.zzb = zzdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized zzbnn zze(zzbnm zzbnmVar) {
        zzbnn zzbnnVar = this.zzc;
        if (zzbnnVar != null) {
            return zzbnnVar;
        }
        zzbnn zzbnnVar2 = new zzbnn(zzbnmVar);
        this.zzc = zzbnnVar2;
        return zzbnnVar2;
    }

    public final zzbnz zza() {
        return new zzbor(this, null);
    }

    @Nullable
    public final zzbnw zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new zzboq(this, null);
    }

    public final /* synthetic */ com.google.android.gms.ads.formats.zze zzc() {
        return this.zza;
    }

    public final /* synthetic */ com.google.android.gms.ads.formats.zzd zzd() {
        return this.zzb;
    }
}
