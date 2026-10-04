package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfvg extends zzgxe {
    private final LinkedList zza = new LinkedList();

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.Collection, java.util.Queue
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzfuo zzfuoVar = (zzfuo) obj;
        if (zzfuoVar.zzf() != 3) {
            this.zza.add(zzfuoVar);
            return true;
        }
        LinkedList linkedList = this.zza;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            zzfuo zzfuoVar2 = (zzfuo) listIterator.next();
            if (zzfuoVar2.zzf() == 3) {
                double dZze = zzfuoVar2.zze();
                double dZze2 = zzfuoVar.zze();
                if (dZze < dZze2 || (dZze == dZze2 && zzfuoVar2.zzc() > zzfuoVar.zzc())) {
                    listIterator.set(zzfuoVar);
                    zzfuoVar = zzfuoVar2;
                }
            }
        }
        linkedList.add(zzfuoVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxe
    public final Queue zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, com.google.android.gms.internal.ads.zzgxd
    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgxe, com.google.android.gms.internal.ads.zzgxb
    public final /* synthetic */ Collection zzc() {
        return this.zza;
    }
}
