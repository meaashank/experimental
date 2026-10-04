package l2;

import k2.C4819c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C4819c f220913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f220914b;

    public G(@NotNull C4819c buyer, @NotNull String name) {
        kotlin.jvm.internal.G.p(buyer, "buyer");
        kotlin.jvm.internal.G.p(name, "name");
        this.f220913a = buyer;
        this.f220914b = name;
    }

    @NotNull
    public final C4819c a() {
        return this.f220913a;
    }

    @NotNull
    public final String b() {
        return this.f220914b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return kotlin.jvm.internal.G.g(this.f220913a, g10.f220913a) && kotlin.jvm.internal.G.g(this.f220914b, g10.f220914b);
    }

    public int hashCode() {
        return this.f220914b.hashCode() + (this.f220913a.f214345a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "LeaveCustomAudience: buyer=" + this.f220913a + ", name=" + this.f220914b;
    }
}
