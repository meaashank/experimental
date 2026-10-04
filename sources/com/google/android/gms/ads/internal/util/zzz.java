package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzelp;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class zzz {
    public /* synthetic */ zzz(byte[] bArr) {
    }

    @Nullable
    public CookieManager zza(Context context) {
        throw null;
    }

    public zzclx zzb(zzclm zzclmVar, zzbif zzbifVar, boolean z10, @Nullable zzelp zzelpVar) {
        throw null;
    }

    public WebResourceResponse zzc(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    public zzbil.zzq zzd(Context context, TelephonyManager telephonyManager) {
        return zzbil.zzq.ENUM_UNKNOWN;
    }

    public void zze(Context context, String str, String str2) {
    }

    public boolean zzf(Context context, String str) {
        return false;
    }

    @Nullable
    public Intent zzg(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public void zzh(Activity activity) {
    }

    public int zzi(AudioManager audioManager) {
        return 0;
    }

    public int zzk(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
