package com.prism.gaia.naked.compat.android.app;

import android.app.Notification;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.metadata.android.app.NotificationCAG;

/* JADX INFO: loaded from: classes6.dex */
public class NotificationCompat2 {

    public static class Util {
        public static void setChannelId(Notification notification, String str) {
            if (C3841e.s()) {
                NotificationCAG.O26.mChannelId().set(notification, str);
            }
        }
    }
}
