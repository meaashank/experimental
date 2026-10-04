package androidx.compose.ui.text.input;

import androidx.compose.ui.text.C2359l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2332a implements InterfaceC2340i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f104781a = 0;

    @Override // androidx.compose.ui.text.input.InterfaceC2340i
    public void a(@NotNull C2342k c2342k) {
        if (c2342k.m()) {
            c2342k.c(c2342k.f104812d, c2342k.f104813e);
            return;
        }
        if (c2342k.h() != -1) {
            if (c2342k.h() == 0) {
                return;
            }
            c2342k.c(C2359l.b(c2342k.f104809a.toString(), c2342k.h()), c2342k.h());
        } else {
            int i10 = c2342k.f104810b;
            int i11 = c2342k.f104811c;
            c2342k.r(i10, i10);
            c2342k.c(i10, i11);
        }
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof C2332a;
    }

    public int hashCode() {
        return kotlin.jvm.internal.O.d(C2332a.class).hashCode();
    }

    @NotNull
    public String toString() {
        return "BackspaceCommand()";
    }
}
