package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.n;
import e.f0;
import g3.InterfaceC4444b;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import y3.C5817f;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f139491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f139492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @f0
    public final Map<InterfaceC4444b, d> f139493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReferenceQueue<n<?>> f139494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n.a f139495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f139496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public volatile c f139497g;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC0365a implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        public class RunnableC0366a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f139498a;

            public RunnableC0366a(Runnable runnable) {
                this.f139498a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f139498a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new RunnableC0366a(runnable), "glide-active-resources");
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    @f0
    public interface c {
        void a();
    }

    @f0
    public static final class d extends WeakReference<n<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC4444b f139501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f139502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public s<?> f139503c;

        public d(@NonNull InterfaceC4444b interfaceC4444b, @NonNull n<?> nVar, @NonNull ReferenceQueue<? super n<?>> referenceQueue, boolean z10) {
            s<?> sVarD;
            super(nVar, referenceQueue);
            y3.m.f(interfaceC4444b, "Argument must not be null");
            this.f139501a = interfaceC4444b;
            if (nVar.e() && z10) {
                sVarD = nVar.d();
                y3.m.f(sVarD, "Argument must not be null");
            } else {
                sVarD = null;
            }
            this.f139503c = sVarD;
            this.f139502b = nVar.e();
        }

        public void a() {
            this.f139503c = null;
            clear();
        }
    }

    public a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC0365a()));
    }

    public synchronized void a(InterfaceC4444b interfaceC4444b, n<?> nVar) {
        d dVarPut = this.f139493c.put(interfaceC4444b, new d(interfaceC4444b, nVar, this.f139494d, this.f139491a));
        if (dVarPut != null) {
            dVarPut.a();
        }
    }

    public void b() {
        while (!this.f139496f) {
            try {
                c((d) this.f139494d.remove());
                c cVar = this.f139497g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void c(@NonNull d dVar) {
        s<?> sVar;
        synchronized (this) {
            this.f139493c.remove(dVar.f139501a);
            if (dVar.f139502b && (sVar = dVar.f139503c) != null) {
                this.f139495e.c(dVar.f139501a, new n<>(sVar, true, false, dVar.f139501a, this.f139495e));
            }
        }
    }

    public synchronized void d(InterfaceC4444b interfaceC4444b) {
        d dVarRemove = this.f139493c.remove(interfaceC4444b);
        if (dVarRemove != null) {
            dVarRemove.a();
        }
    }

    @Nullable
    public synchronized n<?> e(InterfaceC4444b interfaceC4444b) {
        d dVar = this.f139493c.get(interfaceC4444b);
        if (dVar == null) {
            return null;
        }
        n<?> nVar = dVar.get();
        if (nVar == null) {
            c(dVar);
        }
        return nVar;
    }

    @f0
    public void f(c cVar) {
        this.f139497g = cVar;
    }

    public void g(n.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f139495e = aVar;
            }
        }
    }

    @f0
    public void h() {
        this.f139496f = true;
        Executor executor = this.f139492b;
        if (executor instanceof ExecutorService) {
            C5817f.c((ExecutorService) executor);
        }
    }

    @f0
    public a(boolean z10, Executor executor) {
        this.f139493c = new HashMap();
        this.f139494d = new ReferenceQueue<>();
        this.f139491a = z10;
        this.f139492b = executor;
        executor.execute(new b());
    }
}
