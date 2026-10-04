package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class zzbpc implements zzbqh {
    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzc;
        zzclm zzclmVar = (zzclm) obj;
        zzbmi zzbmiVarZzar = zzclmVar.zzar();
        if (zzbmiVarZzar == null || (jSONObjectZzc = zzbmiVarZzar.zzc()) == null) {
            zzclmVar.zzd("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzclmVar.zzd("nativeAdViewSignalsReady", jSONObjectZzc);
        }
    }
}
