package com.android.launcher3.notification;

import android.annotation.TargetApi;
import android.app.Notification;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.ArraySet;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationChannelCompat;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.SettingsActivity;
import com.android.launcher3.util.PackageUserKey;
import com.android.launcher3.util.SettingsObserver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(26)
public class NotificationListener extends NotificationListenerService {
    private static final int MSG_NOTIFICATION_FULL_REFRESH = 3;
    private static final int MSG_NOTIFICATION_POSTED = 1;
    private static final int MSG_NOTIFICATION_REMOVED = 2;
    public static final String TAG = "NotificationListener";
    private static boolean sIsConnected;
    private static boolean sIsCreated;
    private static NotificationListener sNotificationListenerInstance;
    private static NotificationsChangedListener sNotificationsChangedListener;
    private static StatusBarNotificationsChangedListener sStatusBarNotificationsChangedListener;
    private String mLastKeyDismissedByLauncher;
    private SettingsObserver mNotificationBadgingObserver;
    private final Handler.Callback mUiCallback;
    private final Handler mUiHandler;
    private final Handler.Callback mWorkerCallback;
    private final Handler mWorkerHandler;
    private final NotificationListenerService.Ranking mTempRanking = new NotificationListenerService.Ranking();
    private final Map<String, NotificationGroup> mNotificationGroupMap = new HashMap();
    private final Map<String, String> mNotificationGroupKeyMap = new HashMap();

    public class NotificationPostedMsg {
        final NotificationKeyData notificationKey;
        final PackageUserKey packageUserKey;
        final boolean shouldBeFilteredOut;

        public NotificationPostedMsg(StatusBarNotification statusBarNotification) {
            this.packageUserKey = PackageUserKey.fromNotification(statusBarNotification);
            this.notificationKey = NotificationKeyData.fromNotification(statusBarNotification);
            this.shouldBeFilteredOut = NotificationListener.this.shouldBeFilteredOut(statusBarNotification);
        }
    }

    public interface NotificationsChangedListener {
        void onNotificationFullRefresh(List<StatusBarNotification> list);

        void onNotificationPosted(PackageUserKey packageUserKey, NotificationKeyData notificationKeyData, boolean z10);

        void onNotificationRemoved(PackageUserKey packageUserKey, NotificationKeyData notificationKeyData);
    }

    public interface StatusBarNotificationsChangedListener {
        void onNotificationPosted(StatusBarNotification statusBarNotification);

        void onNotificationRemoved(StatusBarNotification statusBarNotification);
    }

