package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzgzj extends zzgxw {
    private final transient zzgxp zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzgzj(zzgxp zzgxpVar, Object[] objArr, int i10, int i11) {
        this.zza = zzgxpVar;
        this.zzb = objArr;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, com.google.android.gms.internal.ads.zzgxi
    /* JADX INFO: renamed from: zza */
    public final zzhaa iterator() {
        return zze().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final int zzg(Object[] objArr, int i10) {
        return zze().zzg(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    public final zzgxm zzs() {
        return new zzgzi(this);
    }

    public final /* synthetic */ Object[] zzw() {
        return this.zzb;
    }

    public final /* synthetic */ int zzx() {
        return this.zzc;
    }
}
