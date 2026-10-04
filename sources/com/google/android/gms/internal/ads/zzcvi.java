package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcvi implements zzbfg {
    private zzclm zza;
    private final Executor zzb;
    private final zzcuu zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcux zzg = new zzcux();

    public zzcvi(Executor executor, zzcuu zzcuuVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcuuVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvh
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e10);
        }
    }

    public final void zza(zzclm zzclmVar) {
        this.zza = zzclmVar;
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzdj(zzbff zzbffVar) {
        boolean z10 = this.zzf ? false : zzbffVar.zzj;
        zzcux zzcuxVar = this.zzg;
        zzcuxVar.zza = z10;
        zzcuxVar.zzd = this.zzd.elapsedRealtime();
        zzcuxVar.zzf = zzbffVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z10) {
        this.zzf = z10;
    }

    public final /* synthetic */ void zzf(JSONObject jSONObject) {
        String string = jSONObject.toString();
        String strA = androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 31), "Calling AFMA_updateActiveView(", string, ")");
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(strA);
        this.zza.zzb("AFMA_updateActiveView", jSONObject);
    }
}
