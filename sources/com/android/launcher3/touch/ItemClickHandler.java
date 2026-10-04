package com.android.launcher3.touch;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.android.launcher3.AppInfo;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.FolderInfo;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherAppWidgetInfo;
import com.android.launcher3.LauncherAppWidgetProviderInfo;
import com.android.launcher3.PromiseAppInfo;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.compat.AppWidgetManagerCompat;
import com.android.launcher3.extension.ExtensionFactory;
import com.android.launcher3.extension.ItemClickHandlerExtension;
import com.android.launcher3.folder.Folder;
import com.android.launcher3.folder.FolderIcon;
import com.android.launcher3.util.PackageManagerHelper;
import com.android.launcher3.widget.PendingAppWidgetHostView;
import com.android.launcher3.widget.WidgetAddFlowHandler;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class ItemClickHandler {
    public static final View.OnClickListener INSTANCE = new f();
    private static final ItemClickHandlerExtension extension = ExtensionFactory.createItemClickHandlerExtension();

    /* JADX INFO: Access modifiers changed from: private */
    public static void onClick(View view) {
        if (view.getWindowToken() == null) {
            return;
        }
        Launcher launcher = Launcher.getLauncher(view.getContext());
        if (launcher.getWorkspace().isFinishedSwitchingState()) {
            Object tag = view.getTag();
            if (tag instanceof ShortcutInfo) {
                ShortcutInfo shortcutInfo = (ShortcutInfo) tag;
                ItemClickHandlerExtension itemClickHandlerExtension = extension;
                if (itemClickHandlerExtension == null || !itemClickHandlerExtension.onClickShortcutInfo(view, shortcutInfo, launcher)) {
                    onClickAppShortcut(view, shortcutInfo, launcher);
                    return;
                }
                return;
            }
            if (tag instanceof FolderInfo) {
                if (view instanceof FolderIcon) {
                    onClickFolderIcon(view);
                }
            } else {
                if (!(tag instanceof AppInfo)) {
                    if ((tag instanceof LauncherAppWidgetInfo) && (view instanceof PendingAppWidgetHostView)) {
                        onClickPendingWidget((PendingAppWidgetHostView) view, launcher);
                        return;
                    }
                    return;
                }
                AppInfo appInfo = (AppInfo) tag;
                ItemClickHandlerExtension itemClickHandlerExtension2 = extension;
                if (itemClickHandlerExtension2 != null) {
                    itemClickHandlerExtension2.onClickAppInfo(view, appInfo, launcher);
                } else {
                    startAppShortcutOrInfoActivity(view, appInfo, launcher);
                }
            }
        }
    }

    private static void onClickAppShortcut(View view, ShortcutInfo shortcutInfo, Launcher launcher) {
        if (shortcutInfo.isDisabled() && (shortcutInfo.runtimeStatusFlags & 51) != 0) {
            if (!TextUtils.isEmpty(shortcutInfo.disabledMessage)) {
                Toast.makeText(launcher, shortcutInfo.disabledMessage, 0).show();
                return;
            } else {
                int i10 = shortcutInfo.runtimeStatusFlags;
                Toast.makeText(launcher, (i10 & 1) != 0 ? R.string.safemode_shortcut_error : ((i10 & 16) == 0 && (i10 & 32) == 0) ? R.string.activity_not_available : R.string.shortcut_not_available, 0).show();
                return;
            }
        }
        if ((view instanceof BubbleTextView) && shortcutInfo.hasPromiseIconUi()) {
            String packageName = shortcutInfo.intent.getComponent() != null ? shortcutInfo.intent.getComponent().getPackageName() : shortcutInfo.intent.getPackage();
            if (!TextUtils.isEmpty(packageName)) {
                onClickPendingAppItem(view, launcher, packageName, shortcutInfo.hasStatusFlag(4));
                return;
            }
        }
        startAppShortcutOrInfoActivity(view, shortcutInfo, launcher);
    }

    private static void onClickFolderIcon(View view) {
        Folder folder = ((FolderIcon) view).getFolder();
        if (folder.isOpen() || folder.isDestroyed()) {
            return;
        }
        folder.animateOpen();
    }

    private static void onClickPendingAppItem(final View view, final Launcher launcher, final String str, boolean z10) {
        if (z10) {
            startMarketIntentForPackage(view, launcher, str);
        } else {
            new AlertDialog.Builder(launcher).setTitle(R.string.abandoned_promises_title).setMessage(R.string.abandoned_promise_explanation).setPositiveButton(R.string.abandoned_search, new DialogInterface.OnClickListener() { // from class: com.android.launcher3.touch.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ItemClickHandler.startMarketIntentForPackage(view, launcher, str);
                }
            }).setNeutralButton(R.string.abandoned_clean_this, new DialogInterface.OnClickListener() { // from class: com.android.launcher3.touch.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    launcher.getWorkspace().removeAbandonedPromise(str, Process.myUserHandle());
                }
            }).create().show();
        }
    }

    private static void onClickPendingWidget(PendingAppWidgetHostView pendingAppWidgetHostView, Launcher launcher) {
        if (launcher.getPackageManager().isSafeMode()) {
            Toast.makeText(launcher, R.string.safemode_widget_error, 0).show();
            return;
        }
        LauncherAppWidgetInfo launcherAppWidgetInfo = (LauncherAppWidgetInfo) pendingAppWidgetHostView.getTag();
        if (!pendingAppWidgetHostView.isReadyForClickSetup()) {
            onClickPendingAppItem(pendingAppWidgetHostView, launcher, launcherAppWidgetInfo.providerName.getPackageName(), launcherAppWidgetInfo.installProgress >= 0);
            return;
        }
        LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfoFindProvider = AppWidgetManagerCompat.getInstance(launcher).findProvider(launcherAppWidgetInfo.providerName, launcherAppWidgetInfo.user);
        if (launcherAppWidgetProviderInfoFindProvider == null) {
            return;
        }
        WidgetAddFlowHandler widgetAddFlowHandler = new WidgetAddFlowHandler(launcherAppWidgetProviderInfoFindProvider);
        if (!launcherAppWidgetInfo.hasRestoreFlag(1)) {
            widgetAddFlowHandler.startConfigActivity(launcher, launcherAppWidgetInfo, 13);
        } else if (launcherAppWidgetInfo.hasRestoreFlag(16)) {
            widgetAddFlowHandler.startBindFlow(launcher, launcherAppWidgetInfo.appWidgetId, launcherAppWidgetInfo, 12);
        }
    }

    private static void startAppShortcutOrInfoActivity(View view, ItemInfo itemInfo, Launcher launcher) {
        Intent marketIntent = itemInfo instanceof PromiseAppInfo ? ((PromiseAppInfo) itemInfo).getMarketIntent(launcher) : itemInfo.getIntent();
        if (marketIntent == null) {
            throw new IllegalArgumentException("Input must have a valid intent");
        }
        if ((itemInfo instanceof ShortcutInfo) && ((ShortcutInfo) itemInfo).hasStatusFlag(16) && marketIntent.getAction() == "android.intent.action.VIEW") {
            Intent intent = new Intent(marketIntent);
            intent.setPackage(null);
            marketIntent = intent;
        }
        launcher.startActivitySafely(view, marketIntent, itemInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void startMarketIntentForPackage(View view, Launcher launcher, String str) {
        launcher.startActivitySafely(view, new PackageManagerHelper(launcher).getMarketIntent(str), (ItemInfo) view.getTag());
    }
}
