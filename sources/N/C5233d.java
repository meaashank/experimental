package n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.T;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: n.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class C5233d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f221203a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f221204b = Executors.newFixedThreadPool(4, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public volatile Handler f221205c;

    /* JADX INFO: renamed from: n.d$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f221206c = "arch_disk_io_";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f221207a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(f221206c + this.f221207a.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: renamed from: n.d$b */
    @T(28)
    public static class b {
        @NonNull
        public static Handler a(@NonNull Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @NonNull
    public static Handler e(@NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // n.e
    public void a(@NonNull Runnable runnable) {
        this.f221204b.execute(runnable);
    }

    @Override // n.e
    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // n.e
    public void d(@NonNull Runnable runnable) {
        if (this.f221205c == null) {
            synchronized (this.f221203a) {
                try {
                    if (this.f221205c == null) {
                        this.f221205c = e(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f221205c.post(runnable);
    }
}
