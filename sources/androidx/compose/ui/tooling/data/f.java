package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@q
@r(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f105372c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f105373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f105374b;

    public f(@Nullable Object obj, @Nullable Object obj2) {
        this.f105373a = obj;
        this.f105374b = obj2;
    }

    public static f d(f fVar, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = fVar.f105373a;
        }
        if ((i10 & 2) != 0) {
            obj2 = fVar.f105374b;
        }
        fVar.getClass();
        return new f(obj, obj2);
    }

    @Nullable
    public final Object a() {
        return this.f105373a;
    }

    @Nullable
    public final Object b() {
        return this.f105374b;
    }

    @NotNull
    public final f c(@Nullable Object obj, @Nullable Object obj2) {
        return new f(obj, obj2);
    }

    @Nullable
    public final Object e() {
        return this.f105373a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return G.g(this.f105373a, fVar.f105373a) && G.g(this.f105374b, fVar.f105374b);
    }

    @Nullable
    public final Object f() {
        return this.f105374b;
    }

    public int hashCode() {
        Object obj = this.f105373a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f105374b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "JoinedKey(left=" + this.f105373a + ", right=" + this.f105374b + ')';
    }
}
