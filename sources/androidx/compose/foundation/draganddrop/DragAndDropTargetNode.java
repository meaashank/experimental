package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.L;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.f;
import androidx.compose.ui.node.AbstractC2206j;
import ed.l;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@L
@V({"SMAP\nDragAndDropTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropTarget.kt\nandroidx/compose/foundation/draganddrop/DragAndDropTargetNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
public final class DragAndDropTargetNode extends AbstractC2206j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public l<? super androidx.compose.ui.draganddrop.b, Boolean> f89094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public f f89095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.draganddrop.d f89096t;

    public DragAndDropTargetNode(@NotNull l<? super androidx.compose.ui.draganddrop.b, Boolean> lVar, @NotNull f fVar) {
        this.f89094r = lVar;
        this.f89095s = fVar;
    }

    @Override // androidx.compose.ui.p.d
    public void O2() {
        q3();
    }

    @Override // androidx.compose.ui.p.d
    public void P2() {
        androidx.compose.ui.draganddrop.d dVar = this.f89096t;
        G.m(dVar);
        l3(dVar);
    }

    public final void q3() {
        androidx.compose.ui.draganddrop.d dVarB = DragAndDropNodeKt.b(new l<androidx.compose.ui.draganddrop.b, Boolean>() { // from class: androidx.compose.foundation.draganddrop.DragAndDropTargetNode$createAndAttachDragAndDropModifierNode$1
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull androidx.compose.ui.draganddrop.b bVar) {
                return this.f89097d.f89094r.invoke(bVar);
            }
        }, this.f89095s);
        e3(dVarB);
        this.f89096t = dVarB;
    }

    public final void r3(@NotNull l<? super androidx.compose.ui.draganddrop.b, Boolean> lVar, @NotNull f fVar) {
        this.f89094r = lVar;
        if (G.g(fVar, this.f89095s)) {
            return;
        }
        androidx.compose.ui.draganddrop.d dVar = this.f89096t;
        if (dVar != null) {
            l3(dVar);
        }
        this.f89095s = fVar;
        q3();
    }
}
