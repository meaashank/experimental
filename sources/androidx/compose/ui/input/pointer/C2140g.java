package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@androidx.compose.ui.i
public final class C2140g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f102285d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f102287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f102288c;

    public C2140g(long j10, long j11, long j12) {
        this(j10, j11);
        this.f102288c = j12;
    }

    public final long a() {
        return this.f102288c;
    }

    public final long b() {
        return this.f102287b;
    }

    public final long c() {
        return this.f102286a;
    }

    @NotNull
    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f102286a + ", position=" + ((Object) P.g.y(this.f102287b)) + ')';
    }

    public /* synthetic */ C2140g(long j10, long j11, long j12, C4969v c4969v) {
        this(j10, j11, j12);
    }

    public /* synthetic */ C2140g(long j10, long j11, C4969v c4969v) {
        this(j10, j11);
    }

    public C2140g(long j10, long j11) {
        this.f102286a = j10;
        this.f102287b = j11;
        P.g.f65503b.getClass();
        this.f102288c = P.g.f65504c;
    }
}
