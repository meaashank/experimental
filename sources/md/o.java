package md;

import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC5043v;
import kotlin.O0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends m implements g<Long>, r<Long> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f221156e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final o f221157f = new o(1, 0);

    public static final class a {
        public a() {
        }

        @NotNull
        public final o a() {
            return o.f221157f;
        }

        public a(C4969v c4969v) {
        }
    }

    public o(long j10, long j11) {
        super(j10, j11, 1L);
    }

    @NotNull
    public Long A() {
        return Long.valueOf(this.f221150b);
    }

    @NotNull
    public Long B() {
        return Long.valueOf(this.f221149a);
    }

    @Override // md.g
    public Comparable b() {
        return Long.valueOf(this.f221149a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // md.g
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return w(((Number) comparable).longValue());
    }

    @Override // md.m
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (isEmpty() && ((o) obj).isEmpty()) {
            return true;
        }
        o oVar = (o) obj;
        return this.f221149a == oVar.f221149a && this.f221150b == oVar.f221150b;
    }

    @Override // md.g
    public Comparable h() {
        return Long.valueOf(this.f221150b);
    }

    @Override // md.m
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = this.f221149a;
        long j11 = ((long) 31) * (j10 ^ (j10 >>> 32));
        long j12 = this.f221150b;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    @Override // md.m, md.g
    public boolean isEmpty() {
        return this.f221149a > this.f221150b;
    }

    @Override // md.m
    @NotNull
    public String toString() {
        return this.f221149a + ".." + this.f221150b;
    }

    public boolean w(long j10) {
        return this.f221149a <= j10 && j10 <= this.f221150b;
    }

    @Override // md.r
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Long i() {
        long j10 = this.f221150b;
        if (j10 != Long.MAX_VALUE) {
            return Long.valueOf(j10 + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @InterfaceC4887e0(version = "1.9")
    @InterfaceC4982o(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @O0(markerClass = {InterfaceC5043v.class})
    public static /* synthetic */ void z() {
    }
}
