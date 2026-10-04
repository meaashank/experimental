package i0;

import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class c<T> implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f202772c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f202773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f202774b;

    public c(T t10, T t11) {
        this.f202773a = t10;
        this.f202774b = t11;
    }

    public static c d(c cVar, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = cVar.f202773a;
        }
        if ((i10 & 2) != 0) {
            obj2 = cVar.f202774b;
        }
        cVar.getClass();
        return new c(obj, obj2);
    }

    public final T a() {
        return this.f202773a;
    }

    public final T b() {
        return this.f202774b;
    }

    @NotNull
    public final c<T> c(T t10, T t11) {
        return new c<>(t10, t11);
    }

    public final T e() {
        return this.f202773a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return G.g(this.f202773a, cVar.f202773a) && G.g(this.f202774b, cVar.f202774b);
    }

    public final T f() {
        return this.f202774b;
    }

    public int hashCode() {
        T t10 = this.f202773a;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f202774b;
        return iHashCode + (t11 != null ? t11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TargetState(initial=" + this.f202773a + ", target=" + this.f202774b + ')';
    }
}
