package com.google.android.play.core.hsdp.service;

import android.content.Intent;
import android.net.Uri;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.prism.fusionadsdk.internal.activity.WebViewInterstitialActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzq {
    public static Intent zza(String str, String str2, Map map) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority(WebViewInterstitialActivity.f162277t).path("store/apps/details").appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals("id") && !str3.equals("referrer")) {
                    builderAppendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", builderAppendQueryParameter.build());
        intent.setPackage("com.android.vending");
        return intent;
    }

    public static Intent zzb(String str, String str2, String str3, Map map) {
        Intent intent = new Intent("android.intent.action.VIEW", zzc(str, str2, map));
        intent.setPackage("com.android.vending");
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", str3);
        intent.putExtra("hsdp_caller_source", "hpoa");
        return intent;
    }

    public static Uri zzc(String str, String str2, Map map) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority(WebViewInterstitialActivity.f162277t).path(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D).appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals("id") && !str3.equals("referrer")) {
                    builderAppendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        return builderAppendQueryParameter.build();
    }
}
