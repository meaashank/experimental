package okio;

import java.io.IOException;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5370u implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e0 f226100a;

    public AbstractC5370u(@NotNull e0 delegate) {
        kotlin.jvm.internal.G.p(delegate, "delegate");
        this.f226100a = delegate;
    }

    @Override // okio.e0
    public long L3(@NotNull C5360j sink, long j10) throws IOException {
        kotlin.jvm.internal.G.p(sink, "sink");
        return this.f226100a.L3(sink, j10);
    }

    @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f226100a.close();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "delegate", imports = {}))
    @dd.j(name = "-deprecated_delegate")
    @NotNull
    public final e0 d() {
        return this.f226100a;
    }

    @dd.j(name = "delegate")
    @NotNull
    public final e0 k() {
        return this.f226100a;
    }

    @Override // okio.e0
    @NotNull
    public g0 timeout() {
        return this.f226100a.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.f226100a + ')';
    }
}
