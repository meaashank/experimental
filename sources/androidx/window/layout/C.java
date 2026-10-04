package androidx.window.layout;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.window.core.b f120087a;

    public C(@NotNull androidx.window.core.b _bounds) {
        kotlin.jvm.internal.G.p(_bounds, "_bounds");
        this.f120087a = _bounds;
    }

    @NotNull
    public final Rect a() {
        return this.f120087a.i();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C.class.equals(obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.G.g(this.f120087a, ((C) obj).f120087a);
    }

    public int hashCode() {
        return this.f120087a.hashCode();
    }

    @NotNull
    public String toString() {
        return "WindowMetrics { bounds: " + this.f120087a.i() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.TESTS})
    public C(@NotNull Rect bounds) {
        this(new androidx.window.core.b(bounds));
        kotlin.jvm.internal.G.p(bounds, "bounds");
    }
}
