package com.prism.lib.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.widget.RemoteViews;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC1486c;
import androidx.compose.runtime.C1979x1;
import androidx.core.app.NotificationCompat;
import com.prism.commons.activity.MainProcessProxyActivity;
import com.prism.commons.notification.NotificationBundle;
import com.prism.commons.utils.C3836a;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import com.prism.gaia.server.accounts.b;
import com.prism.lib.notification.a;
import r4.C5527b;
import v8.C5699i;
import v8.C5700j;
import w.j;

/* JADX INFO: loaded from: classes7.dex */
public class NotificationCustom {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f178719b = "gaia.foreground.quiet";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f178720c = "gaia.foreground";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f178721d = 1000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f178722e = 1001;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f178718a = l0.b(NotificationCustom.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final NotificationCustom f178723f = new NotificationCustom();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile NotificationChannel f178724g = null;

    public static class AskToObserveNotificationAction extends MainProcessProxyActivity.EmptyProxyActivityAction {
        public static final Parcelable.Creator<AskToObserveNotificationAction> CREATOR = new a();

        public class a implements Parcelable.Creator<AskToObserveNotificationAction> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public AskToObserveNotificationAction createFromParcel(Parcel parcel) {
                return new AskToObserveNotificationAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public AskToObserveNotificationAction[] newArray(int i10) {
                return new AskToObserveNotificationAction[i10];
            }
        }

        public AskToObserveNotificationAction() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.prism.commons.activity.MainProcessProxyActivity.EmptyProxyActivityAction, com.prism.commons.activity.MainProcessProxyActivity.IProxyActivityAction
        public void onStart(ActivityC1486c activityC1486c) {
            try {
                try {
                    Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
                    intent.addFlags(268435456);
                    activityC1486c.startActivity(intent);
                } catch (Exception e10) {
                    I.i(NotificationCustom.f178718a, e10);
                    Toast.makeText(activityC1486c, "Sorry! Your device is not supporting Notification-Manager!", 0).show();
                    activityC1486c.setResult(-1);
                    activityC1486c.finish();
                }
            } catch (ActivityNotFoundException unused) {
                Intent intent2 = new Intent();
                intent2.addFlags(268435456);
                intent2.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$NotificationAccessSettingsActivity"));
                intent2.putExtra(":settings:show_fragment", "NotificationAccessSettings");
                activityC1486c.startActivity(intent2);
                Toast.makeText(activityC1486c, "Sorry! Your device is not supporting Notification-Manager!", 0).show();
                activityC1486c.setResult(-1);
                activityC1486c.finish();
            }
            activityC1486c.setResult(-1);
            activityC1486c.finish();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
        }

        public AskToObserveNotificationAction(Parcel parcel) {
        }
    }

    public static Notification b(Context context) {
        I.a(f178718a, "askToObserveNotification() build notification");
        c(context);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, f178719b);
        builder.setSmallIcon(a.g.f181216j1);
        builder.setContentTitle(context.getString(a.m.f181995c2));
        builder.setContentText(context.getString(a.m.f181991b2));
        builder.setContentIntent(PendingIntent.getActivity(context, 0, MainProcessProxyActivity.U0(context, new AskToObserveNotificationAction()), C3836a.b.a(C1979x1.f100279m)));
        builder.setPriority(0);
        builder.setSound(null);
        return builder.build();
    }

    public static synchronized void c(Context context) {
        try {
            if (C3841e.s()) {
                if (f178724g == null) {
                    C5527b.a();
                    f178724g = j.a(f178719b, context.getString(a.m.f181948O), 2);
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.deleteNotificationChannel("gaia.foreground");
                        f178724g.setDescription(context.getString(a.m.f181945N));
                        f178724g.enableLights(false);
                        f178724g.enableVibration(false);
                        f178724g.setSound(null, null);
                        notificationManager.createNotificationChannel(f178724g);
                    } else {
                        f178724g = null;
                        I.g(f178718a, "create notification channel(%s) failed", f178719b);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static Notification d(Context context) {
        I.a(f178718a, "fadeNotification() build notification");
        c(context);
        Notification.Builder builderA = C3841e.s() ? C5699i.a(context, f178719b) : new Notification.Builder(context);
        builderA.setSmallIcon(a.g.f181208h1);
        if (C3841e.s()) {
            builderA.setStyle(C5700j.a());
            builderA.setCustomContentView(new RemoteViews(context.getPackageName(), a.k.f181786D));
            builderA.setOngoing(false);
            builderA.setAutoCancel(true);
        } else {
            builderA.setContent(new RemoteViews(context.getPackageName(), a.k.f181788E));
        }
        builderA.setPriority(-1);
        builderA.setSound(null);
        if (C3841e.z()) {
            builderA.setForegroundServiceBehavior(1);
        }
        return builderA.build();
    }

    public static NotificationCustom e() {
        return f178723f;
    }

    public static NotificationBundle f(Context context) {
        return (!C3841e.s() || f178723f.g(context)) ? new NotificationBundle(1000, "gaia#fade", d(context), true) : new NotificationBundle(1001, "gaia#observe", b(context));
    }

    public static boolean h(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split(b.f166434b0)) {
                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                if (componentNameUnflattenFromString != null) {
                    return TextUtils.equals(context.getPackageName(), componentNameUnflattenFromString.getPackageName());
                }
            }
        }
        return false;
    }

    public boolean g(Context context) {
        NotificationObserverService notificationObserverServiceB = NotificationObserverService.b();
        return notificationObserverServiceB != null ? notificationObserverServiceB.d() : h(context);
    }
}
