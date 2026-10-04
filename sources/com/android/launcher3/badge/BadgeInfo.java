package com.android.launcher3.badge;

import com.android.launcher3.notification.NotificationKeyData;
import com.android.launcher3.util.PackageUserKey;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BadgeInfo {
    public static final int MAX_COUNT = 999;
    private List<NotificationKeyData> mNotificationKeys = new ArrayList();
    private PackageUserKey mPackageUserKey;
    private int mTotalCount;

    public BadgeInfo(PackageUserKey packageUserKey) {
        this.mPackageUserKey = packageUserKey;
    }

    public boolean addOrUpdateNotificationKey(NotificationKeyData notificationKeyData) {
        int iIndexOf = this.mNotificationKeys.indexOf(notificationKeyData);
        NotificationKeyData notificationKeyData2 = iIndexOf == -1 ? null : this.mNotificationKeys.get(iIndexOf);
        if (notificationKeyData2 == null) {
            boolean zAdd = this.mNotificationKeys.add(notificationKeyData);
            if (zAdd) {
                this.mTotalCount += notificationKeyData.count;
            }
            return zAdd;
        }
        int i10 = notificationKeyData2.count;
        int i11 = notificationKeyData.count;
        if (i10 == i11) {
            return false;
        }
        this.mTotalCount = (this.mTotalCount - i10) + i11;
        notificationKeyData2.count = i11;
        return true;
    }

    public int getNotificationDisplayCount() {
        return Math.min(this.mTotalCount, 999);
    }

    public List<NotificationKeyData> getNotificationKeys() {
        return this.mNotificationKeys;
    }

    public int getNotificationRealCount() {
        return this.mTotalCount;
    }

    public boolean removeNotificationKey(NotificationKeyData notificationKeyData) {
        boolean zRemove = this.mNotificationKeys.remove(notificationKeyData);
        if (zRemove) {
            this.mTotalCount -= notificationKeyData.count;
        }
        return zRemove;
    }

    public boolean shouldBeInvalidated(BadgeInfo badgeInfo) {
        return this.mPackageUserKey.equals(badgeInfo.mPackageUserKey) && getNotificationDisplayCount() != badgeInfo.getNotificationDisplayCount();
    }
}
