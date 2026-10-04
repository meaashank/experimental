package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgxp<K, V> implements Map<K, V>, Serializable {
    private transient zzgxw zza;
    private transient zzgxw zzb;
    private transient zzgxi zzc;

    public static zzgxp zza() {
        return zzgzm.zza;
    }

    public static zzgxp zzb(Object obj, Object obj2) {
        zzgwi.zza("dialog_not_shown_reason", obj2);
        return zzgzm.zzk(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    public static zzgxp zzc(Map map) {
        if ((map instanceof zzgxp) && !(map instanceof SortedMap)) {
            zzgxp zzgxpVar = (zzgxp) map;
            zzgxpVar.zzj();
            return zzgxpVar;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        zzgxo zzgxoVar = new zzgxo(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzgxoVar.zzb(setEntrySet);
        return zzgxoVar.zzc();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzgyt.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgzw.zzc(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzgwi.zzb(size, X3.i.f76775k);
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z10) {
                sb2.append(U6.j.f68738d);
            }
            sb2.append(entry.getKey());
            sb2.append(SignatureVisitor.INSTANCEOF);
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgxw entrySet() {
        zzgxw zzgxwVar = this.zza;
        if (zzgxwVar != null) {
            return zzgxwVar;
        }
        zzgxw zzgxwVarZze = zze();
        this.zza = zzgxwVarZze;
        return zzgxwVarZze;
    }

    public abstract zzgxw zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzgxw keySet() {
        zzgxw zzgxwVar = this.zzb;
        if (zzgxwVar != null) {
            return zzgxwVar;
        }
        zzgxw zzgxwVarZzg = zzg();
        this.zzb = zzgxwVarZzg;
        return zzgxwVarZzg;
    }

    public abstract zzgxw zzg();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgxi values() {
        zzgxi zzgxiVar = this.zzc;
        if (zzgxiVar != null) {
            return zzgxiVar;
        }
        zzgxi zzgxiVarZzi = zzi();
        this.zzc = zzgxiVarZzi;
        return zzgxiVarZzi;
    }

    public abstract zzgxi zzi();

    public abstract boolean zzj();
}
