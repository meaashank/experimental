package com.android.launcher3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.android.launcher3.extension.ExtensionFactory;
import com.prism.commons.utils.l0;

/* JADX INFO: loaded from: classes2.dex */
public class AppFilter {
    private static final String TAG = l0.b("AppFilter");

    public static AppFilter newInstance(Context context) {
        AppFilter appFilterCreateOverrideAppFilter = ExtensionFactory.createOverrideAppFilter(context);
        Log.d(TAG, "AppFilter:" + appFilterCreateOverrideAppFilter);
        return appFilterCreateOverrideAppFilter;
    }

    public boolean shouldShowApp(ComponentName componentName, ApplicationInfo applicationInfo) {
        return true;
    }

    public boolean shouldShowWidget(ComponentName componentName) {
        return true;
    }
}
