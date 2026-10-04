package zd;

import androidx.constraintlayout.motion.widget.s;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f241360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f241361b;

    public c(@NotNull String name, @NotNull String value) {
        G.p(name, "name");
        G.p(value, "value");
        this.f241360a = name;
        this.f241361b = value;
        if (name.length() == 0) {
            throw new IllegalArgumentException("Header name cannot be empty");
        }
    }

    public static /* synthetic */ c d(c cVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cVar.f241360a;
        }
        if ((i10 & 2) != 0) {
            str2 = cVar.f241361b;
        }
        return cVar.c(str, str2);
    }

    @NotNull
    public final String a() {
        return this.f241360a;
    }

    @NotNull
    public final String b() {
        return this.f241361b;
    }

    @NotNull
    public final c c(@NotNull String name, @NotNull String value) {
        G.p(name, "name");
        G.p(value, "value");
        return new c(name, value);
    }

    @NotNull
    public final String e() {
        return this.f241360a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return G.g(this.f241360a, cVar.f241360a) && G.g(this.f241361b, cVar.f241361b);
    }

    @NotNull
    public final String f() {
        return this.f241361b;
    }

    public int hashCode() {
        return this.f241361b.hashCode() + (this.f241360a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return s.a("Header(name=", this.f241360a, ", value=", this.f241361b, ")");
    }
}
