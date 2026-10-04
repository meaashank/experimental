package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzidt implements zzihe {
    static {
        int i10 = zziew.zzb;
        int i11 = zzidv.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzihe
    public final /* synthetic */ Object zza(InputStream inputStream, zziew zziewVar) throws zzige {
        zzihz zzihzVarZzaU;
        zziem zziemVarZzH = zziem.zzH(inputStream, 4096);
        zzigw zzigwVar = (zzigw) zzb(zziemVarZzH, zziewVar);
        zziemVarZzH.zzb(0);
        if (zzigwVar == null || zzigwVar.zzbi()) {
            return zzigwVar;
        }
        if (zzigwVar instanceof zzidr) {
            zzihzVarZzaU = ((zzidr) zzigwVar).zzaU();
        } else {
            if (zzigwVar instanceof zzids) {
                throw null;
            }
            zzihzVarZzaU = new zzihz(zzigwVar);
        }
        throw zzihzVarZzaU.zza();
    }
}
