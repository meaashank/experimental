package Jb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f58215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object f58216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f58217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f58218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Handler f58219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Handler f58220f;

    public n(@NotNull String namespace, @Nullable Handler handler) {
        G.p(namespace, "namespace");
        this.f58215a = namespace;
        this.f58216b = new Object();
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread(namespace);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
        }
        this.f58219e = handler;
    }

    public static void a(InterfaceC4376a interfaceC4376a) {
        interfaceC4376a.invoke();
    }

    public static void b(InterfaceC4376a interfaceC4376a) {
        interfaceC4376a.invoke();
    }

    public static final void f(InterfaceC4376a interfaceC4376a) {
        interfaceC4376a.invoke();
    }

    public static final void m(InterfaceC4376a interfaceC4376a) {
        interfaceC4376a.invoke();
    }

    public final void c() {
        Looper looper;
        synchronized (this.f58216b) {
            if (!this.f58217c) {
                this.f58217c = true;
                try {
                    this.f58219e.removeCallbacksAndMessages(null);
                    this.f58219e.getLooper().quit();
                } catch (Exception unused) {
                }
                try {
                    Handler handler = this.f58220f;
                    this.f58220f = null;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                    if (handler != null && (looper = handler.getLooper()) != null) {
                        looper.quit();
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    public final void d() {
        synchronized (this.f58216b) {
            if (!this.f58217c) {
                int i10 = this.f58218d;
                if (i10 == 0) {
                } else {
                    this.f58218d = i10 - 1;
                }
            }
        }
    }

    public final void e(@NotNull final InterfaceC4376a<L0> runnable) {
        G.p(runnable, "runnable");
        synchronized (this.f58216b) {
            try {
                if (!this.f58217c) {
                    if (this.f58220f == null) {
                        this.f58220f = i();
                    }
                    Handler handler = this.f58220f;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: Jb.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                runnable.invoke();
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        G.n(obj, "null cannot be cast to non-null type com.tonyodev.fetch2core.HandlerWrapper");
        return G.g(this.f58215a, ((n) obj).f58215a);
    }

    @NotNull
    public final Looper g() {
        Looper looper;
        synchronized (this.f58216b) {
            looper = this.f58219e.getLooper();
        }
        G.o(looper, "synchronized(...)");
        return looper;
    }

    @NotNull
    public final String h() {
        return this.f58215a;
    }

    public int hashCode() {
        return this.f58215a.hashCode();
    }

    public final Handler i() {
        HandlerThread handlerThread = new HandlerThread(androidx.compose.runtime.changelist.j.a(this.f58215a, " worker task"));
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    @NotNull
    public final Looper j() {
        Looper looper;
        synchronized (this.f58216b) {
            try {
                Handler handler = this.f58220f;
                if (handler == null) {
                    Handler handlerI = i();
                    this.f58220f = handlerI;
                    looper = handlerI.getLooper();
                } else {
                    looper = handler.getLooper();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        G.o(looper, "synchronized(...)");
        return looper;
    }

    public final void k() {
        synchronized (this.f58216b) {
            if (!this.f58217c) {
                this.f58218d++;
            }
        }
    }

    public final void l(@NotNull final InterfaceC4376a<L0> runnable) {
        G.p(runnable, "runnable");
        synchronized (this.f58216b) {
            if (!this.f58217c) {
                this.f58219e.post(new Runnable() { // from class: Jb.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        runnable.invoke();
                    }
                });
            }
        }
    }

    public final void n(@NotNull Runnable runnable, long j10) {
        G.p(runnable, "runnable");
        synchronized (this.f58216b) {
            if (!this.f58217c) {
                this.f58219e.postDelayed(runnable, j10);
            }
        }
    }

    public final void o(@NotNull Runnable runnable) {
        G.p(runnable, "runnable");
        synchronized (this.f58216b) {
            if (!this.f58217c) {
                this.f58219e.removeCallbacks(runnable);
            }
        }
    }

    public final int p() {
        int i10;
        synchronized (this.f58216b) {
            i10 = !this.f58217c ? this.f58218d : 0;
        }
        return i10;
    }

    public /* synthetic */ n(String str, Handler handler, int i10, C4969v c4969v) {
        this(str, (i10 & 2) != 0 ? null : handler);
    }
}
