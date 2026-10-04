package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdya {
    private final zzfms zza;
    private final zzdxx zzb;

    public zzdya(zzfms zzfmsVar, zzdxx zzdxxVar) {
        this.zza = zzfmsVar;
        this.zzb = zzdxxVar;
    }

    public final zzfmu zza(String str, JSONObject jSONObject) throws zzfmd {
        zzbvx zzbvxVarZza;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbvxVarZza = new zzbwv(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbvxVarZza = new zzbwv(new zzbym());
            } else {
                zzbvu zzbvuVarZzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzbvxVarZza = zzbvuVarZzd.zzb(string) ? zzbvuVarZzd.zza("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzbvuVarZzd.zzc(string) ? zzbvuVarZzd.zza(string) : zzbvuVarZzd.zza("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e10) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid custom event.", e10);
                        zzbvxVarZza = zzbvuVarZzd.zza(str);
                    }
                } else {
                    zzbvxVarZza = zzbvuVarZzd.zza(str);
                }
            }
            zzfmu zzfmuVar = new zzfmu(zzbvxVarZza);
            this.zzb.zza(str, zzfmuVar);
            return zzfmuVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkS)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfmd(th);
        }
    }

    public final zzbxt zzb(String str) throws RemoteException {
        zzbxt zzbxtVarZzd = zzd().zzd(str);
        this.zzb.zzb(str, zzbxtVarZzd);
        return zzbxtVarZzd;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    @e.f0
    public final zzbvu zzd() throws RemoteException {
        zzbvu zzbvuVarZzd = this.zza.zzd();
        if (zzbvuVarZzd != null) {
            return zzbvuVarZzd;
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
