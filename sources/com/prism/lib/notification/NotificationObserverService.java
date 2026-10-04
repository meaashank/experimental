package com.prism.lib.notification;

import android.app.Notification;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import e.T;

/* JADX INFO: loaded from: classes7.dex */
@T(18)
public class NotificationObserverService extends NotificationListenerService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f178725b = l0.b("NotificationObserverService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static NotificationObserverService f178726c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f178727a = false;

    public static NotificationObserverService b() {
        return f178726c;
    }

    public final void a(StatusBarNotification statusBarNotification) {
        I.b(f178725b, "cancelNotificationCompat(id=%d)[2]: %s", Integer.valueOf(statusBarNotification.getId()), statusBarNotification);
        try {
            if (statusBarNotification.isClearable()) {
                cancelNotification(statusBarNotification.getKey());
            } else if (C3841e.s()) {
                snoozeNotification(statusBarNotification.getKey(), Long.MAX_VALUE - System.currentTimeMillis());
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final boolean c(StatusBarNotification statusBarNotification) {
        int id2 = statusBarNotification.getId();
        Notification notification = statusBarNotification.getNotification();
        if (C3841e.s() && e(notification.getChannelId())) {
            a(statusBarNotification);
            return false;
        }
        if (!f(id2) || !getPackageName().equals(statusBarNotification.getPackageName())) {
            return true;
        }
        a(statusBarNotification);
        return false;
    }

    public synchronized boolean d() {
        return this.f178727a;
    }

    public final boolean e(String str) {
        return str != null && str.equals(NotificationCustom.f178719b);
    }

    public final boolean f(int i10) {
        return i10 == 1000 || i10 == 1001;
    }

    public final synchronized void g(boolean z10) {
        this.f178727a = z10;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        g(NotificationCustom.h(this));
        f178726c = this;
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public void onDestroy() {
        f178726c = null;
        super.onDestroy();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerConnected() {
        StatusBarNotification[] activeNotifications;
        I.a(f178725b, "onListenerConnected");
        if (!this.f178727a) {
            g(true);
        }
        try {
            activeNotifications = getActiveNotifications();
        } catch (SecurityException e10) {
            e10.getMessage();
            activeNotifications = null;
        }
        if (activeNotifications != null) {
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                try {
                    c(statusBarNotification);
                } catch (SecurityException e11) {
                    e11.getMessage();
                }
            }
        }
        super.onListenerConnected();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerDisconnected() {
        if (!NotificationCustom.h(this)) {
            g(false);
        }
        super.onListenerDisconnected();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        I.b(f178725b, "onNotificationPosted: %s", statusBarNotification);
        c(statusBarNotification);
        super.onNotificationPosted(statusBarNotification);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        I.b(f178725b, "onNotificationRemoved: %s", statusBarNotification);
        super.onNotificationRemoved(statusBarNotification);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap, int i10) {
        I.b(f178725b, "onNotificationRemoved reason(%d): %s", Integer.valueOf(i10), statusBarNotification);
        super.onNotificationRemoved(statusBarNotification, rankingMap, i10);
    }
}
