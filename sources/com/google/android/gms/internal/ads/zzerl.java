package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzerl implements zzems {
    private final zzesp zza;
    private final zzdya zzb;

    public zzerl(zzesp zzespVar, zzdya zzdyaVar) {
        this.zza = zzespVar;
        this.zzb = zzdyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    @Nullable
    public final zzemt zza(String str, JSONObject jSONObject) throws zzfmd {
        zzbxt zzbxtVarZzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcu)).booleanValue()) {
            try {
                zzbxtVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Coundn't create RTB adapter: ", e10);
                zzbxtVarZzb = null;
            }
        } else {
            zzbxtVarZzb = this.zza.zzb(str);
        }
        if (zzbxtVarZzb == null) {
            return null;
        }
        return new zzemt(zzbxtVarZzb, new zzeof(), str);
    }
}
