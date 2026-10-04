package com.google.android.play.core.hsdp.service;

import android.app.Activity;

/* JADX INFO: loaded from: classes4.dex */
final class zza {
    public static int zza(Activity activity, int i10) {
        return (int) ((i10 * activity.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int zzb(Activity activity) {
        return zza(activity, activity.getResources().getConfiguration().screenHeightDp);
    }

    public static int zzc(Activity activity) {
        return zza(activity, activity.getResources().getConfiguration().screenWidthDp);
    }
}
