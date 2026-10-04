package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzic extends zzgxc {
    private final Map zza;

    public zzic(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final boolean containsKey(@Nullable Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final boolean containsValue(@Nullable Object obj) {
        return zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final Set entrySet() {
        return zzgzw.zzb(this.zza.entrySet(), zzia.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final boolean equals(@Nullable Object obj) {
        return obj != null && zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    @Nullable
    public final /* synthetic */ Object get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final int hashCode() {
        return zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final Set keySet() {
        return zzgzw.zzb(this.zza.keySet(), zzib.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxc
    public final Map zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, com.google.android.gms.internal.ads.zzgxd
    public final /* synthetic */ Object zzb() {
        return this.zza;
    }
}
