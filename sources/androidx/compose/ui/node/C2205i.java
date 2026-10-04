package androidx.compose.ui.node;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.node.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nDelegatableNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.android.kt\nandroidx/compose/ui/node/DelegatableNode_androidKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,34:1\n42#2,7:35\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.android.kt\nandroidx/compose/ui/node/DelegatableNode_androidKt\n*L\n29#1:35,7\n*E\n"})
public final class C2205i {
    @NotNull
    public static final View a(@NotNull InterfaceC2203g interfaceC2203g) {
        if (interfaceC2203g.g0().f103127m) {
            return (View) K.c(C2204h.r(interfaceC2203g));
        }
        W.a.g("Cannot get View because the Modifier node is not currently attached.");
        throw null;
    }
}
