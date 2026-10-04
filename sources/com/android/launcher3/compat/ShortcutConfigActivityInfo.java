package com.android.launcher3.compat;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.LauncherActivityInfo;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.UserHandle;
import android.util.Log;
import android.widget.Toast;
import com.android.launcher3.IconCache;
import com.android.launcher3.ShortcutInfo;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ShortcutConfigActivityInfo {
    private static final String TAG = "SCActivityInfo";
    private final ComponentName mCn;
    private final UserHandle mUser;

    public static class ShortcutConfigActivityInfoVL extends ShortcutConfigActivityInfo {
        private final ActivityInfo mInfo;
        private final PackageManager mPm;

        public ShortcutConfigActivityInfoVL(ActivityInfo activityInfo, PackageManager packageManager) {
            super(new ComponentName(activityInfo.packageName, activityInfo.name), Process.myUserHandle());
            this.mInfo = activityInfo;
            this.mPm = packageManager;
        }

        @Override // com.android.launcher3.compat.ShortcutConfigActivityInfo
        public Drawable getFullResIcon(IconCache iconCache) {
            return iconCache.getFullResIcon(this.mInfo);
        }

        @Override // com.android.launcher3.compat.ShortcutConfigActivityInfo
        public CharSequence getLabel() {
            return this.mInfo.loadLabel(this.mPm);
        }
    }

    @TargetApi(26)
    public static class ShortcutConfigActivityInfoVO extends ShortcutConfigActivityInfo {
        private final LauncherActivityInfo mInfo;

        public ShortcutConfigActivityInfoVO(LauncherActivityInfo launcherActivityInfo) {
            super(launcherActivityInfo.getComponentName(), launcherActivityInfo.getUser());
            this.mInfo = launcherActivityInfo;
        }

        @Override // com.android.launcher3.compat.ShortcutConfigActivityInfo
        public Drawable getFullResIcon(IconCache iconCache) {
            return iconCache.getFullResIcon(this.mInfo);
        }

        @Override // com.android.launcher3.compat.ShortcutConfigActivityInfo
        public CharSequence getLabel() {
            return this.mInfo.getLabel();
        }

        @Override // com.android.launcher3.compat.ShortcutConfigActivityInfo
        public boolean startConfigActivity(Activity activity, int i10) {
            if (getUser().equals(Process.myUserHandle())) {
                return super.startConfigActivity(activity, i10);
            }
            try {
                activity.startIntentSenderForResult(((LauncherApps) activity.getSystemService(LauncherApps.class)).getShortcutConfigActivityIntent(this.mInfo), i10, null, 0, 0, 0);
                return true;
            } catch (IntentSender.SendIntentException unused) {
                Toast.makeText(activity, R.string.activity_not_found, 0).show();
                return false;
            }
        }
    }

    public ShortcutConfigActivityInfo(ComponentName componentName, UserHandle userHandle) {
        this.mCn = componentName;
        this.mUser = userHandle;
    }

    public ShortcutInfo createShortcutInfo() {
        return null;
    }

    public ComponentName getComponent() {
        return this.mCn;
    }

    public abstract Drawable getFullResIcon(IconCache iconCache);

    public int getItemType() {
        return 1;
    }

    public abstract CharSequence getLabel();

    public UserHandle getUser() {
        return this.mUser;
    }

    public boolean isPersistable() {
        return true;
    }

    public boolean startConfigActivity(Activity activity, int i10) {
        Intent component = new Intent("android.intent.action.CREATE_SHORTCUT").setComponent(getComponent());
        try {
            activity.startActivityForResult(component, i10);
            return true;
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(activity, R.string.activity_not_found, 0).show();
            return false;
        } catch (SecurityException e10) {
            Toast.makeText(activity, R.string.activity_not_found, 0).show();
            Log.e(TAG, "Launcher does not have the permission to launch " + component + ". Make sure to create a MAIN intent-filter for the corresponding activity or use the exported attribute for this activity.", e10);
            return false;
        }
    }
}
