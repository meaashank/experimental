package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgwr extends zzgwd {
    final /* synthetic */ zzgwt zza;
    private final Object zzb;
    private int zzc;

    public zzgwr(zzgwt zzgwtVar, int i10) {
        Objects.requireNonNull(zzgwtVar);
        this.zza = zzgwtVar;
        this.zzb = zzgwtVar.zzo(i10);
        this.zzc = i10;
    }

    private final void zza() {
        int i10 = this.zzc;
        if (i10 != -1) {
            zzgwt zzgwtVar = this.zza;
            if (i10 < zzgwtVar.size() && Objects.equals(this.zzb, zzgwtVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgwd, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgwd, java.util.Map.Entry
    public final Object getValue() {
        zzgwt zzgwtVar = this.zza;
        Map mapZzc = zzgwtVar.zzc();
        if (mapZzc != null) {
            return mapZzc.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        return zzgwtVar.zzp(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgwd, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgwt zzgwtVar = this.zza;
        Map mapZzc = zzgwtVar.zzc();
        if (mapZzc != null) {
            return mapZzc.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            zzgwtVar.put(this.zzb, obj);
            return null;
        }
        Object objZzp = zzgwtVar.zzp(i10);
        zzgwtVar.zzq(this.zzc, obj);
        return objZzp;
    }
}
