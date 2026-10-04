package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
final class zzgvt extends zzgvw implements NavigableMap {
    final /* synthetic */ zzgwc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvt(zzgwc zzgwcVar, NavigableMap navigableMap) {
        super(zzgwcVar, navigableMap);
        Objects.requireNonNull(zzgwcVar);
        this.zzc = zzgwcVar;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = ((NavigableMap) ((SortedMap) ((zzgvp) this).zza)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return zzb(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzgvp) this).zza)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new zzgvt(this.zzc, ((NavigableMap) ((SortedMap) ((zzgvp) this).zza)).descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = ((NavigableMap) ((SortedMap) ((zzgvp) this).zza)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return zzb(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = ((NavigableMap) ((SortedMap) ((zzgvp) this).zza)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return zzb(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzgvp) this).zza)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvw, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = ((NavigableMap) ((SortedMap) ((zzgvp) this).zza)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return zzb(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzgvp) this).zza)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvw, com.google.android.gms.internal.ads.zzgvp, com.google.android.gms.internal.ads.zzgys, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = ((NavigableMap) ((SortedMap) ((zzgvp) this).zza)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return zzb(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = ((NavigableMap) ((SortedMap) ((zzgvp) this).zza)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return zzb(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzgvp) this).zza)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return zzc(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return zzc(descendingMap().entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzgvw, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgvw, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final Map.Entry zzc(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        zzgwc zzgwcVar = this.zzc;
        Collection collectionZzc = zzgwcVar.zzc();
        collectionZzc.addAll((Collection) entry.getValue());
        it.remove();
        return new AbstractMap.SimpleImmutableEntry(entry.getKey(), zzgwcVar.zza(collectionZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzgvw, com.google.android.gms.internal.ads.zzgys
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet zzh() {
        return new zzgvu(this.zzc, (NavigableMap) ((SortedMap) ((zzgvp) this).zza));
    }

    @Override // com.google.android.gms.internal.ads.zzgvw
    /* JADX INFO: renamed from: zzf */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.android.gms.internal.ads.zzgvw
    public final /* synthetic */ SortedMap zzg() {
        return (NavigableMap) ((SortedMap) ((zzgvp) this).zza);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z10) {
        return new zzgvt(this.zzc, ((NavigableMap) ((SortedMap) ((zzgvp) this).zza)).headMap(obj, z10));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return new zzgvt(this.zzc, ((NavigableMap) ((SortedMap) ((zzgvp) this).zza)).subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z10) {
        return new zzgvt(this.zzc, ((NavigableMap) ((SortedMap) ((zzgvp) this).zza)).tailMap(obj, z10));
    }
}
