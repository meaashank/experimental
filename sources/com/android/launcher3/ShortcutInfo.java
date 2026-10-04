package com.android.launcher3;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.launcher3.LauncherSettings;
import com.android.launcher3.compat.UserManagerCompat;
import com.android.launcher3.shortcuts.ShortcutInfoCompat;
import com.android.launcher3.util.ContentWriter;

/* JADX INFO: loaded from: classes2.dex */
public class ShortcutInfo extends ItemInfoWithIcon {
    public static final int DEFAULT = 0;
    private static final String EXTRA_VUSER_ID = "_guest_vuserId";
    public static final int FLAG_AUTOINSTALL_ICON = 2;
    public static final int FLAG_INSTALL_SESSION_ACTIVE = 4;
    public static final int FLAG_RESTORED_ICON = 1;
    public static final int FLAG_RESTORE_STARTED = 8;
    public static final int FLAG_SUPPORTS_WEB_UI = 16;
    public CharSequence disabledMessage;
    public Intent.ShortcutIconResource iconResource;
    public Intent intent;
    private int mInstallProgress;
    public int status;

    public ShortcutInfo() {
        this.itemType = 1;
    }

    public String getDeepShortcutId() {
        if (this.itemType == 6) {
            return getIntent().getStringExtra(ShortcutInfoCompat.EXTRA_SHORTCUT_ID);
        }
        return null;
    }

    public int getInstallProgress() {
        return this.mInstallProgress;
    }

    @Override // com.android.launcher3.ItemInfo
    public Intent getIntent() {
        return this.intent;
    }

    @Override // com.android.launcher3.ItemInfo
    public ComponentName getTargetComponent() {
        ComponentName targetComponent = super.getTargetComponent();
        if (targetComponent != null || (this.itemType != 1 && !hasStatusFlag(16))) {
            return targetComponent;
        }
        String str = this.intent.getPackage();
        if (str == null) {
            return null;
        }
        return new ComponentName(str, IconCache.EMPTY_CLASS_NAME);
    }

    public int getVuserId() {
        return this.intent.getIntExtra(EXTRA_VUSER_ID, 0);
    }

    public boolean hasPromiseIconUi() {
        return hasStatusFlag(3) && !hasStatusFlag(16);
    }

    public boolean hasStatusFlag(int i10) {
        return (i10 & this.status) != 0;
    }

    public final boolean isPromise() {
        return hasStatusFlag(3);
    }

    @Override // com.android.launcher3.ItemInfo
    public void onAddToDatabase(ContentWriter contentWriter) {
        super.onAddToDatabase(contentWriter);
        contentWriter.put("title", this.title).put("intent", getIntent()).put(LauncherSettings.Favorites.RESTORED, Integer.valueOf(this.status));
        if (!this.usingLowResIcon) {
            contentWriter.putIcon(this.iconBitmap, this.user);
        }
        Intent.ShortcutIconResource shortcutIconResource = this.iconResource;
        if (shortcutIconResource != null) {
            contentWriter.put(LauncherSettings.BaseLauncherColumns.ICON_PACKAGE, shortcutIconResource.packageName).put(LauncherSettings.BaseLauncherColumns.ICON_RESOURCE, this.iconResource.resourceName);
        }
    }

    public void setInstallProgress(int i10) {
        this.mInstallProgress = i10;
        this.status |= 4;
    }

    public void setVuserId(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.intent.putExtra(EXTRA_VUSER_ID, i10);
    }

    public void updateFromDeepShortcutInfo(ShortcutInfoCompat shortcutInfoCompat, Context context) {
        this.intent = shortcutInfoCompat.makeIntent();
        this.title = shortcutInfoCompat.getShortLabel();
        CharSequence longLabel = shortcutInfoCompat.getLongLabel();
        if (TextUtils.isEmpty(longLabel)) {
            longLabel = shortcutInfoCompat.getShortLabel();
        }
        this.contentDescription = UserManagerCompat.getInstance(context).getBadgedLabelForUser(longLabel, this.user);
        if (shortcutInfoCompat.isEnabled()) {
            this.runtimeStatusFlags &= -17;
        } else {
            this.runtimeStatusFlags |= 16;
        }
        this.disabledMessage = shortcutInfoCompat.getDisabledMessage();
    }

    public ShortcutInfo(ShortcutInfo shortcutInfo) {
        super(shortcutInfo);
        this.title = shortcutInfo.title;
        this.intent = new Intent(shortcutInfo.intent);
        this.iconResource = shortcutInfo.iconResource;
        this.status = shortcutInfo.status;
        this.mInstallProgress = shortcutInfo.mInstallProgress;
    }

    public ShortcutInfo(AppInfo appInfo) {
        super(appInfo);
        this.title = Utilities.trim(appInfo.title);
        this.intent = new Intent(appInfo.intent);
    }

    @TargetApi(24)
    public ShortcutInfo(ShortcutInfoCompat shortcutInfoCompat, Context context) {
        this.user = shortcutInfoCompat.getUserHandle();
        this.itemType = 6;
        updateFromDeepShortcutInfo(shortcutInfoCompat, context);
    }
}
