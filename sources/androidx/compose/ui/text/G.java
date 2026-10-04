package androidx.compose.ui.text;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class G {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104235c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final E f104236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final D f104237b;

    public /* synthetic */ G(int i10, C4969v c4969v) {
        this(i10);
    }

    @Nullable
    public final D a() {
        return this.f104237b;
    }

    @Nullable
    public final E b() {
        return this.f104236a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return kotlin.jvm.internal.G.g(this.f104237b, g10.f104237b) && kotlin.jvm.internal.G.g(this.f104236a, g10.f104236a);
    }

    public int hashCode() {
        E e10 = this.f104236a;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * 31;
        D d10 = this.f104237b;
        return iHashCode + (d10 != null ? d10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f104236a + ", paragraphSyle=" + this.f104237b + ')';
    }

    public G(@Nullable E e10, @Nullable D d10) {
        this.f104236a = e10;
        this.f104237b = d10;
    }

    public /* synthetic */ G(boolean z10, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public G(boolean z10) {
        this((E) null, new D(z10));
    }

    public G(int i10) {
        this((E) null, new D(i10));
    }
}
