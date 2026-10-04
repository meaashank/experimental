package androidx.compose.ui.focus;

import android.view.KeyEvent;
import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface t extends InterfaceC1999n {
    boolean a(@NotNull KeyEvent keyEvent, @NotNull InterfaceC4376a<Boolean> interfaceC4376a);

    @NotNull
    androidx.compose.ui.p b();

    @NotNull
    M c();

    boolean d(@NotNull KeyEvent keyEvent);

    boolean e(@NotNull androidx.compose.ui.input.rotary.d dVar);

    boolean f(boolean z10, boolean z11, boolean z12, int i10);

    boolean g(int i10, @Nullable P.j jVar);

    boolean h(@Nullable C1989d c1989d, @Nullable P.j jVar);

    void i(@NotNull InterfaceC1993h interfaceC1993h);

    void k(@NotNull FocusTargetNode focusTargetNode);

    @NotNull
    H l();

    void m(@NotNull x xVar);

    @Nullable
    P.j n();

    void o();

    @Nullable
    Boolean p(int i10, @Nullable P.j jVar, @NotNull ed.l<? super FocusTargetNode, Boolean> lVar);
}
