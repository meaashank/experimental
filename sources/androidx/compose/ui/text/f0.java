package androidx.compose.ui.text;

import androidx.compose.runtime.R0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class f0 extends d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104426c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f104427b;

    public f0(@NotNull String str) {
        this.f104427b = str;
    }

    @NotNull
    public final String a() {
        return this.f104427b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && kotlin.jvm.internal.G.g(this.f104427b, ((f0) obj).f104427b);
    }

    public int hashCode() {
        return this.f104427b.hashCode();
    }

    @NotNull
    public String toString() {
        return R0.a(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f104427b, ')');
    }
}
