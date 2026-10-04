package A6;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;

/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7259a = l0.b(l.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f7260b;

    static {
        int i10 = C3841e.w() ? 63 : 0;
        if (C3841e.x()) {
            i10 |= 192;
        }
        if (C3841e.E()) {
            i10 |= 2816;
        }
        f7260b = i10;
    }

    public static int a(int i10) {
        return i10 & f7260b;
    }

    public static void b(Service service, int i10, Notification notification, int i11) {
        if (C3841e.w()) {
            service.startForeground(i10, notification, i11);
        } else {
            service.startForeground(i10, notification);
        }
    }

    public static int c(ServiceInfo serviceInfo) {
        if (C3841e.w()) {
            return serviceInfo.getForegroundServiceType() & f7260b;
        }
        return 0;
    }

    public static int d() {
        return f7260b;
    }

    public static boolean e(Context context, Intent intent) {
        try {
            if (C3841e.s()) {
                I.b(f7259a, "startServiceCompat in foreground: %s", intent);
                context.startForegroundService(intent);
            } else {
                I.b(f7259a, "startServiceCompat: %s", intent);
                context.startService(intent);
            }
            return true;
        } catch (Throwable th) {
            I.h(f7259a, "startServiceCompat failed with intent: " + intent, th);
            return false;
        }
    }

    public static boolean f(Service service) {
        try {
            if (C3841e.s()) {
                service.stopForeground(true);
            }
            service.stopSelf();
            return true;
        } catch (Throwable th) {
            I.h(f7259a, "stopServiceCompat failed with service: " + service, th);
            return false;
        }
    }
}
