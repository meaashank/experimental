package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfwk {
    private static final zzfwk zza = new zzfwk();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfwk() {
    }

    public static zzfwk zza() {
        return zza;
    }

    public final void zzb(zzfvq zzfvqVar) {
        this.zzb.add(zzfvqVar);
    }

    public final void zzc(zzfvq zzfvqVar) {
        ArrayList arrayList = this.zzc;
        boolean zZzg = zzg();
        arrayList.add(zzfvqVar);
        if (zZzg) {
            return;
        }
        zzfws.zza().zzc();
    }

    public final void zzd(zzfvq zzfvqVar) {
        ArrayList arrayList = this.zzb;
        boolean zZzg = zzg();
        arrayList.remove(zzfvqVar);
        this.zzc.remove(zzfvqVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzfws.zza().zze();
    }

    public final Collection zze() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final Collection zzf() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
