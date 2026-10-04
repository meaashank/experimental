package androidx.compose.ui.input.pointer;

import android.view.PointerIcon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2135b implements InterfaceC2154v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102278c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PointerIcon f102279b;

    public C2135b(@NotNull PointerIcon pointerIcon) {
        this.f102279b = pointerIcon;
    }

    @NotNull
    public final PointerIcon a() {
        return this.f102279b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2135b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return kotlin.jvm.internal.G.g(this.f102279b, ((C2135b) obj).f102279b);
    }

    public int hashCode() {
        return this.f102279b.hashCode();
    }

    @NotNull
    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f102279b + ')';
    }
}
