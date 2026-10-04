package com.android.launcher3.model;

import android.appwidget.AppWidgetProviderInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.UserHandle;
import com.android.launcher3.InvariantDeviceProfile;
import com.android.launcher3.LauncherAppWidgetProviderInfo;
import com.android.launcher3.Utilities;
import com.android.launcher3.compat.ShortcutConfigActivityInfo;
import com.android.launcher3.util.ComponentKey;
import java.text.Collator;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetItem extends ComponentKey implements Comparable<WidgetItem> {
    private static Collator sCollator;
    private static UserHandle sMyUserHandle;
    public final ShortcutConfigActivityInfo activityInfo;
    public final String label;
    public final int spanX;
    public final int spanY;
    public final LauncherAppWidgetProviderInfo widgetInfo;

    public WidgetItem(LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo, PackageManager packageManager, InvariantDeviceProfile invariantDeviceProfile) {
        super(((AppWidgetProviderInfo) launcherAppWidgetProviderInfo).provider, launcherAppWidgetProviderInfo.getProfile());
        this.label = Utilities.trim(launcherAppWidgetProviderInfo.getLabel(packageManager));
        this.widgetInfo = launcherAppWidgetProviderInfo;
        this.activityInfo = null;
        this.spanX = Math.min(launcherAppWidgetProviderInfo.spanX, invariantDeviceProfile.numColumns);
        this.spanY = Math.min(launcherAppWidgetProviderInfo.spanY, invariantDeviceProfile.numRows);
    }

    @Override // java.lang.Comparable
    public int compareTo(WidgetItem widgetItem) {
        if (sMyUserHandle == null) {
            sMyUserHandle = Process.myUserHandle();
            sCollator = Collator.getInstance();
        }
        boolean zEquals = sMyUserHandle.equals(this.user);
        if ((!zEquals) ^ (!sMyUserHandle.equals(widgetItem.user))) {
            return !zEquals ? 1 : -1;
        }
        int iCompare = sCollator.compare(this.label, widgetItem.label);
        if (iCompare != 0) {
            return iCompare;
        }
        int i10 = this.spanX;
        int i11 = this.spanY;
        int i12 = i10 * i11;
        int i13 = widgetItem.spanX;
        int i14 = widgetItem.spanY;
        int i15 = i13 * i14;
        return i12 == i15 ? Integer.compare(i11, i14) : Integer.compare(i12, i15);
    }

    public WidgetItem(ShortcutConfigActivityInfo shortcutConfigActivityInfo) {
        super(shortcutConfigActivityInfo.getComponent(), shortcutConfigActivityInfo.getUser());
        this.label = Utilities.trim(shortcutConfigActivityInfo.getLabel());
        this.widgetInfo = null;
        this.activityInfo = shortcutConfigActivityInfo;
        this.spanY = 1;
        this.spanX = 1;
    }
}
