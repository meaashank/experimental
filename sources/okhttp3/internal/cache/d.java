package okhttp3.internal.cache;

import ed.l;
import java.io.EOFException;
import java.io.IOException;
import kotlin.L0;
import kotlin.jvm.internal.G;
import okio.AbstractC5369t;
import okio.C5360j;
import okio.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class d extends AbstractC5369t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final l<IOException, L0> f225573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f225574c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull c0 delegate, @NotNull l<? super IOException, L0> onException) {
        super(delegate);
        G.p(delegate, "delegate");
        G.p(onException, "onException");
        this.f225573b = onException;
    }

    @Override // okio.AbstractC5369t, okio.c0
    public void O2(@NotNull C5360j source, long j10) throws EOFException {
        G.p(source, "source");
        if (this.f225574c) {
            source.skip(j10);
            return;
        }
        try {
            super.O2(source, j10);
        } catch (IOException e10) {
            this.f225574c = true;
            this.f225573b.invoke(e10);
        }
    }

    @Override // okio.AbstractC5369t, okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f225574c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f225574c = true;
            this.f225573b.invoke(e10);
        }
    }

    @Override // okio.AbstractC5369t, okio.c0, java.io.Flushable
    public void flush() {
        if (this.f225574c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f225574c = true;
            this.f225573b.invoke(e10);
        }
    }

    @NotNull
    public final l<IOException, L0> l() {
        return this.f225573b;
    }
}
