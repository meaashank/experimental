package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5053c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static AbstractC5051b f218833a;

    @Xc.f
    public static final long c() {
        AbstractC5051b abstractC5051b = f218833a;
        return abstractC5051b != null ? abstractC5051b.a() : System.currentTimeMillis();
    }

    public static final void d(@Nullable AbstractC5051b abstractC5051b) {
        f218833a = abstractC5051b;
    }

    @Xc.f
    public static final long e() {
        AbstractC5051b abstractC5051b = f218833a;
        return abstractC5051b != null ? abstractC5051b.b() : System.nanoTime();
    }

    @Xc.f
    public static final void f(Object obj, long j10) {
        kotlin.L0 l02;
        AbstractC5051b abstractC5051b = f218833a;
        if (abstractC5051b != null) {
            abstractC5051b.c(obj, j10);
            l02 = kotlin.L0.f217464a;
        } else {
            l02 = null;
        }
        if (l02 == null) {
            LockSupport.parkNanos(obj, j10);
        }
    }

    @Xc.f
    public static final void g() {
        AbstractC5051b abstractC5051b = f218833a;
        if (abstractC5051b != null) {
            abstractC5051b.d();
        }
    }

    @Xc.f
    public static final void h() {
        AbstractC5051b abstractC5051b = f218833a;
        if (abstractC5051b != null) {
            abstractC5051b.e();
        }
    }

    @Xc.f
    public static final void i() {
        AbstractC5051b abstractC5051b = f218833a;
        if (abstractC5051b != null) {
            abstractC5051b.f();
        }
    }

    @Xc.f
    public static final void j(Thread thread) {
        kotlin.L0 l02;
        AbstractC5051b abstractC5051b = f218833a;
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

    @Xc.f
    public static final void k() {
        AbstractC5051b abstractC5051b = f218833a;
        if (abstractC5051b != null) {
            abstractC5051b.h();
        }
    }

    @Xc.f
    public static final Runnable l(Runnable runnable) {
        Runnable runnableI;
        AbstractC5051b abstractC5051b = f218833a;
        return (abstractC5051b == null || (runnableI = abstractC5051b.i(runnable)) == null) ? runnable : runnableI;
    }
}
