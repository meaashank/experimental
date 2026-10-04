package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbqv implements zzbqh {

    @Nullable
    private final com.google.android.gms.ads.internal.zzb zza;

    @Nullable
    private final zzeaj zzb;

    @Nullable
    private final zzbys zzd;

    @Nullable
    private final zzele zze;

    @Nullable
    private final zzcub zzf;

    @Nullable
    private final zzdcq zzg;
    private final zzdcg zzh;

    @Nullable
    private com.google.android.gms.ads.internal.util.client.zzu zzc = null;
    private com.google.android.gms.ads.internal.overlay.zzaa zzi = null;
    private final zzhdi zzj = zzcgj.zzh;

    public zzbqv(com.google.android.gms.ads.internal.zzb zzbVar, zzbys zzbysVar, zzele zzeleVar, zzeaj zzeajVar, zzcub zzcubVar, zzdcq zzdcqVar, zzdcg zzdcgVar) {
        this.zza = zzbVar;
        this.zzd = zzbysVar;
        this.zze = zzeleVar;
        this.zzb = zzeajVar;
        this.zzf = zzcubVar;
        this.zzg = zzdcqVar;
        this.zzh = zzdcgVar;
    }

    public static boolean zzb(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzc(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if (com.prism.gaia.helper.utils.l.f165154a.equalsIgnoreCase(str)) {
            return 6;
        }
        return a7.c.f84756a.equalsIgnoreCase(str) ? 14 : -1;
    }

    @e.f0
    public static Uri zzd(Context context, zzbbd zzbbdVar, Uri uri, View view, @Nullable Activity activity, @Nullable zzfma zzfmaVar) {
        if (zzbbdVar != null) {
            try {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznH)).booleanValue() || zzfmaVar == null) {
                    if (zzbbdVar.zze(uri)) {
                        return zzbbdVar.zzd(uri, context, view, activity);
                    }
                } else if (zzbbdVar.zze(uri)) {
                    return zzfmaVar.zza(uri, context, view, activity);
                }
            } catch (zzbbe unused) {
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    @e.f0
    public static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e10) {
            String strValueOf = String.valueOf(uri.toString());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error adding click uptime parameter to url: ".concat(strValueOf), e10);
            return uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0360  */
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.String r27, com.google.android.gms.ads.internal.client.zza r28, java.util.Map r29, java.lang.String r30) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instruction units count: 1397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqv.zzf(java.lang.String, com.google.android.gms.ads.internal.client.zza, java.util.Map, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzjU)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzjP)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzjO)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzj(com.google.android.gms.ads.internal.client.zza r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqv.zzj(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    private final void zzk(Context context, String str, String str2) {
        zzele zzeleVar = this.zze;
        zzeleVar.zzd(str);
        zzeaj zzeajVar = this.zzb;
        if (zzeajVar != null) {
            zzelp.zzd(context, zzeajVar, zzeleVar, str, "dialog_not_shown", zzgxp.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x014b, code lost:
    
        r15 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzl(com.google.android.gms.ads.internal.client.zza r21, java.util.Map r22, boolean r23, java.lang.String r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqv.zzl(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void zzm(boolean z10) {
        zzbys zzbysVar = this.zzd;
        if (zzbysVar != null) {
            zzbysVar.zzb(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzh(int i10) {
        zzeaj zzeajVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfH)).booleanValue() || (zzeajVar = this.zzb) == null) {
            return;
        }
        zzeai zzeaiVarZza = zzeajVar.zza();
        zzeaiVarZza.zzc("action", "cct_action");
        switch (i10) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = com.prism.lib_google_billing.q.f194113a;
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzeaiVarZza.zzc("cct_open_status", str);
        zzeaiVarZza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcub zzcubVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        zzclm zzclmVar = (zzclm) zzaVar;
        if (zzclmVar.zzC() != null) {
            map2 = zzclmVar.zzC().zzaw;
        }
        String strZza = zzcet.zza(str, zzclmVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzb()) {
            zzhcy.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlH)).booleanValue() && (zzcubVar = this.zzf) != null && zzcub.zzc(strZza)) ? zzcubVar.zzb(strZza, com.google.android.gms.ads.internal.client.zzay.zzh()) : zzhcy.zza(strZza), new zzbqq(this, map, zzaVar, str2), this.zzj);
        } else {
            zzbVar.zzc(strZza);
        }
    }

    public final /* synthetic */ void zzg(String str, String str2, Bundle bundle) {
        zzeaj zzeajVar = this.zzb;
        if (zzeajVar == null) {
            return;
        }
        String strEncodeToString = bundle != null ? Base64.encodeToString(com.google.android.gms.ads.internal.client.zzay.zza().zzn(bundle, new JSONObject()).toString().getBytes(), 1) : null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoE)).booleanValue()) {
            zzeai zzeaiVarZza = zzeajVar.zza();
            zzeaiVarZza.zzc("action", str);
            if (str2 != null) {
                zzeaiVarZza.zzc("gqi", str2);
            }
            if (strEncodeToString != null) {
                zzeaiVarZza.zzc("hsoe", strEncodeToString);
            }
            zzeaiVarZza.zzf();
        }
    }
}
