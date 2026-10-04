package com.google.android.gms.internal.drive;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
class zzmi<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzot;
    private final int zzvd;
    private List<zzmp> zzve;
    private Map<K, V> zzvf;
    private volatile zzmr zzvg;
    private Map<K, V> zzvh;
    private volatile zzml zzvi;

    private zzmi(int i10) {
        this.zzvd = i10;
        this.zzve = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.zzvf = map;
        this.zzvh = map;
    }

    public static <FieldDescriptorType extends zzkd<FieldDescriptorType>> zzmi<FieldDescriptorType, Object> zzav(int i10) {
        return new zzmj(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzax(int i10) {
        zzeu();
        V v10 = (V) this.zzve.remove(i10).getValue();
        if (!this.zzvf.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzev().entrySet().iterator();
            this.zzve.add(new zzmp(this, it.next()));
            it.remove();
        }
        return v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzeu() {
        if (this.zzot) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzev() {
        zzeu();
        if (this.zzvf.isEmpty() && !(this.zzvf instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzvf = treeMap;
            this.zzvh = treeMap.descendingMap();
        }
        return (SortedMap) this.zzvf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzeu();
        if (!this.zzve.isEmpty()) {
            this.zzve.clear();
        }
        if (this.zzvf.isEmpty()) {
            return;
        }
        this.zzvf.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzvf.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzvg == null) {
            this.zzvg = new zzmr(this, null);
        }
        return this.zzvg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmi)) {
            return super.equals(obj);
        }
        zzmi zzmiVar = (zzmi) obj;
        int size = size();
        if (size != zzmiVar.size()) {
            return false;
        }
        int iZzer = zzer();
        if (iZzer != zzmiVar.zzer()) {
            return entrySet().equals(zzmiVar.entrySet());
        }
        for (int i10 = 0; i10 < iZzer; i10++) {
            if (!zzaw(i10).equals(zzmiVar.zzaw(i10))) {
                return false;
            }
        }
        if (iZzer != size) {
            return this.zzvf.equals(zzmiVar.zzvf);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        return iZza >= 0 ? (V) this.zzve.get(iZza).getValue() : this.zzvf.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iZzer = zzer();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iZzer; i10++) {
            iHashCode += this.zzve.get(i10).hashCode();
        }
        return this.zzvf.size() > 0 ? this.zzvf.hashCode() + iHashCode : iHashCode;
    }

    public final boolean isImmutable() {
        return this.zzot;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzeu();
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return zzax(iZza);
        }
        if (this.zzvf.isEmpty()) {
            return null;
        }
        return this.zzvf.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzvf.size() + this.zzve.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v10) {
        zzeu();
        int iZza = zza(k10);
        if (iZza >= 0) {
            return (V) this.zzve.get(iZza).setValue(v10);
        }
        zzeu();
        if (this.zzve.isEmpty() && !(this.zzve instanceof ArrayList)) {
            this.zzve = new ArrayList(this.zzvd);
        }
        int i10 = -(iZza + 1);
        if (i10 >= this.zzvd) {
            return zzev().put(k10, v10);
        }
        int size = this.zzve.size();
        int i11 = this.zzvd;
        if (size == i11) {
            zzmp zzmpVarRemove = this.zzve.remove(i11 - 1);
            zzev().put((Comparable) zzmpVarRemove.getKey(), zzmpVarRemove.getValue());
        }
        this.zzve.add(i10, new zzmp(this, k10, v10));
        return null;
    }

    public final Map.Entry<K, V> zzaw(int i10) {
        return this.zzve.get(i10);
    }

    public void zzbp() {
        if (this.zzot) {
            return;
        }
        this.zzvf = this.zzvf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzvf);
        this.zzvh = this.zzvh.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzvh);
        this.zzot = true;
    }

    public final int zzer() {
        return this.zzve.size();
    }

    public final Iterable<Map.Entry<K, V>> zzes() {
        return this.zzvf.isEmpty() ? zzmm.zzex() : this.zzvf.entrySet();
    }

    public final Set<Map.Entry<K, V>> zzet() {
        if (this.zzvi == null) {
            this.zzvi = new zzml(this, null);
        }
        return this.zzvi;
    }

    public /* synthetic */ zzmi(int i10, zzmj zzmjVar) {
        this(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(K r5) {
        /*
            r4 = this;
            java.util.List<com.google.android.gms.internal.drive.zzmp> r0 = r4.zzve
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L25
            java.util.List<com.google.android.gms.internal.drive.zzmp> r2 = r4.zzve
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.drive.zzmp r2 = (com.google.android.gms.internal.drive.zzmp) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L22
            int r0 = r0 + 1
        L20:
            int r5 = -r0
            return r5
        L22:
            if (r2 != 0) goto L25
            return r1
        L25:
            r0 = 0
        L26:
            if (r0 > r1) goto L49
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<com.google.android.gms.internal.drive.zzmp> r3 = r4.zzve
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.drive.zzmp r3 = (com.google.android.gms.internal.drive.zzmp) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L43
            int r1 = r2 + (-1)
            goto L26
        L43:
            if (r3 <= 0) goto L48
            int r0 = r2 + 1
            goto L26
        L48:
            return r2
        L49:
            int r0 = r0 + 1
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzmi.zza(java.lang.Comparable):int");
    }
}
