package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbve implements zzbuq {
    private final zzbus zza;
    private final zzbut zzb;
    private final zzbum zzc;
    private final String zzd;

    public zzbve(zzbum zzbumVar, String str, zzbut zzbutVar, zzbus zzbusVar) {
        this.zzc = zzbumVar;
        this.zzd = str;
        this.zzb = zzbutVar;
        this.zza = zzbusVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final ListenableFuture zza(@Nullable Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbuq
    public final ListenableFuture zzb(Object obj) {
        zzcgo zzcgoVar = new zzcgo();
        zzbug zzbugVarZzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzbugVarZzb.zze(new zzbvb(this, zzbugVarZzb, obj, zzcgoVar), new zzbvc(this, zzcgoVar, zzbugVarZzb));
        return zzcgoVar;
    }

    public final /* synthetic */ void zzc(zzbug zzbugVar, zzbun zzbunVar, Object obj, zzcgo zzcgoVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            String string = UUID.randomUUID().toString();
            zzbqg.zzo.zzb(string, new zzbvd(this, zzbugVar, zzcgoVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", this.zzb.zzb(obj));
            zzbunVar.zzb(this.zzd, jSONObject);
        } catch (Exception e10) {
            try {
                zzcgoVar.zzd(e10);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to invokeJavascript", e10);
            } finally {
                zzbugVar.zza();
            }
        }
    }

    public final /* synthetic */ zzbus zzd() {
        return this.zza;
    }
}
