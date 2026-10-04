package com.prism.gaia.naked.metadata.androidx.core.app;

import W6.b;
import W6.c;
import W6.j;
import W6.l;
import W6.n;
import android.app.Notification;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public class NotificationCompatCAGI {

    @l
    @j("androidx.core.app.NotificationCompat")
    public interface G extends ClassAccessor {

        @l
        @j("androidx.core.app.NotificationCompat$Builder")
        public interface Builder extends ClassAccessor {
            @n("mNotification")
            NakedObject<Notification> mNotification();
        }
    }
}
