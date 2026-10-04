package com.google.android.gms.internal.drive;

import com.google.android.gms.auth.b;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzmp implements Comparable<zzmp>, Map.Entry<Object, Object> {
    private Object value;
    private final /* synthetic */ zzmi zzvk;
    private final Object zzvn;

    public zzmp(zzmi zzmiVar, Map.Entry<Object, Object> entry) {
        this(zzmiVar, (Comparable) entry.getKey(), entry.getValue());
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzmp zzmpVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzmpVar.getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return equals(this.zzvn, entry.getKey()) && equals(this.value, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzvn;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.zzvn;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.value;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.zzvk.zzeu();
        Object obj2 = this.value;
        this.value = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzvn);
        String strValueOf2 = String.valueOf(this.value);
        return b.a(strValueOf2.length() + strValueOf.length() + 1, strValueOf, "=", strValueOf2);
    }

    public zzmp(zzmi zzmiVar, Object obj, Object obj2) {
        this.zzvk = zzmiVar;
        this.zzvn = obj;
        this.value = obj2;
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
