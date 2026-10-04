package com.android.launcher3.util;

import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.LauncherActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.android.launcher3.AppInfo;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.LauncherAppWidgetInfo;
import com.android.launcher3.PendingAddItemInfo;
import com.android.launcher3.PromiseAppInfo;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.Utilities;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.app.hider.master.promax.R;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.prism.fusionadsdk.internal.activity.WebViewInterstitialActivity;
import java.net.URISyntaxException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PackageManagerHelper {
    private static final String TAG = "PackageManagerHelper";
    private final Context mContext;
    private final LauncherAppsCompat mLauncherApps;
    private final PackageManager mPm;

    public PackageManagerHelper(Context context) {
        this.mContext = context;
        this.mPm = context.getPackageManager();
        this.mLauncherApps = LauncherAppsCompat.getInstance(context);
    }

    public static Intent getMarketSearchIntent(Context context, String str) {
        try {
            Intent uri = Intent.parseUri(context.getString(R.string.market_search_intent), 0);
            if (!TextUtils.isEmpty(str)) {
                uri.setData(uri.getData().buildUpon().appendQueryParameter(CampaignEx.JSON_KEY_AD_Q, str).build());
            }
            return uri;
        } catch (URISyntaxException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Intent getAppLaunchIntent(String str, UserHandle userHandle) {
        List<LauncherActivityInfo> activityList = this.mLauncherApps.getActivityList(str, userHandle);
        if (activityList.isEmpty()) {
            return null;
        }
        return AppInfo.makeLaunchIntent(activityList.get(0));
    }

    public Intent getMarketIntent(String str) {
        return new Intent("android.intent.action.VIEW").setData(new Uri.Builder().scheme(WebViewInterstitialActivity.f162279v).authority(WebViewInterstitialActivity.f162280w).appendQueryParameter("id", str).build()).putExtra("android.intent.extra.REFERRER", new Uri.Builder().scheme("android-app").authority(this.mContext.getPackageName()).build());
    }

    public boolean hasPermissionForActivity(Intent intent, String str) {
        ResolveInfo resolveInfoResolveActivity = this.mPm.resolveActivity(intent, 0);
        if (resolveInfoResolveActivity == null) {
            return false;
        }
        if (TextUtils.isEmpty(resolveInfoResolveActivity.activityInfo.permission)) {
            return true;
        }
        if (TextUtils.isEmpty(str) || this.mPm.checkPermission(resolveInfoResolveActivity.activityInfo.permission, str) != 0) {
            return false;
        }
        if (Utilities.ATLEAST_MARSHMALLOW && !TextUtils.isEmpty(AppOpsManager.permissionToOp(resolveInfoResolveActivity.activityInfo.permission))) {
            return this.mPm.getApplicationInfo(str, 0).targetSdkVersion >= 23;
        }
        return true;
    }

    public boolean isAppOnSdcard(String str, UserHandle userHandle) {
        ApplicationInfo applicationInfo = this.mLauncherApps.getApplicationInfo(str, 8192, userHandle);
        return (applicationInfo == null || (applicationInfo.flags & 262144) == 0) ? false : true;
    }

    public boolean isAppSuspended(String str, UserHandle userHandle) {
        ApplicationInfo applicationInfo = this.mLauncherApps.getApplicationInfo(str, 0, userHandle);
        return applicationInfo != null && isAppSuspended(applicationInfo);
    }

    public boolean isSafeMode() {
        return this.mContext.getPackageManager().isSafeMode();
    }

    public void startDetailsActivityForInfo(ItemInfo itemInfo, Rect rect, Bundle bundle) {
        if (itemInfo instanceof PromiseAppInfo) {
            Context context = this.mContext;
            context.startActivity(((PromiseAppInfo) itemInfo).getMarketIntent(context));
            return;
        }
        ComponentName targetComponent = itemInfo instanceof AppInfo ? ((AppInfo) itemInfo).componentName : itemInfo instanceof ShortcutInfo ? itemInfo.getTargetComponent() : itemInfo instanceof PendingAddItemInfo ? ((PendingAddItemInfo) itemInfo).componentName : itemInfo instanceof LauncherAppWidgetInfo ? ((LauncherAppWidgetInfo) itemInfo).providerName : null;
        if (targetComponent != null) {
            try {
                this.mLauncherApps.showAppDetailsForProfile(targetComponent, itemInfo.user, rect, bundle);
            } catch (ActivityNotFoundException | SecurityException e10) {
                Toast.makeText(this.mContext, R.string.activity_not_found, 0).show();
                Log.e(TAG, "Unable to launch settings", e10);
            }
        }
    }

    public static boolean isAppSuspended(ApplicationInfo applicationInfo) {
        return Utilities.ATLEAST_NOUGAT && (applicationInfo.flags & 1073741824) != 0;
    }
}
