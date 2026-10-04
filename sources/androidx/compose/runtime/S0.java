package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class S0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99334b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f99335a;

    public S0(@NotNull String str) {
        this.f99335a = str;
    }

    public static S0 c(S0 s02, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = s02.f99335a;
        }
        s02.getClass();
        return new S0(str);
    }

    @NotNull
    public final String a() {
        return this.f99335a;
    }

    @NotNull
    public final S0 b(@NotNull String str) {
        return new S0(str);
    }

    @NotNull
    public final String d() {
        return this.f99335a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof S0) && kotlin.jvm.internal.G.g(this.f99335a, ((S0) obj).f99335a);
    }

    public int hashCode() {
        return this.f99335a.hashCode();
    }

    @NotNull
    public String toString() {
        return R0.a(new StringBuilder("OpaqueKey(key="), this.f99335a, ')');
    }
}
