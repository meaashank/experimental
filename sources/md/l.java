package md;

import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC5043v;
import kotlin.O0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends j implements g<Integer>, r<Integer> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f221146e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final l f221147f = new l(1, 0, 1);

    public static final class a {
        public a() {
        }

        @NotNull
        public final l a() {
            return l.f221147f;
        }

        public a(C4969v c4969v) {
        }
    }

    public l(int i10, int i11) {
        super(i10, i11, 1);
    }

    @NotNull
    public Integer A() {
        return Integer.valueOf(this.f221140b);
    }

    @NotNull
    public Integer B() {
        return Integer.valueOf(this.f221139a);
    }

    @Override // md.g
    public Comparable b() {
        return Integer.valueOf(this.f221139a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // md.g
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return w(((Number) comparable).intValue());
    }

    @Override // md.j
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (isEmpty() && ((l) obj).isEmpty()) {
            return true;
        }
        l lVar = (l) obj;
        return this.f221139a == lVar.f221139a && this.f221140b == lVar.f221140b;
    }

    @Override // md.g
    public Comparable h() {
        return Integer.valueOf(this.f221140b);
    }

    @Override // md.j
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f221139a * 31) + this.f221140b;
    }

    @Override // md.j, md.g
    public boolean isEmpty() {
        return this.f221139a > this.f221140b;
    }

    @Override // md.j
    @NotNull
    public String toString() {
        return this.f221139a + ".." + this.f221140b;
    }

    public boolean w(int i10) {
        return this.f221139a <= i10 && i10 <= this.f221140b;
    }

    @Override // md.r
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Integer i() {
        int i10 = this.f221140b;
        if (i10 != Integer.MAX_VALUE) {
            return Integer.valueOf(i10 + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @InterfaceC4887e0(version = "1.9")
    @InterfaceC4982o(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @O0(markerClass = {InterfaceC5043v.class})
    public static /* synthetic */ void z() {
    }
}
