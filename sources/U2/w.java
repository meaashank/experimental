package U2;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.f0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f68489f = androidx.work.i.f("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f68490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f68491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, c> f68492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, b> f68493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f68494e;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68495a = 0;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable r10) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(r10);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f68495a);
            this.f68495a = this.f68495a + 1;
            return threadNewThread;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface b {
        void b(@NonNull String workSpecId);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class c implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f68497c = "WrkTimerRunnable";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f68498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f68499b;

        public c(@NonNull w workTimer, @NonNull String workSpecId) {
            this.f68498a = workTimer;
            this.f68499b = workSpecId;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f68498a.f68494e) {
                try {
                    if (this.f68498a.f68492c.remove(this.f68499b) != null) {
                        b bVarRemove = this.f68498a.f68493d.remove(this.f68499b);
                        if (bVarRemove != null) {
                            bVarRemove.b(this.f68499b);
                        }
                    } else {
                        androidx.work.i.c().a(f68497c, String.format("Timer with %s is already marked as complete.", this.f68499b), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public w() {
        a aVar = new a();
        this.f68490a = aVar;
        this.f68492c = new HashMap();
        this.f68493d = new HashMap();
        this.f68494e = new Object();
        this.f68491b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    @NonNull
    @f0
    public ScheduledExecutorService a() {
        return this.f68491b;
    }

    @NonNull
    @f0
    public synchronized Map<String, b> b() {
        return this.f68493d;
    }

    @NonNull
    @f0
    public synchronized Map<String, c> c() {
        return this.f68492c;
    }

    public void d() {
        if (this.f68491b.isShutdown()) {
            return;
        }
        this.f68491b.shutdownNow();
    }

    public void e(@NonNull final String workSpecId, long processingTimeMillis, @NonNull b listener) {
        synchronized (this.f68494e) {
            androidx.work.i.c().a(f68489f, String.format("Starting timer for %s", workSpecId), new Throwable[0]);
            f(workSpecId);
            c cVar = new c(this, workSpecId);
            this.f68492c.put(workSpecId, cVar);
            this.f68493d.put(workSpecId, listener);
            this.f68491b.schedule(cVar, processingTimeMillis, TimeUnit.MILLISECONDS);
        }
    }

    public void f(@NonNull final String workSpecId) {
        synchronized (this.f68494e) {
            try {
                if (this.f68492c.remove(workSpecId) != null) {
                    androidx.work.i.c().a(f68489f, String.format("Stopping timer for %s", workSpecId), new Throwable[0]);
                    this.f68493d.remove(workSpecId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
