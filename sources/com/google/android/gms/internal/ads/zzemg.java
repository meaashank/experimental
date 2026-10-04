package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes4.dex */
public interface zzemg {
    boolean zza(Context context);

    @Nullable
    String zzb(Context context);

    @Nullable
    zzeml zzc(String str, WebView webView, String str2, String str3, @Nullable String str4, zzemi zzemiVar, zzemh zzemhVar, @Nullable String str5);

    @Nullable
    zzeml zzd(String str, WebView webView, String str2, String str3, @Nullable String str4, String str5, zzemi zzemiVar, zzemh zzemhVar, @Nullable String str6);

    void zze(zzfvm zzfvmVar);

    void zzf(zzfvm zzfvmVar);

    void zzg(zzfvm zzfvmVar, View view);

    void zzh(zzfvm zzfvmVar, View view);

    @Nullable
    zzfvy zzi(VersionInfoParcel versionInfoParcel, WebView webView, boolean z10);

    void zzj(zzfvy zzfvyVar, zzfvx zzfvxVar);

    void zzk(zzfvy zzfvyVar, View view);
}
