package com.android.launcher3.compat;

import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import androidx.annotation.Nullable;
import com.android.launcher3.util.PackageUserKey;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class AppWidgetManagerCompatVO extends AppWidgetManagerCompatVL {
    public AppWidgetManagerCompatVO(Context context) {
        super(context);
    }

    @Override // com.android.launcher3.compat.AppWidgetManagerCompatVL, com.android.launcher3.compat.AppWidgetManagerCompat
    public List<AppWidgetProviderInfo> getAllProviders(@Nullable PackageUserKey packageUserKey) {
        return packageUserKey == null ? super.getAllProviders(null) : this.mAppWidgetManager.getInstalledProvidersForPackage(packageUserKey.mPackageName, packageUserKey.mUser);
    }
}
