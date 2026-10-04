package com.android.launcher3.notification;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationGroup {
    private Set<String> mChildKeys = new HashSet();
    private String mGroupSummaryKey;

    public void addChildKey(String str) {
        this.mChildKeys.add(str);
    }

    public String getGroupSummaryKey() {
        return this.mGroupSummaryKey;
    }

    public boolean isEmpty() {
        return this.mChildKeys.isEmpty();
    }

    public void removeChildKey(String str) {
        this.mChildKeys.remove(str);
    }

    public void setGroupSummaryKey(String str) {
        this.mGroupSummaryKey = str;
    }
}
