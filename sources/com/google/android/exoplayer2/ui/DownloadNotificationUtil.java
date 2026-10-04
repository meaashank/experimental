package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import e.InterfaceC4346u;
import e.Z;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadNotificationUtil {

    @Z
    private static final int NULL_STRING_ID = 0;

    private DownloadNotificationUtil() {
    }

    public static Notification buildDownloadCompletedNotification(Context context, @InterfaceC4346u int i10, String str, @Nullable PendingIntent pendingIntent, @Nullable String str2) {
        return newNotificationBuilder(context, i10, str, pendingIntent, str2, R.string.exo_download_completed).build();
    }

    public static Notification buildDownloadFailedNotification(Context context, @InterfaceC4346u int i10, String str, @Nullable PendingIntent pendingIntent, @Nullable String str2) {
        return newNotificationBuilder(context, i10, str, pendingIntent, str2, R.string.exo_download_failed).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.app.Notification buildProgressNotification(android.content.Context r15, @e.InterfaceC4346u int r16, java.lang.String r17, @androidx.annotation.Nullable android.app.PendingIntent r18, @androidx.annotation.Nullable java.lang.String r19, com.google.android.exoplayer2.offline.DownloadManager.TaskState[] r20) {
        /*
            r0 = r20
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r4
        La:
            if (r5 >= r1) goto L34
            r9 = r0[r5]
            com.google.android.exoplayer2.offline.DownloadAction r10 = r9.action
            boolean r10 = r10.isRemoveAction
            if (r10 != 0) goto L31
            int r10 = r9.state
            if (r10 == r4) goto L19
            goto L31
        L19:
            float r10 = r9.downloadPercentage
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 == 0) goto L23
            float r2 = r2 + r10
            r8 = r3
        L23:
            long r9 = r9.downloadedBytes
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L2d
            r9 = r4
            goto L2e
        L2d:
            r9 = r3
        L2e:
            r7 = r7 | r9
            int r6 = r6 + 1
        L31:
            int r5 = r5 + 1
            goto La
        L34:
            if (r6 <= 0) goto L38
            r1 = r4
            goto L39
        L38:
            r1 = r3
        L39:
            if (r1 == 0) goto L48
            int r0 = com.google.android.exoplayer2.ui.R.string.exo_download_downloading
        L3d:
            r9 = r15
            r10 = r16
            r11 = r17
            r12 = r18
            r13 = r19
            r14 = r0
            goto L58
        L48:
            int r0 = r0.length
            if (r0 <= 0) goto L4e
            int r0 = com.google.android.exoplayer2.ui.R.string.exo_download_removing
            goto L3d
        L4e:
            r9 = r15
            r10 = r16
            r11 = r17
            r12 = r18
            r13 = r19
            r14 = r3
        L58:
            androidx.core.app.NotificationCompat$Builder r15 = newNotificationBuilder(r9, r10, r11, r12, r13, r14)
            if (r1 == 0) goto L62
            float r0 = (float) r6
            float r2 = r2 / r0
            int r0 = (int) r2
            goto L63
        L62:
            r0 = r3
        L63:
            if (r1 == 0) goto L6c
            if (r8 == 0) goto L6a
            if (r7 == 0) goto L6a
            goto L6c
        L6a:
            r1 = r3
            goto L6d
        L6c:
            r1 = r4
        L6d:
            r2 = 100
            r15.setProgress(r2, r0, r1)
            r15.setOngoing(r4)
            r15.setShowWhen(r3)
            android.app.Notification r15 = r15.build()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DownloadNotificationUtil.buildProgressNotification(android.content.Context, int, java.lang.String, android.app.PendingIntent, java.lang.String, com.google.android.exoplayer2.offline.DownloadManager$TaskState[]):android.app.Notification");
    }

    private static NotificationCompat.Builder newNotificationBuilder(Context context, @InterfaceC4346u int i10, String str, @Nullable PendingIntent pendingIntent, @Nullable String str2, @Z int i11) {
        NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(context, str).setSmallIcon(i10);
        if (i11 != 0) {
            smallIcon.setContentTitle(context.getResources().getString(i11));
        }
        if (pendingIntent != null) {
            smallIcon.setContentIntent(pendingIntent);
        }
        if (str2 != null) {
            NotificationCompat.k kVar = new NotificationCompat.k();
            kVar.f110834e = NotificationCompat.Builder.limitCharSequenceLength(str2);
            smallIcon.setStyle(kVar);
        }
        return smallIcon;
    }
}
