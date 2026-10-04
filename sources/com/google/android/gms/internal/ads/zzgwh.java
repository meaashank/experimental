package com.google.android.gms.internal.ads;

import androidx.fragment.app.C2564b;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgwh extends zzgzg implements Serializable {
    final zzgub zza;
    final zzgzg zzb;

    public zzgwh(zzgub zzgubVar, zzgzg zzgzgVar) {
        this.zza = zzgubVar;
        this.zzb = zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzgub zzgubVar = this.zza;
        return this.zzb.compare(zzgubVar.apply(obj), zzgubVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgwh) {
            zzgwh zzgwhVar = (zzgwh) obj;
            if (this.zza.equals(zzgwhVar.zza) && this.zzb.equals(zzgwhVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        int length = string.length();
        String string2 = this.zza.toString();
        return C2564b.a(new StringBuilder(length + 12 + string2.length() + 1), string, ".onResultOf(", string2, ")");
    }
}
