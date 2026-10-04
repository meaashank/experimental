package com.android.launcher3.extension;

import android.content.Intent;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.model.LoaderCursor;

/* JADX INFO: loaded from: classes2.dex */
public interface LoaderTaskExtension {
    ShortcutInfo createExtensionShortcut(LoaderCursor loaderCursor, Intent intent);

    boolean isValidExtensionPkg(String str);
}
