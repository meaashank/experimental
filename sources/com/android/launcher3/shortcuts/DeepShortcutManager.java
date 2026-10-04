package com.android.launcher3.shortcuts;

import C0.C0941j;
import a3.i;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.LauncherApps;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.UserHandle;
import android.util.Log;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Utilities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DeepShortcutManager {
    private static final int FLAG_GET_ALL = 11;
    private static final String TAG = "DeepShortcutManager";
    private static DeepShortcutManager sInstance;
    private static final Object sInstanceLock = new Object();
    private final LauncherApps mLauncherApps;
    private boolean mWasLastCallSuccess;

    private DeepShortcutManager(Context context) {
        this.mLauncherApps = (LauncherApps) context.getSystemService("launcherapps");
    }

    private List<String> extractIds(List<ShortcutInfoCompat> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfoCompat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getId());
        }
        return arrayList;
    }

    public static DeepShortcutManager getInstance(Context context) {
        DeepShortcutManager deepShortcutManager;
        synchronized (sInstanceLock) {
            try {
                if (sInstance == null) {
                    sInstance = new DeepShortcutManager(context.getApplicationContext());
                }
                deepShortcutManager = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return deepShortcutManager;
    }

    @TargetApi(25)
    private List<ShortcutInfoCompat> query(int i10, String str, ComponentName componentName, List<String> list, UserHandle userHandle) {
        if (!Utilities.ATLEAST_NOUGAT_MR1) {
            return Collections.EMPTY_LIST;
        }
        LauncherApps.ShortcutQuery shortcutQueryA = i.a();
        shortcutQueryA.setQueryFlags(i10);
        if (str != null) {
            shortcutQueryA.setPackage(str);
            shortcutQueryA.setActivity(componentName);
            shortcutQueryA.setShortcutIds(list);
        }
        List shortcuts = null;
        try {
            shortcuts = this.mLauncherApps.getShortcuts(shortcutQueryA, userHandle);
            this.mWasLastCallSuccess = true;
        } catch (IllegalStateException | SecurityException e10) {
            Log.e(TAG, "Failed to query for shortcuts", e10);
            this.mWasLastCallSuccess = false;
        }
        if (shortcuts == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(shortcuts.size());
        Iterator it = shortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new ShortcutInfoCompat(C0941j.a(it.next())));
        }
        return arrayList;
    }

    public static boolean supportsShortcuts(ItemInfo itemInfo) {
        return false;
    }

    @TargetApi(25)
    public Drawable getShortcutIconDrawable(ShortcutInfoCompat shortcutInfoCompat, int i10) {
        if (!Utilities.ATLEAST_NOUGAT_MR1) {
            return null;
        }
        try {
            Drawable shortcutIconDrawable = this.mLauncherApps.getShortcutIconDrawable(shortcutInfoCompat.getShortcutInfo(), i10);
            this.mWasLastCallSuccess = true;
            return shortcutIconDrawable;
        } catch (IllegalStateException | SecurityException e10) {
            Log.e(TAG, "Failed to get shortcut icon", e10);
            this.mWasLastCallSuccess = false;
            return null;
        }
    }

    @TargetApi(25)
    public boolean hasHostPermission() {
        if (!Utilities.ATLEAST_NOUGAT_MR1) {
            return false;
        }
        try {
            return this.mLauncherApps.hasShortcutHostPermission();
        } catch (IllegalStateException | SecurityException e10) {
            Log.e(TAG, "Failed to make shortcut manager call", e10);
            return false;
        }
    }

    public void onShortcutsChanged(List<ShortcutInfoCompat> list) {
    }

    @TargetApi(25)
    public void pinShortcut(ShortcutKey shortcutKey) {
        if (Utilities.ATLEAST_NOUGAT_MR1) {
            String packageName = shortcutKey.componentName.getPackageName();
            String id2 = shortcutKey.getId();
            UserHandle userHandle = shortcutKey.user;
            List<String> listExtractIds = extractIds(queryForPinnedShortcuts(packageName, userHandle));
            listExtractIds.add(id2);
            try {
                this.mLauncherApps.pinShortcuts(packageName, listExtractIds, userHandle);
                this.mWasLastCallSuccess = true;
            } catch (IllegalStateException | SecurityException e10) {
                Log.w(TAG, "Failed to pin shortcut", e10);
                this.mWasLastCallSuccess = false;
            }
        }
    }

    public List<ShortcutInfoCompat> queryForAllShortcuts(UserHandle userHandle) {
        return query(11, null, null, null, userHandle);
    }

    public List<ShortcutInfoCompat> queryForFullDetails(String str, List<String> list, UserHandle userHandle) {
        return query(11, str, null, list, userHandle);
    }

    public List<ShortcutInfoCompat> queryForPinnedShortcuts(String str, UserHandle userHandle) {
        return query(2, str, null, null, userHandle);
    }

    public List<ShortcutInfoCompat> queryForShortcutsContainer(ComponentName componentName, List<String> list, UserHandle userHandle) {
        return query(9, componentName.getPackageName(), componentName, list, userHandle);
    }

    @TargetApi(25)
    public void startShortcut(String str, String str2, Rect rect, Bundle bundle, UserHandle userHandle) {
        if (Utilities.ATLEAST_NOUGAT_MR1) {
            try {
                this.mLauncherApps.startShortcut(str, str2, rect, bundle, userHandle);
                this.mWasLastCallSuccess = true;
            } catch (IllegalStateException | SecurityException e10) {
                Log.e(TAG, "Failed to start shortcut", e10);
                this.mWasLastCallSuccess = false;
            }
        }
    }

    @TargetApi(25)
    public void unpinShortcut(ShortcutKey shortcutKey) {
        if (Utilities.ATLEAST_NOUGAT_MR1) {
            String packageName = shortcutKey.componentName.getPackageName();
            String id2 = shortcutKey.getId();
            UserHandle userHandle = shortcutKey.user;
            List<String> listExtractIds = extractIds(queryForPinnedShortcuts(packageName, userHandle));
            listExtractIds.remove(id2);
            try {
                this.mLauncherApps.pinShortcuts(packageName, listExtractIds, userHandle);
                this.mWasLastCallSuccess = true;
            } catch (IllegalStateException | SecurityException e10) {
                Log.w(TAG, "Failed to unpin shortcut", e10);
                this.mWasLastCallSuccess = false;
            }
        }
    }

    public boolean wasLastCallSuccess() {
        return this.mWasLastCallSuccess;
    }
}
