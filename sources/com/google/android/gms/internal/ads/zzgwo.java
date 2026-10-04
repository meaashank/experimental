package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgwo extends AbstractSet {
    final /* synthetic */ zzgwt zza;

    public /* synthetic */ zzgwo(zzgwt zzgwtVar, byte[] bArr) {
        Objects.requireNonNull(zzgwtVar);
        this.zza = zzgwtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zzgwt zzgwtVar = this.zza;
        Map mapZzc = zzgwtVar.zzc();
        if (mapZzc != null) {
            return mapZzc.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzi = zzgwtVar.zzi(entry.getKey());
            if (iZzi != -1 && Objects.equals(zzgwtVar.zzp(iZzi), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgwt zzgwtVar = this.zza;
        Map mapZzc = zzgwtVar.zzc();
        return mapZzc != null ? mapZzc.entrySet().iterator() : new zzgwm(zzgwtVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iZzh;
        int iZze;
        zzgwt zzgwtVar = this.zza;
        Map mapZzc = zzgwtVar.zzc();
        if (mapZzc != null) {
            return mapZzc.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zzgwtVar.zzb() || (iZze = zzgwu.zze(entry.getKey(), entry.getValue(), (iZzh = zzgwtVar.zzh()), zzgwtVar.zzk(), zzgwtVar.zzl(), zzgwtVar.zzm(), zzgwtVar.zzn())) == -1) {
            return false;
        }
        zzgwtVar.zze(iZze, iZzh);
        zzgwtVar.zzu(zzgwtVar.zzt() - 1);
        zzgwtVar.zzd();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
