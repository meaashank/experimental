package xd;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.C4969v;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class g extends ExecutorCoroutineDispatcher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f240619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f240620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f240621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f240622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public CoroutineScheduler f240623h;

    public g() {
        this(0, 0, 0L, null, 15, null);
    }

    private final CoroutineScheduler d3() {
        return new CoroutineScheduler(this.f240619d, this.f240620e, this.f240621f, this.f240622g);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void F2(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable) {
        CoroutineScheduler.r(this.f240623h, runnable, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void H2(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable) {
        CoroutineScheduler.r(this.f240623h, runnable, null, true, 2, null);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    public Executor Z2() {
        return this.f240623h;
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        this.f240623h.close();
    }

    public final void k3(@NotNull Runnable runnable, @NotNull j jVar, boolean z10) {
        this.f240623h.q(runnable, jVar, z10);
    }

    public final void m3() {
        v3();
    }

    public final synchronized void q3(long j10) {
        this.f240623h.Y1(j10);
    }

    public final synchronized void v3() {
        this.f240623h.Y1(1000L);
        this.f240623h = d3();
    }

    public g(int i10, int i11, long j10, @NotNull String str) {
        this.f240619d = i10;
        this.f240620e = i11;
        this.f240621f = j10;
        this.f240622g = str;
        this.f240623h = d3();
    }

    public /* synthetic */ g(int i10, int i11, long j10, String str, int i12, C4969v c4969v) {
        this((i12 & 1) != 0 ? m.f240630c : i10, (i12 & 2) != 0 ? m.f240631d : i11, (i12 & 4) != 0 ? m.f240632e : j10, (i12 & 8) != 0 ? "CoroutineScheduler" : str);
    }
}
