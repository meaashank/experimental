package androidx.compose.ui.text.input;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2337f implements InterfaceC2340i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f104796a = 0;

    @Override // androidx.compose.ui.text.input.InterfaceC2340i
    public void a(@NotNull C2342k c2342k) {
        c2342k.o(0, c2342k.f104809a.b(), "");
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof C2337f;
    }

    public int hashCode() {
        return kotlin.jvm.internal.O.d(C2337f.class).hashCode();
    }

    @NotNull
    public String toString() {
        return "DeleteAllCommand()";
    }
}
