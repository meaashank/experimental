package Ed;

import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f33877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f33878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public c f33879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f33880d;

    public a(@NotNull String name, boolean z10) {
        G.p(name, "name");
        this.f33877a = name;
        this.f33878b = z10;
        this.f33880d = -1L;
    }

    public final boolean a() {
        return this.f33878b;
    }

    @NotNull
    public final String b() {
        return this.f33877a;
    }

    public final long c() {
        return this.f33880d;
    }

    @Nullable
    public final c d() {
        return this.f33879c;
    }

    public final void e(@NotNull c queue) {
        G.p(queue, "queue");
        c cVar = this.f33879c;
        if (cVar == queue) {
            return;
        }
        if (cVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f33879c = queue;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f33880d = j10;
    }

    public final void h(@Nullable c cVar) {
        this.f33879c = cVar;
    }

    @NotNull
    public String toString() {
        return this.f33877a;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, C4969v c4969v) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
