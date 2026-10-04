package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;
import com.mbridge.msdk.MBridgeConstans;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdzq implements zzdgv, zzdfd, zzdds, zzdmi {
    private final zzeae zza;
    private final zzeao zzb;
    private final Context zzc;

    public zzdzq(zzeae zzeaeVar, zzeao zzeaoVar, Context context) {
        this.zza = zzeaeVar;
        this.zzb = zzeaoVar;
        this.zzc = context;
    }

    private final void zzc(Bundle bundle, zzgxm zzgxmVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(zzdzs.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        zzeae zzeaeVar = this.zza;
        zzeaeVar.zzh();
        if (bundle.containsKey("ls")) {
            zzeaeVar.zzd("ls", true != bundle.getBoolean("ls") ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
        }
        int size = zzgxmVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzdzt zzdztVar = (zzdzt) zzgxmVar.get(i10);
            long j10 = bundle.getLong(zzdztVar.zzb().zza(), -1L);
            long j11 = bundle.getLong(zzdztVar.zzc().zza(), -1L);
            if (j10 > 0 && j11 > 0) {
                zzeaeVar.zzd(zzdztVar.zza(), String.valueOf(j11 - j10));
            }
        }
        zzf(bundle.getBundle("client_sig_latency_key"));
        zzf(bundle.getBundle("gms_sig_latency_key"));
    }

    private final void zzf(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j10 = bundle.getLong(str);
            if (j10 >= 0) {
                this.zza.zzd(str, String.valueOf(j10));
            }
        }
    }

    private final void zzh() {
        List historicalProcessExitReasons;
        if (((Boolean) zzbln.zzd.zze()).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zze(true) || !PlatformVersion.isAtLeastR()) {
            return;
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlg);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Context context = this.zzc;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 1)) == null || historicalProcessExitReasons.isEmpty()) {
                return;
            }
            int reason = U2.d.a(historicalProcessExitReasons.get(0)).getReason();
            for (String str2 : zzguz.zza(zzgty.zzd(',')).zze(zzgty.zzc()).zzd().zzf(str)) {
                try {
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 53);
                    sb2.append("Invalid number format in appExitInfoReasonAllowlist: ");
                    sb2.append(str2);
                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                }
                if (Integer.parseInt(str2) == reason) {
                    zzeao zzeaoVar = this.zzb;
                    Map mapZza = zzeaoVar.zza();
                    mapZza.put("action", "aei");
                    mapZza.put("aeir", String.valueOf(reason));
                    zzeaoVar.zzf(mapZza);
                    return;
                }
            }
        } catch (NoClassDefFoundError e10) {
            e = e10;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CsiAdLoadListener.maybeLogAppExitInfo");
        } catch (NoSuchMethodError e11) {
            e = e11;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CsiAdLoadListener.maybeLogAppExitInfo");
        } catch (RuntimeException e12) {
            e = e12;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CsiAdLoadListener.maybeLogAppExitInfo");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zzd(@Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhZ)).booleanValue()) {
            if (zzbcVar == null) {
                zzeae zzeaeVar = this.zza;
                zzeaeVar.zzc().put("action", "sgs");
                zzeaeVar.zzc().put("request_id", "-1");
                this.zzb.zzb(zzeaeVar.zzc());
                return;
            }
            zzcbv zzcbvVar = zzbcVar.zzc;
            if (zzcbvVar != null) {
                zzc(zzcbvVar.zzm, zzdzt.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(zzbcVar.zzb);
                zzeae zzeaeVar2 = this.zza;
                zzeaeVar2.zzc().put("action", "sgs");
                Map mapZzc = zzeaeVar2.zzc();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzln)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL;
                    } catch (JSONException e10) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving JSONObject from the requestJson, ", e10);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                mapZzc.put("tpc", str);
                zzcbv zzcbvVar2 = zzbcVar.zzc;
                if (zzcbvVar2 != null) {
                    this.zza.zzb(zzcbvVar2.zza);
                }
                zzeae zzeaeVar3 = this.zza;
                zzeaeVar3.zzi();
                this.zzb.zzb(zzeaeVar3.zzc());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlf)).booleanValue()) {
                    zzh();
                }
            } catch (JSONException unused) {
                zzeae zzeaeVar4 = this.zza;
                zzeaeVar4.zzc().put("action", "sgf");
                zzeaeVar4.zzc().put("sgf_reason", "request_invalid");
                this.zzb.zzb(zzeaeVar4.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeae zzeaeVar = this.zza;
        zzeaeVar.zzc().put("action", "ftl");
        zzeaeVar.zzd("ftl", String.valueOf(zzeVar.zza));
        zzeaeVar.zzd("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzio)).booleanValue()) {
            zzeaeVar.zzd("emsg", zzeVar.zzb);
        }
        zzeaeVar.zzi();
        this.zzb.zzb(zzeaeVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdP(zzcbv zzcbvVar) {
        this.zza.zzb(zzcbvVar.zza);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzle)).booleanValue()) {
            zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdQ(zzflo zzfloVar) {
        this.zza.zza(zzfloVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzld)).booleanValue()) {
            zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zze(@Nullable String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhZ)).booleanValue()) {
            zzeae zzeaeVar = this.zza;
            zzeaeVar.zzc().put("action", "sgf");
            zzeaeVar.zzd("sgf_reason", str);
            zzeaeVar.zzi();
            this.zzb.zzb(zzeaeVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        zzeae zzeaeVar = this.zza;
        zzeaeVar.zzc().put("action", "loaded");
        zzc(zzeaeVar.zze(), zzdzt.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoo)).booleanValue()) {
            zzeaeVar.zzc().put("mafe", true != I2.H0.d("MUTE_AUDIO") ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
        }
        zzeaeVar.zzi();
        this.zzb.zzb(zzeaeVar.zzc());
    }
}
