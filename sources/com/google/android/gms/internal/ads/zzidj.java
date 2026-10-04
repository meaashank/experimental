package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzidj extends zzicu {
    public static final zzidj zza = new zzidj();

    private zzidj() {
    }

    public final void zza(zzidn zzidnVar, zzico zzicoVar) throws IOException {
        if (zzicoVar == null || (zzicoVar instanceof zzicp)) {
            zzidnVar.zzj();
            return;
        }
        if (zzicoVar instanceof zzics) {
            zzics zzicsVarZzg = zzicoVar.zzg();
            if (zzicsVarZzg.zzc()) {
                zzidnVar.zzi(zzicsVarZzg.zzh());
                return;
            } else if (zzicsVarZzg.zza()) {
                zzidnVar.zzh(zzicsVarZzg.zzb());
                return;
            } else {
                zzidnVar.zzg(zzicsVarZzg.zzd());
                return;
            }
        }
        if (zzicoVar instanceof zzicn) {
            zzidnVar.zzb();
            Iterator it = zzicoVar.zzf().iterator();
            while (it.hasNext()) {
                zza(zzidnVar, (zzico) it.next());
            }
            zzidnVar.zzc();
            return;
        }
        if (!(zzicoVar instanceof zzicq)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(zzicoVar.getClass())));
        }
        zzidnVar.zzd();
        for (Map.Entry entry : zzicoVar.zze().zzb()) {
            zzidnVar.zzf((String) entry.getKey());
            zza(zzidnVar, (zzico) entry.getValue());
        }
        zzidnVar.zze();
    }
}
