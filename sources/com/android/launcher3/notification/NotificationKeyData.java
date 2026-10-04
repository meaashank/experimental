package com.android.launcher3.notification;

import android.app.Notification;
import android.service.notification.StatusBarNotification;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationKeyData {
    public int count;
    public final String notificationKey;
    public final String shortcutId;

    public NotificationKeyData(String str, String str2, int i10) {
        this.notificationKey = str;
        this.shortcutId = str2;
        this.count = Math.max(1, i10);
    }

    public static List<String> extractKeysOnly(@NonNull List<NotificationKeyData> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<NotificationKeyData> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().notificationKey);
        }
        return arrayList;
    }

    public static NotificationKeyData fromNotification(StatusBarNotification statusBarNotification) {
        Notification notification = statusBarNotification.getNotification();
        return new NotificationKeyData(statusBarNotification.getKey(), notification.getShortcutId(), notification.number);
    }

    public boolean equals(Object obj) {
        if (obj instanceof NotificationKeyData) {
            return ((NotificationKeyData) obj).notificationKey.equals(this.notificationKey);
        }
        return false;
    }
}
