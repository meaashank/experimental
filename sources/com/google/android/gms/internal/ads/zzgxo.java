package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgxo {
    Object[] zza;
    int zzb;
    zzgxn zzc;

    public zzgxo() {
        this(4);
    }

    private final void zze(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzgxh.zze(length, i11));
        }
    }

    private final zzgxp zzf(boolean z10) {
        zzgxn zzgxnVar;
        zzgxn zzgxnVar2;
        if (z10 && (zzgxnVar2 = this.zzc) != null) {
            throw zzgxnVar2.zza();
        }
        zzgzm zzgzmVarZzk = zzgzm.zzk(this.zzb, this.zza, this);
        if (!z10 || (zzgxnVar = this.zzc) == null) {
            return zzgzmVarZzk;
        }
        throw zzgxnVar.zza();
    }

    public final zzgxo zza(Object obj, Object obj2) {
        zze(this.zzb + 1);
        zzgwi.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.zzb = i10 + 1;
        return this;
    }

    public final zzgxo zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zze(((Collection) iterable).size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgxp zzc() {
        return zzf(true);
    }

    public final zzgxp zzd() {
        return zzf(false);
    }

    public zzgxo(int i10) {
        this.zza = new Object[i10 + i10];
        this.zzb = 0;
    }
}
