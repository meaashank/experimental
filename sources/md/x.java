package md;

import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC5043v;
import kotlin.O0;
import kotlin.jvm.internal.C4969v;
import kotlin.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.5")
public final class x extends v implements g<x0>, r<x0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f221170e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final x f221171f = new x(-1, 0, 1);

    public static final class a {
        public a() {
        }

        @NotNull
        public final x a() {
            return x.f221171f;
        }

        public a(C4969v c4969v) {
        }
    }

    public x(int i10, int i11) {
        super(i10, i11, 1);
    }

    public int A() {
        return this.f221163a;
    }

    @Override // md.g
    public Comparable b() {
        return new x0(this.f221163a);
    }

    @Override // md.g
    public /* synthetic */ boolean contains(Comparable comparable) {
        return v(((x0) comparable).f218498a);
    }

    @Override // md.v
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        if (isEmpty() && ((x) obj).isEmpty()) {
            return true;
        }
        x xVar = (x) obj;
        return this.f221163a == xVar.f221163a && this.f221164b == xVar.f221164b;
    }

    @Override // md.g
    public Comparable h() {
        return new x0(this.f221164b);
    }

    @Override // md.v
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f221163a * 31) + this.f221164b;
    }

    @Override // md.r
    public /* synthetic */ Comparable i() {
        return new x0(w());
    }

    @Override // md.v, md.g
    public boolean isEmpty() {
        return Integer.compare(this.f221163a ^ Integer.MIN_VALUE, this.f221164b ^ Integer.MIN_VALUE) > 0;
    }

    @Override // md.v
    @NotNull
    public String toString() {
        return ((Object) x0.g0(this.f221163a)) + ".." + ((Object) x0.g0(this.f221164b));
    }

    public boolean v(int i10) {
        return Integer.compare(this.f221163a ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) <= 0 && Integer.compare(i10 ^ Integer.MIN_VALUE, this.f221164b ^ Integer.MIN_VALUE) <= 0;
    }

    public int w() {
        int i10 = this.f221164b;
        if (i10 != -1) {
            return i10 + 1;
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    public int z() {
        return this.f221164b;
    }

    public x(int i10, int i11, C4969v c4969v) {
        super(i10, i11, 1);
    }

    @InterfaceC4887e0(version = "1.9")
    @InterfaceC4982o(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @O0(markerClass = {InterfaceC5043v.class})
    public static /* synthetic */ void x() {
    }
}
