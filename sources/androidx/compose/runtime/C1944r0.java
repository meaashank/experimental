package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1944r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f99963c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f99964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f99965b;

    public C1944r0(@Nullable Object obj, @Nullable Object obj2) {
        this.f99964a = obj;
        this.f99965b = obj2;
    }

    public static C1944r0 d(C1944r0 c1944r0, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c1944r0.f99964a;
        }
        if ((i10 & 2) != 0) {
            obj2 = c1944r0.f99965b;
        }
        c1944r0.getClass();
        return new C1944r0(obj, obj2);
    }

    @Nullable
    public final Object a() {
        return this.f99964a;
    }

    @Nullable
    public final Object b() {
        return this.f99965b;
    }

    @NotNull
    public final C1944r0 c(@Nullable Object obj, @Nullable Object obj2) {
        return new C1944r0(obj, obj2);
    }

    @Nullable
    public final Object e() {
        return this.f99964a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1944r0)) {
            return false;
        }
        C1944r0 c1944r0 = (C1944r0) obj;
        return kotlin.jvm.internal.G.g(this.f99964a, c1944r0.f99964a) && kotlin.jvm.internal.G.g(this.f99965b, c1944r0.f99965b);
    }

    @Nullable
    public final Object f() {
        return this.f99965b;
    }

    public final int g(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public int hashCode() {
        return g(this.f99965b) + (g(this.f99964a) * 31);
    }

    @NotNull
    public String toString() {
        return "JoinedKey(left=" + this.f99964a + ", right=" + this.f99965b + ')';
    }
}
