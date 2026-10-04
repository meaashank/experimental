package e4;

import androidx.compose.runtime.internal.r;
import androidx.constraintlayout.motion.widget.s;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public final class C4363f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f200242c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f200243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f200244b;

    public C4363f(@NotNull String scheme, @NotNull String host) {
        G.p(scheme, "scheme");
        G.p(host, "host");
        this.f200243a = scheme;
        this.f200244b = host;
    }

    public static /* synthetic */ C4363f d(C4363f c4363f, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4363f.f200243a;
        }
        if ((i10 & 2) != 0) {
            str2 = c4363f.f200244b;
        }
        return c4363f.c(str, str2);
    }

    @NotNull
    public final String a() {
        return this.f200243a;
    }

    @NotNull
    public final String b() {
        return this.f200244b;
    }

    @NotNull
    public final C4363f c(@NotNull String scheme, @NotNull String host) {
        G.p(scheme, "scheme");
        G.p(host, "host");
        return new C4363f(scheme, host);
    }

    @NotNull
    public final String e() {
        return this.f200244b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4363f)) {
            return false;
        }
        C4363f c4363f = (C4363f) obj;
        return G.g(this.f200243a, c4363f.f200243a) && G.g(this.f200244b, c4363f.f200244b);
    }

    @NotNull
    public final String f() {
        return this.f200243a;
    }

    public int hashCode() {
        return this.f200244b.hashCode() + (this.f200243a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return s.a("ValidUri(scheme=", this.f200243a, ", host=", this.f200244b, ")");
    }
}
