package Ed;

import Bd.f;
import dd.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.U;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final b f33893h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @g
    @NotNull
    public static final d f33894i = new d(new c(f.Y(G.C(f.f17499i, " TaskRunner"), true)));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Logger f33895j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f33896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f33899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<Ed.c> f33900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<Ed.c> f33901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Runnable f33902g;

    public interface a {
        void a(@NotNull d dVar);

        void b(@NotNull d dVar, long j10);

        void c(@NotNull d dVar);

        void execute(@NotNull Runnable runnable);

        long nanoTime();
    }

    public static final class b {
        public b() {
        }

        @NotNull
        public final Logger a() {
            return d.f33895j;
        }

        public b(C4969v c4969v) {
        }
    }

    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ThreadPoolExecutor f33903a;

        public c(@NotNull ThreadFactory threadFactory) {
            G.p(threadFactory, "threadFactory");
            this.f33903a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // Ed.d.a
        public void a(@NotNull d taskRunner) {
            G.p(taskRunner, "taskRunner");
        }

        @Override // Ed.d.a
        public void b(@NotNull d taskRunner, long j10) throws InterruptedException {
            G.p(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // Ed.d.a
        public void c(@NotNull d taskRunner) {
            G.p(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        public final void d() {
            this.f33903a.shutdown();
        }

        @Override // Ed.d.a
        public void execute(@NotNull Runnable runnable) {
            G.p(runnable, "runnable");
            this.f33903a.execute(runnable);
        }

        @Override // Ed.d.a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* JADX INFO: renamed from: Ed.d$d, reason: collision with other inner class name */
    public static final class RunnableC0028d implements Runnable {
        public RunnableC0028d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Ed.a aVarE;
            long jNanoTime;
            while (true) {
                d dVar = d.this;
                synchronized (dVar) {
                    aVarE = dVar.e();
                }
                if (aVarE == null) {
                    return;
                }
                Ed.c cVar = aVarE.f33879c;
                G.m(cVar);
                d dVar2 = d.this;
                d.f33893h.getClass();
                boolean zIsLoggable = d.f33895j.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = cVar.f33881a.f33896a.nanoTime();
                    Ed.b.c(aVarE, cVar, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    dVar2.k(aVarE);
                    if (zIsLoggable) {
                        Ed.b.c(aVarE, cVar, G.C("finished run in ", Ed.b.b(cVar.f33881a.f33896a.nanoTime() - jNanoTime)));
                    }
                } finally {
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        G.o(logger, "getLogger(TaskRunner::class.java.name)");
        f33895j = logger;
    }

    public d(@NotNull a backend) {
        G.p(backend, "backend");
        this.f33896a = backend;
        this.f33897b = 10000;
        this.f33900e = new ArrayList();
        this.f33901f = new ArrayList();
        this.f33902g = new RunnableC0028d();
    }

    @NotNull
    public final List<Ed.c> c() {
        List<Ed.c> listI4;
        synchronized (this) {
            listI4 = U.I4(this.f33900e, this.f33901f);
        }
        return listI4;
    }

    public final void d(Ed.a aVar, long j10) {
        if (f.f17498h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        Ed.c cVar = aVar.f33879c;
        G.m(cVar);
        if (cVar.f33884d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z10 = cVar.f33886f;
        cVar.f33886f = false;
        cVar.f33884d = null;
        this.f33900e.remove(cVar);
        if (j10 != -1 && !z10 && !cVar.f33883c) {
            cVar.q(aVar, j10, true);
        }
        if (cVar.f33885e.isEmpty()) {
            return;
        }
        this.f33901f.add(cVar);
    }

    @Nullable
    public final Ed.a e() {
        boolean z10;
        if (f.f17498h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        while (true) {
            if (this.f33901f.isEmpty()) {
                break;
            }
            long jNanoTime = this.f33896a.nanoTime();
            Iterator<Ed.c> it = this.f33901f.iterator();
            long jMin = Long.MAX_VALUE;
            Ed.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                Ed.a aVar2 = it.next().f33885e.get(0);
                long jMax = Math.max(0L, aVar2.f33880d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                f(aVar);
                if (z10 || (!this.f33898c && !this.f33901f.isEmpty())) {
                    this.f33896a.execute(this.f33902g);
                }
                return aVar;
            }
            if (!this.f33898c) {
                this.f33898c = true;
                this.f33899d = jNanoTime + jMin;
                try {
                    try {
                        this.f33896a.b(this, jMin);
                    } catch (InterruptedException unused) {
                        g();
                    }
                } finally {
                    this.f33898c = false;
                }
            } else if (jMin < this.f33899d - jNanoTime) {
                this.f33896a.c(this);
            }
        }
        return null;
    }

    public final void f(Ed.a aVar) {
        if (f.f17498h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        aVar.f33880d = -1L;
        Ed.c cVar = aVar.f33879c;
        G.m(cVar);
        cVar.f33885e.remove(aVar);
        this.f33901f.remove(cVar);
        cVar.f33884d = aVar;
        this.f33900e.add(cVar);
    }

    public final void g() {
        int size = this.f33900e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                this.f33900e.get(size).b();
                if (i10 < 0) {
                    break;
                } else {
                    size = i10;
                }
            }
        }
        int size2 = this.f33901f.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            Ed.c cVar = this.f33901f.get(size2);
            cVar.b();
            if (cVar.f33885e.isEmpty()) {
                this.f33901f.remove(size2);
            }
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }

    @NotNull
    public final a h() {
        return this.f33896a;
    }

    public final void i(@NotNull Ed.c taskQueue) {
        G.p(taskQueue, "taskQueue");
        if (f.f17498h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (taskQueue.f33884d == null) {
            if (taskQueue.f33885e.isEmpty()) {
                this.f33901f.remove(taskQueue);
            } else {
                f.c(this.f33901f, taskQueue);
            }
        }
        if (this.f33898c) {
            this.f33896a.c(this);
        } else {
            this.f33896a.execute(this.f33902g);
        }
    }

    @NotNull
    public final Ed.c j() {
        int i10;
        synchronized (this) {
            i10 = this.f33897b;
            this.f33897b = i10 + 1;
        }
        return new Ed.c(this, G.C("Q", Integer.valueOf(i10)));
    }

    public final void k(Ed.a aVar) {
        if (f.f17498h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.f33877a);
        try {
            long jF = aVar.f();
            synchronized (this) {
                d(aVar, jF);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                d(aVar, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }
}
