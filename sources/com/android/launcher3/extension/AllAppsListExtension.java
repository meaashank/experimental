package com.android.launcher3.extension;

import android.content.pm.LauncherActivityInfo;
import com.android.launcher3.AppInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface AllAppsListExtension {
    void onAdd(AppInfo appInfo, LauncherActivityInfo launcherActivityInfo);

    void onClear();

    void onRemovePackage(String str);
}
