package com.android.launcher3.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.android.launcher3.AppInfo;
import com.android.launcher3.Utilities;
import com.app.hider.master.promax.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class InstantAppResolver {
    public static InstantAppResolver newInstance(Context context) {
        return (InstantAppResolver) Utilities.getOverrideObject(InstantAppResolver.class, context, R.string.instant_app_resolver_class);
    }

    public List<ApplicationInfo> getInstantApps() {
        return Collections.EMPTY_LIST;
    }

    public boolean isInstantApp(ApplicationInfo applicationInfo) {
        return false;
    }

    public boolean isInstantApp(AppInfo appInfo) {
        return false;
    }

    public boolean isInstantApp(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(str, 0).applicationInfo;
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("InstantAppResolver", "Failed to determine whether package is instant app " + str, e10);
            return false;
        }
    }
}
