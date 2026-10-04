package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzif implements Iterator {
    final /* synthetic */ zzii zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzif(zzii zziiVar, zzih zzihVar) {
        Objects.requireNonNull(zziiVar);
        this.zza = zziiVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb + 1;
        zzii zziiVar = this.zza;
        if (i10 >= zziiVar.zzb) {
            return !zziiVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzii zziiVar = this.zza;
        return i10 < zziiVar.zzb ? (zzie) zziiVar.zza[i10] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzii zziiVar = this.zza;
        zziiVar.zzo();
        int i10 = this.zzb;
        if (i10 >= zziiVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i10 - 1;
            zziiVar.zzm(i10);
        }
    }
}
