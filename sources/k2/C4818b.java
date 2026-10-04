package k2;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: k2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4818b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f214344a;

    public C4818b(@NotNull String signals) {
        G.p(signals, "signals");
        this.f214344a = signals;
    }

    @NotNull
    public final String a() {
        return this.f214344a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4818b) {
            return G.g(this.f214344a, ((C4818b) obj).f214344a);
        }
        return false;
    }

    public int hashCode() {
        return this.f214344a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdSelectionSignals: " + this.f214344a;
    }
}
