package androidx.work;

import android.app.Notification;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f120261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f120262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f120263c;

    public d(int notificationId, @NonNull Notification notification) {
        this(notificationId, notification, 0);
    }

    public int a() {
        return this.f120262b;
    }

    @NonNull
    public Notification b() {
        return this.f120263c;
    }

    public int c() {
        return this.f120261a;
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 == null || d.class != o10.getClass()) {
            return false;
        }
        d dVar = (d) o10;
        if (this.f120261a == dVar.f120261a && this.f120262b == dVar.f120262b) {
            return this.f120263c.equals(dVar.f120263c);
        }
        return false;
    }

    public int hashCode() {
        return this.f120263c.hashCode() + (((this.f120261a * 31) + this.f120262b) * 31);
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f120261a + ", mForegroundServiceType=" + this.f120262b + ", mNotification=" + this.f120263c + '}';
    }

    public d(int notificationId, @NonNull Notification notification, int foregroundServiceType) {
        this.f120261a = notificationId;
        this.f120263c = notification;
        this.f120262b = foregroundServiceType;
    }
}
