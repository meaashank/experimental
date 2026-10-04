package com.android.launcher3.extension;

import android.view.View;
import com.android.launcher3.AppInfo;
import com.android.launcher3.ShortcutInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface OnDropExtension {
    void onDrop();

    AppInfo prepareAppInfo(AppInfo appInfo);

    ShortcutInfo prepareShortcutInfo(ShortcutInfo shortcutInfo);

    View prepareShortcutView(View view);
}
