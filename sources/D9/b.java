package D9;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f22987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Handler f22988b;

    public b() {
        super("android.bg", 10);
    }

    public static void a() {
        if (f22987a == null) {
            b bVar = new b();
            f22987a = bVar;
            bVar.start();
            f22988b = new Handler(f22987a.getLooper());
        }
    }

    public static b b() {
        b bVar;
        synchronized (b.class) {
            a();
            bVar = f22987a;
        }
        return bVar;
    }

    public static Handler c() {
        Handler handler;
        synchronized (b.class) {
            a();
            handler = f22988b;
        }
        return handler;
    }
}
