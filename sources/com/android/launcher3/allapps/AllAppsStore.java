package com.android.launcher3.allapps;

import android.view.View;
import android.view.ViewGroup;
import com.android.launcher3.AppInfo;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.PromiseAppInfo;
import com.android.launcher3.util.ComponentKey;
import com.android.launcher3.util.PackageUserKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class AllAppsStore {
    private PackageUserKey mTempKey = new PackageUserKey(null, null);
    private final HashMap<ComponentKey, AppInfo> mComponentToAppMap = new HashMap<>();
    private final List<OnUpdateListener> mUpdateListeners = new ArrayList();
    private final ArrayList<ViewGroup> mIconContainers = new ArrayList<>();
    private boolean mDeferUpdates = false;
    private boolean mUpdatePending = false;

    public interface IconAction {
        void apply(BubbleTextView bubbleTextView);
    }

    public interface OnUpdateListener {
        void onAppsUpdated();
    }

    public static /* synthetic */ void b(PromiseAppInfo promiseAppInfo, BubbleTextView bubbleTextView) {
        if (bubbleTextView.getTag() == promiseAppInfo) {
            bubbleTextView.applyProgressLevel(promiseAppInfo.level);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateIconBadges$0(Set set, BubbleTextView bubbleTextView) {
        if (bubbleTextView.getTag() instanceof ItemInfo) {
            ItemInfo itemInfo = (ItemInfo) bubbleTextView.getTag();
            if (this.mTempKey.updateFromItemInfo(itemInfo) && set.contains(this.mTempKey)) {
                bubbleTextView.applyBadgeState(itemInfo, true);
            }
        }
    }

    private void notifyUpdate() {
        if (this.mDeferUpdates) {
            this.mUpdatePending = true;
            return;
        }
        int size = this.mUpdateListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mUpdateListeners.get(i10).onAppsUpdated();
        }
    }

    private void updateAllIcons(IconAction iconAction) {
        for (int size = this.mIconContainers.size() - 1; size >= 0; size--) {
            ViewGroup viewGroup = this.mIconContainers.get(size);
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof BubbleTextView) {
                    iconAction.apply((BubbleTextView) childAt);
                }
            }
        }
    }

    public void addOrUpdateApps(List<AppInfo> list) {
        for (AppInfo appInfo : list) {
            this.mComponentToAppMap.put(appInfo.toComponentKey(), appInfo);
        }
        notifyUpdate();
    }

    public void addUpdateListener(OnUpdateListener onUpdateListener) {
        this.mUpdateListeners.add(onUpdateListener);
    }

    public AppInfo getApp(ComponentKey componentKey) {
        return this.mComponentToAppMap.get(componentKey);
    }

    public Collection<AppInfo> getApps() {
        return this.mComponentToAppMap.values();
    }

    public void registerIconContainer(ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.mIconContainers.add(viewGroup);
        }
    }

    public void removeApps(List<AppInfo> list) {
        Iterator<AppInfo> it = list.iterator();
        while (it.hasNext()) {
            this.mComponentToAppMap.remove(it.next().toComponentKey());
        }
        notifyUpdate();
    }

    public void removeUpdateListener(OnUpdateListener onUpdateListener) {
        this.mUpdateListeners.remove(onUpdateListener);
    }

    public void setApps(List<AppInfo> list) {
        this.mComponentToAppMap.clear();
        addOrUpdateApps(list);
    }

    public void setDeferUpdates(boolean z10) {
        if (this.mDeferUpdates != z10) {
            this.mDeferUpdates = z10;
            if (z10 || !this.mUpdatePending) {
                return;
            }
            notifyUpdate();
            this.mUpdatePending = false;
        }
    }

    public void unregisterIconContainer(ViewGroup viewGroup) {
        this.mIconContainers.remove(viewGroup);
    }

    public void updateIconBadges(final Set<PackageUserKey> set) {
        updateAllIcons(new IconAction() { // from class: com.android.launcher3.allapps.i
            @Override // com.android.launcher3.allapps.AllAppsStore.IconAction
            public final void apply(BubbleTextView bubbleTextView) {
                this.f136895a.lambda$updateIconBadges$0(set, bubbleTextView);
            }
        });
    }

    public void updatePromiseAppProgress(final PromiseAppInfo promiseAppInfo) {
        updateAllIcons(new IconAction() { // from class: com.android.launcher3.allapps.h
            @Override // com.android.launcher3.allapps.AllAppsStore.IconAction
            public final void apply(BubbleTextView bubbleTextView) {
                AllAppsStore.b(promiseAppInfo, bubbleTextView);
            }
        });
    }
}
