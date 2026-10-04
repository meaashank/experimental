package androidx.lifecycle;

import e.InterfaceC4330d;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlinx.coroutines.C5052b0;
import kotlinx.coroutines.J0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2600m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f114356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f114357c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f114355a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Queue<Runnable> f114358d = new ArrayDeque();

    public static final void d(C2600m this$0, Runnable runnable) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(runnable, "$runnable");
        this$0.f(runnable);
    }

    @e.I
    public final boolean b() {
        return this.f114356b || !this.f114355a;
    }

    @InterfaceC4330d
    public final void c(@NotNull kotlin.coroutines.i context, @NotNull final Runnable runnable) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(runnable, "runnable");
        J0 j0Z2 = C5052b0.e().Z2();
        if (j0Z2.J2(context) || b()) {
            j0Z2.F2(context, new Runnable() { // from class: androidx.lifecycle.l
                @Override // java.lang.Runnable
                public final void run() {
                    C2600m.d(this.f114352a, runnable);
                }
            });
        } else {
            f(runnable);
        }
    }

    @e.I
    public final void e() {
        if (this.f114357c) {
            return;
        }
        try {
            this.f114357c = true;
            while (!this.f114358d.isEmpty() && b()) {
                Runnable runnablePoll = this.f114358d.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
        } finally {
            this.f114357c = false;
        }
    }

    @e.I
    public final void f(Runnable runnable) {
        if (!this.f114358d.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        e();
    }

    @e.I
    public final void g() {
        this.f114356b = true;
        e();
    }

    @e.I
    public final void h() {
        this.f114355a = true;
    }

    @e.I
    public final void i() {
        if (this.f114355a) {
            if (this.f114356b) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.f114355a = false;
            e();
        }
    }
}
