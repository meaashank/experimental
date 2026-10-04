package com.android.launcher3;

import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.os.UserHandle;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.widget.Toast;
import com.android.launcher3.badge.BadgeInfo;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.android.launcher3.shortcuts.DeepShortcutManager;
import com.android.launcher3.uioverrides.DisplayRotationListener;
import com.android.launcher3.uioverrides.WallpaperColorInfo;
import com.android.launcher3.views.BaseDragLayer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseDraggingActivity extends BaseActivity implements WallpaperColorInfo.OnChangeListener {
    public static final Object AUTO_CANCEL_ACTION_MODE = new Object();
    public static final String INTENT_EXTRA_IGNORE_LAUNCH_ANIMATION = "com.android.launcher3.intent.extra.shortcut.INGORE_LAUNCH_ANIMATION";
    private static final String TAG = "BaseDraggingActivity";
    private ActionMode mCurrentActionMode;
    protected boolean mIsSafeModeEnabled;
    private OnStartCallback mOnStartCallback;
    private DisplayRotationListener mRotationListener;
    private int mThemeRes = com.app.hider.master.promax.R.style.LauncherTheme;

    public interface OnStartCallback<T extends BaseDraggingActivity> {
        void onActivityStart(T t10);
    }

    public static BaseDraggingActivity fromContext(Context context) {
        return context instanceof BaseDraggingActivity ? (BaseDraggingActivity) context : (BaseDraggingActivity) ((ContextWrapper) context).getBaseContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDeviceRotationChanged() {
        if (this.mDeviceProfile.updateIsSeascape(getWindowManager())) {
            reapplyUi();
        }
    }

    private void startShortcutIntentSafely(Intent intent, Bundle bundle, ItemInfo itemInfo) {
        try {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            try {
                StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
                if (itemInfo.itemType == 6) {
                    String deepShortcutId = ((ShortcutInfo) itemInfo).getDeepShortcutId();
                    DeepShortcutManager.getInstance(this).startShortcut(intent.getPackage(), deepShortcutId, intent.getSourceBounds(), bundle, itemInfo.user);
                } else {
                    startActivity(intent, bundle);
                }
                StrictMode.setVmPolicy(vmPolicy);
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (SecurityException e10) {
            if (!onErrorStartingShortcut(intent, itemInfo)) {
                throw e10;
            }
        }
    }

    public boolean finishAutoCancelActionMode() {
        ActionMode actionMode = this.mCurrentActionMode;
        if (actionMode == null || AUTO_CANCEL_ACTION_MODE != actionMode.getTag()) {
            return false;
        }
        this.mCurrentActionMode.finish();
        return true;
    }

    public abstract ActivityOptions getActivityLaunchOptions(View view);

    public final Bundle getActivityLaunchOptionsAsBundle(View view) {
        ActivityOptions activityLaunchOptions = getActivityLaunchOptions(view);
        if (activityLaunchOptions == null) {
            return null;
        }
        return activityLaunchOptions.toBundle();
    }

    public abstract BadgeInfo getBadgeInfoForItem(ItemInfo itemInfo);

    public abstract BaseDragLayer getDragLayer();

    public abstract <T extends View> T getOverviewPanel();

    public abstract View getRootView();

    public int getThemeRes(WallpaperColorInfo wallpaperColorInfo) {
        if (wallpaperColorInfo.isDark()) {
            if (wallpaperColorInfo.supportsDarkText()) {
                return 2132083055;
            }
            return com.app.hider.master.promax.R.style.LauncherThemeDark;
        }
        if (wallpaperColorInfo.supportsDarkText()) {
            return 2132083051;
        }
        return com.app.hider.master.promax.R.style.LauncherTheme;
    }

    public Rect getViewBounds(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new Rect(i10, iArr[1], view.getWidth() + i10, view.getHeight() + iArr[1]);
    }

    public abstract void invalidateParent(ItemInfo itemInfo);

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        this.mCurrentActionMode = null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.mCurrentActionMode = actionMode;
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mIsSafeModeEnabled = getPackageManager().isSafeMode();
        this.mRotationListener = new DisplayRotationListener(this, new Runnable() { // from class: com.android.launcher3.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f136903a.onDeviceRotationChanged();
            }
        });
        WallpaperColorInfo wallpaperColorInfo = WallpaperColorInfo.getInstance(this);
        wallpaperColorInfo.addOnChangeListener(this);
        int themeRes = getThemeRes(wallpaperColorInfo);
        if (themeRes != this.mThemeRes) {
            this.mThemeRes = themeRes;
            setTheme(themeRes);
        }
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WallpaperColorInfo.getInstance(this).removeOnChangeListener(this);
        this.mRotationListener.disable();
    }

    public void onDeviceProfileInitiated() {
        if (!this.mDeviceProfile.isVerticalBarLayout()) {
            this.mRotationListener.disable();
        } else {
            this.mRotationListener.enable();
            this.mDeviceProfile.updateIsSeascape(getWindowManager());
        }
    }

    public boolean onErrorStartingShortcut(Intent intent, ItemInfo itemInfo) {
        return false;
    }

    @Override // com.android.launcher3.uioverrides.WallpaperColorInfo.OnChangeListener
    public void onExtractedColorsChanged(WallpaperColorInfo wallpaperColorInfo) {
        if (this.mThemeRes != getThemeRes(wallpaperColorInfo)) {
            recreate();
        }
    }

    @Override // com.android.launcher3.BaseActivity, androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onStart() {
        super.onStart();
        OnStartCallback onStartCallback = this.mOnStartCallback;
        if (onStartCallback != null) {
            onStartCallback.onActivityStart(this);
            this.mOnStartCallback = null;
        }
    }

    public abstract void reapplyUi();

    public <T extends BaseDraggingActivity> void setOnStartCallback(OnStartCallback<T> onStartCallback) {
        this.mOnStartCallback = onStartCallback;
    }

    public boolean startActivitySafely(View view, Intent intent, ItemInfo itemInfo) {
        int i10;
        if (this.mIsSafeModeEnabled && !Utilities.isSystemApp(this, intent)) {
            Toast.makeText(this, com.app.hider.master.promax.R.string.safemode_shortcut_error, 0).show();
            return false;
        }
        Bundle activityLaunchOptionsAsBundle = (view == null || intent.hasExtra(INTENT_EXTRA_IGNORE_LAUNCH_ANIMATION)) ? null : getActivityLaunchOptionsAsBundle(view);
        UserHandle userHandle = itemInfo != null ? itemInfo.user : null;
        intent.addFlags(268435456);
        if (view != null) {
            intent.setSourceBounds(getViewBounds(view));
        }
        try {
            if (Utilities.ATLEAST_MARSHMALLOW && (itemInfo instanceof ShortcutInfo) && (((i10 = itemInfo.itemType) == 1 || i10 == 6) && !((ShortcutInfo) itemInfo).hasStatusFlag(3))) {
                startShortcutIntentSafely(intent, activityLaunchOptionsAsBundle, itemInfo);
            } else if (userHandle == null || userHandle.equals(Process.myUserHandle())) {
                startActivity(intent, activityLaunchOptionsAsBundle);
            } else {
                LauncherAppsCompat.getInstance(this).startActivityForProfile(intent.getComponent(), userHandle, intent.getSourceBounds(), activityLaunchOptionsAsBundle);
            }
            getUserEventDispatcher().logAppLaunch(view, intent);
            return true;
        } catch (ActivityNotFoundException e10) {
            e = e10;
            Toast.makeText(this, com.app.hider.master.promax.R.string.activity_not_found, 0).show();
            Log.e(TAG, "Unable to launch. tag=" + itemInfo + " intent=" + intent, e);
            return false;
        } catch (SecurityException e11) {
            e = e11;
            Toast.makeText(this, com.app.hider.master.promax.R.string.activity_not_found, 0).show();
            Log.e(TAG, "Unable to launch. tag=" + itemInfo + " intent=" + intent, e);
            return false;
        }
    }
}