    public NotificationListener() {
        Handler.Callback callback = new Handler.Callback() { // from class: com.android.launcher3.notification.NotificationListener.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                Object arrayList;
                int i10 = message.what;
                if (i10 == 1 || i10 == 2) {
                    NotificationListener.this.mUiHandler.obtainMessage(message.what, message.obj).sendToTarget();
                } else if (i10 == 3) {
                    if (NotificationListener.sIsConnected) {
                        try {
                            NotificationListener notificationListener = NotificationListener.this;
                            arrayList = notificationListener.filterNotifications(notificationListener.getActiveNotifications());
                        } catch (SecurityException unused) {
                            Log.e(NotificationListener.TAG, "SecurityException: failed to fetch notifications");
                            arrayList = new ArrayList();
                        }
                    } else {
                        arrayList = new ArrayList();
                    }
                    NotificationListener.this.mUiHandler.obtainMessage(message.what, arrayList).sendToTarget();
                }
                return true;
            }
        };
        this.mWorkerCallback = callback;
        Handler.Callback callback2 = new Handler.Callback() { // from class: com.android.launcher3.notification.NotificationListener.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3 && NotificationListener.sNotificationsChangedListener != null) {
                            NotificationListener.sNotificationsChangedListener.onNotificationFullRefresh((List) message.obj);
                        }
                    } else if (NotificationListener.sNotificationsChangedListener != null) {
                        Pair pair = (Pair) message.obj;
                        NotificationListener.sNotificationsChangedListener.onNotificationRemoved((PackageUserKey) pair.first, (NotificationKeyData) pair.second);
                    }
                } else if (NotificationListener.sNotificationsChangedListener != null) {
                    NotificationPostedMsg notificationPostedMsg = (NotificationPostedMsg) message.obj;
                    NotificationListener.sNotificationsChangedListener.onNotificationPosted(notificationPostedMsg.packageUserKey, notificationPostedMsg.notificationKey, notificationPostedMsg.shouldBeFilteredOut);
                }
                return true;
            }
        };
        this.mUiCallback = callback2;
        this.mWorkerHandler = new Handler(LauncherModel.getWorkerLooper(), callback);
        this.mUiHandler = new Handler(Looper.getMainLooper(), callback2);
        sNotificationListenerInstance = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<StatusBarNotification> filterNotifications(StatusBarNotification[] statusBarNotificationArr) {
        if (statusBarNotificationArr == null) {
            return null;
        }
        ArraySet arraySet = new ArraySet();
        for (int i10 = 0; i10 < statusBarNotificationArr.length; i10++) {
            if (shouldBeFilteredOut(statusBarNotificationArr[i10])) {
                arraySet.add(Integer.valueOf(i10));
            }
        }
        ArrayList arrayList = new ArrayList(statusBarNotificationArr.length - arraySet.size());
        for (int i11 = 0; i11 < statusBarNotificationArr.length; i11++) {
            if (!arraySet.contains(Integer.valueOf(i11))) {
                arrayList.add(statusBarNotificationArr[i11]);
            }
        }
        return arrayList;
    }

    @Nullable
    public static NotificationListener getInstanceIfConnected() {
        if (sIsConnected) {
            return sNotificationListenerInstance;
        }
        return null;
    }

    private void onNotificationFullRefresh() {
        this.mWorkerHandler.obtainMessage(3).sendToTarget();
    }

    public static void removeNotificationsChangedListener() {
        sNotificationsChangedListener = null;
    }

    public static void removeStatusBarNotificationsChangedListener() {
        sStatusBarNotificationsChangedListener = null;
    }

    public static void setNotificationsChangedListener(NotificationsChangedListener notificationsChangedListener) {
        NotificationsChangedListener notificationsChangedListener2;
        sNotificationsChangedListener = notificationsChangedListener;
        NotificationListener instanceIfConnected = getInstanceIfConnected();
        if (instanceIfConnected != null) {
            instanceIfConnected.onNotificationFullRefresh();
        } else {
            if (sIsCreated || (notificationsChangedListener2 = sNotificationsChangedListener) == null) {
                return;
            }
            notificationsChangedListener2.onNotificationFullRefresh(Collections.EMPTY_LIST);
        }
    }

    public static void setStatusBarNotificationsChangedListener(StatusBarNotificationsChangedListener statusBarNotificationsChangedListener) {
        sStatusBarNotificationsChangedListener = statusBarNotificationsChangedListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldBeFilteredOut(StatusBarNotification statusBarNotification) {
        Notification notification = statusBarNotification.getNotification();
        updateGroupKeyIfNecessary(statusBarNotification);
        getCurrentRanking().getRanking(statusBarNotification.getKey(), this.mTempRanking);
        if (!this.mTempRanking.canShowBadge()) {
            return true;
        }
        if (!this.mTempRanking.getChannel().getId().equals(NotificationChannelCompat.f110732s) || (notification.flags & 2) == 0) {
            return (notification.flags & 512) != 0 || (TextUtils.isEmpty(notification.extras.getCharSequence("android.title")) && TextUtils.isEmpty(notification.extras.getCharSequence("android.text")));
        }
        return true;
    }

    private void updateGroupKeyIfNecessary(StatusBarNotification statusBarNotification) {
        String key = statusBarNotification.getKey();
        String str = this.mNotificationGroupKeyMap.get(key);
        String groupKey = statusBarNotification.getGroupKey();
        if (str == null || !str.equals(groupKey)) {
            this.mNotificationGroupKeyMap.put(key, groupKey);
            if (str != null && this.mNotificationGroupMap.containsKey(str)) {
                NotificationGroup notificationGroup = this.mNotificationGroupMap.get(str);
                notificationGroup.removeChildKey(key);
                if (notificationGroup.isEmpty()) {
                    this.mNotificationGroupMap.remove(str);
                }
            }
        }
        if (!statusBarNotification.isGroup() || groupKey == null) {
            return;
        }
        NotificationGroup notificationGroup2 = this.mNotificationGroupMap.get(groupKey);
        if (notificationGroup2 == null) {
            notificationGroup2 = new NotificationGroup();
            this.mNotificationGroupMap.put(groupKey, notificationGroup2);
        }
        if ((statusBarNotification.getNotification().flags & 512) != 0) {
            notificationGroup2.setGroupSummaryKey(key);
        } else {
            notificationGroup2.addChildKey(key);
        }
    }

    public void cancelNotificationFromLauncher(String str) {
        this.mLastKeyDismissedByLauncher = str;
        cancelNotification(str);
    }

    public List<StatusBarNotification> getNotificationsForKeys(List<NotificationKeyData> list) {
        StatusBarNotification[] activeNotifications = getActiveNotifications((String[]) ((ArrayList) NotificationKeyData.extractKeysOnly(list)).toArray(new String[list.size()]));
        return activeNotifications == null ? Collections.EMPTY_LIST : Arrays.asList(activeNotifications);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        sIsCreated = true;
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        sIsCreated = false;
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerConnected() {
        super.onListenerConnected();
        sIsConnected = true;
        SettingsObserver.Secure secure = new SettingsObserver.Secure(getContentResolver()) { // from class: com.android.launcher3.notification.NotificationListener.3
            @Override // com.android.launcher3.util.SettingsObserver
            public void onSettingChanged(boolean z10) {
                if (z10) {
                    return;
                }
                NotificationListener.this.requestUnbind();
            }
        };
        this.mNotificationBadgingObserver = secure;
        secure.register(SettingsActivity.NOTIFICATION_BADGING, new String[0]);
        onNotificationFullRefresh();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerDisconnected() {
        super.onListenerDisconnected();
        sIsConnected = false;
        SettingsObserver settingsObserver = this.mNotificationBadgingObserver;
        if (settingsObserver != null) {
            settingsObserver.unregister();
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        super.onNotificationPosted(statusBarNotification);
        if (statusBarNotification == null) {
            return;
        }
        this.mWorkerHandler.obtainMessage(1, new NotificationPostedMsg(statusBarNotification)).sendToTarget();
        StatusBarNotificationsChangedListener statusBarNotificationsChangedListener = sStatusBarNotificationsChangedListener;
        if (statusBarNotificationsChangedListener != null) {
            statusBarNotificationsChangedListener.onNotificationPosted(statusBarNotification);
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRankingUpdate(NotificationListenerService.RankingMap rankingMap) {
        super.onNotificationRankingUpdate(rankingMap);
        for (StatusBarNotification statusBarNotification : getActiveNotifications(rankingMap.getOrderedKeys())) {
            updateGroupKeyIfNecessary(statusBarNotification);
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        super.onNotificationRemoved(statusBarNotification);
        if (statusBarNotification == null) {
            return;
        }
        this.mWorkerHandler.obtainMessage(2, new Pair(PackageUserKey.fromNotification(statusBarNotification), NotificationKeyData.fromNotification(statusBarNotification))).sendToTarget();
        StatusBarNotificationsChangedListener statusBarNotificationsChangedListener = sStatusBarNotificationsChangedListener;
        if (statusBarNotificationsChangedListener != null) {
            statusBarNotificationsChangedListener.onNotificationRemoved(statusBarNotification);
        }
        NotificationGroup notificationGroup = this.mNotificationGroupMap.get(statusBarNotification.getGroupKey());
        String key = statusBarNotification.getKey();
        if (notificationGroup != null) {
            notificationGroup.removeChildKey(key);
            if (notificationGroup.isEmpty()) {
                if (key.equals(this.mLastKeyDismissedByLauncher)) {
                    cancelNotification(notificationGroup.getGroupSummaryKey());
                }
                this.mNotificationGroupMap.remove(statusBarNotification.getGroupKey());
            }
        }
        if (key.equals(this.mLastKeyDismissedByLauncher)) {
            this.mLastKeyDismissedByLauncher = null;
        }
    }
}
