package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.H;
import androidx.work.i;
import androidx.work.impl.foreground.a;
import e.I;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemForegroundService extends H implements a.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f120401f = i.f("SystemFgService");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static SystemForegroundService f120402g = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f120403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f120404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.work.impl.foreground.a f120405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NotificationManager f120406e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f120407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Notification f120408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f120409c;

        public a(final int val$notificationId, final Notification val$notification, final int val$notificationType) {
            this.f120407a = val$notificationId;
            this.f120408b = val$notification;
            this.f120409c = val$notificationType;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f120407a, this.f120408b, this.f120409c);
            } else {
                SystemForegroundService.this.startForeground(this.f120407a, this.f120408b);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f120411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Notification f120412b;

        public b(final int val$notificationId, final Notification val$notification) {
            this.f120411a = val$notificationId;
            this.f120412b = val$notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f120406e.notify(this.f120411a, this.f120412b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f120414a;

        public c(final int val$notificationId) {
            this.f120414a = val$notificationId;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f120406e.cancel(this.f120414a);
        }
    }

    @Nullable
    public static SystemForegroundService e() {
        return f120402g;
    }

    @I
    private void f() {
        this.f120403b = new Handler(Looper.getMainLooper());
        this.f120406e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f120405d = aVar;
        aVar.o(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(final int notificationId) {
        this.f120403b.post(new c(notificationId));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void b(final int notificationId, @NonNull final Notification notification) {
        this.f120403b.post(new b(notificationId, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(final int notificationId, final int notificationType, @NonNull final Notification notification) {
        this.f120403b.post(new a(notificationId, notification, notificationType));
    }

    @Override // androidx.lifecycle.H, android.app.Service
    public void onCreate() {
        super.onCreate();
        f120402g = this;
        f();
    }

    @Override // androidx.lifecycle.H, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f120405d.m();
    }

    @Override // androidx.lifecycle.H, android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (this.f120404c) {
            i.c().d(f120401f, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f120405d.m();
            f();
            this.f120404c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f120405d.n(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    @I
    public void stop() {
        this.f120404c = true;
        i.c().a(f120401f, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f120402g = null;
        stopSelf();
    }
}
