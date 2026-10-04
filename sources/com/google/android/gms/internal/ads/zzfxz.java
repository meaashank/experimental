package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfxz extends zzfxv {
    public zzfxz(zzfxo zzfxoVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfxoVar, hashSet, jSONObject, j10);
    }

    private final void zzc(String str) {
        zzfwk zzfwkVarZza = zzfwk.zza();
        if (zzfwkVarZza != null) {
            for (zzfvq zzfvqVar : zzfwkVarZza.zze()) {
                if (((zzfxv) this).zza.contains(zzfvqVar.zzh())) {
                    zzfvqVar.zzg().zzi(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfxw, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfxw
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
