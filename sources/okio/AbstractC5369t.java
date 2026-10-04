package okio;

import java.io.IOException;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5369t implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c0 f226099a;

    public AbstractC5369t(@NotNull c0 delegate) {
        kotlin.jvm.internal.G.p(delegate, "delegate");
        this.f226099a = delegate;
    }

    @Override // okio.c0
    public void O2(@NotNull C5360j source, long j10) throws IOException {
        kotlin.jvm.internal.G.p(source, "source");
        this.f226099a.O2(source, j10);
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f226099a.close();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "delegate", imports = {}))
    @dd.j(name = "-deprecated_delegate")
    @NotNull
    public final c0 d() {
        return this.f226099a;
    }

    @Override // okio.c0, java.io.Flushable
    public void flush() throws IOException {
        this.f226099a.flush();
    }

    @dd.j(name = "delegate")
    @NotNull
    public final c0 k() {
        return this.f226099a;
    }

    @Override // okio.c0
    @NotNull
    public g0 timeout() {
        return this.f226099a.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.f226099a + ')';
    }
}
