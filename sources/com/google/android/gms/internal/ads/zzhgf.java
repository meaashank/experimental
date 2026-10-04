package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzhgf implements zzhmt {
    static final /* synthetic */ zzhgf zza = new zzhgf();

    private /* synthetic */ zzhgf() {
    }

    @Override // com.google.android.gms.internal.ads.zzhmt
    public final /* synthetic */ zzhes zza(zzhfj zzhfjVar, Integer num) throws GeneralSecurityException {
        zzhgm zzhgmVar = (zzhgm) zzhfjVar;
        int i10 = zzhgi.zza;
        if (zzhgmVar.zzc() != 16 && zzhgmVar.zzc() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        zzhgd zzhgdVar = new zzhgd(null);
        zzhgdVar.zza(zzhgmVar);
        zzhgdVar.zzd(num);
        zzhgdVar.zzb(zzicj.zzb(zzhgmVar.zzc()));
        zzhgdVar.zzc(zzicj.zzb(zzhgmVar.zzd()));
        return zzhgdVar.zze();
    }
}
