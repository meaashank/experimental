package androidx.compose.ui.text.input;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2344m implements InterfaceC2340i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f104814a = 0;

    @Override // androidx.compose.ui.text.input.InterfaceC2340i
    public void a(@NotNull C2342k c2342k) {
        c2342k.b();
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof C2344m;
    }

    public int hashCode() {
        return kotlin.jvm.internal.O.d(C2344m.class).hashCode();
    }

    @NotNull
    public String toString() {
        return "FinishComposingTextCommand()";
    }
}
