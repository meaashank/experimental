package androidx.compose.ui.input.pointer;

import androidx.activity.C1477d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2136c implements InterfaceC2154v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102280c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f102281b;

    public C2136c(int i10) {
        this.f102281b = i10;
    }

    public final int a() {
        return this.f102281b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2136c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f102281b == ((C2136c) obj).f102281b;
    }

    public int hashCode() {
        return this.f102281b;
    }

    @NotNull
    public String toString() {
        return C1477d.a(new StringBuilder("AndroidPointerIcon(type="), this.f102281b, ')');
    }
}
