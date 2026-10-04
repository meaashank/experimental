package com.android.launcher3;

import android.content.Context;
import android.content.pm.LauncherActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class IconProvider {
    protected String mSystemState;

    public static IconProvider newInstance(Context context) {
        IconProvider iconProvider = (IconProvider) Utilities.getOverrideObject(IconProvider.class, context, com.app.hider.master.promax.R.string.icon_provider_class);
        iconProvider.updateSystemStateString(context);
        return iconProvider;
    }

    public Drawable getIcon(LauncherActivityInfo launcherActivityInfo, int i10, boolean z10) {
        return launcherActivityInfo.getIcon(i10);
    }

    public String getIconSystemState(String str) {
        return this.mSystemState;
    }

    public void updateSystemStateString(Context context) {
        StringBuilder sbA = android.support.v4.media.f.a(Utilities.ATLEAST_NOUGAT ? context.getResources().getConfiguration().getLocales().toLanguageTags() : Locale.getDefault().toString(), ",");
        sbA.append(Build.VERSION.SDK_INT);
        this.mSystemState = sbA.toString();
    }
}
