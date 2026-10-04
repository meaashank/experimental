package md;

import kotlin.B0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC5043v;
import kotlin.N0;
import kotlin.O0;
import kotlin.jvm.internal.C4969v;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: md.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.5")
public final class C5222A extends y implements g<B0>, r<B0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f221118e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final C5222A f221119f = new C5222A(-1, 0);

    /* JADX INFO: renamed from: md.A$a */
    public static final class a {
        public a() {
        }

        @NotNull
        public final C5222A a() {
            return C5222A.f221119f;
        }

        public a(C4969v c4969v) {
        }
    }

    public C5222A(long j10, long j11) {
        super(j10, j11, 1L);
    }

    public long A() {
        return this.f221173a;
    }

    @Override // md.g
    public Comparable b() {
        return new B0(this.f221173a);
    }

    @Override // md.g
    public /* synthetic */ boolean contains(Comparable comparable) {
        return v(((B0) comparable).f217440a);
    }

    @Override // md.y
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C5222A)) {
            return false;
        }
        if (isEmpty() && ((C5222A) obj).isEmpty()) {
            return true;
        }
        C5222A c5222a = (C5222A) obj;
        return this.f221173a == c5222a.f221173a && this.f221174b == c5222a.f221174b;
    }

    @Override // md.g
    public Comparable h() {
        return new B0(this.f221174b);
    }

    @Override // md.y
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = this.f221173a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f221174b;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    @Override // md.r
    public /* synthetic */ Comparable i() {
        return new B0(w());
    }

    @Override // md.y, md.g
    public boolean isEmpty() {
        return Long.compare(this.f221173a ^ Long.MIN_VALUE, this.f221174b ^ Long.MIN_VALUE) > 0;
    }

    @Override // md.y
    @NotNull
    public String toString() {
        return ((Object) N0.t(this.f221173a, 10)) + ".." + ((Object) N0.t(this.f221174b, 10));
    }

    public boolean v(long j10) {
        return Long.compare(this.f221173a ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) <= 0 && Long.compare(j10 ^ Long.MIN_VALUE, this.f221174b ^ Long.MIN_VALUE) <= 0;
    }

    public long w() {
        long j10 = this.f221174b;
        if (j10 != -1) {
            return j10 + (((long) 1) & ZipKt.f225990j);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    public long z() {
        return this.f221174b;
    }

    public /* synthetic */ C5222A(long j10, long j11, C4969v c4969v) {
        this(j10, j11);
    }

    @InterfaceC4887e0(version = "1.9")
    @InterfaceC4982o(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @O0(markerClass = {InterfaceC5043v.class})
    public static /* synthetic */ void x() {
    }
}
