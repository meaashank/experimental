package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class U0<V extends AbstractC1603p> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f87992d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final V f87993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final G f87994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f87995c;

    public /* synthetic */ U0(AbstractC1603p abstractC1603p, G g10, int i10, C4969v c4969v) {
        this(abstractC1603p, g10, i10);
    }

    public static U0 e(U0 u02, AbstractC1603p abstractC1603p, G g10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC1603p = u02.f87993a;
        }
        if ((i11 & 2) != 0) {
            g10 = u02.f87994b;
        }
        if ((i11 & 4) != 0) {
            i10 = u02.f87995c;
        }
        u02.getClass();
        return new U0(abstractC1603p, g10, i10);
    }

    @NotNull
    public final V a() {
        return this.f87993a;
    }

    @NotNull
    public final G b() {
        return this.f87994b;
    }

    public final int c() {
        return this.f87995c;
    }

    @NotNull
    public final U0<V> d(@NotNull V v10, @NotNull G g10, int i10) {
        return new U0<>(v10, g10, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u02 = (U0) obj;
        return kotlin.jvm.internal.G.g(this.f87993a, u02.f87993a) && kotlin.jvm.internal.G.g(this.f87994b, u02.f87994b) && this.f87995c == u02.f87995c;
    }

    public final int f() {
        return this.f87995c;
    }

    @NotNull
    public final G g() {
        return this.f87994b;
    }

    @NotNull
    public final V h() {
        return this.f87993a;
    }

    public int hashCode() {
        return ((this.f87994b.hashCode() + (this.f87993a.hashCode() * 31)) * 31) + this.f87995c;
    }

    @NotNull
    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f87993a + ", easing=" + this.f87994b + ", arcMode=" + ((Object) C1612u.i(this.f87995c)) + ')';
    }

    public U0(V v10, G g10, int i10) {
        this.f87993a = v10;
        this.f87994b = g10;
        this.f87995c = i10;
    }
}
