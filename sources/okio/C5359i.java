package okio;

import java.io.EOFException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C5359i implements c0 {
    @Override // okio.c0
    public void O2(@NotNull C5360j source, long j10) throws EOFException {
        kotlin.jvm.internal.G.p(source, "source");
        source.skip(j10);
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.c0, java.io.Flushable
    public void flush() {
    }

    @Override // okio.c0
    @NotNull
    public g0 timeout() {
        return g0.f225946e;
    }
}
