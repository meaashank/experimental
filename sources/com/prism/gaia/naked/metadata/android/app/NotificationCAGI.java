package com.prism.gaia.naked.metadata.android.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class NotificationCAGI {

    @W6.l
    @W6.i(Notification.class)
    public interface G extends ClassAccessor {
        @W6.n("extras")
        NakedObject<Bundle> extras();

        @W6.p("setLatestEventInfo")
        @W6.f({Context.class, CharSequence.class, CharSequence.class, PendingIntent.class})
        NakedMethod<Void> setLatestEventInfo();

        @W6.n("sound")
        NakedObject<Uri> sound();
    }

    @W6.l
    @W6.i(Notification.class)
    public interface L extends ClassAccessor {

        @W6.l
        @W6.i(Notification.Builder.class)
        public interface Builder extends ClassAccessor {
            @W6.f({Context.class, Notification.class})
            @W6.s("rebuild")
            NakedStaticMethod<Notification> rebuild();
        }
    }

    @W6.l
    @W6.i(Notification.class)
    public interface M extends ClassAccessor {
        @W6.n("mLargeIcon")
        NakedObject<Icon> mLargeIcon();

        @W6.n("mSmallIcon")
        NakedObject<Icon> mSmallIcon();
    }

    @W6.l
    @W6.i(Notification.class)
    public interface O26 extends ClassAccessor {
        @W6.n("mChannelId")
        NakedObject<String> mChannelId();
    }
}
