package kotlin;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@cd.f(couldBeConvertedToExplicitExport = true)
public final class Pair<A, B> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f217467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f217468b;

    public Pair(A a10, B b10) {
        this.f217467a = a10;
        this.f217468b = b10;
    }

    public static Pair i(Pair pair, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = pair.f217467a;
        }
        if ((i10 & 2) != 0) {
            obj2 = pair.f217468b;
        }
        pair.getClass();
        return new Pair(obj, obj2);
    }

    public final A d() {
        return this.f217467a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return kotlin.jvm.internal.G.g(this.f217467a, pair.f217467a) && kotlin.jvm.internal.G.g(this.f217468b, pair.f217468b);
    }

    public final B g() {
        return this.f217468b;
    }

    @NotNull
    public final Pair<A, B> h(A a10, B b10) {
        return new Pair<>(a10, b10);
    }

    public int hashCode() {
        A a10 = this.f217467a;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f217468b;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public final A j() {
        return this.f217467a;
    }

    public final B k() {
        return this.f217468b;
    }

    @NotNull
    public String toString() {
        return "(" + this.f217467a + U6.j.f68738d + this.f217468b + ')';
    }
}
