package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.L;
import androidx.compose.ui.draganddrop.f;
import androidx.compose.ui.node.W;
import androidx.compose.ui.platform.C2278s0;
import ed.l;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@L
final class DropTargetElement extends W<DragAndDropTargetNode> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l<androidx.compose.ui.draganddrop.b, Boolean> f89103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final f f89104d;

    /* JADX WARN: Multi-variable type inference failed */
    public DropTargetElement(@NotNull l<? super androidx.compose.ui.draganddrop.b, Boolean> lVar, @NotNull f fVar) {
        this.f89103c = lVar;
        this.f89104d = fVar;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropTargetElement)) {
            return false;
        }
        DropTargetElement dropTargetElement = (DropTargetElement) obj;
        return G.g(this.f89104d, dropTargetElement.f89104d) && this.f89103c == dropTargetElement.f89103c;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "dropTarget";
        c2278s0.f103929c.c("target", this.f89104d);
        c2278s0.f103929c.c("shouldStartDragAndDrop", this.f89103c);
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f89103c.hashCode() + (this.f89104d.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public DragAndDropTargetNode c() {
        return new DragAndDropTargetNode(this.f89103c, this.f89104d);
    }

    @NotNull
    public final l<androidx.compose.ui.draganddrop.b, Boolean> j() {
        return this.f89103c;
    }

    @NotNull
    public final f k() {
        return this.f89104d;
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull DragAndDropTargetNode dragAndDropTargetNode) {
        dragAndDropTargetNode.r3(this.f89103c, this.f89104d);
    }
}
