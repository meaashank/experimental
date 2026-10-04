package androidx.compose.ui.draganddrop;

import androidx.compose.ui.layout.C2189y;
import androidx.compose.ui.node.B0;
import androidx.compose.ui.node.C2204h;
import androidx.compose.ui.node.C2215t;
import androidx.compose.ui.node.TraversableNode;
import ed.l;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,317:1\n56#2,4:318\n70#3,4:322\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n*L\n286#1:318,4\n287#1:322,4\n*E\n"})
public final class DragAndDropNodeKt {
    @NotNull
    public static final d a() {
        return new DragAndDropNode(new l<b, f>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt$DragAndDropModifierNode$1
            @Nullable
            public final f e(@NotNull b bVar) {
                return null;
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ f invoke(b bVar) {
                return null;
            }
        });
    }

    @NotNull
    public static final d b(@NotNull final l<? super b, Boolean> lVar, @NotNull final f fVar) {
        return new DragAndDropNode(new l<b, f>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt$DragAndDropModifierNode$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // ed.l
            @Nullable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final f invoke(@NotNull b bVar) {
                if (lVar.invoke(bVar).booleanValue()) {
                    return fVar;
                }
                return null;
            }
        });
    }

    public static final boolean f(d dVar, long j10) {
        if (!dVar.g0().f103127m) {
            return false;
        }
        C2215t c2215t = C2204h.r(dVar).f102729A.f103036b;
        if (!c2215t.f103092Y.f103127m) {
            return false;
        }
        long j11 = c2215t.f102606c;
        int i10 = (int) (j11 >> 32);
        int i11 = (int) (j11 & ZipKt.f225990j);
        long jF = C2189y.f(c2215t);
        float fP = P.g.p(jF);
        float fR = P.g.r(jF);
        float f10 = i10 + fP;
        float f11 = i11 + fR;
        float fP2 = P.g.p(j10);
        if (fP > fP2 || fP2 > f10) {
            return false;
        }
        float fR2 = P.g.r(j10);
        return fR <= fR2 && fR2 <= f11;
    }

    public static final void g(f fVar, b bVar) {
        fVar.F1(bVar);
        fVar.u1(bVar);
    }

    public static final <T extends TraversableNode> T h(T t10, final l<? super T, Boolean> lVar) {
        if (!t10.g0().f103127m) {
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        B0.h(t10, new l<T, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt$firstDescendantOrNull$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction; */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(@NotNull TraversableNode traversableNode) {
                if (!lVar.invoke(traversableNode).booleanValue()) {
                    return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
                objectRef.f217904a = traversableNode;
                return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
            }
        });
        return (T) objectRef.f217904a;
    }

    public static final <T extends TraversableNode> void i(T t10, l<? super T, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar) {
        if (lVar.invoke(t10) != TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal) {
            return;
        }
        B0.h(t10, lVar);
    }
}
