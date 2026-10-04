package androidx.compose.foundation.text.input.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class V0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f94038c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WedgeAffinity f94039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WedgeAffinity f94040b;

    public V0(@NotNull WedgeAffinity wedgeAffinity, @NotNull WedgeAffinity wedgeAffinity2) {
        this.f94039a = wedgeAffinity;
        this.f94040b = wedgeAffinity2;
    }

    public static V0 d(V0 v02, WedgeAffinity wedgeAffinity, WedgeAffinity wedgeAffinity2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            wedgeAffinity = v02.f94039a;
        }
        if ((i10 & 2) != 0) {
            wedgeAffinity2 = v02.f94040b;
        }
        v02.getClass();
        return new V0(wedgeAffinity, wedgeAffinity2);
    }

    @NotNull
    public final WedgeAffinity a() {
        return this.f94039a;
    }

    @NotNull
    public final WedgeAffinity b() {
        return this.f94040b;
    }

    @NotNull
    public final V0 c(@NotNull WedgeAffinity wedgeAffinity, @NotNull WedgeAffinity wedgeAffinity2) {
        return new V0(wedgeAffinity, wedgeAffinity2);
    }

    @NotNull
    public final WedgeAffinity e() {
        return this.f94040b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V0)) {
            return false;
        }
        V0 v02 = (V0) obj;
        return this.f94039a == v02.f94039a && this.f94040b == v02.f94040b;
    }

    @NotNull
    public final WedgeAffinity f() {
        return this.f94039a;
    }

    public int hashCode() {
        return this.f94040b.hashCode() + (this.f94039a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.f94039a + ", endAffinity=" + this.f94040b + ')';
    }

    public V0(@NotNull WedgeAffinity wedgeAffinity) {
        this(wedgeAffinity, wedgeAffinity);
    }
}
