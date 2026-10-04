package com.android.launcher3.compat;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.UserHandle;
import androidx.annotation.Nullable;
import com.android.launcher3.LauncherAppWidgetProviderInfo;
import com.android.launcher3.Utilities;
import com.android.launcher3.util.ComponentKey;
import com.android.launcher3.util.PackageUserKey;
import com.android.launcher3.widget.custom.CustomWidgetParser;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AppWidgetManagerCompat {
    private static AppWidgetManagerCompat sInstance;
    private static final Object sInstanceLock = new Object();
    final AppWidgetManager mAppWidgetManager;
    final Context mContext;

    public AppWidgetManagerCompat(Context context) {
        this.mContext = context;
        this.mAppWidgetManager = AppWidgetManager.getInstance(context);
    }

    public static AppWidgetManagerCompat getInstance(Context context) {
        AppWidgetManagerCompat appWidgetManagerCompat;
        synchronized (sInstanceLock) {
            try {
                if (sInstance == null) {
                    if (Utilities.ATLEAST_OREO) {
                        sInstance = new AppWidgetManagerCompatVO(context.getApplicationContext());
                    } else {
                        sInstance = new AppWidgetManagerCompatVL(context.getApplicationContext());
                    }
                }
                appWidgetManagerCompat = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appWidgetManagerCompat;
    }

    public abstract boolean bindAppWidgetIdIfAllowed(int i10, AppWidgetProviderInfo appWidgetProviderInfo, Bundle bundle);

    public abstract LauncherAppWidgetProviderInfo findProvider(ComponentName componentName, UserHandle userHandle);

    public abstract List<AppWidgetProviderInfo> getAllProviders(@Nullable PackageUserKey packageUserKey);

    public abstract HashMap<ComponentKey, AppWidgetProviderInfo> getAllProvidersMap();

    public LauncherAppWidgetProviderInfo getLauncherAppWidgetInfo(int i10) {
        if (i10 <= -100) {
            return CustomWidgetParser.getWidgetProvider(this.mContext, i10);
        }
        AppWidgetProviderInfo appWidgetInfo = this.mAppWidgetManager.getAppWidgetInfo(i10);
        if (appWidgetInfo == null) {
            return null;
        }
        return LauncherAppWidgetProviderInfo.fromProviderInfo(this.mContext, appWidgetInfo);
    }
}
