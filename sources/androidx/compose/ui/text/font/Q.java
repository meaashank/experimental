package androidx.compose.ui.text.font;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class Q extends AbstractC2325w {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f104580j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final e0 f104581i;

    public Q(@NotNull e0 e0Var) {
        super(true);
        this.f104581i = e0Var;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Q) && kotlin.jvm.internal.G.g(this.f104581i, ((Q) obj).f104581i);
    }

    public int hashCode() {
        return this.f104581i.hashCode();
    }

    @NotNull
    public final e0 t() {
        return this.f104581i;
    }

    @NotNull
    public String toString() {
        return "LoadedFontFamily(typeface=" + this.f104581i + ')';
    }
}
