package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbvm implements zzhcg {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzb;

    public zzbvm(ListenableFuture listenableFuture, String str, zzbut zzbutVar, zzbus zzbusVar) {
        this.zzb = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(final Object obj) {
        return zzhcy.zzj(this.zzb, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzbvl
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                return this.zza.zzc(obj, (zzbun) obj2);
            }
        }, zzcgj.zzh);
    }

    public final /* synthetic */ ListenableFuture zzc(Object obj, zzbun zzbunVar) throws JSONException {
        zzcgo zzcgoVar = new zzcgo();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzbqg.zzo.zzb(string, new zzbvk(this, zzcgoVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbunVar.zzb(this.zza, jSONObject);
        return zzcgoVar;
    }
}
