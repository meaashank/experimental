package Nd;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.G;
import okio.A;
import okio.C5360j;
import okio.e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f64953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C5360j f64954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Inflater f64955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final A f64956d;

    public c(boolean z10) {
        this.f64953a = z10;
        C5360j c5360j = new C5360j();
        this.f64954b = c5360j;
        Inflater inflater = new Inflater(true);
        this.f64955c = inflater;
        this.f64956d = new A((e0) c5360j, inflater);
    }

    public final void a(@NotNull C5360j buffer) throws IOException {
        G.p(buffer, "buffer");
        if (this.f64954b.f226051b != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f64953a) {
            this.f64955c.reset();
        }
        this.f64954b.Q2(buffer);
        this.f64954b.b4(65535);
        long bytesRead = this.f64955c.getBytesRead() + this.f64954b.f226051b;
        do {
            this.f64956d.a(buffer, Long.MAX_VALUE);
        } while (this.f64955c.getBytesRead() < bytesRead);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f64956d.close();
    }
}
