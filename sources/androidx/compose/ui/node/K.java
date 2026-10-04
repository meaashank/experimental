package androidx.compose.ui.node;

import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNodeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,1555:1\n66#2,9:1556\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNodeKt\n*L\n1541#1:1556,9\n*E\n"})
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f102719a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4814e f102720b = k0.g.b(1.0f, 0.0f, 2, null);

    public static final void b(@NotNull LayoutNode layoutNode, @NotNull LayoutNode layoutNode2) {
        layoutNode.P0(layoutNode.Z().size(), layoutNode2);
    }

    @NotNull
    public static final l0 c(@NotNull LayoutNode layoutNode) {
        l0 l0Var = layoutNode.f102750k;
        if (l0Var != null) {
            return l0Var;
        }
        W.a.h("LayoutNode should be attached to an owner");
        throw null;
    }
}
