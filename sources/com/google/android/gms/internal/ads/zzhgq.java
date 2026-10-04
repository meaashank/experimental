package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzhgq implements zzhmt {
    static final /* synthetic */ zzhgq zza = new zzhgq();

    private /* synthetic */ zzhgq() {
    }

    @Override // com.google.android.gms.internal.ads.zzhmt
    public final /* synthetic */ zzhes zza(zzhfj zzhfjVar, Integer num) throws GeneralSecurityException {
        zzhgu zzhguVar = (zzhgu) zzhfjVar;
        int i10 = zzhgr.zza;
        if (zzhguVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES EAX Parameters are not valid");
        }
        zzhgn zzhgnVar = new zzhgn(null);
        zzhgnVar.zza(zzhguVar);
        zzhgnVar.zzc(num);
        zzhgnVar.zzb(zzicj.zzb(zzhguVar.zzc()));
        return zzhgnVar.zzd();
    }
}
