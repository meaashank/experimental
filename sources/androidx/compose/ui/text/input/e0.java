package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104793c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AnnotatedString f104794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final L f104795b;

    public e0(@NotNull AnnotatedString annotatedString, @NotNull L l10) {
        this.f104794a = annotatedString;
        this.f104795b = l10;
    }

    @NotNull
    public final L a() {
        return this.f104795b;
    }

    @NotNull
    public final AnnotatedString b() {
        return this.f104794a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.G.g(this.f104794a, e0Var.f104794a) && kotlin.jvm.internal.G.g(this.f104795b, e0Var.f104795b);
    }

    public int hashCode() {
        return this.f104795b.hashCode() + (this.f104794a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TransformedText(text=" + ((Object) this.f104794a) + ", offsetMapping=" + this.f104795b + ')';
    }
}
