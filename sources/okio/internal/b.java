package okio.internal;

import java.io.IOException;
import kotlin.jvm.internal.G;
import okio.AbstractC5370u;
import okio.C5360j;
import okio.e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends AbstractC5370u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f226027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f226028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f226029d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull e0 delegate, long j10, boolean z10) {
        super(delegate);
        G.p(delegate, "delegate");
        this.f226027b = j10;
        this.f226028c = z10;
    }

    @Override // okio.AbstractC5370u, okio.e0
    public long L3(@NotNull C5360j sink, long j10) throws IOException {
        G.p(sink, "sink");
        long j11 = this.f226029d;
        long j12 = this.f226027b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f226028c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long jL3 = super.L3(sink, j10);
        if (jL3 != -1) {
            this.f226029d += jL3;
        }
        long j14 = this.f226029d;
        long j15 = this.f226027b;
        if ((j14 >= j15 || jL3 != -1) && j14 <= j15) {
            return jL3;
        }
        if (jL3 > 0 && j14 > j15) {
            l(sink, sink.f226051b - (j14 - j15));
        }
        throw new IOException("expected " + this.f226027b + " bytes but got " + this.f226029d);
    }

    public final void l(C5360j c5360j, long j10) throws IOException {
        C5360j c5360j2 = new C5360j();
        c5360j2.Q2(c5360j);
        c5360j.O2(c5360j2, j10);
        c5360j2.l();
    }
}
