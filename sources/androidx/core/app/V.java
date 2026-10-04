package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f110981a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f110982b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f110983c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f110984d = 255;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f110985e = 1073745919;

    @e.T(24)
    public static class a {
        public static void a(Service service, int i10) {
            service.stopForeground(i10);
        }
    }

    @e.T(29)
    public static class b {
        public static void a(Service service, int i10, Notification notification, int i11) {
            if (i11 == 0 || i11 == -1) {
                service.startForeground(i10, notification, i11);
            } else {
                service.startForeground(i10, notification, i11 & 255);
            }
        }
    }

    @e.T(34)
    public static class c {
        public static void a(Service service, int i10, Notification notification, int i11) {
            if (i11 == 0 || i11 == -1) {
                service.startForeground(i10, notification, i11);
            } else {
                service.startForeground(i10, notification, i11 & V.f110985e);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface d {
    }

    public static void a(@NonNull Service service, int i10, @NonNull Notification notification, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            c.a(service, i10, notification, i11);
        } else if (i12 >= 29) {
            b.a(service, i10, notification, i11);
        } else {
            service.startForeground(i10, notification);
        }
    }

    public static void b(@NonNull Service service, int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            a.a(service, i10);
        } else {
            service.stopForeground((i10 & 1) != 0);
        }
    }
}
