package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdul {
    private final Executor zza;
    private final zzcvi zzb;
    private final zzdlq zzc;
    private final zzcub zzd;
    private final zzdck zze;

    public zzdul(Executor executor, zzcvi zzcviVar, zzdlq zzdlqVar, zzcub zzcubVar, zzdck zzdckVar) {
        this.zza = executor;
        this.zzc = zzdlqVar;
        this.zzb = zzcviVar;
        this.zzd = zzcubVar;
        this.zze = zzdckVar;
    }

    public final void zza(final zzclm zzclmVar) {
        if (zzclmVar == null) {
            return;
        }
        zzdlq zzdlqVar = this.zzc;
        zzdlqVar.zza(zzclmVar.zzE());
        zzbfg zzbfgVar = new zzbfg() { // from class: com.google.android.gms.internal.ads.zzduk
            @Override // com.google.android.gms.internal.ads.zzbfg
            public final /* synthetic */ void zzdj(zzbff zzbffVar) {
                Rect rect = zzbffVar.zzd;
                zzclmVar.zzP().zza(rect.left, rect.top, false);
            }
        };
        Executor executor = this.zza;
        zzdlqVar.zzq(zzbfgVar, executor);
        zzdlqVar.zzq(new zzbfg() { // from class: com.google.android.gms.internal.ads.zzduh
            @Override // com.google.android.gms.internal.ads.zzbfg
            public final /* synthetic */ void zzdj(zzbff zzbffVar) {
                HashMap map = new HashMap();
                map.put("isVisible", true != zzbffVar.zzj ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
                zzclmVar.zze("onAdVisibilityChanged", map);
            }
        }, executor);
        zzcvi zzcviVar = this.zzb;
        zzdlqVar.zzq(zzcviVar, executor);
        zzcviVar.zza(zzclmVar);
        zzcnk zzcnkVarZzP = zzclmVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlM)).booleanValue() && zzcnkVarZzP != null) {
            zzcub zzcubVar = this.zzd;
            zzcnkVarZzP.zzc(zzcubVar);
            zzcnkVarZzP.zze(zzcubVar, null, null);
        }
        zzclmVar.zzab("/trackActiveViewUnit", new zzbqh() { // from class: com.google.android.gms.internal.ads.zzdui
            @Override // com.google.android.gms.internal.ads.zzbqh
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzclm) obj, map);
            }
        });
        zzclmVar.zzab("/untrackActiveViewUnit", new zzbqh() { // from class: com.google.android.gms.internal.ads.zzduj
            @Override // com.google.android.gms.internal.ads.zzbqh
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc((zzclm) obj, map);
            }
        });
        zzclmVar.zzP().zzJ(this.zze);
    }

    public final /* synthetic */ void zzb(zzclm zzclmVar, Map map) {
        this.zzb.zzd();
    }

    public final /* synthetic */ void zzc(zzclm zzclmVar, Map map) {
        this.zzb.zzb();
    }
}
