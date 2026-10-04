package k2;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: k2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4819c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f214345a;

    public C4819c(@NotNull String identifier) {
        G.p(identifier, "identifier");
        this.f214345a = identifier;
    }

    @NotNull
    public final String a() {
        return this.f214345a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4819c) {
            return G.g(this.f214345a, ((C4819c) obj).f214345a);
        }
        return false;
    }

    public int hashCode() {
        return this.f214345a.hashCode();
    }

    @NotNull
    public String toString() {
        return String.valueOf(this.f214345a);
    }
}
