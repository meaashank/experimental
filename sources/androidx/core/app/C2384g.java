package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.core.app.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2384g {

    /* JADX INFO: renamed from: androidx.core.app.g$a */
    @e.T(21)
    public static class a {
        public static AlarmManager.AlarmClockInfo a(long j10, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j10, pendingIntent);
        }

        public static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.g$b */
    @e.T(23)
    public static class b {
        public static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i10, j10, pendingIntent);
        }

        public static void b(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i10, j10, pendingIntent);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.g$c */
    @e.T(31)
    public static class c {
        public static boolean a(AlarmManager alarmManager) {
            return alarmManager.canScheduleExactAlarms();
        }
    }

    public static boolean a(@NonNull AlarmManager alarmManager) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.a(alarmManager);
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    public static void b(@NonNull AlarmManager alarmManager, long j10, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
        alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j10, pendingIntent), pendingIntent2);
    }

    public static void c(@NonNull AlarmManager alarmManager, int i10, long j10, @NonNull PendingIntent pendingIntent) {
        alarmManager.setAndAllowWhileIdle(i10, j10, pendingIntent);
    }

    @e.S(expression = "alarmManager.setExact(type, triggerAtMillis, operation)")
    @Deprecated
    public static void d(@NonNull AlarmManager alarmManager, int i10, long j10, @NonNull PendingIntent pendingIntent) {
        alarmManager.setExact(i10, j10, pendingIntent);
    }

    public static void e(@NonNull AlarmManager alarmManager, int i10, long j10, @NonNull PendingIntent pendingIntent) {
        alarmManager.setExactAndAllowWhileIdle(i10, j10, pendingIntent);
    }
}
