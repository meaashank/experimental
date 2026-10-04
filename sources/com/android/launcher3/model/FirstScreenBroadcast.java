package com.android.launcher3.model;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.util.Log;
import com.android.launcher3.FolderInfo;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.LauncherAppWidgetInfo;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.util.MultiHashMap;
import com.prism.commons.utils.C3836a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class FirstScreenBroadcast {
    private static final String ACTION_FIRST_SCREEN_ACTIVE_INSTALLS = "com.android.launcher3.action.FIRST_SCREEN_ACTIVE_INSTALLS";
    private static final boolean DEBUG = false;
    private static final String FOLDER_ITEM_EXTRA = "folderItem";
    private static final String HOTSEAT_ITEM_EXTRA = "hotseatItem";
    private static final String TAG = "FirstScreenBroadcast";
    private static final String VERIFICATION_TOKEN_EXTRA = "verificationToken";
    private static final String WIDGET_ITEM_EXTRA = "widgetItem";
    private static final String WORKSPACE_ITEM_EXTRA = "workspaceItem";
    private final MultiHashMap<String, String> mPackagesForInstaller;

    public FirstScreenBroadcast(HashMap<String, PackageInstaller.SessionInfo> map) {
        this.mPackagesForInstaller = getPackagesForInstaller(map);
    }

    private static String getPackageName(ItemInfo itemInfo) {
        if (!(itemInfo instanceof LauncherAppWidgetInfo)) {
            if (itemInfo.getTargetComponent() != null) {
                return itemInfo.getTargetComponent().getPackageName();
            }
            return null;
        }
        ComponentName componentName = ((LauncherAppWidgetInfo) itemInfo).providerName;
        if (componentName != null) {
            return componentName.getPackageName();
        }
        return null;
    }

    private MultiHashMap<String, String> getPackagesForInstaller(HashMap<String, PackageInstaller.SessionInfo> map) {
        MultiHashMap<String, String> multiHashMap = new MultiHashMap<>();
        for (Map.Entry<String, PackageInstaller.SessionInfo> entry : map.entrySet()) {
            multiHashMap.addToList(entry.getValue().getInstallerPackageName(), entry.getKey());
        }
        return multiHashMap;
    }

    private static void printList(String str, String str2, Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            Log.d(TAG, str + com.prism.gaia.server.accounts.b.f166434b0 + str2 + com.prism.gaia.server.accounts.b.f166434b0 + it.next());
        }
    }

    private void sendBroadcastToInstaller(Context context, String str, List<String> list, List<ItemInfo> list2) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        Iterator<ItemInfo> it = list2.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                context.sendBroadcast(new Intent(ACTION_FIRST_SCREEN_ACTIVE_INSTALLS).setPackage(str).putStringArrayListExtra(FOLDER_ITEM_EXTRA, new ArrayList<>(hashSet)).putStringArrayListExtra(WORKSPACE_ITEM_EXTRA, new ArrayList<>(hashSet2)).putStringArrayListExtra(HOTSEAT_ITEM_EXTRA, new ArrayList<>(hashSet3)).putStringArrayListExtra(WIDGET_ITEM_EXTRA, new ArrayList<>(hashSet4)).putExtra(VERIFICATION_TOKEN_EXTRA, PendingIntent.getActivity(context, 0, new Intent(), C3836a.b.a(1140850688))));
                return;
            }
            ItemInfo next = it.next();
            if (next instanceof FolderInfo) {
                ArrayList<ShortcutInfo> arrayList = ((FolderInfo) next).contents;
                int size = arrayList.size();
                while (i10 < size) {
                    ShortcutInfo shortcutInfo = arrayList.get(i10);
                    i10++;
                    String packageName = getPackageName(shortcutInfo);
                    if (packageName != null && list.contains(packageName)) {
                        hashSet.add(packageName);
                    }
                }
            }
            String packageName2 = getPackageName(next);
            if (packageName2 != null && list.contains(packageName2)) {
                if (next instanceof LauncherAppWidgetInfo) {
                    hashSet4.add(packageName2);
                } else {
                    long j10 = next.container;
                    if (j10 == -101) {
                        hashSet3.add(packageName2);
                    } else if (j10 == -100) {
                        hashSet2.add(packageName2);
                    }
                }
            }
        }
    }

    public void sendBroadcasts(Context context, List<ItemInfo> list) {
        for (Map.Entry<String, String> entry : this.mPackagesForInstaller.entrySet()) {
            sendBroadcastToInstaller(context, entry.getKey(), (List) entry.getValue(), list);
        }
    }
}
