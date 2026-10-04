package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcjl implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final boolean zza(zzcif zzcifVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcjk zzcjkVar = (zzcjk) it.next();
            if (zzcjkVar.zza == zzcifVar) {
                arrayList.add(zzcjkVar);
            }
        }
        int i10 = 0;
        if (arrayList.isEmpty()) {
            return false;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((zzcjk) obj).zzb.zzl();
        }
        return true;
    }

    @Nullable
    public final zzcjk zzb(zzcif zzcifVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcjk zzcjkVar = (zzcjk) it.next();
            if (zzcjkVar.zza == zzcifVar) {
                return zzcjkVar;
            }
        }
        return null;
    }

    public final void zzc(zzcjk zzcjkVar) {
        this.zza.add(zzcjkVar);
    }

    public final void zzd(zzcjk zzcjkVar) {
        this.zza.remove(zzcjkVar);
    }
}
