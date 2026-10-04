package androidx.compose.material;

import androidx.compose.animation.C1571b;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@P
@InterfaceC1924k0
@InterfaceC4982o(message = SwipeableKt.f97668a)
public final class C0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f95796d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f95797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f95798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f95799c;

    public C0(T t10, T t11, float f10) {
        this.f95797a = t10;
        this.f95798b = t11;
        this.f95799c = f10;
    }

    public final float a() {
        return this.f95799c;
    }

    public final T b() {
        return this.f95797a;
    }

    public final T c() {
        return this.f95798b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        return kotlin.jvm.internal.G.g(this.f95797a, c02.f95797a) && kotlin.jvm.internal.G.g(this.f95798b, c02.f95798b) && this.f95799c == c02.f95799c;
    }

    public int hashCode() {
        T t10 = this.f95797a;
        int iHashCode = (t10 != null ? t10.hashCode() : 0) * 31;
        T t11 = this.f95798b;
        return Float.floatToIntBits(this.f95799c) + ((iHashCode + (t11 != null ? t11.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SwipeProgress(from=");
        sb2.append(this.f95797a);
        sb2.append(", to=");
        sb2.append(this.f95798b);
        sb2.append(", fraction=");
        return C1571b.a(sb2, this.f95799c, ')');
    }
}
