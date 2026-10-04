package U2;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.WeakHashMap;
import w.y;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f68460a = androidx.work.i.f("WakeLocks");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f68461b = new WeakHashMap<>();

    public static void a() {
        HashMap map = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f68461b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.i.c().h(f68460a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock b(@NonNull Context context, @NonNull String tag) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService(Y7.a.f79330e);
        String strA = y.a("WorkManager: ", tag);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strA);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f68461b;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, strA);
        }
        return wakeLockNewWakeLock;
    }
}
