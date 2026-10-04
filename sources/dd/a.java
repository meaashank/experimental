package Dd;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.G;
import okio.C5360j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FileChannel f28045a;

    public a(@NotNull FileChannel fileChannel) {
        G.p(fileChannel, "fileChannel");
        this.f28045a = fileChannel;
    }

    public final void a(long j10, @NotNull C5360j sink, long j11) throws IOException {
        G.p(sink, "sink");
        if (j11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j12 = j10;
        long j13 = j11;
        while (j13 > 0) {
            long jTransferTo = this.f28045a.transferTo(j12, j13, sink);
            j12 += jTransferTo;
            j13 -= jTransferTo;
        }
    }

    public final void b(long j10, @NotNull C5360j source, long j11) throws IOException {
        G.p(source, "source");
        if (j11 < 0 || j11 > source.f226051b) {
            throw new IndexOutOfBoundsException();
        }
        long j12 = j10;
        long j13 = j11;
        while (j13 > 0) {
            long jTransferFrom = this.f28045a.transferFrom(source, j12, j13);
            j12 += jTransferFrom;
            j13 -= jTransferFrom;
        }
    }
}
