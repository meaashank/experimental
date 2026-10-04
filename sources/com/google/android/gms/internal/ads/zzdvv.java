package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdvv {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final Context zzc;
    private final zzeaj zzd;
    private final Executor zze;
    private final zzbbd zzf;
    private final VersionInfoParcel zzg;
    private final zzele zzi;
    private final zzfte zzj;
    private final zzelp zzk;
    private final zzfma zzl;
    private final zzdcg zzm;
    private ListenableFuture zzn;
    private final zzdvj zza = new zzdvj();
    private final zzbqz zzh = new zzbqz();

    public zzdvv(zzdvt zzdvtVar) {
        this.zzc = zzdvtVar.zzb();
        this.zze = zzdvtVar.zze();
        this.zzf = zzdvtVar.zzf();
        this.zzg = zzdvtVar.zzg();
        this.zzb = zzdvtVar.zza();
        this.zzi = zzdvtVar.zzd();
        this.zzj = zzdvtVar.zzh();
        this.zzd = zzdvtVar.zzc();
        this.zzk = zzdvtVar.zzi();
        this.zzl = zzdvtVar.zzj();
        this.zzm = zzdvtVar.zzk();
    }

    public final synchronized void zza() {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeN);
        zzbbd zzbbdVar = this.zzf;
        com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        zzelp zzelpVar = this.zzk;
        ListenableFuture listenableFutureZzk = zzhcy.zzk(zzcmc.zzb(this.zzc, this.zzg, str, zzbbdVar, zzaVar, zzelpVar, this.zzl, this.zzd), new zzgub() { // from class: com.google.android.gms.internal.ads.zzdvs
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                zzclm zzclmVar = (zzclm) obj;
                this.zza.zzi(zzclmVar);
                return zzclmVar;
            }
        }, this.zze);
        this.zzn = listenableFutureZzk;
        zzcgm.zza(listenableFutureZzk, "NativeJavascriptExecutor.initializeEngine", zzcgj.zzh);
    }

    public final synchronized void zzb() {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzhcy.zzr(listenableFuture, new zzdvk(this), this.zze);
        this.zzn = null;
    }

    public final synchronized ListenableFuture zzc(final String str, final JSONObject jSONObject) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return zzhcy.zza(null);
        }
        return zzhcy.zzj(listenableFuture, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzdvr
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzj(str, jSONObject, (zzclm) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzd(String str, zzbqh zzbqhVar) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzhcy.zzr(listenableFuture, new zzdvl(this, str, zzbqhVar), this.zze);
    }

    public final synchronized void zze(String str, zzbqh zzbqhVar) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzhcy.zzr(listenableFuture, new zzdvm(this, str, zzbqhVar), this.zze);
    }

    public final synchronized void zzf(String str, Map map) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzhcy.zzr(listenableFuture, new zzdvn(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzg(zzfld zzfldVar, zzflg zzflgVar, zzcub zzcubVar) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzhcy.zzr(listenableFuture, new zzdvo(this, zzfldVar, zzflgVar, zzcubVar), this.zze);
    }

    public final void zzh(WeakReference weakReference, String str, zzbqh zzbqhVar) {
        zzd(str, new zzdvu(this, weakReference, str, zzbqhVar, null));
    }

    public final /* synthetic */ zzclm zzi(zzclm zzclmVar) {
        zzclmVar.zzab("/result", this.zzh);
        zzcnk zzcnkVarZzP = zzclmVar.zzP();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzc, null, null);
        zzdcg zzdcgVar = this.zzm;
        zzele zzeleVar = this.zzi;
        zzfte zzfteVar = this.zzj;
        zzeaj zzeajVar = this.zzd;
        zzdvj zzdvjVar = this.zza;
        zzcnkVarZzP.zzab(null, zzdvjVar, zzdvjVar, zzdvjVar, zzdvjVar, false, null, zzbVar, null, null, zzeleVar, zzfteVar, zzeajVar, null, null, null, null, null, null, null, null, null, zzdcgVar);
        return zzclmVar;
    }

    public final /* synthetic */ ListenableFuture zzj(String str, JSONObject jSONObject, zzclm zzclmVar) {
        return this.zzh.zzc(zzclmVar, str, jSONObject);
    }

    public final /* synthetic */ zzdvj zzk() {
        return this.zza;
    }

    public final /* synthetic */ zzeaj zzl() {
        return this.zzd;
    }

    public final /* synthetic */ zzele zzm() {
        return this.zzi;
    }

    public final /* synthetic */ zzfte zzn() {
        return this.zzj;
    }
}
