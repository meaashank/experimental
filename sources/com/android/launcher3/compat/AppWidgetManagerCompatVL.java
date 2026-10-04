package com.android.launcher3.compat;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import androidx.annotation.Nullable;
import com.android.launcher3.LauncherAppWidgetProviderInfo;
import com.android.launcher3.util.ComponentKey;
import com.android.launcher3.util.PackageUserKey;
import com.android.launcher3.widget.custom.CustomWidgetParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class AppWidgetManagerCompatVL extends AppWidgetManagerCompat {
    private final UserManager mUserManager;

    public AppWidgetManagerCompatVL(Context context) {
        super(context);
        this.mUserManager = (UserManager) context.getSystemService("user");
    }

    @Override // com.android.launcher3.compat.AppWidgetManagerCompat
    public boolean bindAppWidgetIdIfAllowed(int i10, AppWidgetProviderInfo appWidgetProviderInfo, Bundle bundle) {
        if (i10 <= -100) {
            return true;
        }
        return this.mAppWidgetManager.bindAppWidgetIdIfAllowed(i10, appWidgetProviderInfo.getProfile(), appWidgetProviderInfo.provider, bundle);
    }

    @Override // com.android.launcher3.compat.AppWidgetManagerCompat
    public LauncherAppWidgetProviderInfo findProvider(ComponentName componentName, UserHandle userHandle) {
        for (AppWidgetProviderInfo appWidgetProviderInfo : getAllProviders(new PackageUserKey(componentName.getPackageName(), userHandle))) {
            if (appWidgetProviderInfo.provider.equals(componentName)) {
                return LauncherAppWidgetProviderInfo.fromProviderInfo(this.mContext, appWidgetProviderInfo);
            }
        }
        if (!Process.myUserHandle().equals(userHandle)) {
            return null;
        }
        for (LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo : CustomWidgetParser.getCustomWidgets(this.mContext)) {
            if (((AppWidgetProviderInfo) launcherAppWidgetProviderInfo).provider.equals(componentName)) {
                return launcherAppWidgetProviderInfo;
            }
        }
        return null;
    }

    @Override // com.android.launcher3.compat.AppWidgetManagerCompat
    public List<AppWidgetProviderInfo> getAllProviders(@Nullable PackageUserKey packageUserKey) {
        if (packageUserKey == null) {
            ArrayList arrayList = new ArrayList();
            Iterator<UserHandle> it = this.mUserManager.getUserProfiles().iterator();
            while (it.hasNext()) {
                arrayList.addAll(this.mAppWidgetManager.getInstalledProvidersForProfile(it.next()));
            }
            arrayList.addAll(CustomWidgetParser.getCustomWidgets(this.mContext));
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(this.mAppWidgetManager.getInstalledProvidersForProfile(packageUserKey.mUser));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (!((AppWidgetProviderInfo) it2.next()).provider.getPackageName().equals(packageUserKey.mPackageName)) {
                it2.remove();
            }
        }
        if (Process.myUserHandle().equals(packageUserKey.mUser) && this.mContext.getPackageName().equals(packageUserKey.mPackageName)) {
            arrayList2.addAll(CustomWidgetParser.getCustomWidgets(this.mContext));
        }
        return arrayList2;
    }

    @Override // com.android.launcher3.compat.AppWidgetManagerCompat
    public HashMap<ComponentKey, AppWidgetProviderInfo> getAllProvidersMap() {
        HashMap<ComponentKey, AppWidgetProviderInfo> map = new HashMap<>();
        for (UserHandle userHandle : this.mUserManager.getUserProfiles()) {
            for (AppWidgetProviderInfo appWidgetProviderInfo : this.mAppWidgetManager.getInstalledProvidersForProfile(userHandle)) {
                map.put(new ComponentKey(appWidgetProviderInfo.provider, userHandle), appWidgetProviderInfo);
            }
        }
        for (LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo : CustomWidgetParser.getCustomWidgets(this.mContext)) {
            map.put(new ComponentKey(((AppWidgetProviderInfo) launcherAppWidgetProviderInfo).provider, launcherAppWidgetProviderInfo.getProfile()), launcherAppWidgetProviderInfo);
        }
        return map;
    }
}
