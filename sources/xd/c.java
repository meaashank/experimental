package xd;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.P;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
@InterfaceC4850b0
public class c extends ExecutorCoroutineDispatcher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f240607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f240608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f240609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f240610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public CoroutineScheduler f240611h;

    public c(int i10, int i11, long j10, @NotNull String str) {
        this.f240607d = i10;
        this.f240608e = i11;
        this.f240609f = j10;
        this.f240610g = str;
        this.f240611h = m3();
    }

    public static /* synthetic */ CoroutineDispatcher k3(c cVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
        }
        if ((i11 & 1) != 0) {
            i10 = 16;
        }
        return cVar.d3(i10);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void F2(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable) {
        Runnable runnable2;
        try {
            runnable2 = runnable;
            try {
                CoroutineScheduler.r(this.f240611h, runnable2, null, false, 6, null);
            } catch (RejectedExecutionException unused) {
                P.f218782i.h4(runnable2);
            }
        } catch (RejectedExecutionException unused2) {
            runnable2 = runnable;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void H2(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable) {
        Runnable runnable2;
        try {
            runnable2 = runnable;
            try {
                CoroutineScheduler.r(this.f240611h, runnable2, null, true, 2, null);
            } catch (RejectedExecutionException unused) {
                P.f218782i.F2(iVar, runnable2);
            }
        } catch (RejectedExecutionException unused2) {
            runnable2 = runnable;
        }
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    public Executor Z2() {
        return this.f240611h;
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        this.f240611h.close();
    }

    @NotNull
    public final CoroutineDispatcher d3(int i10) {
        if (i10 > 0) {
            return new e(this, i10, null, 1);
        }
        throw new IllegalArgumentException(android.support.v4.media.c.a("Expected positive parallelism level, but have ", i10).toString());
    }

    public final CoroutineScheduler m3() {
        return new CoroutineScheduler(this.f240607d, this.f240608e, this.f240609f, this.f240610g);
    }

    public final void q3(@NotNull Runnable runnable, @NotNull j jVar, boolean z10) {
        try {
            this.f240611h.q(runnable, jVar, z10);
        } catch (RejectedExecutionException unused) {
            P.f218782i.h4(this.f240611h.l(runnable, jVar));
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return super.toString() + "[scheduler = " + this.f240611h + ']';
    }

    @NotNull
    public final CoroutineDispatcher v3(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Expected positive parallelism level, but have ", i10).toString());
        }
        if (i10 <= this.f240607d) {
            return new e(this, i10, null, 0);
        }
        throw new IllegalArgumentException(("Expected parallelism level lesser than core pool size (" + this.f240607d + "), but have " + i10).toString());
    }

    public /* synthetic */ c(int i10, int i11, long j10, String str, int i12, C4969v c4969v) {
        this(i10, i11, j10, (i12 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public /* synthetic */ c(int i10, int i11, String str, int i12, C4969v c4969v) {
        this((i12 & 1) != 0 ? m.f240630c : i10, (i12 & 2) != 0 ? m.f240631d : i11, (i12 & 4) != 0 ? m.f240628a : str);
    }

    public c(int i10, int i11, @NotNull String str) {
        this(i10, i11, m.f240632e, str);
    }

    public /* synthetic */ c(int i10, int i11, int i12, C4969v c4969v) {
        this((i12 & 1) != 0 ? m.f240630c : i10, (i12 & 2) != 0 ? m.f240631d : i11);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ c(int i10, int i11) {
        this(i10, i11, m.f240632e, null, 8, null);
    }
}
