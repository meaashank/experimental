package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.a;
import androidx.browser.customtabs.b;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzcak;
import com.google.android.gms.internal.ads.zzcfe;
import e.W;
import java.util.List;
import v.C5668b;

/* JADX INFO: loaded from: classes3.dex */
public class MobileAds {

    @NonNull
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(@NonNull Context context) {
        zzeu.zzb().zzm(context);
    }

    @Nullable
    public static InitializationStatus getInitializationStatus() {
        return zzeu.zzb().zzl();
    }

    @KeepForSdk
    private static String getInternalVersion() {
        return zzeu.zzb().zzo();
    }

    @NonNull
    public static RequestConfiguration getRequestConfiguration() {
        return zzeu.zzb().zzp();
    }

    @NonNull
    public static VersionInfo getVersion() {
        zzeu.zzb();
        String[] strArrSplit = TextUtils.split("25.4.0", "\\.");
        if (strArrSplit.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    @W("android.permission.INTERNET")
    public static void initialize(@NonNull Context context) {
        zzeu.zzb().zzc(context, null, null);
    }

    public static void openAdInspector(@NonNull Context context, @NonNull OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzeu.zzb().zzn(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(@NonNull Context context, @NonNull String str) {
        zzeu.zzb().zzj(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z10) {
        return zzeu.zzb().zzr(z10);
    }

    @Nullable
    public static b registerCustomTabsSession(@NonNull Context context, @NonNull a aVar, @NonNull String str, @Nullable C5668b c5668b) {
        zzeu.zzb();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfe zzcfeVarZza = zzcak.zza(context);
        if (zzcfeVarZza == null) {
            zzo.zzf("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (b) ObjectWrapper.unwrap(zzcfeVarZza.zzm(ObjectWrapper.wrap(context), ObjectWrapper.wrap(aVar), str, ObjectWrapper.wrap(c5668b)));
        } catch (RemoteException | IllegalArgumentException e10) {
            zzo.zzg("Unable to register custom tabs session. Error: ", e10);
            return null;
        }
    }

    @KeepForSdk
    public static void registerRtbAdapter(@NonNull Class<? extends RtbAdapter> cls) {
        zzeu.zzb().zzk(cls);
    }

    public static void registerWebView(@NonNull WebView webView) {
        zzeu.zzb();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzo.zzf("The webview to be registered cannot be null.");
            return;
        }
        zzcfe zzcfeVarZza = zzcak.zza(webView.getContext());
        if (zzcfeVarZza == null) {
            zzo.zzf("Internal error, query info generator is null.");
            return;
        }
        try {
            zzcfeVarZza.zzj(ObjectWrapper.wrap(webView));
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    public static void setAppMuted(boolean z10) {
        zzeu.zzb().zzh(z10);
    }

    public static void setAppVolume(float f10) {
        zzeu.zzb().zzf(f10);
    }

    @KeepForSdk
    private static void setPlugin(String str) {
        zzeu.zzb().zzs(str);
    }

    public static void setRequestConfiguration(@NonNull RequestConfiguration requestConfiguration) {
        zzeu.zzb().zzq(requestConfiguration);
    }

    @Deprecated
    public static void startPreload(@NonNull Context context, @NonNull List<PreloadConfiguration> list, @NonNull PreloadCallback preloadCallback) {
        zzeu.zzb().zze(context, list, preloadCallback);
    }

    @KeepForSdk
    private static void stop() {
        zzeu.zzb().zzd();
    }

    public static void initialize(@NonNull Context context, @NonNull OnInitializationCompleteListener onInitializationCompleteListener) {
        zzeu.zzb().zzc(context, null, onInitializationCompleteListener);
    }
}
