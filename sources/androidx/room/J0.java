package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nTransactionExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionExecutor.kt\nandroidx/room/TransactionExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
public final class J0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Executor f117114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<Runnable> f117115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Runnable f117116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Object f117117d;

    public J0(@NotNull Executor executor) {
        kotlin.jvm.internal.G.p(executor, "executor");
        this.f117114a = executor;
        this.f117115b = new ArrayDeque<>();
        this.f117117d = new Object();
    }

    public static final void b(Runnable command, J0 this$0) {
        kotlin.jvm.internal.G.p(command, "$command");
        kotlin.jvm.internal.G.p(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.c();
        }
    }

    public final void c() {
        synchronized (this.f117117d) {
            Runnable runnablePoll = this.f117115b.poll();
            Runnable runnable = runnablePoll;
            this.f117116c = runnable;
            if (runnablePoll != null) {
                this.f117114a.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull final Runnable command) {
        kotlin.jvm.internal.G.p(command, "command");
        synchronized (this.f117117d) {
            this.f117115b.offer(new Runnable() { // from class: androidx.room.I0
                @Override // java.lang.Runnable
                public final void run() {
                    J0.b(command, this);
                }
            });
            if (this.f117116c == null) {
                c();
            }
        }
    }
}
