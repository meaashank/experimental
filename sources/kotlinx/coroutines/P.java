package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.AbstractC5093j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nDefaultExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultExecutor.kt\nkotlinx/coroutines/DefaultExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
public final class P extends AbstractC5093j0 implements Runnable {

    @Nullable
    private static volatile Thread _thread = null;
    private static volatile int debugStatus = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final P f218782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f218783j = "kotlinx.coroutines.DefaultExecutor";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f218784k = 1000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f218785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f218786m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f218787n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f218788o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f218789p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f218790q = 4;

    static {
        Long l10;
        P p10 = new P();
        f218782i = p10;
        AbstractC5066i0.x3(p10, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f218785l = timeUnit.toNanos(l10.longValue());
    }

    public static /* synthetic */ void D4() {
    }

    public final synchronized void A4() {
        if (F4()) {
            debugStatus = 3;
            r4();
            notifyAll();
        }
    }

    public final synchronized Thread B4() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, f218783j);
            _thread = thread;
            thread.setContextClassLoader(P.class.getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final synchronized void C4() {
        debugStatus = 0;
        B4();
        while (debugStatus == 0) {
            wait();
        }
    }

    public final boolean E4() {
        return debugStatus == 4;
    }

    public final boolean F4() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    public final boolean G4() {
        return _thread != null;
    }

    public final synchronized boolean H4() {
        if (F4()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    public final void I4() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void J4(long j10) {
        kotlin.L0 l02;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() + j10;
            if (!F4()) {
                debugStatus = 2;
            }
            while (debugStatus != 3 && _thread != null) {
                Thread thread = _thread;
                if (thread != null) {
                    AbstractC5051b abstractC5051b = C5053c.f218833a;
                    if (abstractC5051b != null) {
                        abstractC5051b.g(thread);
                        l02 = kotlin.L0.f217464a;
                    } else {
                        l02 = null;
                    }
                    if (l02 == null) {
                        LockSupport.unpark(thread);
                    }
                }
                if (jCurrentTimeMillis - System.currentTimeMillis() <= 0) {
                    break;
                } else {
                    wait(j10);
                }
            }
            debugStatus = 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // kotlinx.coroutines.AbstractC5095k0
    @NotNull
    public Thread b4() {
        Thread thread = _thread;
        return thread == null ? B4() : thread;
    }

    @Override // kotlinx.coroutines.AbstractC5095k0
    public void c4(long j10, @NotNull AbstractC5093j0.c cVar) {
        I4();
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractC5093j0, kotlinx.coroutines.U
    @NotNull
    public InterfaceC5058e0 h1(long j10, @NotNull Runnable runnable, @NotNull kotlin.coroutines.i iVar) {
        return u4(j10, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5093j0
    public void h4(@NotNull Runnable runnable) {
        if (E4()) {
            I4();
            throw null;
        }
        super.h4(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        kotlin.L0 l02;
        b1.f218831a.d(this);
        AbstractC5051b abstractC5051b = C5053c.f218833a;
        if (abstractC5051b != null) {
            abstractC5051b.d();
        }
        try {
            if (!H4()) {
                _thread = null;
                A4();
                AbstractC5051b abstractC5051b2 = C5053c.f218833a;
                if (abstractC5051b2 != null) {
                    abstractC5051b2.h();
                }
                if (J3()) {
                    return;
                }
                b4();
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jY3 = Y3();
                if (jY3 == Long.MAX_VALUE) {
                    AbstractC5051b abstractC5051b3 = C5053c.f218833a;
                    long jB = abstractC5051b3 != null ? abstractC5051b3.b() : System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f218785l + jB;
                    }
                    long j11 = j10 - jB;
                    if (j11 <= 0) {
                        _thread = null;
                        A4();
                        AbstractC5051b abstractC5051b4 = C5053c.f218833a;
                        if (abstractC5051b4 != null) {
                            abstractC5051b4.h();
                        }
                        if (J3()) {
                            return;
                        }
                        b4();
                        return;
                    }
                    if (jY3 > j11) {
                        jY3 = j11;
                    }
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jY3 > 0) {
                    if (F4()) {
                        _thread = null;
                        A4();
                        AbstractC5051b abstractC5051b5 = C5053c.f218833a;
                        if (abstractC5051b5 != null) {
                            abstractC5051b5.h();
                        }
                        if (J3()) {
                            return;
                        }
                        b4();
                        return;
                    }
                    AbstractC5051b abstractC5051b6 = C5053c.f218833a;
                    if (abstractC5051b6 != null) {
                        abstractC5051b6.c(this, jY3);
                        l02 = kotlin.L0.f217464a;
                    } else {
                        l02 = null;
                    }
                    if (l02 == null) {
                        LockSupport.parkNanos(this, jY3);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            A4();
            AbstractC5051b abstractC5051b7 = C5053c.f218833a;
            if (abstractC5051b7 != null) {
                abstractC5051b7.h();
            }
            if (!J3()) {
                b4();
            }
            throw th;
        }
    }

    @Override // kotlinx.coroutines.AbstractC5093j0, kotlinx.coroutines.AbstractC5066i0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
