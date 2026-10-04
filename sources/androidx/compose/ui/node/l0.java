package androidx.compose.ui.node;

import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.focus.C1989d;
import androidx.compose.ui.graphics.X1;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.v0;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.G1;
import androidx.compose.ui.platform.H0;
import androidx.compose.ui.platform.InterfaceC2230c;
import androidx.compose.ui.platform.InterfaceC2234d0;
import androidx.compose.ui.platform.InterfaceC2285u1;
import androidx.compose.ui.platform.P1;
import androidx.compose.ui.platform.y1;
import androidx.compose.ui.text.font.AbstractC2325w;
import androidx.compose.ui.text.font.InterfaceC2324v;
import androidx.compose.ui.unit.LayoutDirection;
import ed.InterfaceC4376a;
import k0.InterfaceC4814e;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface l0 extends androidx.compose.ui.input.pointer.P {

    /* JADX INFO: renamed from: R2, reason: collision with root package name */
    @NotNull
    public static final a f103070R2 = a.f103071a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f103071a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static boolean f103072b;

        public final boolean a() {
            return f103072b;
        }

        public final void b(boolean z10) {
            f103072b = z10;
        }
    }

    public interface b {
        void r();
    }

    long A(long j10);

    void B(@NotNull LayoutNode layoutNode, boolean z10, boolean z11, boolean z12);

    void C();

    @androidx.compose.ui.i
    @NotNull
    O.A E();

    boolean F();

    @NotNull
    androidx.compose.ui.focus.t G();

    void H(@NotNull LayoutNode layoutNode, boolean z10, boolean z11);

    long I(long j10);

    @NotNull
    androidx.compose.ui.input.pointer.x J();

    void M(@NotNull LayoutNode layoutNode);

    @InterfaceC2217v
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    void N(boolean z10);

    @NotNull
    v0.a O();

    void P(@NotNull LayoutNode layoutNode, boolean z10);

    @NotNull
    X1 Q();

    @NotNull
    InterfaceC2285u1 R();

    @NotNull
    AbstractC2325w.b S();

    long T();

    @Nullable
    C1989d U(@NotNull KeyEvent keyEvent);

    @NotNull
    j0 V(@NotNull ed.p<? super androidx.compose.ui.graphics.C0, ? super GraphicsLayer, L0> pVar, @NotNull InterfaceC4376a<L0> interfaceC4376a, @Nullable GraphicsLayer graphicsLayer);

    @NotNull
    InterfaceC2324v.b W();

    void X(@NotNull LayoutNode layoutNode);

    @NotNull
    androidx.compose.ui.draganddrop.c Y();

    void Z(@NotNull InterfaceC4376a<L0> interfaceC4376a);

    @NotNull
    InterfaceC4814e a();

    void a0(@NotNull LayoutNode layoutNode);

    @NotNull
    androidx.compose.ui.text.input.Y b();

    @NotNull
    I b0();

    @NotNull
    G1 c();

    @NotNull
    InterfaceC2234d0 c0();

    @NotNull
    P1 d0();

    @NotNull
    T.a g0();

    @NotNull
    LayoutDirection getLayoutDirection();

    @NotNull
    LayoutNode getRoot();

    void h0();

    @NotNull
    kotlin.coroutines.i m();

    @Nullable
    Object n(@NotNull ed.p<? super H0, ? super kotlin.coroutines.e<?>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<?> eVar);

    void o(boolean z10);

    void p(@NotNull LayoutNode layoutNode);

    @NotNull
    InterfaceC2230c q();

    @androidx.compose.ui.j
    void r(@NotNull View view);

    boolean requestFocus();

    void s(@NotNull b bVar);

    @androidx.compose.ui.i
    @Nullable
    O.j t();

    @NotNull
    U.b u();

    @NotNull
    OwnerSnapshotObserver v();

    @NotNull
    ModifierLocalManager w();

    @NotNull
    y1 x();

    @NotNull
    v0 y();

    void z(@NotNull LayoutNode layoutNode, long j10);
}
