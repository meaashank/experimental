package androidx.compose.ui.platform;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class B1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f103425c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f103426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f103427b;

    public B1(@NotNull String str, @Nullable Object obj) {
        this.f103426a = str;
        this.f103427b = obj;
    }

    public static B1 d(B1 b12, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = b12.f103426a;
        }
        if ((i10 & 2) != 0) {
            obj = b12.f103427b;
        }
        b12.getClass();
        return new B1(str, obj);
    }

    @NotNull
    public final String a() {
        return this.f103426a;
    }

    @Nullable
    public final Object b() {
        return this.f103427b;
    }

    @NotNull
    public final B1 c(@NotNull String str, @Nullable Object obj) {
        return new B1(str, obj);
    }

    @NotNull
    public final String e() {
        return this.f103426a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B1)) {
            return false;
        }
        B1 b12 = (B1) obj;
        return kotlin.jvm.internal.G.g(this.f103426a, b12.f103426a) && kotlin.jvm.internal.G.g(this.f103427b, b12.f103427b);
    }

    @Nullable
    public final Object f() {
        return this.f103427b;
    }

    public int hashCode() {
        int iHashCode = this.f103426a.hashCode() * 31;
        Object obj = this.f103427b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        return "ValueElement(name=" + this.f103426a + ", value=" + this.f103427b + ')';
    }
}
