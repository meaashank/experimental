package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcnl {

    @Nullable
    private H2.d zza = null;

    public final void zza(WebView webView) {
        if (this.zza != null) {
            try {
                H2.t.y(webView, "GMA_WEBVIEW_PROFILE");
                com.google.android.gms.ads.internal.util.zze.zza("WebViewCompat Profile is defined");
            } catch (IllegalStateException e10) {
                String strConcat = "WebViewCompat error: ".concat(e10.toString());
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpP)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "WebViewCompat.setProfile");
                }
            }
        }
    }

    @e.T(api = 24)
    @e.e0
    public final void zzb(zzcnp zzcnpVar) {
        ProfileStore profileStore;
        if (!I2.H0.d("MULTI_PROFILE")) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) zzgbu.zza("androidx.webkit.ProfileStore", "getInstance", new zzgbt[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(strValueOf));
            try {
                profileStore = (ProfileStore) zzgbu.zza("androidx.webkit.ProfileStore$-CC", "getInstance", new zzgbt[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e11) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(String.valueOf(e11.getMessage())));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.zza = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpO)).booleanValue()) {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzcnpVar.zza;
                zzeai zzeaiVarZza = zzcnpVar.zzb.zzd().zza();
                zzeaiVarZza.zzc("action", "webview_p_l");
                zzeaiVarZza.zzc("webview_p_l", Long.toString(jElapsedRealtime));
                zzeaiVarZza.zzd();
                return;
            }
            return;
        }
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("WebViewCompat failure: No instance");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpO)).booleanValue()) {
            zzeai zzeaiVarZza2 = zzcnpVar.zzb.zzd().zza();
            zzeaiVarZza2.zzc("action", "webview_p_f");
            zzeaiVarZza2.zzc("webview_p_f", "No instance");
            zzeaiVarZza2.zzd();
        }
    }
}
