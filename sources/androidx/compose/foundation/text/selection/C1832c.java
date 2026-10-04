package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.C2150q;
import androidx.compose.ui.platform.G1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1832c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final G1 f94970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f94971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.input.pointer.A f94972c;

    public C1832c(@NotNull G1 g12) {
        this.f94970a = g12;
    }

    public final int a() {
        return this.f94971b;
    }

    @Nullable
    public final androidx.compose.ui.input.pointer.A b() {
        return this.f94972c;
    }

    public final boolean c(@NotNull androidx.compose.ui.input.pointer.A a10, @NotNull androidx.compose.ui.input.pointer.A a11) {
        return SelectionGesturesKt.i(this.f94970a, a10, a11);
    }

    public final void d(int i10) {
        this.f94971b = i10;
    }

    public final void e(@Nullable androidx.compose.ui.input.pointer.A a10) {
        this.f94972c = a10;
    }

    public final boolean f(@NotNull androidx.compose.ui.input.pointer.A a10, @NotNull androidx.compose.ui.input.pointer.A a11) {
        return a11.f102147b - a10.f102147b < this.f94970a.e();
    }

    public final void g(@NotNull C2150q c2150q) {
        androidx.compose.ui.input.pointer.A a10 = this.f94972c;
        androidx.compose.ui.input.pointer.A a11 = c2150q.f102318a.get(0);
        if (a10 != null && f(a10, a11) && SelectionGesturesKt.i(this.f94970a, a10, a11)) {
            this.f94971b++;
        } else {
            this.f94971b = 1;
        }
        this.f94972c = a11;
    }
}
