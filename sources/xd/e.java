package xd;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends ExecutorCoroutineDispatcher implements j, Executor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f240612i = AtomicIntegerFieldUpdater.newUpdater(e.class, "inFlightTasks$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c f240613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f240614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f240615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f240616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ConcurrentLinkedQueue<Runnable> f240617h = new ConcurrentLinkedQueue<>();
    private volatile /* synthetic */ int inFlightTasks$volatile;

    public e(@NotNull c cVar, int i10, @Nullable String str, int i11) {
        this.f240613d = cVar;
        this.f240614e = i10;
        this.f240615f = str;
        this.f240616g = i11;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void F2(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable) {
        d3(runnable, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void H2(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable) {
        d3(runnable, true);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher");
    }

    @Override // xd.j
    public void d() {
        Runnable runnablePoll = this.f240617h.poll();
        if (runnablePoll != null) {
            this.f240613d.q3(runnablePoll, this, true);
            return;
        }
        f240612i.decrementAndGet(this);
        Runnable runnablePoll2 = this.f240617h.poll();
        if (runnablePoll2 == null) {
            return;
        }
        d3(runnablePoll2, true);
    }

    public final void d3(Runnable runnable, boolean z10) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f240612i;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f240614e) {
                this.f240613d.q3(runnable, this, z10);
                return;
            }
            this.f240617h.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f240614e) {
                return;
            } else {
                runnable = this.f240617h.poll();
            }
        } while (runnable != null);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        d3(runnable, false);
    }

    @Override // xd.j
    public int h2() {
        return this.f240616g;
    }

    public final /* synthetic */ int k3() {
        return this.inFlightTasks$volatile;
    }

    public final /* synthetic */ void q3(int i10) {
        this.inFlightTasks$volatile = i10;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        String str = this.f240615f;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f240613d + ']';
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    public Executor Z2() {
        return this;
    }
}
