package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzhnm implements zzhmt {
    static final /* synthetic */ zzhnm zza = new zzhnm();

    private /* synthetic */ zzhnm() {
    }

    @Override // com.google.android.gms.internal.ads.zzhmt
    public final /* synthetic */ zzhes zza(zzhfj zzhfjVar, Integer num) throws GeneralSecurityException {
        int i10 = zzhnn.zza;
        zzhtw zzhtwVarZzc = ((zzhnf) zzhfjVar).zzb().zzc();
        zzhet zzhetVarZzd = zzhmu.zza().zzd(zzhtwVarZzc.zza());
        if (!zzhmu.zza().zze(zzhtwVarZzc.zza())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzhtt zzhttVarZzd = zzhetVarZzd.zzd(zzhtwVarZzc.zzb());
        return new zzhne(zzhos.zza(zzhttVarZzd.zza(), zzhttVarZzd.zzb(), zzhor.zzc(zzhttVarZzd.zzi()), zzhor.zzd(zzhtwVarZzc.zzk()), num), zzheq.zza());
    }
}
