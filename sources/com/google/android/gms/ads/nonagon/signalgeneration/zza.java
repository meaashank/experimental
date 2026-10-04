package com.google.android.gms.ads.nonagon.signalgeneration;

import H2.t;
import H2.u;
import I2.H0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzgxw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zza {
    private final Context zza;

    @Nullable
    private final ApplicationInfo zzb;
    private final List zzc;
    private final VersionInfoParcel zzd;
    private final JSONObject zze = new JSONObject();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zza(Context context, zzbiq zzbiqVar, List list, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
        this.zzc = list;
        this.zzd = versionInfoParcel;
    }

    public final void zza(@Nullable WebView webView) {
        if (this.zzf.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfo = null;
        try {
            ApplicationInfo applicationInfo = this.zzb;
            if (applicationInfo != null) {
                packageInfo = Wrappers.packageManager(this.zza).getPackageInfo(applicationInfo.packageName, 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo != null) {
            try {
                JSONObject jSONObject = this.zze;
                jSONObject.put("vc", packageInfo.versionCode);
                jSONObject.put("vnm", packageInfo.versionName);
            } catch (JSONException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "PawAppSignalGenerator.initialize");
            }
        }
        ApplicationInfo applicationInfo2 = this.zzb;
        if (applicationInfo2 != null) {
            this.zze.put("pn", applicationInfo2.packageName);
        }
        JSONObject jSONObject2 = this.zze;
        List list = this.zzc;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlu)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject2.put("eid", arrayList);
        jSONObject2.put("js", this.zzd.afmaVersion);
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject2.get(next);
            if (obj != null) {
                jSONObject2.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) zzblm.zzb.zze()).booleanValue() && H0.d(u.f45497R) && webView != null) {
            t.a(webView, String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlt), zzb()), zzgxw.zzi("*"));
        }
    }

    public final JSONObject zzb() {
        if (!this.zzf.get()) {
            zza(null);
        }
        return this.zze;
    }
}
