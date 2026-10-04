package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbkh {

    @Nullable
    private androidx.browser.customtabs.b zza;

    @Nullable
    private androidx.browser.customtabs.a zzb;

    @Nullable
    private v.f zzc;

    @Nullable
    private zzbkg zzd;

    public static boolean zza(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(zziom.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final void zzb(Activity activity) {
        v.f fVar = this.zzc;
        if (fVar == null) {
            return;
        }
        activity.unbindService(fVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    @Nullable
    public final androidx.browser.customtabs.b zzc() {
        androidx.browser.customtabs.a aVar = this.zzb;
        if (aVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = aVar.k(null);
        }
        return this.zza;
    }

    public final void zzd(zzbkg zzbkgVar) {
        this.zzd = zzbkgVar;
    }

    public final void zze(Activity activity) {
        String strZza;
        if (this.zzb == null && (strZza = zziom.zza(activity)) != null) {
            zzion zzionVar = new zzion(this);
            this.zzc = zzionVar;
            androidx.browser.customtabs.a.b(activity, strZza, zzionVar);
        }
    }

    public final void zzf(androidx.browser.customtabs.a aVar) {
        this.zzb = aVar;
        aVar.n(0L);
        zzbkg zzbkgVar = this.zzd;
        if (zzbkgVar != null) {
            zzbkgVar.zza();
        }
    }

    public final void zzg() {
        this.zzb = null;
        this.zza = null;
    }
}
