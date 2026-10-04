package kotlin.time;

import kotlin.InterfaceC4887e0;
import kotlin.O0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.9")
@O0(markerClass = {n.class})
public final class G<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f218383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f218384b;

    public /* synthetic */ G(Object obj, long j10, C4969v c4969v) {
        this(obj, j10);
    }

    public static G d(G g10, Object obj, long j10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = g10.f218383a;
        }
        if ((i10 & 2) != 0) {
            j10 = g10.f218384b;
        }
        g10.getClass();
        return new G(obj, j10);
    }

    public final T a() {
        return this.f218383a;
    }

    public final long b() {
        return this.f218384b;
    }

    @NotNull
    public final G<T> c(T t10, long j10) {
        return new G<>(t10, j10);
    }

    public final long e() {
        return this.f218384b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return kotlin.jvm.internal.G.g(this.f218383a, g10.f218383a) && C5041h.s(this.f218384b, g10.f218384b);
    }

    public final T f() {
        return this.f218383a;
    }

    public int hashCode() {
        T t10 = this.f218383a;
        return C5041h.M(this.f218384b) + ((t10 == null ? 0 : t10.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "TimedValue(value=" + this.f218383a + ", duration=" + ((Object) C5041h.h0(this.f218384b)) + ')';
    }

    public G(T t10, long j10) {
        this.f218383a = t10;
        this.f218384b = j10;
    }
}
