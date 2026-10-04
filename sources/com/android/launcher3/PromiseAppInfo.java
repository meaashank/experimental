package com.android.launcher3;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.android.launcher3.compat.PackageInstallerCompat;
import com.android.launcher3.util.PackageManagerHelper;

/* JADX INFO: loaded from: classes2.dex */
public class PromiseAppInfo extends AppInfo {
    public int level;

    public PromiseAppInfo(@NonNull PackageInstallerCompat.PackageInstallInfo packageInstallInfo) {
        this.level = 0;
        this.componentName = packageInstallInfo.componentName;
        this.intent = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setComponent(this.componentName).setFlags(270532608);
    }

    public Intent getMarketIntent(Context context) {
        return new PackageManagerHelper(context).getMarketIntent(this.componentName.getPackageName());
    }

    @Override // com.android.launcher3.AppInfo
    public ShortcutInfo makeShortcut() {
        ShortcutInfo shortcutInfo = new ShortcutInfo(this);
        shortcutInfo.setInstallProgress(this.level);
        shortcutInfo.status |= 10;
        return shortcutInfo;
    }

    public PromiseAppInfo(AppInfo appInfo) {
        super(appInfo);
        this.level = 0;
    }
}
