package md;

import fd.InterfaceC4418a;
import java.util.Iterator;
import kotlin.B0;
import kotlin.InterfaceC4887e0;
import kotlin.N0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.5")
public class y implements Iterable<B0>, InterfaceC4418a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f221172d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f221173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f221174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f221175c;

    public static final class a {
        public a() {
        }

        @NotNull
        public final y a(long j10, long j11, long j12) {
            return new y(j10, j11, j12);
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ y(long j10, long j11, long j12, C4969v c4969v) {
        this(j10, j11, j12);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        if (isEmpty() && ((y) obj).isEmpty()) {
            return true;
        }
        y yVar = (y) obj;
        return this.f221173a == yVar.f221173a && this.f221174b == yVar.f221174b && this.f221175c == yVar.f221175c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = this.f221173a;
        long j11 = this.f221174b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f221175c;
        return i10 + ((int) ((j12 >>> 32) ^ j12));
    }

    public boolean isEmpty() {
        long j10 = this.f221175c;
        long j11 = this.f221173a;
        long j12 = this.f221174b;
        return j10 > 0 ? Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) > 0 : Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) < 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<B0> iterator() {
        return new z(this.f221173a, this.f221174b, this.f221175c);
    }

    public final long j() {
        return this.f221173a;
    }

    public final long o() {
        return this.f221174b;
    }

    public final long q() {
        return this.f221175c;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        long j10;
        if (this.f221175c > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) N0.t(this.f221173a, 10));
            sb2.append("..");
            sb2.append((Object) N0.t(this.f221174b, 10));
            sb2.append(" step ");
            j10 = this.f221175c;
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) N0.t(this.f221173a, 10));
            sb2.append(" downTo ");
            sb2.append((Object) N0.t(this.f221174b, 10));
            sb2.append(" step ");
            j10 = -this.f221175c;
        }
        sb2.append(j10);
        return sb2.toString();
    }

    public y(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f221173a = j10;
        this.f221174b = Xc.t.c(j10, j11, j12);
        this.f221175c = j12;
    }
}
