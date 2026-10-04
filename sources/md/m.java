package md;

import fd.InterfaceC4418a;
import kotlin.collections.g0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class m implements Iterable<Long>, InterfaceC4418a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f221148d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f221149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f221150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f221151c;

    public static final class a {
        public a() {
        }

        @NotNull
        public final m a(long j10, long j11, long j12) {
            return new m(j10, j11, j12);
        }

        public a(C4969v c4969v) {
        }
    }

    public m(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f221149a = j10;
        this.f221150b = Xc.o.d(j10, j11, j12);
        this.f221151c = j12;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (isEmpty() && ((m) obj).isEmpty()) {
            return true;
        }
        m mVar = (m) obj;
        return this.f221149a == mVar.f221149a && this.f221150b == mVar.f221150b && this.f221151c == mVar.f221151c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = 31;
        long j11 = this.f221149a;
        long j12 = this.f221150b;
        long j13 = (((j11 ^ (j11 >>> 32)) * j10) + (j12 ^ (j12 >>> 32))) * j10;
        long j14 = this.f221151c;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    public boolean isEmpty() {
        long j10 = this.f221151c;
        long j11 = this.f221149a;
        long j12 = this.f221150b;
        return j10 > 0 ? j11 > j12 : j11 < j12;
    }

    public final long j() {
        return this.f221149a;
    }

    public final long o() {
        return this.f221150b;
    }

    public final long q() {
        return this.f221151c;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public g0 iterator() {
        return new n(this.f221149a, this.f221150b, this.f221151c);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        long j10;
        if (this.f221151c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f221149a);
            sb2.append("..");
            sb2.append(this.f221150b);
            sb2.append(" step ");
            j10 = this.f221151c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f221149a);
            sb2.append(" downTo ");
            sb2.append(this.f221150b);
            sb2.append(" step ");
            j10 = -this.f221151c;
        }
        sb2.append(j10);
        return sb2.toString();
    }
}
