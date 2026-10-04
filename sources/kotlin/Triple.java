package kotlin;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@cd.f(couldBeConvertedToExplicitExport = true)
public final class Triple<A, B, C> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f217480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f217481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f217482c;

    public Triple(A a10, B b10, C c10) {
        this.f217480a = a10;
        this.f217481b = b10;
        this.f217482c = c10;
    }

    public static Triple j(Triple triple, Object obj, Object obj2, Object obj3, int i10, Object obj4) {
        if ((i10 & 1) != 0) {
            obj = triple.f217480a;
        }
        if ((i10 & 2) != 0) {
            obj2 = triple.f217481b;
        }
        if ((i10 & 4) != 0) {
            obj3 = triple.f217482c;
        }
        triple.getClass();
        return new Triple(obj, obj2, obj3);
    }

    public final A d() {
        return this.f217480a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return kotlin.jvm.internal.G.g(this.f217480a, triple.f217480a) && kotlin.jvm.internal.G.g(this.f217481b, triple.f217481b) && kotlin.jvm.internal.G.g(this.f217482c, triple.f217482c);
    }

    public final B g() {
        return this.f217481b;
    }

    public final C h() {
        return this.f217482c;
    }

    public int hashCode() {
        A a10 = this.f217480a;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f217481b;
        int iHashCode2 = (iHashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f217482c;
        return iHashCode2 + (c10 != null ? c10.hashCode() : 0);
    }

    @NotNull
    public final Triple<A, B, C> i(A a10, B b10, C c10) {
        return new Triple<>(a10, b10, c10);
    }

    public final A k() {
        return this.f217480a;
    }

    public final B l() {
        return this.f217481b;
    }

    public final C m() {
        return this.f217482c;
    }

    @NotNull
    public String toString() {
        return "(" + this.f217480a + U6.j.f68738d + this.f217481b + U6.j.f68738d + this.f217482c + ')';
    }
}
