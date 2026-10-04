package com.android.launcher3.util;

import android.content.ComponentName;
import android.os.UserHandle;
import com.android.launcher3.FolderInfo;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.LauncherAppWidgetInfo;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.shortcuts.ShortcutKey;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemInfoMatcher {
    public static ItemInfoMatcher not(ItemInfoMatcher itemInfoMatcher) {
        return new ItemInfoMatcher() { // from class: com.android.launcher3.util.ItemInfoMatcher.3
            @Override // com.android.launcher3.util.ItemInfoMatcher
            public boolean matches(ItemInfo itemInfo, ComponentName componentName) {
                return !ItemInfoMatcher.this.matches(itemInfo, componentName);
            }
        };
    }

    public static ItemInfoMatcher ofComponents(final HashSet<ComponentName> hashSet, final UserHandle userHandle) {
        return new ItemInfoMatcher() { // from class: com.android.launcher3.util.ItemInfoMatcher.5
            @Override // com.android.launcher3.util.ItemInfoMatcher
            public boolean matches(ItemInfo itemInfo, ComponentName componentName) {
                return hashSet.contains(componentName) && itemInfo.user.equals(userHandle);
            }
        };
    }

    public static ItemInfoMatcher ofItemIds(final LongArrayMap<Boolean> longArrayMap, final Boolean bool) {
        return new ItemInfoMatcher() { // from class: com.android.launcher3.util.ItemInfoMatcher.9
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.android.launcher3.util.ItemInfoMatcher
            public boolean matches(ItemInfo itemInfo, ComponentName componentName) {
                return ((Boolean) longArrayMap.get(itemInfo.f136873id, bool)).booleanValue();
            }
        };
    }

    public static ItemInfoMatcher ofPackage(final String str) {
        return new ItemInfoMatcher() { // from class: com.android.launcher3.util.ItemInfoMatcher.7
            @Override // com.android.launcher3.util.ItemInfoMatcher
            public boolean matches(ItemInfo itemInfo, ComponentName componentName) {
                return str.equals(componentName.getPackageName());
            }
        };
    }

    public static ItemInfoMatcher ofPackages(final HashSet<String> hashSet, final UserHandle userHandle) {
        return new ItemInfoMatcher() { // from class: com.android.launcher3.util.ItemInfoMatcher.6
            @Override // com.android.launcher3.util.ItemInfoMatcher
            public boolean matches(ItemInfo itemInfo, ComponentName componentName) {
                return hashSet.contains(componentName.getPackageName()) && itemInfo.user.equals(userHandle);
            }
        };
    }

    public static ItemInfoMatcher ofShortcutKeys(final HashSet<ShortcutKey> hashSet) {
        return new ItemInfoMatcher() { // from class: com.android.launcher3.util.ItemInfoMatcher.8
            @Override // com.android.launcher3.util.ItemInfoMatcher
            public boolean matches(ItemInfo itemInfo, ComponentName componentName) {
                return itemInfo.itemType == 6 && hashSet.contains(ShortcutKey.fromIntent(itemInfo.getIntent(), itemInfo.user));
            }
        };
    }

    public static ItemInfoMatcher ofUser(final UserHandle userHandle) {
        return new ItemInfoMatcher() { // from class: com.android.launcher3.util.ItemInfoMatcher.4
            @Override // com.android.launcher3.util.ItemInfoMatcher
            public boolean matches(ItemInfo itemInfo, ComponentName componentName) {
                return itemInfo.user.equals(userHandle);
            }
        };
    }

    public ItemInfoMatcher and(final ItemInfoMatcher itemInfoMatcher) {
        return new ItemInfoMatcher() { // from class: com.android.launcher3.util.ItemInfoMatcher.2
            @Override // com.android.launcher3.util.ItemInfoMatcher
            public boolean matches(ItemInfo itemInfo, ComponentName componentName) {
                return this.matches(itemInfo, componentName) && itemInfoMatcher.matches(itemInfo, componentName);
            }
        };
    }

    public final HashSet<ItemInfo> filterItemInfos(Iterable<ItemInfo> iterable) {
        LauncherAppWidgetInfo launcherAppWidgetInfo;
        ComponentName componentName;
        HashSet<ItemInfo> hashSet = new HashSet<>();
        for (ItemInfo itemInfo : iterable) {
            if (itemInfo instanceof ShortcutInfo) {
                ItemInfo itemInfo2 = (ShortcutInfo) itemInfo;
                ComponentName targetComponent = itemInfo2.getTargetComponent();
                if (targetComponent != null && matches(itemInfo2, targetComponent)) {
                    hashSet.add(itemInfo2);
                }
            } else if (itemInfo instanceof FolderInfo) {
                ArrayList<ShortcutInfo> arrayList = ((FolderInfo) itemInfo).contents;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    ItemInfo itemInfo3 = arrayList.get(i10);
                    i10++;
                    ItemInfo itemInfo4 = (ShortcutInfo) itemInfo3;
                    ComponentName targetComponent2 = itemInfo4.getTargetComponent();
                    if (targetComponent2 != null && matches(itemInfo4, targetComponent2)) {
                        hashSet.add(itemInfo4);
                    }
                }
            } else if ((itemInfo instanceof LauncherAppWidgetInfo) && (componentName = (launcherAppWidgetInfo = (LauncherAppWidgetInfo) itemInfo).providerName) != null && matches(launcherAppWidgetInfo, componentName)) {
                hashSet.add(launcherAppWidgetInfo);
            }
        }
        return hashSet;
    }

    public abstract boolean matches(ItemInfo itemInfo, ComponentName componentName);

    public ItemInfoMatcher or(final ItemInfoMatcher itemInfoMatcher) {
        return new ItemInfoMatcher() { // from class: com.android.launcher3.util.ItemInfoMatcher.1
            @Override // com.android.launcher3.util.ItemInfoMatcher
            public boolean matches(ItemInfo itemInfo, ComponentName componentName) {
                return this.matches(itemInfo, componentName) || itemInfoMatcher.matches(itemInfo, componentName);
            }
        };
    }
}
