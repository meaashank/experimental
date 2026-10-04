package com.android.launcher3.badge;

import com.android.launcher3.Utilities;

/* JADX INFO: loaded from: classes2.dex */
public class FolderBadgeInfo extends BadgeInfo {
    private static final int MIN_COUNT = 0;
    private int mNumNotifications;

    public FolderBadgeInfo() {
        super(null);
    }

    public void addBadgeInfo(BadgeInfo badgeInfo) {
        if (badgeInfo == null) {
            return;
        }
        int size = badgeInfo.getNotificationKeys().size() + this.mNumNotifications;
        this.mNumNotifications = size;
        this.mNumNotifications = Utilities.boundToRange(size, 0, 999);
    }

    @Override // com.android.launcher3.badge.BadgeInfo
    public int getNotificationDisplayCount() {
        return 0;
    }

    public boolean hasBadge() {
        return this.mNumNotifications > 0;
    }

    public void subtractBadgeInfo(BadgeInfo badgeInfo) {
        if (badgeInfo == null) {
            return;
        }
        int size = this.mNumNotifications - badgeInfo.getNotificationKeys().size();
        this.mNumNotifications = size;
        this.mNumNotifications = Utilities.boundToRange(size, 0, 999);
    }
}
