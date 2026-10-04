package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfya extends zzfxv {
    public zzfya(zzfxo zzfxoVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfxoVar, hashSet, jSONObject, j10);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzfxo zzfxoVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfxg.zzg(jSONObject, zzfxoVar.zzd())) {
            return null;
        }
        zzfxoVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfxw, android.os.AsyncTask
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzfwk zzfwkVarZza;
        if (!TextUtils.isEmpty(str) && (zzfwkVarZza = zzfwk.zza()) != null) {
            for (zzfvq zzfvqVar : zzfwkVarZza.zze()) {
                if (((zzfxv) this).zza.contains(zzfvqVar.zzh())) {
                    zzfvqVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
